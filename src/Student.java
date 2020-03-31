import java.time.LocalDate;
import java.time.Period;
import java.util.*; 
import java.util.temporal.ChronoUnit; 

public class Student {
	String firstName; 
	String lastName; 
	String middleInitial; 
	int dob_day;  // dob - data of birth 
	int dob_month; 
	int dob_year;
	
	public String getFullName () {
   
		// This method should return the full name    
		//    concatenating first name, middle initial and last name   ...
		String fullName = firstName + middleInitial + lastName;
		return fullName;
		} 
	public int age( ) {
		int age = 0; 
		LocalDate pdate = LocalDate.of(year, month, day);
		LocalDate now = LocalDate.now();
		
		Period diff = Period.between(pdate, now);
		age = diff.getYears();
		return age;
	}
	public long elaspedDays (int y, int m, int d) {
		long days = 0;
		
		LocalDate pdate = LocalDate.of(year,  month,  day);
		LocalDate now = LocalDate.of(y,  m,  d);
		days = java.time.temporal.ChronoUnit.DAYS.between(pdate, now);
		return days;
	}
	}

