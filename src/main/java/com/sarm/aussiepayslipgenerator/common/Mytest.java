/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sarm.aussiepayslipgenerator.common;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author sarm
 */
public class Mytest {
    
    
    BigDecimal balance =  new BigDecimal("50.0");
    public static void main(String[] arg){
        
        Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,null);
//       Writer out = new OutputStreamWriter();
   int i=2 ,j=0;
   j=(i++ + i++)*--i;
   
   Mytest my = new Mytest();
   System.out.println(j);
    Storage s1;
    s1 = new Storage(2,4);
     Storage s2 = new Storage(6,8);
     System.out.println(s1.data1 +" "+ s1.data2);
     System.out.println(s2.data1 +" "+ s2.data2);
     s1.modify(s1.data1);
     s2.modify(s1.data1);
     
     System.out.println(s1.data1 +" "+ s1.data2);
     System.out.println(s2.data1 +" "+ s2.data2);
     
     s1.modify(2);
     s2.modify(2);
     
     System.out.println(s1.data1 +" "+ s1.data2);
     System.out.println(s2.data1 +" "+ s2.data2);
             }
}
    
class Storage{
    int data1;
    float data2;
    Storage(int data1, float data2){
        this.data1 = data1;
        this.data2 = data2;
    }
    
    void modify(int value){
    this.data1 = this.data1/value;
    this.data2 = this.data2/value;
    value= value+2;
    
    }
    }


        
    
    
