/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sac;

/**
 *
 * @author makinlosotu
 */
import java.util.Random;

/**
 *
 * @author Mintellechael
 */


public class Employee { 
    private String FirstName;
    private String LastName;
    private double Salary;
    private  int SocialSecurity;
    private  char Sex;
    private  int DateJoined;
    private  int JobID;
    

public Employee (String fname, String lname, double salary, int ssn, char sex, int doj, int jobID)
{
    FirstName = fname;
    LastName  = lname;
    Salary = salary;
    SocialSecurity = ssn; 
    Sex = sex;
    DateJoined = doj;
    JobID = jobID;
}


public String getfname() // GETS THE 1st name of Student
    {
        return FirstName;
    
    }
    public String getlname() 
    {
        return LastName;
    }
    
    public double getsalary()
    {
        return Salary;
       
    }
    
    
     public void aa(double ss)
    {
        Salary=ss;
       
    }
    
    public int getssn()
    {
        Random generator = new Random();
        int ssn; 
        ssn = generator.nextInt(9)+1;  // 1st digit area code
       
        return SocialSecurity;
    }
    
    public char getsex()
    {
        return Sex;
    }
    public int getdoj()
    {
        return DateJoined;
    }
    
    public int getjobID()
    {
        return JobID;
    }
    
    public String toString(){
        return(FirstName + "  " + LastName + "  " + Salary + "   "  + SocialSecurity + "    "+ Sex+ "   "  + Sex+ "   " + DateJoined + "    "+ JobID);
    }
    
    
    void display() {
      System.out.println(FirstName + "  " + LastName + "  " + Salary + "   "  + SocialSecurity + "    "+ Sex+ "   "  + Sex+ "   " + DateJoined + "    "+ JobID);
      
 }
    
    
   
   
    
   
}

    

