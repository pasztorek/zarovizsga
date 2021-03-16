package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkHours {


    public String minWork(String path) {
        String lasy = "";

        try (
        BufferedReader reader = Files.newBufferedReader(Path.of(path))){
            String line;
            String[] splited;

            Integer minHours = 24;

            while((line =reader.readLine())!=null){
                splited = line.split(",");
                if(Integer.parseInt(splited[1])<minHours){
                    minHours=(Integer.parseInt(splited[1]));
                    lasy = splited[0] + ": " + splited[2];
                }

            }



        }
            catch (IOException io){
            throw new IllegalStateException("Nem tudom megnyitni a filet");
            }

        return lasy;
    }
}
