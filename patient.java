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
public class patient extends person {
    public static Scanner input = new Scanner(System.in);
    private  ArrayList <Boolean> insuranceinfo = new ArrayList<>();
    private  ArrayList <String> diseases = new ArrayList<>();
    int num =0 ;
    
    patient()
    {
        for(int i =0 ; i<fname.size() ; i++)
        {
            System.out.println("please enter your have insurance(True/False)");
          insuranceinfo.add(input.nextBoolean()); 
          System.out.println("please enter disease (one word)");
          diseases.add(input.next());
        }
        System.out.println("--------------------------");
    }
    patient(String f , String l , int i , int day,int mon, int year,boolean insurance , String d)
    {
        super( f , l , i , day, mon, year);
        insuranceinfo.add(insurance);
        diseases.add(d);
    }
    public void set_insuranceinfo()
    {
        print();
       System.out.println("please cgoice to  edit insuranceinfo ");
       int x = input.nextInt();
      insuranceinfo.set((x-1),input.nextBoolean());
    }
    public void set_diseases ()
    {
      print();
       System.out.println("please cgoice to  edit diseases ");
       int x = input.nextInt();
      diseases.set((x-1),input.next());  
    }
    public void print_patient()
    {
        System.out.println("please first name of patient ");
       String sname = input.next();
       System.out.println("please last name of patient ");
       String ssname = input.next();
       System.out.println("--------------------------");
       if(fname.contains(sname)==true&& lname.contains(ssname)==true)
       {
         num = fname.indexOf(sname);
       System.out.println(  "  name :"+fname.get(num)+" "+lname.get(num)+" | id :"+id.get(num)+
                     " | birthday : "+daybirth.get(num)+"/"+monbirth.get(num)+"/"+yearbirth.get(num)+
                " | insuranceinfo :"+insuranceinfo.get(num)+" | diseases :"+diseases.get(num));
       }else{
        System.out.println("can not find this patient");
       }
    }
      public void print_patient_id()
    {
       System.out.println("please enter your id ");
       int sid = input.nextInt();
       System.out.println("--------------------------");
       if(id.contains(sid)==true)
       {
         num = id.indexOf(sid);
       System.out.println(  "  name :"+fname.get(num)+" "+lname.get(num)+" | id :"+id.get(num)+
                     " | birthday : "+daybirth.get(num)+"/"+monbirth.get(num)+"/"+yearbirth.get(num)+
                " | insuranceinfo :"+insuranceinfo.get(num)+" | diseases :"+diseases.get(num));
       }else{
        System.out.println("can not find this patient ,please try again in later");
       }
    }
    @Override
    public void print()
    {
       super.print();
       for(int i =0 ; i<fname.size() ; i++)
      {
             System.out.println( " | insuranceinfo :"+insuranceinfo.get(i)+" | diseases :"+diseases.get(i));     
      }
       System.out.println("--------------------------");
    }

}
