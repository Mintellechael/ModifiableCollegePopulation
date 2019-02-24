/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sac;
import java.util.*;
/**
 *
 * @author makinlosotu
 */
public class SAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // DECLARING PARAMETERS USED 
         String fname;
      String major;
      String minor;
      String lname;
      float salary;
      int doj;
      int jobID = 0;
      char sex;
      int yog;
      int ssn;
      float cgpa;
      int scount = 0;
      int ecount = 0;
      long startTime;
      long endTime;
      long resultTime;
      
      // _______________________________________________________GROUP OF CREATED STUDENTS _______________________________________________________
      Students[] studar = new Students[10];
      
      Students studar1 = new Students("Michael","Akinlosotu","ComputerScience","Business",432382343,'M',2018,3);
      studar[scount] = studar1; 
      scount++;
      Students studar2 = new Students("Aliesha","Grandison","Psychology","None",849347343,'F',2017,1);
      studar[scount] = studar2; 
      scount++;
      Students studar3 = new Students("Emmanuel","Akinlosotu","FineArts","None",987342312,'M',2019,1);
      studar[scount] = studar3; 
      scount++;
      Students studar4 = new Students("Shatiaka","Allen","CriminalJustice","None",756456543,'F',2016,2);
      studar[scount] = studar4; 
      scount++;
      Students studar5 = new Students("Larry","Johnson","Math","Business",848939483,'M',2015,3);
      studar[scount] = studar5; 
      scount++;
      Students studar6 = new Students("Billy","Dee","Nursing","None",594034345,'F',2018,4);
      studar[scount] = studar6; 
      scount++;
      Students studar7 = new Students("Craig","Olsen","Criminology","Business",493534584,'M',2017,3);
      studar[scount] = studar7; 
      scount++;
      Students studar8 = new Students("Dom","Kennedy","MusicalArts","None",59594344,'M',2018,3);
      studar[scount] = studar8; 
      scount++;
      Students studar9 = new Students("Issa","Zonteh","ComputerScience","None",584938234,'M',2019,3);
      studar[scount] = studar9; 
      scount++;
      Students studar10 = new Students("Kim","Possible","SelfDefense","None",895432126,'F',2016,3);
      studar[scount] = studar10; 
      scount++;
      
      
  // _______________________________________________________GROUP OF CREATED EMPLOYEES _______________________________________________________

      
   Employee [] emp = new Employee[10];
   
      Employee emp1 = new Employee("Bobby","Smith",4000,432382343,'M',2018,2);
      emp[ecount] = emp1; 
      ecount++;
      Employee emp2 = new Employee("Ron","Stoppable",5000,849347343,'M',2017,1);
      emp[ecount] = emp2; 
      ecount++;
      Employee emp3 = new Employee("Flex","Washington",700,987342312,'M',2019,2);
      emp[ecount] = emp3; 
      ecount++;
      Employee emp4 = new Employee("Johnny","Football",800,756456543,'M',2016,2);
      emp[ecount] = emp4; 
      ecount++;
      Employee emp5 = new Employee("Stacy","Epps",9000,848939483,'F',2015,1);
      emp[ecount] = emp5; 
      ecount++;
      Employee emp6 = new Employee("Cammy","Mason",700,594034345,'F',2018,2);
     emp[ecount] = emp6; 
      ecount++;;
      Employee emp7 = new Employee("Vanessa","Olsen",800,493534584,'F',2017,1);
      emp[ecount] = emp7; 
      ecount++;
      Employee emp8 = new Employee("Marcy","Cola",34566,59594344,'F',2018,2);
      emp[ecount] = emp8; 
      ecount++;
      Employee emp9 = new Employee("Mack","Wild",245000,584938234,'M',2019,2);
      emp[ecount] = emp9; 
      ecount++;
      Employee emp10 = new Employee("Kim","Johnson",450000,895432126,'F',2016,1);
      emp[ecount] = emp10; 
      ecount++;
      
      // __________________________________________________________________________________________
        Scanner scan = new Scanner (System.in);  // Declaring Scaner Parameter
        String enterName; // Declare Parameter
  
  
  
  int act =0 ; 
  

  
  //      // _______________________________________________________MENU BEGINS _______________________________________________________

  menu(); // Shows user the menu
  act = scan.nextInt(); // user input for their choice from the menu
      
  do { // beginning of loop
  
 
  switch (act) {
     
      case 1:        // _______________________________________________________CASE 1 _______________________________________________________

          
      System.out.println("First Name : ");
      fname = scan.next();
      System.out.println("Last name : ");
      lname = scan.next();
      
      System.out.println(" Major: ");
            major = scan.next();

            
      System.out.println(" sex: ");
                        sex = scan.next().charAt(0);

            System.out.println(" YOG : ");
                  yog = scan.nextInt();
                  
                System.out.println(" Minor : ");
                    minor = scan.next();


        System.out.println(" ssn : ");
        ssn = scan.nextInt();

        System.out.println(" cgpa : ");
        cgpa = scan.nextFloat();
     

         // Increasing Size of Array if out of bounds _______________________________________________________

      Students x = new Students(fname,lname,major, minor,ssn,sex,yog,cgpa);
      if (studar.length==scount){
           Students[] temp = new Students[studar.length*2];
    
            for (int i = 0; i < scount; i++ ){
             temp[i] = studar[i];
            }
        studar = temp; 
      }
          
      
      
      studar[scount] = x;
      scount++;
      
      
    

    
     
     menu();
          act = scan.nextInt();
          break;
  
        
      case 2: // _______________________________________________________CASE 2 _______________________________________________________

          System.out.println("First Name : ");
      fname = scan.next();
      System.out.println("Last name : ");
      lname = scan.next();
      
      System.out.println(" Salary : ");
            salary = scan.nextFloat();
            
             System.out.println(" ssn : ");
        ssn = scan.nextInt();

            System.out.println(" Sex : ");
                        sex = scan.next().charAt(0);

            System.out.println(" DOJ : ");
                  doj = scan.nextInt();
                  
                System.out.println(" jobID : ");
                    jobID = scan.nextInt();
                    
    
     
        // Increase Size of Array if out of bounds _______________________________________________________

      Employee y = new Employee (fname,lname,salary,ssn,sex,doj,jobID);
      
        if (emp.length==ecount){
           Employee[] temp = new Employee[emp.length*2];
    
            for (int i = 0; i < ecount; i++ ){
             temp[i] = emp[i];
            }
        emp = temp; 
      }
          
      
      
      
      emp[ecount] = y;
      ecount++;
      
      
     
     menu();
          act = scan.nextInt();
          break;
  
   case 3:        // _______________________________________________________CASE 3 _______________________________________________________

         
          for(int i = 0; i < scount; i++)
            studar[i].display(); 
          
          
          
          
         
        menu();
          act = scan.nextInt();
          
          break;
          
      case 4:       // _______________________________________________________CASE 4 _______________________________________________________

          
          for(int i = 0; i< ecount; i++)
              emp[i].display();
          
          menu();
          act = scan.nextInt();
           break;
          
          
      case 5:       // _______________________________________________________Case 5 _______________________________________________________

                  
          for(int i = 0; i< ecount; i++)
              if (emp[i].getjobID() == 2)
              emp[i].display();
          
          menu();
          act = scan.nextInt();
           break;
          
      case 6:        // _______________________________________________________Case 6 _______________________________________________________
 
          for(int i = 0; i< ecount; i++)
              if (emp[i].getjobID() != 2)
              emp[i].display();
          
          menu();
          act = scan.nextInt();
           break;
          
      case 7 :       // _______________________________________________________Case 7 _______________________________________________________

          System.out.println("Enter year of graduation :");
          int yog1 = scan.nextInt();
           for(int i = 0; i< scount; i++){
          if (studar[i].getyog() == (yog1)) {
                   studar[i].display(); }
          else
              System.out.println("");
           }
           menu();
          act = scan.nextInt();
           break;
           
           case 8:       // _______________________________________________________Case 8 _______________________________________________________

               System.out.println("Enter Major :(NO SPACE)");
               String major2 = scan.next();
           for(int i = 0; i< scount; i++){
          if (studar[i].getmajor().equals(major2)) {
                   studar[i].display(); }
          else
              System.out.println("");
           }
           menu();
          act = scan.nextInt();
           break;
  case 9: // LINEAR STUDENT         // _______________________________________________________Case 9 _______________________________________________________

                  System.out.println("Student last name :");

                 startTime = System.nanoTime();
                 String searchName = scan.next();
              
                        
                for(int i=0; i<scount; i++){
                if(studar[i].getlname().equalsIgnoreCase(searchName)){
                studar[i].display();
                }
                }
                endTime = System.nanoTime();
                    resultTime = endTime - startTime; //Find Elapsed Time of Linear Search
                    System.out.println("\nSystem Time to Complete Linear Search: " + resultTime + "nano seconds"); //Report Time
                    
                            
                            
                            menu();
                            act = scan.nextInt();
                             break;
                    
                
           
           case 10:       // _______________________________________________________CASE 10 _______________________________________________________

                  System.out.println("Employee last name :");

                 startTime = System.nanoTime();
                 searchName = scan.next();
               
                        
                for(int i=0; i<scount; i++){
                if(emp[i].getlname().equalsIgnoreCase(searchName)){
                emp[i].display();
                } 
                }
                endTime = System.nanoTime();
                
                
                   
                        
                            resultTime = endTime - startTime; //Find Elapsed Time of Linear Search
                            System.out.println("\nSystem Time to Complete Linear Search: " + resultTime + "nano seconds"); //Report Time
                            
                            
                            menu();
                            act = scan.nextInt();
                             break;
               
          case 11:       // _______________________________________________________CASE 11 _______________________________________________________

               System.out.println("Student First Name? : ");
               enterName = scan.next();
               startTime = System.nanoTime();
               bubbleSort(studar);
               binSearch(studar,0,scount-1,enterName);
               endTime = System.nanoTime();
               resultTime = endTime - startTime;
               System.out.println("Result Time" + resultTime + "nano seconds");
             
              
                    // SUBMENU _______________________________________________________
 
             int flag=1;
               do {
                    submenuS();
                 int actsub;
               actsub = scan.nextInt();
               
                  switch (actsub){
                      case 1 : 
                         System.out.println("Student (First Name) who has to be deleted :");
                         String deletename = scan.next();
                      for ( int i = 0 ; i < scount; i++)  { 
                                    if(studar[i].getfname().equalsIgnoreCase(enterName)){
                                        for (int j=i;j<scount-1;j++){
                                            studar[j]=studar[j+1];
                                        }
                                        studar[scount-1]=null;
                                        scount--;
                                    
                                    }}
                                        break;
                                    
                                        
                       case 2:  
                           
                            
                           System.out.println("New GPA?");
                           Float changegpa = scan.nextFloat();
                           
                              for ( int i = 0 ; i < scount; i++)  { 
                                    if(studar[i].getfname().equalsIgnoreCase(enterName)){
                                       studar[i].aa(changegpa);
                                       break;
                                    }
                              }
                       break;
                           
                       case 3 : 
                            System.out.println("New Major?");
                           String changemajor = scan.next();
                           
                              for ( int i = 0 ; i < scount; i++)  { 
                                    if(studar[i].getfname().equalsIgnoreCase(enterName)){
                                       studar[i].setmajor(changemajor);
                                       break;
                                    }
                              }
                       break;
                           
                       case 4:
                           System.out.println("New Minor?");
                           String changeminor = scan.next();
                           
                              for ( int i = 0 ; i < scount; i++)  { 
                                    if(studar[i].getfname().equalsIgnoreCase(enterName)){
                                       studar[i].setminor(changeminor);
                                       break;
                                    }
                              }
                       break;
                           
                           
                       
                           
                           
                                        
                      case 5:flag=0;
                          break;
                        
                  }
               }while (flag==1);
                     
                                menu();
                            act = scan.nextInt();
                             break;
                         
                         
               case 12:       // _______________________________________________________CASE 12 _______________________________________________________

                System.out.println("Employee First Name? : ");
               enterName = scan.next();
               startTime = System.nanoTime();
               bubbleSortE(emp);
               binSearchE(emp,0,emp.length-1,enterName);
               endTime = System.nanoTime();
               resultTime = endTime - startTime;
               System.out.println("Result Time" + resultTime + "nano seconds");
               
              
                    // SUBMENU _______________________________________________________

                flag=1;
               do {
                    submenuE();
                 int actsub;
               actsub = scan.nextInt();
               
                  switch (actsub){
                      case 1 : 
                         System.out.println("Employee First Name? who has to be deleted");
                         String deletename = scan.next();
                      for ( int i = 0 ; i < ecount; i++)  { 
                                    if(emp[i].getfname().equalsIgnoreCase(enterName)){
                                        for (int j=i;j<ecount-1;j++){
                                            emp[j]=emp[j+1];
                                        }
                                        emp[ecount-1]=null;
                                        ecount--;
                                    
                                    }}
                                        break;
                                    
                                        
                       case 2:  
                           
                            
                           System.out.println("New Salary?");
                           double changeSal = scan.nextDouble();
                           
                              for ( int i = 0 ; i < ecount; i++)  { 
                                    if(emp[i].getfname().equalsIgnoreCase(enterName)){
                                       emp[i].aa(changeSal);
                                       break;
                                    }
                              }
                       break;
                           
                                        
                      case 3:flag=0;
                          break;
                        
                  }
               }while (flag==1);
                     
                     
                     menu();
                            act = scan.nextInt();
                             break;
                         
                     case 13:       // _______________________________________________________CASE 13 _______________________________________________________

                  startTime = System.nanoTime();
                  
              
                  int min;
                  
                  for ( int i = 0; i < scount-1; i++) {
                   min=i;
                   for ( int j = i+1; j < scount; j++) {
                            if (studar[j].getlname().compareToIgnoreCase(studar[min].getlname()) < 0) {
                   min = j;
               
             }
                            
                            
               
               Students tempSelect;
               
               tempSelect = studar[i];
               studar[i] = studar[min];
               studar[min] = tempSelect;
             }
                  }
               for( int g = 0; g < scount; g++){
                   studar[g].display();
               }
              
               endTime = System.nanoTime();
                    resultTime = endTime - startTime; //Find Elapsed Time of Linear Search
                    System.out.println("\nSystem Time to Complete Linear Search: " + resultTime + "nano seconds"); //Report Time
           
           
           menu();
                            act = scan.nextInt();
                             break;
               
           case 14:       // _______________________________________________________CASE 14 _______________________________________________________

              
               
                    startTime = System.nanoTime();
                    for(int i = 1; i < ecount; i++ ) {
                        
                        Employee key = emp[i];
                        int position = i;
                        
       while (position > 0 && emp[position-1].getfname().compareToIgnoreCase(key.getfname()) > 0)
       {
           emp[position] = emp[position-1];
           position--;
       }
           emp[position] = key;
           
       }
                    for( int g = 0; g < ecount ; g++){
                   System.out.println(emp[g]);}
                    
                    endTime = System.nanoTime();
                    resultTime = endTime - startTime; //Find Elapsed Time of Linear Search
                    System.out.println("\nSystem Time to Complete Linear Search: " + resultTime + "nano seconds"); //Report Time
                        
                     menu();
                            act = scan.nextInt();
                             break;
               
           case 15 :       // _______________________________________________________CASE 15 _______________________________________________________

               System.out.println("Number of students : " + scount);
               
               menu();
                            act = scan.nextInt();
                             break;
               
           case 16 :       // _______________________________________________________CASE 16 _______________________________________________________

                              System.out.println("Number of employees : " + ecount);
                 menu();
                            act = scan.nextInt();
                             break;
           case 17:        // _______________________________________________________CASE 17 _______________________________________________________

               startTime = System.nanoTime();
                    for(int i = 1; i < scount; i++ ) {
                        
                        Students key = studar[i];
                        int position = i;
                        
       while (position > 0 && studar[position-1].getcgpa() < (key.getcgpa()))
       {
           studar[position] = studar[position-1];
           position--;
       }
           studar[position] = key;
           
       }
                    for( int g = 0; g < scount ; g++){
                   System.out.println(studar[g]);}
                    
                    endTime = System.nanoTime();
                    resultTime = endTime - startTime; //Find Elapsed Time of Linear Search
                    System.out.println("\nSystem Time to Complete Linear Search: " + resultTime + "nano seconds"); //Report Time
                        
                     menu();
                            act = scan.nextInt();
                             break;
               
               
  
  
  } //switch
  
          
  }while(act!=18);        // _______________________________________________________END  OF MENU _______________________________________________________

      
       
      
      
    }//main
          // _______________________________________________________MENU OPTIONS _______________________________________________________

      public static void menu() {
   System.out.println("1: Add Student");
   System.out.println("2: Add Employee ");
   System.out.println("3. Display All Students");
   System.out.println("4: Display All Employees");
   System.out.println("5: Display Faculty");
   System.out.println("6 : Display Staff");
   System.out.println("7: Display Students by YOG");
   System.out.println("8: Display Students by Major");
   System.out.println("9: Linear student search by last name and display");
   System.out.println("10: Linear employee search by last name and display ");
   System.out.println("11: Binary student search by first name and display ");
   System.out.println("12: Binary employee search by first name and display ");
   System.out.println("13: Selection Sort by Last name "); 
   System.out.println("14: Insertion Sort by First name "); 
   System.out.println("15: Total number of Students");
   System.out.println("16: Total number of Employees");
   System.out.println("17: Sort Students by GPA");
  System.out.println("18: EXIT ");

   
  }        // _______________________________________________________SUBMENU OPTIONS _______________________________________________________

       public static void submenuE() {
       System.out.println("1.Delete the Employee");
       System.out.println("2. Change Salary");
       System.out.println("3.Back to main menu");
   }
        public static void submenuS() {
       System.out.println("1.Delete the Student");
       System.out.println("2. Change GPA");
       System.out.println("3.Change Major");
       System.out.println("4.Change Minor");
       System.out.println("5.Back to main menu");
        }
             // _______________________________________________________BUBBLE SORTS _______________________________________________________

           public static void bubbleSort(Students [] st) {
        Students temp;
      for ( int i = 0; i < st.length-1; i++) {
          for(int j = 1; j < st.length; j++) {
        if(st[j-1].getfname().compareToIgnoreCase(st[j].getfname()) > 0) {
            temp = st[j-1];
            st[j-1] = st[j];
            st[j] = temp;
        }
          }
      }
    }
      public static void bubbleSortE(Employee [] em) {
        Employee temp;
      for ( int i = 0; i < em.length-1; i++) {
          for(int j = 1; j < em.length; j++) {
        if(em[j-1].getfname().compareToIgnoreCase(em[j].getfname()) > 0) {
            temp = em[j-1];
            em[j-1] = em[j];
            em[j] = temp;
          }
          
      }
      }
    }
          // _______________________________________________________BINARY SEARCHES _______________________________________________________

    public static void binSearch(Students [] st, int first, int last, String in) {
        int mid;
        if (last == 1) mid = 0;
         else
        mid = last-first/2;
      mid = first + mid; 
      
      if (st[mid].getfname().compareToIgnoreCase(in) == 0) { // MID
           st[mid].display();
      }
      else if (in.compareToIgnoreCase(st[mid].getfname()) > 0) { // GREATER RightSIDE
         binSearch (st,mid +1, last, in); 
         }
       else  
         binSearch (st,first, mid -1 , in);  // LESS THAN Leftside
      
    }
    public static void binSearchE(Employee [] em, int first, int last, String in) {
        int mid;
        if (last == 1) mid = 0;
         else
        mid = last-first/2;
      mid = first + mid; 
      
      if (em[mid].getfname().compareToIgnoreCase(in) == 0) { // MID
           em[mid].display();
      }
      else if (in.compareToIgnoreCase(em[mid].getfname()) > 0) { // GREATER RightSIDE
         binSearchE (em,mid +1, last, in); 
      }
       else  
         binSearchE (em,first, mid -1 , in);  // LESS THAN Leftside
    }
    
}//class
//       // _______________________________________________________END OF PROGRAM _______________________________________________________
