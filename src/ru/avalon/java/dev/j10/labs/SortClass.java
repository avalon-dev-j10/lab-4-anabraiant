/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class SortClass implements Sort{
    
    

    // Выполняет сортировку переданного массива объектов @param array массив, подлежащий сортировке
    @Override
    public void sort(Object[] array) { 
        if (array instanceof Comparable[]){ // проверяем не наслед. ли Comparable
            sort((Comparable[]) array); //если да, то сортируем с compareTo
        }
       }
    
    // Выполняет сортировку массива сравниваемых объектов. 
    @Override
    public void sort(Comparable[] array) {
            for (int i = 0; i < array.length-1; i++) {
                for (int j = 0; j < array.length -1 ; j++){ 
                    if ((array[j].compareTo(array[j+1])) == 1){//проверка объекта, если он больше, чем следущий, то меняем местами 
                        Comparable tmp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = tmp;
                }
                            
                }
    
            }
         }

    // Выполняет сортировку массива объектов c использованием переданного объекта типа Comparator.
    @Override
    public void sort(Object[] array, Comparator comparator) { 
        Arrays.sort(array, comparator);
        }
         
    
}
