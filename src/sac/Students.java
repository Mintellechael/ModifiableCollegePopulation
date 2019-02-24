/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sac;

import java.util.Random;

/**
 *
 * @author Mintellechael
 */
public class Students {
    
    private  String FirstName;
    private String LastName;
    private String Major;
    private String Minor;
    private int SocialSecurity;
    private char Sex;
    private int YearOfGrad;
    private float CurrentGPA;
 

 

    
 
   
    public int getssn()
    {
        Random generator = new Random();
        int ssn; 
        ssn = generator.nextInt(9)+1;  // 1st digit area code
       
       
        return SocialSecurity;
    }


  
    
public Students (String fname, String lname, String major, String minor, int ssn, char sex, int yog, float cgpa)
   {

FirstName = fname;
LastName = lname;
Major = major;
Minor = minor;
SocialSecurity = ssn;
Sex = sex;
YearOfGrad = yog;
CurrentGPA = cgpa;
   }


    public String getfname() // GETS THE 1st name of Student
    {
        return FirstName;
    
    }
    public String getlname() 
    {
        return LastName;
    }
    
    public String getmajor()
    {
        return Major;
       
    }
    public void setminor(String ss) 
    {
        Minor = ss;
    }
    
    public void aa(float ss)
    {
        CurrentGPA = ss;
    }
    
    public void setmajor(String ss)
    {
        Major = ss;
    }
    
    public char getsex()
    {
        return Sex;
    }
    public int getyog()
    {
        return YearOfGrad;
    }
    
    public float getcgpa()
    {
        return CurrentGPA;
    }
    
    
    
    public String toString(){
        return(FirstName + "  " + LastName + "  " + Major + "   "  + Minor + "    "+ SocialSecurity+ "   "  + Sex+ "   " + YearOfGrad + "    "+ CurrentGPA);
    }
    
    

   void display() {
     System.out.println(FirstName + "  " + CurrentGPA);
       
       /* System.out.println(FirstName);
      System.out.println(LastName);
      System.out.println(Major);
      System.out.println(Minor);
      System.out.println(SocialSecurity);
      System.out.println(Sex);
      System.out.println(YearOfGrad);
      System.out.println(CurrentGPA);
             *
      

*/
     }
}
