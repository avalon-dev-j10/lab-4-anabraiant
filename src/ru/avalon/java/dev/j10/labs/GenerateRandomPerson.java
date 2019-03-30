/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author admin
 */
public class GenerateRandomPerson {
    
    private static final String[] baseNames = {"Sage", "Eric", "Kristo", "Mike",
            "John", "Bella", "Luci", "Brad", "Luk", "Anna", "Peter",};
    
    public static String generateName(){
        int i = baseNames.length;
        String randomName = baseNames[new Random().nextInt(i)];
        return  randomName;
    }
    
    public static Date randomDateofBirth() {
        Calendar initialYear = Calendar.getInstance(); //
        initialYear.set(Calendar.YEAR, 1950);
        long offset = initialYear.getTimeInMillis();

        Calendar lastYear = Calendar.getInstance();
        lastYear.set(Calendar.YEAR, 2019);
        long end = lastYear.getTimeInMillis();

        long diff = end - offset + 1;
        Timestamp timestamp = new Timestamp(offset + 
            (long) (Math.random() * diff));
        return new Date(timestamp.getTime());
}
    public static PersonClass generatePerson(){
        
        return new PersonClass (GenerateRandomPerson.generateName(), GenerateRandomPerson.randomDateofBirth());
    }
}
