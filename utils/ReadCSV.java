package com.bridgelabz.codeinclub.utils;
/*
Read from User Data & Display data
@author manjit Khurana
*/
import com.bridgelabz.codeinclub.utils.AddressBookUtill;
import com.bridgelabz.codeinclub.modles.People;
import com.bridgelabz.codeinclub.utils.WriteCSV;
import java.util.*;


public class ReadCSV{

    final ArrayList<People> peopleEntity = new ArrayList<>();
    
// add to data in address book
    public void addToAddressBook(final People people){
        peopleEntity.add(people);
      }

// call StoreInfo method to use store in csv   
    public void storeInfo(){
        WriteCSV.storeDetails(peopleEntity);
     }
// showDetails People-Entry Method  
   public void showDetails(){
        for(People ppl : peopleEntity){
            System.out.println("FirstName: "+ppl.getFirstName());
		      	System.out.println("LastName: "+ppl.getLastName());
            System.out.println("Address: "+ppl.getAddress());
            System.out.println("City: "+ppl.getCity());
			      System.out.println("State: "+ppl.getState());
            System.out.println("Zip: "+ppl.getZip());
		        System.out.println("PhoneNumber: "+ppl.getPhoneNumber());
        }
    }
}