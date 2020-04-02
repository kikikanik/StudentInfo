public class Tester {

	public static void main(String[] args) {

		Student child1 = new Student ();
		child1.firstName = "Harry";
		child1.lastName = "Potter";
		child1.middleInitial = "S";
		child1.dob_year = 2000;
		child1.dob_month = 04;
		child1.dob_day = 03; 

		String full_name_child1 = child1.getFullName();
		System.out.println(full_name_child1);
		int age_of_child1 = child1.age();
		System.out.println(full_name_child1 + " is " + age_of_child1 + " years old");
		long days_on_earth_child1 = child1.elapsedDays(2004, 04, 03);
		System.out.println("Elapsed Days: " + days_on_earth_child1);


		Student child2 = new Student();
		child2.firstName = "Ron";
		child2.lastName = "Weasley";
		child2.middleInitial = "M";
		child2.dob_year = 2001;
		child2.dob_month = 06; 
		child2.dob_day = 02;

		String full_name_child2 = child2.getFullName();
		System.out.println(full_name_child2);
		int age_of_child2 = child2.age();
		System.out.println(full_name_child2 + " is " + age_of_child2 + " years old");

		long days_on_earth_child2 = child2.elapsedDays(2004, 06, 02);
		System.out.println("Elapsed Days: " + days_on_earth_child2);

		if (days_on_earth_child1 > days_on_earth_child2 ) {
			System.out.println(full_name_child1 + " is older than " + full_name_child2); }
		else { System.out.println(full_name_child2 + " is older than " + full_name_child1); }

	}

}
