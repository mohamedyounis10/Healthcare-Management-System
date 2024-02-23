/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.healthcare;

/**
 *
 * @author moham
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Healthcare {
    //abjects from classes
public static Scanner input = new Scanner(System.in);
    public static doctor d1 = new doctor("mohaemd ", "younis" , 222101421 , 15,10, 2003,"dintistry");
    public static doctor d2 = new doctor("lila ", "ahmed" , 222101422 , 15,12, 2000," medicine");
    
     
    public static patient p1;
        
    public static void main(String[] args) {
        //variabeles
        int ch;
        int ch1;
        int pass_doc;
        int pass_pat; 
        
        ArrayList<Integer> o = new ArrayList<>();
        o.add(d1.get_id());
        o.add(d2.get_id());
        
        boolean datainsertedstatus =false;
       
        System.out.println("       Welcome!        ");
        System.out.println("   Health Care System  ");
        System.out.println(" ----------------------");
        do{
        System.out.println(" press 1 to doctor");
        System.out.println(" press 2 to patient");
        System.out.println("please enter choice (1 or 2)  ");
        System.out.print("My Choose : " );
        ch =input.nextInt();
        System.out.println("------------------------");
        switch (ch) 
        {
            case 1:
                System.out.println("please enter your password");
                pass_doc=input.nextInt();
                System.out.println("------------------------");
                for(int i =0 ; i<3 && pass_doc!=o.get(0)&&pass_doc!=o.get(1) ; i++)
                {
                    System.out.println("please enter your password again");
                pass_doc=input.nextInt();
                }
                if(pass_doc!=o.get(0) || pass_doc!=o.get(1) )
                {
                    do{
                   System.out.println(" press 1 to add a new patient");
                   System.out.println(" press 2 to edit in list ");
                   System.out.println(" press 3 to show all patients ");
                   System.out.println(" press 4 to show specific patient");
                   System.out.println(" press 0 to exit");
                   System.out.println("please enter choice ");
                   System.out.print("My Choose : " );
                   ch1 =input.nextInt();
                  System.out.println("------------------------");
                  if(datainsertedstatus==false && ch1>1)
                                  {
                  System.out.println("can't do any operation after fill all data");
                                 }else{
                      switch(ch1)
                      {
                          case 1:
                              p1  =new patient();
                              datainsertedstatus=true;
                              break;
                          case 2:
                              System.out.println(" press 1 to edit in insurance information ");
                              System.out.println(" press 2 to edit in diseases");
                              System.out.println("please enter choice (1 or 2)  ");
                              System.out.print("My Choose : " );
                              int ch2 =input.nextInt();
                              System.out.println("------------------------");
                             switch (ch2) 
                              {
                                 case 1:
                                     p1.set_insuranceinfo();
                                      System.out.println("------------------------");
                                     break;
                                 case 2:
                                     p1.set_diseases();
                                      System.out.println("------------------------");
                                     break;
                              }
                              break;
                          case 3:
                              p1.print();
                               System.out.println("------------------------");
                              break;
                          case 4:
                              p1.print_patient();
                               System.out.println("------------------------");
                              break; 
                          case 0:
                              return;
                      }
                  }
                }while(ch1!=9);
                }
                else
                    System.out.println("have a problrm please try time later");
                break;
            case 2:
                p1.print_patient_id();
                break;

        }
        }while(ch!=0);        
                
    }
}
