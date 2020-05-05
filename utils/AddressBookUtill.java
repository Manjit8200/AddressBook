package com.bridgelabz.codeinclub.utils;
/*
  In this UserInput Number and String couple time use any where
  @author manjit Khurana
*/
import java.util.Scanner;

public final class AddressBookUtill {

    private final static Scanner scanner = new Scanner(System.in);

    private AddressBookUtill(){
        // default constructor 
    }

    public static int getUserNumber(){
        return scanner.nextInt();
    }

    public static String getUserString(){
        return scanner.nextLine();
    }

}
