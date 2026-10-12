package atm;

import java.util.Scanner;

class EmployeeDetails {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public EmployeeDetails(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;

        switch (designation.toUpperCase()) {
            case "P20":
                this.salary = 20000;
                break;
            case "M30":
                this.salary = 30000;
                break;
            case "T25":
                this.salary = 25000;
                break;
            default:
                this.salary = 15000;
                break;
        }
    }

    public void display() {
        System.out.println("your name is " + name);
        System.out.println("your age is " + age);
        System.out.println("your salary " + salary);
        System.out.println("your desgination is " + designation);
    }

    public void raiseSalary(double amount) {
        this.salary += amount;
    }
}

public class MainEmpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDetails emp = null;

        while (true) {
            System.out.println("\n1)Create 2) Display 3) Raise salary 4) Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

case 1:
    String answer;

    do {
        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the designation (P20/M30/T25): ");
        String desig = sc.nextLine();

        emp = new EmployeeDetails(name, age, desig);

        System.out.println("Employee created successfully!");

        System.out.print("Do you want to create another employee? (yes/no): ");
        answer = sc.nextLine();

    } while (answer.equalsIgnoreCase("yes"));

    break;


                case 2:
                    if (emp != null) {
                        emp.display();
                    } else {
                        System.out.println("No employee data found.");
                    }
                    break;

                case 3:
                    if (emp != null) {
                        System.out.print("Enter raise amount: ");
                        double raise = sc.nextDouble();
                        emp.raiseSalary(raise);
                    } else {
                        System.out.println("No employee data found.");
                    }
                    break;

                case 4:
                    sc.close();
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}









