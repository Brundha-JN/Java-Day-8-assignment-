package com.inheritance;

public class Main {

  public static void main(String[] args) {
           Employee[] employee = new Employee[3];
           for(int i=0;i<3;i++)
           {
             employee[i] = new Employee();
             employee[i].getDetails();
               employee[i].displayDetails();
             
           }
           Engineer engineer = new Engineer();
           {
           
               
               
               engineer.project ();
               engineer.internship ();
               engineer.seminar ();
               }
               
             
           }
           
  }
