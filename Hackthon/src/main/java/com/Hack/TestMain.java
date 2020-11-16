package com.Hack;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestMain {

	public static void main(String[] args) {
		
		MapToJson ms=new MapToJson();
		JsonToMap jm=new JsonToMap();
		HashMap<String, Object> hashmap1=jm.jsontoMap("{ \r\n"
				+ "\"First Name\":\"Sreekar\",\r\n"
				+ "\"Last Name\":\"Nedunuri\",\r\n"
				+ "\"Student ID\":\"801167891\",\r\n"
				+ "\"Address\": \"Ashford\",\r\n"
				+ "\"University\":\"UNCCharlotte\"\r\n"
				+ "}");
		HashMap<String, Object> hashmap2=jm.jsontoMap("{ \r\n"
				+ "\"First Name\":\"Rajesh\",\r\n"
				+ "\"Last Name\":\"Anumula\",\r\n"
				+ "\"TypeofStudent\":\"Full Time\",\r\n"
				+ "\"Subject\": \"Database\"\r\n"
				+ "}");
		for (Entry<String, Object> entry : hashmap2.entrySet()) {
			if(hashmap1.containsKey(entry.getKey())){
				entry.setValue(hashmap1.get(entry.getKey()));
				}
			}
		System.out.println(hashmap2);
		System.out.println(ms.maptoJson(hashmap2));
		}
}
