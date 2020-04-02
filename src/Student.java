// import java.util.*;
import java.time.LocalDate;
import java.time.Period; 
import java.time.temporal.ChronoUnit; 

public class Student {
	String firstName = ""; 
	String lastName = "";
	String middleInitial; 
	int dob_day;  // dob - data of birth 
	int dob_month; 
	int dob_year;

	public String getFullName () {
		String fullName = firstName + " " + middleInitial + " " + lastName;
		return fullName;
	} 
	public int age () {
		int age = 0; 
		LocalDate pdate = LocalDate.of(dob_year, dob_month, dob_day);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);
		age = diff.getYears();
		return age;
	}
	public long elapsedDays (int y, int m, int d) {
		long days = 0;

		LocalDate pdate = LocalDate.of(dob_year,  dob_month, dob_day);
		LocalDate now = LocalDate.of(y, m, d);
		days = ChronoUnit.DAYS.between(pdate, now);
		return days;
	}
}
