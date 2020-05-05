package com.bridgelabz.codeinclub.utils;
/*
Write data In Csv
@author Manjit Khurana
*/

import com.bridgelabz.codeinclub.modles.People;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;

public class WriteCSV {

    public static void storeDetails(ArrayList<People> data){
        try{
            PrintWriter filedata = new PrintWriter("com/bridgelabz/codeinclub/utils/file/AddressBook.csv");
	
            for(People ppl : data){
                String csvfile = ppl.getFirstName()+","+ppl.getLastName()+","+ppl.getAddress()+","+ppl.getCity()+","+ppl.getState()+","+ppl.getZip()+","+ppl.getPhoneNumber()+";";
                System.out.println(csvfile);
			        	filedata.println(csvfile);
            }
            filedata.close();

        }catch(IOException e){
            System.out.println("File Input data Error ");
        }
        System.out.println("Succesfully Enter Data");
    }


}
