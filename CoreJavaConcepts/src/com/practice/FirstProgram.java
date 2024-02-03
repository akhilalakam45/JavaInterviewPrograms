package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



class MyJSONComparator implements Comparator<JSONObject> {

	@Override
	public int compare(JSONObject o1, JSONObject o2) {
	    String v1 =   o1.get("productName").toString();
	    String v3 =  o2.get("productName").toString();
	    
	    //Integer v1 =  Integer.parseInt(o1.get("productId").toString());
	    //Integer v3 =  Integer.parseInt(o2.get("productId").toString());
	   
	    return v1.compareTo(v3);
	}
}

public class FirstProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//System.out.println("Prassu");
		
		JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader("D://Json Files/product.json")){
        	
        	Object obj = jsonParser.parse(reader);
        	
        	JSONArray productList = (JSONArray) obj;
            System.out.println(productList);
            
            
            ArrayList<JSONObject> list = new ArrayList<>();

            for (int i = 0; i < productList.size(); i++) {
                list.add((JSONObject) productList.get(i));
            }
            Collections.sort(list, new MyJSONComparator());

            for (JSONObject obj1 : list) {
                //System.out.println( obj1.get("productName").toString());
            	
            	System.out.println( obj1);
            }
        	
        	
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
