package com.bridgelabz.codeinclub.utils;
/*
Read from User Data & Display data
@author manjit Khurana
*/

import com.bridgelabz.codeinclub.modles.People;
import com.bridgelabz.codeinclub.utils.WriteCSV;
import java.util.*;

public class ReadCSV{

     private static ArrayList<People> peopleEntity = new ArrayList<People>();
     private static Scanner userData = new Scanner(System.in);

// read user input 
    public static void userInput(){
 
       People peopleEntry = new People();
        
	            System.out.println("Enter the FirstName: ");
              peopleEntry.setFirstName(userData.nextLine());
        
	           	System.out.println("Enter the LastName: ");
      		    peopleEntry.setLastName(userData.nextLine());
        	
	            System.out.println("Enter Address: ");
               peopleEntry.setAddress(userData.nextLine());
        
	    	      System.out.println("Enter City: ");
        	    peopleEntry.setCity(userData.nextLine());
        
	    	      System.out.println("Enter State: ");
        	    peopleEntry.setState(userData.nextLine());
        
	            System.out.println("Enter Phone number: ");
              peopleEntry.setPhoneNumber(userData.nextLine());
        
	            System.out.println("Enter ZipCode: ");
              peopleEntry.setZip(userData.nextLine());
        
	    	peopleEntity.add(peopleEntry);
    }
    
  // call StoreInfo method to use store in csv
    public static void storeInfo(){
        WriteCSV.storeDetails(peopleEntity);
    }
 
 // showDetails People-Entry Method
     public static void showDetails(){
       	   for(People ppl : peopleEntity){
           		System.out.println("FirstName: "+ppl.getFirstName());
			        System.out.println("LastName: "+ppl.getLastName());
          		System.out.println("Address: "+ppl.getAddress());
           	 	System.out.println("City: "+ppl.getCity());
           	 	System.out.println("Zip: "+ppl.getZip());
		         	System.out.println("PhoneNumber: "+ppl.getPhoneNumber());
        }
    }
}
