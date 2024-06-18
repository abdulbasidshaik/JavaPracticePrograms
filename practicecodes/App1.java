package com.wipro.practicecodes;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class App1 {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the University: ");
		String universityName=sc.nextLine();
		List<College> collegeList=new ArrayList<>();
		University university=new University(universityName, collegeList);
		int choice=5;
		do
		{
			System.out.println("1.Add College \r\n"
					+ "2.Delete College \r\n"
					+ "3.Display Colleges \r\n"
					+ "4.Exit \r\n"
					+ "Enter your choice: \r\n"
					+ "");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:		//add college
				String detail=sc.nextLine();
				if(detail.equals(""))
						detail=sc.nextLine();
				College college=College.createCollege(detail);
				university.addCollegeToUniversity(college);
				break;
			case 2:		//delete college
				System.out.println("Enter the name of the college to be deleted: ");
				String collegeName=sc.nextLine();
				if(collegeName.equals(""))
					collegeName=sc.nextLine();
				Boolean status = university.removeCollege(collegeName);
				if(status)
				{
					System.out.println("College successfully deleted");
				}else
				{
					System.out.println("College not found in the University");
				}
				break;
			case 3:		//display college
				university.displayColleges();
				break;
			case 4:		//exit
				System.exit(0);
				break;
			}
		}while(choice<4);
	}		
}
