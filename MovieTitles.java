import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.net.HttpURLConnection;

import java.net.URL;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;



public class SortMovieTitles {

		

	public static void main(String[] args)  throws IOException, ParseException

	{

		Scanner in=new Scanner(System.in);

		String substr=in.next();

		SortMovieTitles smt=new SortMovieTitles();

		String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr+"&page=1";

	     URL obj = new URL(url);

	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	     // optional default is GET

	     con.setRequestMethod("GET");

	     //add request header

	     con.setRequestProperty("User-Agent", "Mozilla/5.0");

	     int responseCode = con.getResponseCode();

	     BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

	     String inputLine;

	     StringBuffer response = new StringBuffer();

	     while ((inputLine = br.readLine()) != null) {

	     	response.append(inputLine);

	     }

	     in.close();

	     JSONParser parser = new JSONParser();

	     JSONObject json = (JSONObject) parser.parse(response.toString());

	     long pages=(long) json.get("total");

	     JSONArray ja = (JSONArray) json.get("data");

	     Iterator itr = ja.iterator(); 

	     ArrayList<String> results=new ArrayList<String>();  

	     while (itr.hasNext())  

	        { 

	            JSONObject jo=(JSONObject) itr.next();

	            results.add((String) jo.get("Title"));

	        }

	     pages=pages%10;

	     for(int i=2;i<=pages+1;i++)

	     {

	    	 	

	    	 	 String url1 = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr+"&page="+i;

		     URL obj1 = new URL(url1);

		     HttpURLConnection con1 = (HttpURLConnection) obj1.openConnection();

		     // optional default is GET

		     con1.setRequestMethod("GET");

		     //add request header

		     con1.setRequestProperty("User-Agent", "Mozilla/5.0");

		     int responseCode1 = con1.getResponseCode();

		     BufferedReader br1 = new BufferedReader(new InputStreamReader(con1.getInputStream()));

		     String inputLine1;

		     StringBuffer response1 = new StringBuffer();

		     while ((inputLine1 = br1.readLine()) != null) {

		     	response1.append(inputLine1);

		     }

		     JSONParser parser1 = new JSONParser();

		     JSONObject json1 = (JSONObject) parser1.parse(response1.toString());

		     JSONArray ja1 = (JSONArray) json1.get("data");

		     Iterator itr1 = ja1.iterator(); 

		     while (itr1.hasNext())  

		        { 

		            JSONObject jo1=(JSONObject) itr1.next();

		            results.add((String) jo1.get("Title"));

		        }

	     }

	     Collections.sort(results); 

	     Iterator aitr=results.iterator();  

	     while(aitr.hasNext()){  

	      System.out.println(aitr.next());  

	     }  



	     

	}



}
