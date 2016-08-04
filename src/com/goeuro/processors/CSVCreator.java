package com.goeuro.processors;

import com.goeuro.models.Suggest;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Yevhenii on 04/08/2016.
 */
public class CSVCreator {

    public static void process(String url, String city, String[] fields, String separator, String csvExtension){
        //Get data
        Suggest[] suggests = DataReceiver.getData(url, city);

        //writeToCSV
        try {
            FileWriter writer = new FileWriter(city+csvExtension);
            for (Suggest suggest : suggests){
                writer.append(suggest.toCSVRow(fields, separator));
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Unnable to write to file: "+city+csvExtension);
            e.printStackTrace();
        }
    }

}
