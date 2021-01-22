public class Employee extends Person {

    private double payRate;    
    private double hoursWorked;
    private String department;

   

    public final int HOURS = 40;

    public final double OVERTIME = 1.5;

   
     public Employee() {
	super();
	payRate = 0.f;
	hoursWorked = 0.f;
	department = "";
     }

     public Employee(String firstName, String lastName, double payRate, double hoursWorked, String department){
	super(firstName, lastName);
	this.payRate = payRate;
	this.hoursWorked = hoursWorked;
	this.department = department;
     }

     public String toString() {
	     return "The wages for " + super.toString() + " from the " + getDepartment() + " are: $" + calculatePay();
     }

 

     public void print() {
	System.out.print("The employee " + super.toString() + " from the " + getDepartment() + " worked " + getHoursWorked() + " with a pay rate of $" + getPayRate() + ". The wages for this employee are $" + calculatePay());
     }

     public double calculatePay() {
	double rate = getPayRate(), hours = getHoursWorked();

	if(hours > HOURS){
		return (HOURS) * rate + (rate * OVERTIME) * (hours - HOURS);		
	}

	return hours * rate;
	
     }

     public void setAll(String first, String last, double rate, double hours, String dep){
	super.setName(first, last);
	payRate = rate;
	hoursWorked = hours;
	department = dep;
     }

     public double getPayRate() {
	return payRate;
     }

     public double getHoursWorked() {
	return hoursWorked;
     }

     public String getDepartment() {
	return department;
     }

     public boolean equals(Object o) {
	return super.equals(o);
     }

     public Employee getCopy() {
	return new Employee(getFirst(), getLast(), getPayRate(), getHoursWorked(), getDepartment());		
     }

     public void copy(Employee e) {
	e = getCopy();
     }

}