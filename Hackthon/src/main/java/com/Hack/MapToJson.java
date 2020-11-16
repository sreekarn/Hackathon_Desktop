package com.Hack;

import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapToJson {
	public String maptoJson(HashMap<String, Object> map) 
    {
//        HashMap<String, Object> hashmap = new HashMap<String, Object>();
// 
//        hashmap.put("id", 11);
//        hashmap.put("firstName", "Lokesh");
//        hashmap.put("lastName", "Gupta");
 
        ObjectMapper mapper = new ObjectMapper();
        String json="";
        try
        {
            //Convert Map to JSON
            json = mapper.writeValueAsString(map);
             
            //Print JSON output
            System.out.println(json);
        } 
        catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}
