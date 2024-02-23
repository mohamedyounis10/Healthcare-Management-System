/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcare;

/**
 *
 * @author moham
 */
import java.util.Scanner;
import java.util.ArrayList;
public class  doctor extends person {
    public static Scanner input = new Scanner(System.in);
    
    private  ArrayList <String> medical_specialty = new ArrayList<>();
    
    doctor()
    {
        for(int i =0 ; i<fname.size() ; i++)
        {
            System.out.println("please enter your medical_specialty (one word)");
          medical_specialty.add(input.next()); 
        }
        System.out.println("--------------------------");
    }
    doctor (String f , String l , int i , int day,int mon, int year,String specialty)
    {
        super( f , l , i , day, mon, year);
        medical_specialty.add(specialty);
    }
    public void set_medical_specialty()
    {
       print();
       System.out.println("please choice to edit medical_specialty. ");
       int x = input.nextInt();
      medical_specialty.set((x-1),input.next()); 
    }
    
    @Override
    public void print()
    {
        super.print();
        for(int i =0 ; i<fname.size() ; i++)
      {
             System.out.println( " | medical_specialty :"+medical_specialty.get(i));     
      }
       System.out.println("--------------------------");
    }
    
}
