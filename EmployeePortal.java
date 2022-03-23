package org.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePortal {

	static class Employee {

		private int empId;
		private String name;
		private String dOJ;
		private String gender;

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDOJ() {
			return dOJ;
		}

		public void setDOJ(String dOJ) {
			this.dOJ = dOJ;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

	}

	static ArrayList<Employee> employees = new ArrayList<Employee>();

	public static void output() {

		System.out.println("+---------------+---------------+---------------+-------+");
		System.out.println("|" + "Name" + "\t\t" + "|" + "Employee Id" + "\t" + "|" + "D.O.J" + "\t\t" + "|" + "Gender"
				+ "\t" + "|");
		System.out.println("+---------------+---------------+---------------+-------+");

		for (int i = 0; i < employees.size(); i++) {
			System.out.println("|" + employees.get(i).getName() + "\t" + "|" + employees.get(i).getEmpId() + "\t\t"
					+ "|" + employees.get(i).getDOJ() + "\t" + "|" + employees.get(i).getGender() + "\t" + "|");
			System.out.println("+---------------+---------------+---------------+-------+");
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter Employee Count : ");
		int employeeCount = Integer.parseInt(s.nextLine());
		System.out.println();

		for (int i = 0; i < employeeCount; i++) {

			Employee emp = new Employee();

			System.out.print("Enter Name : ");
			emp.setName(s.nextLine());

			System.out.print("Enter Employee ID : ");
			emp.setEmpId(Integer.parseInt(s.nextLine()));

			System.out.print("Enter Date Of Joining : ");
			emp.setDOJ(s.nextLine());

			System.out.print("Enter Gender : ");
			emp.setGender(s.nextLine());

			employees.add(emp);
			System.out.println();

		}
		System.out.println("Employee List");
		output();
		System.out.println();
		System.out.println("Enter '1' to Add an another Employee Details");
		System.out.println("Enter '2' to Remove an Employee from the List");
		System.out.println("Enter '3' to Display a particular Employee Details");
		System.out.println("Enter '4' to Complete and Show the Employee List");
		System.out.println();
		System.out.println("**********************************************************");

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

				Employee emp = new Employee();

				System.out.print("Enter Name : ");
				emp.setName(s.nextLine());

				System.out.print("Enter Employee ID : ");
				emp.setEmpId(Integer.parseInt(s.nextLine()));

				System.out.print("Enter Date Of Joining : ");
				emp.setDOJ(s.nextLine());

				System.out.print("Enter Gender : ");
				emp.setGender(s.nextLine());

				employees.add(index, emp);

				System.out.println();
				System.out.println("Employee List");
				output();

				System.out.println();
				System.out.println("Enter '1' to Add an another Employee Details");
				System.out.println("Enter '2' to Remove an Employee from the List");
				System.out.println("Enter '3' to Display a particular Employee Details");
				System.out.println("Enter '4' to Complete and Show the Employee List");
				System.out.println();
				System.out.println("**********************************************************");

				System.out.print("Please Enter Option : ");
				break;
			}
			case 2: {
				System.out.print("Please Enter Roll Number to remove : ");
				int temp = 0;
				do {
					String roll = s.nextLine();
					for (Employee employee : employees) {

						if (Integer.toString(employee.getEmpId()).equals(roll)) {
							employees.remove(employee);
							temp++;
							break;
						}
					}
					if (temp == 0) {

						System.out.println("******Entered Employee Id is Invalid******");
						System.out.print("Please Enter Valid Employee Id : ");

					}
				} while (temp != 1);
				System.out.println();
				System.out.println("Employee List");
				output();

				System.out.println();
				System.out.println("Enter '1' to Add an another Employee Details");
				System.out.println("Enter '2' to Remove an Employee from the List");
				System.out.println("Enter '3' to Display a particular Employee Details");
				System.out.println("Enter '4' to Complete and Show the Employee List");
				System.out.println();
				System.out.println("**********************************************************");

				System.out.print("Please Enter Option : ");
				break;
			}
			case 3: {
				System.out.print("Please Enter Employee Id : ");
				int temp = 0;
				do {
					String roll = s.nextLine();
					for (Employee employee : employees) {
							
						if (Integer.toString(employee.getEmpId()).equals(roll)) {
							System.out.println();
							System.out.println("Name\t\t: " + employee.getName());
							System.out.println("Employee Id\t: " + employee.getEmpId());
							System.out.println("DOJ\t\t: " + employee.getDOJ());
							System.out.println("Gender\t\t: " + employee.getGender());
							temp++;
							break;
						}
					}
					if (temp == 0) {
						System.out.println("******Entered Employee Id is Invalid******");
						System.out.print("Please Enter Valid Employee Id : ");
					}
				} while (temp != 1);
				System.out.println();
				System.out.println("Enter '1' to Add an another Employee Details");
				System.out.println("Enter '2' to Remove an Employee from the List");
				System.out.println("Enter '3' to Display a particular Employee Details");
				System.out.println("Enter '4' to Complete and Show the Employee List");
				System.out.println();
				System.out.println("**********************************************************");

				System.out.print("Please Enter Option : ");
				break;
			}
			case 4: {
				s.close();

				System.out.println();
				System.out.println("Final Employee List");
				output();

				System.out.println();
				System.out.println("*********Final Employee List Printed Scessfully**********");
				break;
			}
			default: {
				System.out.println();
				System.out.println("No Match Found");

				System.out.println();
				System.out.println("Enter '1' to Add an another Employee Details");
				System.out.println("Enter '2' to Remove an Employee from the List");
				System.out.println("Enter '3' to Display a particular Employee Details");
				System.out.println("Enter '4' to Complete and Show the Employee List");
				System.out.println();
				System.out.println("**********************************************************");

				System.out.print("Please Enter Valid Option : ");
				break;
			}
			}
		} while (option != 4);
	}

}
