package com.goeuro.processors;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.goeuro.models.Suggest;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Yevhenii on 04/08/2016.
 */
public class DataReceiver {
    final static ObjectMapper mapper = new ObjectMapper();

    public static Suggest[] getData(String apiUrl, String city){
        Suggest[] data = new Suggest[0];
        try {
            String urlCity = city.replaceAll(" ", "%20");
            data = mapper.readValue(new URL(apiUrl+urlCity), Suggest[].class);
        } catch (IOException e) {
            System.out.println(String.format("Error obtaining data for url api: %s and city: %s", apiUrl, city));
            e.printStackTrace();
        }
        return data;
    }
}
