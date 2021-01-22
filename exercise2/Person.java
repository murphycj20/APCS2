public class Person {
	private String firstName, lastName;

	public Person(){
		firstName = "John";
		lastName = "Doe";
	}

	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}	

	public String getFirst(){
		return firstName;
	}

	public String getLast(){
		return lastName;
	}

	public void setName(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void print(){
		System.out.print(firstName + " " + lastName);
	}

	public void printLastFirst(){
		System.out.print(lastName + ", " + firstName);
	}

	public String toString(){
		return firstName + " " + lastName;
	}

	public boolean equals(Object o){
		return o.toString().equals(toString());
	}

	public void copy(Person p){
		p = getCopy();
	}

	public Person getCopy(){
		return new Person(getFirst(), getLast());
	}

}