public class Class_Tester {
	public static void main(String[] args){
		Class_2 class_2 = new Class_2();
		System.out.println(class_2);
		class_2.set(1, 5, 39);
		class_2.print();
		System.out.println();

		class_2 = new Class_2(1, 8, 2);
		class_2.print();
		System.out.println();

		Class_1 class_1 = new Class_2();
		class_1.print();
		System.out.println();

	}

}