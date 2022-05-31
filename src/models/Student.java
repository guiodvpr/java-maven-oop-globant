package models;

import java.util.Calendar;

public class Student extends Person {
	
	private int birthYear;
	
	public Student(int id, String name, int birthDate) {
		super(id, name);
		this.birthYear = birthDate;
	
	}
	
	public int getAge(){
		Calendar today = Calendar.getInstance();
		return today.get(Calendar.YEAR) - birthYear;
	}
	
	
	

	@Override
	public String toString() {
		return " [age=" + getAge() + ", Id=" + getId() + ", Name=" + getName() + "]";
	}

	public int getBirthDate() {
		return birthYear;
	}

	public void setBirthDate(int birthDate) {
		this.birthYear = birthDate;
	}
	
	
	
}
