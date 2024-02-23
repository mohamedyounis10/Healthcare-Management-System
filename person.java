/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcare;

/**
 *
 * @author moham
 */
import java.util.ArrayList;
import java.util.Scanner;
public class person {
    public static Scanner input = new Scanner(System.in);
    public int num =0 , y =0;
    protected  ArrayList <String> fname = new ArrayList<>();
    protected  ArrayList <String> lname = new ArrayList<>();
    public   ArrayList <Integer> id = new ArrayList<>();
    protected  ArrayList <Integer>  daybirth= new ArrayList<>();
    protected  ArrayList <Integer>  monbirth= new ArrayList<>();
    protected   ArrayList <Integer>  yearbirth= new ArrayList<>();
     person()
    {
        System.out.print("please enter number , you want enter : ");
        num = input.nextInt();
        for(int i =0 ; i<num ; i++)
        {
            System.out.println("please enter first name");
            fname.add(input.next());
            System.out.println("please enter last name ");
             lname.add(input.next());
            System.out.println("please enter id  ");
             id.add(input.nextInt());
            System.out.println("please enter birthday (int) ");
             daybirth.add(input.nextInt());
            System.out.println("please enter birthmonth (int)  ");
             monbirth.add(input.nextInt());
            System.out.println("please enter birthyear (int)  ");
            yearbirth.add(input.nextInt());
        }
    }
    person(String f , String l , int i , int day,int mon, int year)
    {
       fname.add(f);
       lname.add(l);
       id.add(i);
       daybirth.add(day);
       monbirth.add(mon);
       yearbirth.add(year);
    }
    public void set_fname()
    {
        print();
       System.out.println("please choice to edit first name ");
       int x = input.nextInt();
      fname.set((x-1),input.next());
    }
    public void set_id()
    {
        print();
       System.out.println("please choice to edit id ");
       int x = input.nextInt();
      id.set((x-1),input.nextInt());
    }
    public int get_id()
    {
       for(int i =0 ; i<fname.size() ; i++)
        y =id.get(i);
       return y ;
    }
    
    public void print()
    {
         System.out.println("--------------------------"); 
      for(int i =0 ; i<fname.size() ; i++)
      {
             System.out.println((i+1) + "  name :"+fname.get(i)+" "+lname.get(i)+" | id :"+id.get(i)+
                     " | birthday : "+daybirth.get(i)+"/"+monbirth.get(i)+"/"+yearbirth.get(i));     
      }
    }
}
