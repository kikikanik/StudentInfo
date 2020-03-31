
public class StudentTester {

	public static void main(String[] args) {
		//have two separate students w diff names and dob
		//invoke getFullName and age methods 
		//compare the two to see which is older (output the older dude)
		//invoke elapsedDays method for each student, passing arbitrary date. print output as Elaspsed Days: <days>
		Student child1 = new Student ();
		child1.firstName = Harry;
		child1.lastName = Potter;
		child1.middleInitial = S;
		child1.dof_day = 03;
		child1.dob_month = 04; 
		child1.dob_year = 2002;
		
		String full_name_child1 = child1.getFullName();
		System.out.println(full_name_child1);
		int age_of_child1 = child1.age();
		System.out.println("Age: " + age_of_child1);
		int days_on_earth_child1 = child1.elapsedDays;
		System.out.println("Elapsed Days: "+ days_on_earth_child1);
		
		
		Student child2 = new Student();
		child1.firstName = Ron;
		child1.lastName = Weasley;
		child1.middleInitial = M;
		child1.dof_day = 02;
		child1.dob_month = 06; 
		child1.dob_year = 2001;
		
		String full_name_child2 = child2.getFullName();
		System.out.println(full_name_child2);
		int age_of_child2 = child2.age();
		System.out.println("Age: " + age_of_child2);
		int days_on_earth_child2 = child2.elapsedDays;
		System.out.println("Elapsed Days: "+ days_on_earth_child2);
		
		if (days_on_earth_child1 > days_on_earth_child2 ) {
			System.out.println(full_name_child1 +" is older than " + full_name_child2);
		}
		else {
			System.out.println(full_name_child2 + "is older than" + full_name_child1);
		}
	}

}
