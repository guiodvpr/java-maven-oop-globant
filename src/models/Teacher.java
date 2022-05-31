package models;

public class Teacher extends Person {
	
	public static final double BASE_SALARY = 1500000;
	public static final double PERCENT = 110.0/100.0;
	private double salary;
	private Boolean isFullTime;
	private double experienceYears;
	private int activeHoursWeek;


	public Teacher(int id, String name, Boolean isFullTime, double experienceYears, int activeHoursWeek) {
		super(id, name);
		this.isFullTime = isFullTime;
		this.experienceYears = experienceYears;
		this.activeHoursWeek =activeHoursWeek;
	}
	
	
	
	public Teacher(int id, String name, Boolean isFullTime, double experienceYears) {
		super(id, name);
		this.isFullTime = isFullTime;
		this.experienceYears = experienceYears;
	}



	public double calculateSalary() {
		if(isFullTime) {
			return ((PERCENT * experienceYears) * BASE_SALARY );
		}
		else {
			return (BASE_SALARY  * activeHoursWeek);
		}
	}


		public double getSalary() {
		if(salary == 0) {
			salary = calculateSalary();
			return salary;
		}
		else {
			return salary;
		}
	}


	


	@Override
		public String toString() {
			return "[Id=" + getId() + ", Name=" + getName()  + ",  salary=" + getSalary() + ", isFullTime=" + isFullTime + ", experienceYears=" + experienceYears
					+ ", activeHoursWeek=" + activeHoursWeek + 
					 "]";
		}
	




	public void setSalary(int salary) {
		this.salary = salary;
	}



	public Boolean getIsFullTime() {
		return isFullTime;
	}



	public void setIsFullTime(Boolean isFullTime) {
		this.isFullTime = isFullTime;
	}



	public double getExperienceYears() {
		return experienceYears;
	}



	public void setExperienceYears(double experienceYears) {
		this.experienceYears = experienceYears;
	}
	
}
