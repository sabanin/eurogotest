package com.goeuro;

import com.goeuro.processors.CSVCreator;

public class Main {

    //Some configuraion
    final static private String URL = "http://api.goeuro.com/api/v2/position/suggest/en/";
    final static private String FIELDS = "_id,name,type,latitude,longitude";
    final static private String SEPARATOR = ",";
    final static private String OUTPUT_EXTENSION = ".csv";

    public static void main(String[] args) {
        //get city
        String city = String.join(" ",args); //to accept both java -jar "New York" and java -jar New York
        CSVCreator.process(URL, city, FIELDS.split(","), SEPARATOR, OUTPUT_EXTENSION);
    }
}
