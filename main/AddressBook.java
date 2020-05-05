package com.bridgelabz.codeinclub.main;

/*
  Main AddressBook File
  @author Manjit Khurana
*/

import com.bridgelabz.codeinclub.utils.ReadCSV;
import java.util.*;

class AddressBook{

  private static Scanner userdata = new Scanner(System.in);
//Main Method
   
   public static void main(String[] args){   
     int select=0;
// Loop cont.. when user cannot select 4
		while(select!=4){
       
       System.out.println("Select the task to perform \n"+
				"1. Create new People Entry \n"+
				"2. Show existing Entry\n"+
				"3. Save AddressBook \n"+
				"4. Close AddressBook\n");     
           select = userdata.nextInt();
 
 // Switch case to select task 
            switch(select){
                case 1:
                    System.out.println("Add People In Address-Book");
                    ReadCSV.userInput();
                    break;
                case 2:
                    System.out.println("Show Contacts Details");
                    ReadCSV.showDetails();
                    break;
                case 3:
                    System.out.println("Save in csv file ");
                    ReadCSV.storeInfo();
                    break;
		          case 4:
		                System.out.println("Close AddressBook App");
                    System.exit(0);
              default:
                    System.out.println(" ");
            }
        }
    }
}
