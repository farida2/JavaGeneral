/*
 *  Farida Belhous
 */


import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.*;


//import java.util.Scanner;

public class Hello {
	public static void main(String[] args) throws Exception{
//		Scanner input = new Scanner(System.in) ;
//		System.out.println("Hello world !");
//		Variables obj = new Variables();
//		obj.method();
//		System.out.println(Variables.m);
//		
////////////////	
//		User k = new User();
//		System.out.println("Enter the first name of user ");
//		k.setFirstName(input.nextLine());
//		System.out.println("Enter the last name of user ");
//		k.setLastName(input.nextLine());
//		System.out.println("Enter the age of user ");
//		k.setAge(input.nextInt());
//		
//		System.out.println("information of the user :");
//		System.out.println("The user's first name :" + k.getFirstName());
//		System.out.println("The user's last name :" + k.getLastName());
//		System.out.println("The user's age :" + k.getAge());
//		System.out.println("Hello " + k.getFirstName()+"!");
//		
///////////////////////////////////// Serialize an object
//		User user1 = new User("maria", "bel");
//		
//		FileOutputStream fileOut = new FileOutputStream("/Users/FaridaB/eclipse-workspace/NewApp/src/f.txt");
//		ObjectOutputStream out = new ObjectOutputStream(fileOut);
//		
//		out.writeObject(user1);
//		out.flush();// screening out
//		
//		System.out.println("success!");
//////////////////////////////////	deserialize an object	
		
//		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
//		User user2 = (User)in.readObject();
//		System.out.println(user2.firstName+ " " + user2.lastName);
//		
//		in.close();
//		
	
///////////////// Autoboxing : convert primitive data to wrapper class
//		int a = 20;
//		Integer b = Integer.valueOf(a);
//		Integer c = a;
//		
//		System.out.println(a + " " + b + " " + c);
		
///////////////// inboxing : convert wrapper data to primitive data
		
//		Integer x =  5;
//		int y = x.intValue();
//		int z = x;
//		
//		System.out.println(x + " " + y + " " + z);		
//		
		
/////////////// equals() method and if-else condition
//		String s1 = new String("hello");
//		String s2 = new String("hello");
//		
//		if (s1.equals(s2)) {
//			System.out.println("s1 equals s2");
//		}
//		else {
//			System.out.println("s1 is not equal to s2");
//		}	
		
/////////////// == operation and if-else condition 
//		String s3 = new String("hello");
//		String s4 = new String("hello");
//		
//		if (s3 == s4) {      // checking on the memory location of s3 and s4 not their values
//			System.out.println("s3 equals s4");
//		}
//		else {
//			System.out.println("s3 is not equal to s4");
//		}	
//		
/////////////////////////	The for loop
//		for (int i = 1 ; i <= 10; i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		for (int i = 10 ; i >= 1; i--) {
//			System.out.print(i + " ");
//		}
		
/////////////////////////// The while loop
//		int i = 1;
//		while (i <= 10) {
//			System.out.print(i + " ");
//			i++;
//		}
//		System.out.println();
//		
//		int j = 10;
//		while (j >= 1) {
//			System.out.print(j + " ");
//			j--;
//		}
		
////////////////// The do while loop
//		int i = 1;
//		do {
//			System.out.print(i + " ");
//			i++;
//		}while (i <= 10);
//		System.out.println();
//		
//		int j = 10;
//		do {
//			System.out.print(j + " ");
//			j--;
//		}while (j >= 1);
//		
		
/////////////////// The break; statement to exit the loop at a certain element
//		int[] numbers = {5, 10, 15, 20, 25, 30};
//		for(int x : numbers) {
//			if(x == 25) {
//				break;
//			}
//			System.out.print(x);
//			System.out.print("\n");
//		}
///////////////// The continue; statement to go through the loop and skip a certain element 
//		int[] numbers = {5, 10, 15, 20, 25, 30};
//		for(int x : numbers) {
//			if(x == 20) {
//				continue;
//			}
//			System.out.print(x);
//			System.out.print("\n");
//		}
		
////////////////////////// Array of alphabets 
//		char[] myArr = new char[26];
//		for (int i =0; i < 26; i++) {
//			myArr[i] = (char)('A'+ i);
//		}
//		System.out.println(myArr);
//
//////////////////////////Array of alphabets 
//		int[] myArr = new int[5];
//		myArr[0] = 10;
//		myArr[1] = 20;
//		myArr[2] = 30;
//		myArr[3] = 40;
//		myArr[4] = 50;
//		for (int i =0; i < myArr.length; i++) {
//			System.out.println(myArr[i]);
//		}
//////////////////////
//		// Declaring of allocating memory to an array
//		int[] myArr = new int[3];
//		// Initializing elements
//		myArr[0] = 1;
//		myArr[1] = 2;
//		myArr[2] = 3;
//		
//		// Display array elements
//		System.out.println(myArr[0]);
//		System.out.println(myArr[1]);
//		System.out.println(myArr[2]);
//		
//		// Or Use for loop
//		System.out.println();
//		
//		for (int i =0; i < myArr.length; i++) {
//			System.out.println(myArr[i]);
//		}
		
//// //////////////////////////// Example begins: Delete an element from an array:
//		int n, x, flag =1, loc = 0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter #no of elements you want in your array:");
//		n = input.nextInt();
//		int newArr[] = new int [n];
//		
//		System.out.println("Enter all elements :");
//		for (int i =0; i < n; i++) {
//			newArr[i] = input.nextInt();
//		}
//		
//		
//		System.out.println("Enter the element you want to delete : ");
//		x = input.nextInt();
//		for (int i =0; i < n; i++) {
//			if(newArr[i] == x) {
//				flag = 1;
//				loc = i;
//				break;
//			}else {
//				flag = 0;
//			}
//			
//		}
//		// if the element to be deleted is found then,delete it then keep shifting the other elements
//		if(flag == 1) {
//			for(int i = loc + 1 ; i < n ; i++) {
//				newArr[i - 1] = newArr[i];
//			}
//			System.out.println("After deleting: ");
//			for(int i = 0 ; i < n -2 ; i++) {
//				System.out.println(newArr[i] + ", ");
//			}
//			System.out.println(newArr[n - 2]);
//		}else{
//			System.out.println("Element not found !");
//		}
//// ////////////////////////////Example ends: Delete an element from an array
//		
////////////////////////////////// Multi-dimensional array : [row][col]
//		int myArr[][] = new int[2][3];
//		// Initialize elements :
//		myArr[0][0] = 1;
//		myArr[0][1] = 2;
//		myArr[0][2] = 3;
//		myArr[1][0] = 4;
//		myArr[1][1] = 5;
//		myArr[1][2] = 6;
//		
//		System.out.println(myArr[0][0]);
//		System.out.println(myArr[0][1]);
//		System.out.println(myArr[0][2]);
//		System.out.println(myArr[1][0]);
//		System.out.println(myArr[1][1]);
//		System.out.println(myArr[1][2]);
//		
//		for (int i = 0; i< myArr.length; i++) {
//			
//			for(int j = 0; j < myArr[i].length; j++) {
//				System.out.print(myArr[i][j]);
//				System.out.print(" ");
//			}
//		}
		
/////////////////////////// Converting primitive int array to a list
//		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// //		List<Integer> aList = IntStream.of(number).boxed().collect(Collectors.toList());
//		List<Integer> aList = Arrays.stream(number).boxed().collect(Collectors.toList());
//		
//		System.out.print("List:  "+ aList);
//		
				
//////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////
//////////////////////////////Static Methods/////////////////////////////////////////////
//		students3.change();
//		students3 s1 = new students3(101, "Maria");
//		students3 s2 = new students3(202, "Jack");
//		students3 s3 = new students3(303, "Gabby");
//		
//		s1.display();
//		s2.display();
//		s3.display();
//		
	/////////////////////////////////////////////////////////////// Demonstrating THE USE OF SUPER
//		Cat kitten = new Cat();
//		kitten.printColor();
//		
/////////////////////// Using super and this keywords
//		Employee emp1 = new Employee("Farida", 80000f);
//		emp1.display();
//		
//////////////////////////////////////////////////////// Abstract class
//		Shape shape1 = new Rectangle();
//		Shape shape2 = new Triangle();
//		
//		shape1.draw();
//		shape2.draw();
		
/////////////////////////////////// try-catch block // YOU CAN HAVE MORE THAN ONE CATCH BLOCK
//		try {
//			//int i = 10/1; // Output 10 no errors
//			
//			int i = 10/0; // Output Error: / by zero
//			System.err.println(i);
//		}
//		catch(ArithmeticException ex) {
//			System.err.println("Error: " + ex.getMessage());
//		}
		
//////////////////////////////////////////// throws keyword
//		ShowingThrows obj1 = new ShowingThrows();
//		obj1.myThirdMethod();
//		System.err.println("The program is working!");
//		
		
////////////////////////////////////////////// finally block	
////// always make sure to follow you try-catch by finally block for cleaner closing connection
//		try {
//			int x = 300;
//		}
//		catch(Exception exp) {
//			System.out.println(exp);
//		}
//		finally {
//			System.out.println("Finally block is executed!");
//		}
//		
		
////////////////////////// Custom Exception "InvalidAgeException"
//		try {
//			validateAge(17);
//		}
//		catch(Exception exp) {
//			System.out.println("Exception occured : " +  exp);
//			System.out.println("The code is working!");
//		}
		
///////////////////////////////////// Strings:
///////////////////////////// matches() method
//		String str = new String("You Are Awesome");
//		
//		System.out.println("regex: (.*)Are(.*) matches Are ?");
//		System.out.println(str.matches("(.*)Are(.*)")); // Output : True
//		
//		System.out.println("regex: (.*)Air(.*) matches Are ?");
//		System.out.println(str.matches("(.*)Air(.*)")); // Output : False
//		
//		System.out.println("regex: (.*)Aray(.*) matches Are ?");
//		System.out.println(str.matches("(.*)Aray(.*)")); // Output : False
//		
//		System.out.println("regex: (.*)Awesome matches Awesome ?");
//		System.out.println(str.matches("(.*)Awesome")); // Output : True
		
/////////////////////////////////////// compareTo() method 
//		String str1 = "Good";
//		String str2 = "Morning";
//		String str3 = "Good";
//		String str4 = "Smith";
//		String str5 = "Goat";
//		
//		System.out.println(str1.compareTo(str3)); // Output : 0  because both are equal
//		System.out.println(str1.compareTo(str2)); // Output : -16  because G is 16 times lower than M
//		System.out.println(str1.compareTo(str4)); // Output : -12  because G is 12 times lower than S
//		System.out.println(str1.compareTo(str5)); // Output : 14  because o is 14 times greater than a
		
////////////////////////////////////////////// concat() method
		
//		String str1 = "Good";
//		String str2 = "Morning";
//		String str3 = "Mr";
//		String str4 = "Smith";
//		
//		str1 = str1.concat(str2);
//		System.out.println(str1);
		
////////////////////////////////// equals() method
		
//		String str1 = "Good";
//		String str2 = "Morning";
//		String str3 = "Good";
//		String str4 = "Smith";
//		
//		System.out.println(str1.equals(str3)); // Output : true  because both are equal
//		System.out.println(str1.equals(str2)); // Output : false  
//		System.out.println(str1.equals(str4)); // Output : false

//////////////////////////////////////// split() method returns an array
		
//		String str1 = "You are amazing , keep up the good work !";
//		String[] words = str1.split("\\s", 5); // splits by white spaces until the fifth character
//		//String[] words = str1.split("\\s"); // splits by white spaces

		//		// using foreach loop
//		for(String elements: words) {
//			System.out.println(elements);
//		}
		
/////////////////////////////////////////// substring() method returns new string
		//////// that is part of the original string
		
//		String str1 = "YouAreAmazingKeepUpTheGoodWork!";
//		
//		System.out.println(str1.substring(3)); // Output : AreAmazingKeepUpTheGoodWork !
//		
//		System.out.println(str1.substring(4, 13)); // Output: reAmazing
		
///////////////////// format() method returns a formatted string
//		String myStr = "Farida";
//		
//		String str1  = String.format("My name is %s", myStr);
//		String str2 = String.format("My name is %f", 99.999999);
//		String str3 = String.format("My name is %99.99f", 99.999999);
//		
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
		
/////////////////////////////////// StringBuilder (capacity 16 elements) has so many methods
////////////////////// StringBuffer (append and insert methods)
		
//		StringBuffer strb1 = new StringBuffer("Welcome ");
//		strb1.append("Farida");
//		System.out.println(strb1); // Output : Welcome Farida
//		
//		strb1.insert(8, "The beautiful "); 
//		System.out.println(strb1); // Output : Welcome The beautiful Farida
		
//////////////////// Dates and  java.util.Date class
//		long milliSecond = System.currentTimeMillis();
//		java.util.Date date = new  java.util.Date(milliSecond);
//		System.out.println(date); // Output : Fri Aug 28 12:22:01 EDT 2020
//		
		
/////////////////////  SimpleDateFormat class
//		Date date = new Date();
//		// for some reasons MM has to be uppercase
//		// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  // Output :28/08/2020
//		SimpleDateFormat formatter = new SimpleDateFormat(); // Output : 8/28/20, 3:06 PM
//		String stringDate = formatter.format(date);
//		System.out.println(stringDate);
		
////////////////////////////////////// java.util.calendar and GrigorianCalendar
		
//		Calendar calendar = new GregorianCalendar();
//		
//		int year        = calendar.get(Calendar.YEAR);
//		int month       = calendar.get(Calendar.MONTH); // Jan =0 not 1
//		int dayOfMonth  = calendar.get(Calendar.DAY_OF_MONTH); 
//		int dayOfWeek   = calendar.get(Calendar.DAY_OF_WEEK); 
//		int weekOfYear  = calendar.get(Calendar.WEEK_OF_YEAR); 
//		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH); 
//		
//		System.out.println(year);         // Output: 2020
//		System.out.println(month);        // Output: 7
//		System.out.println(dayOfMonth);   // Output: 28
//		System.out.println(dayOfWeek);    // Output: 6
//		System.out.println(weekOfYear);   // Output: 35
//		System.out.println(weekOfMonth);  // Output: 5
//		

////////////////////// java.time.LocalDate class is immutable format :(yyy-mm-dd)
//		LocalDate localDateToday = LocalDate.now();
//		ZoneId z = ZoneId.of("Japan");
//		LocalDate localDateZone = LocalDate.now(z);
//		
//		System.out.println("Today's date now is : " + localDateToday);// output: Today's date now is : 2020-08-28
//		System.out.println("Today's date now at zone Japan is : " + localDateZone); // output : Today's date now at zone Japan is : 2020-08-29
//		
		
/////////////// java.time.LocalTime format :(hh:mm:ss.zzz.)
		
//		LocalTime currentTime = LocalTime.now();
//		ZoneId z = ZoneId.of("Japan");
//		LocalTime localTimeZone = LocalTime.now(z);
//		
//		System.out.println("The current time here is : " + currentTime);// output: The current time here is : 15:34:08.596328
//		System.out.println("The current time at Japan is : " + localTimeZone); // output : The current time at Japan is : 04:34:08.599746
//		
		
///////////////////// java.time.LocalDateTime
//		LocalDateTime currentDateTime = LocalDateTime.now();
//		ZoneId z = ZoneId.of("Japan");
//		LocalDateTime localDateTimeZone = LocalDateTime.now(z);
//		
//		System.out.println("The current date/time is : " + currentDateTime);// output: The current date/time is : 2020-08-28T15:46:57.699460
//		System.out.println("The date/time at Japan is : " + localDateTimeZone); // output : The date/time at Japan is : 2020-08-29T04:46:57.704622
//		
		
///////////////////////////////// java.time.Period returns the amount of time in terms
		///////// of years,months and days
		
//		LocalDate localDate1 = LocalDate.of(2013, 11, 12);
//		LocalDate localDate2 = LocalDate.of(2020, 8, 28);
//		
//		Period age = Period.between(localDate1, localDate2);
//		
//		
//		System.out.println("The age between Nov-12-2013 and Aug-28-2020 is : Years("+
//		age.getYears() + "), Months("+ age.getMonths() + ") ,Days(" + age.getDays() +")");// output: The age between Nov-12-2013 and Aug-28-2020 
//		///// is : Years(6), Months(9) ,Days(16)
		
//		
		
////////////////// java.time.format.DateTimeFormatter 
		
//		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z");
//		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
//		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		
//		ZonedDateTime zoneDateTime = ZonedDateTime.now();
//		String formatter1 = dateTimeFormatter1.format(zoneDateTime);
//		String formatter2 = dateTimeFormatter2.format(zoneDateTime);
//		String formatter3 = dateTimeFormatter3.format(zoneDateTime);
//		
//		System.out.println(formatter1); // output: 2020/08/28 16:06:23 EDT
//		System.out.println(formatter2); // output: 28/Aug/2020
//		System.out.println(formatter3); // output: 2020/08/28
		 
//////////////////////////////////////////////////////////////////////////		
////////////////////////// ArrayLists
		
//		ArrayList<String> aList = new ArrayList<String>(); // Create an ArrayList
//		
//		// Add objects
//		aList.add("Maria");
//		aList.add("Mazen");
//		aList.add("Leanne");
//		aList.add("Djamila");
//		aList.add("John");
//		System.out.println(" My list is  :" + aList);
//		
//		// using an iterator to go through aList
//		java.util.Iterator<String> iter = aList.iterator();
//		while (iter.hasNext()){
//			System.out.println(iter.next() + " ");
//		}
		
///////////////////////////////////////////////////////////
		/////////////// Predicate and Lambda expression
//		Child child1 = new Child(3);
//		Child child2 = new Child(2);
//		Child child3 = new Child(7);
//		Child child4 = new Child(10);
//		Child child5 = new Child(6);
//		Child child6 = new Child(9);
//		Child child7 = new Child(8);
//		
//		List<Child> children = Arrays.asList(new Child[] {child1, child2, child3, child4, child5, child6, child7 });
//		
//		List<Child> filtered = ChildPredicates.filterChilds(children, ChildPredicates.filterByAge(8));
//		
//		for (Child  x : filtered) {
//			System.out.println(x.getAge());
//			
//		}
		
/////////////////////////////////////////////////////////////////
	////////////////// Thread 
		
//		HelloRunner r = new HelloRunner();
//		Thread tr = new Thread(r);
//		tr.start();
		
///////////////////////////////// Deadlock example (Multi-threading)
		
		Thread1 tr1 = new Thread1();
		Thread2 tr2 = new Thread2();
		
		tr1.start();
		tr2.start();
		
		
		
		
		
		
		
		
		
		

	}// The end of the main() method
	
/////// A method used for the custom exception
//	static void validateAge(int age) throws InvalidAgeException{
//		if(age < 18) {
//			throw new InvalidAgeException("You can not get a driving licence!");
//		}
//		else {
//			
//			System.out.println("You can drive!");
//		}
//	}

	

}
