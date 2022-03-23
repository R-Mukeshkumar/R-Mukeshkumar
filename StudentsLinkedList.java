package org.linkedlist;

import java.util.*;
//import java.util.Scanner;

public class StudentsLinkedList {
	
	static class Student {

		private int rollNo;
		private String name;
		private int age;
		private String gender;

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

	}

	static LinkedList<Student> students = new LinkedList<Student>();

	public static void output() {

		System.out.println("+-------+-------+-------+-------+");
		System.out
				.println("|" + "Name" + "\t" + "|" + "Roll" + "\t" + "|" + "Age" + "\t" + "|" + "Gender" + "\t" + "|");
		System.out.println("+-------+-------+-------+-------+");

		for (int i = 0; i < students.size(); i++) {
			System.out.println("|" + students.get(i).getName() + "\t" + "|" + students.get(i).getRollNo() + "\t" + "|"
					+ students.get(i).getAge() + "\t" + "|" + students.get(i).getGender() + "\t" + "|");
			System.out.println("+-------+-------+-------+-------+");
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter Student Count : ");
		int studentCount = Integer.parseInt(s.nextLine());
		System.out.println();

		for (int i = 0; i < studentCount; i++) {

			Student stu = new Student();

			System.out.print("Enter Name : ");
			stu.setName(s.nextLine());

			System.out.print("Enter Roll Number : ");
			stu.setRollNo(Integer.parseInt(s.nextLine()));

			System.out.print("Enter Age : ");
			stu.setAge(Integer.parseInt(s.nextLine()));

			System.out.print("Enter Gender : ");
			stu.setGender(s.nextLine());

			students.add(stu);
			System.out.println();

		}
		output();
		System.out.println();
		System.out.println("Enter '1' to add a Student Details");
		System.out.println("Enter '2' to remove a Student Details");
		System.out.println("Enter '3' to finish the List");
		System.out.println("*******************************************");
		System.out.println();

		System.out.print("Please Enter Option : ");
		int option;
		do {
			option = Integer.parseInt(s.nextLine());
			switch (option) {
			case 1: {
				System.out.print("Please Enter Position to add : ");
				int position = Integer.parseInt(s.nextLine());
				int index = position - 1;
				System.out.println();

				Student stu = new Student();

				System.out.print("Enter Name : ");
				stu.setName(s.nextLine());

				System.out.print("Enter Roll Number : ");
				stu.setRollNo(Integer.parseInt(s.nextLine()));

				System.out.print("Enter Age : ");
				stu.setAge(Integer.parseInt(s.nextLine()));

				System.out.print("Enter Gender : ");
				stu.setGender(s.nextLine());

				students.add(index, stu);

				System.out.println();
				output();

				System.out.println();
				System.out.print("Please Enter Next Option : ");
				break;
			}
			case 2: {
				System.out.print("Please Enter Roll Number to remove : ");
				String roll;
				int size = students.size();
				do {
					roll = s.nextLine();
					for (int i = 0; i < size; i++) {

						if (Integer.toString(students.get(i).getRollNo()).equals(roll)) {
							students.remove(i);
						}
					}
					if (size == students.size()) {

						System.out.println("******Entered Roll Number is Invalid******");
						System.out.print("Please Enter Valid Roll Number : ");

					}
				} while (size == students.size());
				System.out.println();
				output();

				System.out.println();
				System.out.print("Please Enter Next Option : ");
				break;
			}
			case 3: {
				s.close();

				System.out.println();
				output();

				System.out.println();
				System.out.println("********Student Details List Printed Scessfully********");
				break;
			}
			default: {
				System.out.println("No Match Found");

				System.out.println();
				System.out.print("Please Enter Valid Option : ");
				break;
			}
			}
		} while (option != 3);
	}
}
