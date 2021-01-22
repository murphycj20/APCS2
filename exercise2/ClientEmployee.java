import java.util.Scanner;

public class ClientEmployee {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        String last, first, dept;
        double pay_rate;
        int hours;

        System.out.print("Enter first name: ");
        first = input.nextLine();
        System.out.print("Enter last name: ");
        last = input.nextLine();
        System.out.print("Enter dept: ");
        dept = input.nextLine();
        System.out.print("Enter pay rate: ");
        pay_rate = input.nextDouble();
        System.out.print("Enter hours: ");
        hours = input.nextInt();
    
    
        Employee prof = new Employee("John", "Doe", 25.50, 50, "COSC");
        Employee newEmp = new Employee(); 
	newEmp.setAll(first, last, pay_rate, hours, dept);

	System.out.println(prof);
	System.out.println(newEmp);

	prof.print();
	System.out.println();
	newEmp.print();
	System.out.println();

	System.out.println(newEmp);

	System.out.println(prof.equals(newEmp));
    }

}