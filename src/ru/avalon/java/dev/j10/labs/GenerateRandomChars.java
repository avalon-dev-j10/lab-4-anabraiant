/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Random;

/**
 *
 * @author admin
 */
public class GenerateRandomChars{
    String forGeneration;
    int length;
    
    public GenerateRandomChars(){
        
    }
   
    public GenerateRandomChars(String forGeneration, int length){
        this.forGeneration = forGeneration;
        this.length = length;
    }
    
    public String generateRandomChars(String candidateChars, int length) {
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
        sb.append(candidateChars.charAt(random.nextInt(candidateChars
                .length())));
    }

    return sb.toString();
}
    
}
