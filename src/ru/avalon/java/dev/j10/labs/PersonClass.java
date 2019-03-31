/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Date;

/**
 *
 * @author admin
 */
public class PersonClass implements Person{
     String name;
     Date birthday;
   
     
     public PersonClass(){}
     
     public PersonClass(String name, Date birthday){
         this.name = name;
         this.birthday = birthday;
     }
     
     public PersonClass(String name ){
         this.name = name;
     }
     public PersonClass (Date birthday){
         this.birthday = birthday;
     }
     public void setName (String name){
             this.name = name;
     }
     public void setBirthday(Date Birthday){
         this.birthday = birthday;
     }
     
    

    @Override
    public String getName() {
        return name;
        
         }

    @Override
    public Date getBirthDate() {
        return birthday;
          }


    

    @Override
    public int compareTo(Person other) {
        PersonClass person = (PersonClass)other;
        // сначала сравниваем по именам 
         int result = name.compareTo(person.name);
         if (result != 0){
             return result;
         }
         //если имена совпадают то по датам рождения 
         result = birthday.compareTo(person.birthday);
         if (result != 0 ){
             return result;
         }
         return 0;
       
    }
    @Override
	    public String toString() {
	        return  name + " was born " + birthday;
            }
} 

