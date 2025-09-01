package com.paket.model;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("***********WELCOME TO COUNTER APPLICATION***********");
		System.out.print("Please enter your full name: ");
		String full_name=scanner.nextLine();
		
		System.out.print("Dear "+full_name+" please enter your Turkish ID number as 11 character: ");
		String id=scanner.nextLine();
		TIN tin=new TIN();
		tin.setId(id);
		

	}

}
