package com.teamwork.cs612assignment.springboot.resources;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.teamwork.cs612assignment.springboot.model.Students;

public class JSONReader {
	//Read Json file.
    public static String ReadFile(String Path){
        BufferedReader reader = null;
        String laststr = "";
        try{
            FileInputStream fileInputStream = new FileInputStream(Path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            reader = new BufferedReader(inputStreamReader);
            String tempString = null;
            while((tempString = reader.readLine()) != null){
                laststr += tempString;
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return laststr;
    }
    
    public static ArrayList<Students> JsonToObj() {
        //JSON parser object to parse read file
		Gson gson = new Gson();
		ArrayList<Students> stu = gson.fromJson(ReadFile("/app/com/teamwork/cs612assignment/springboot/resources/JsonStuCour"), new TypeToken<ArrayList<Students>>(){}.getType());
    		
        return stu;
    }
}
