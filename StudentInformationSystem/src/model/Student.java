package model;

import java.time.LocalDate;

public class Student {
	private int rollNo;
	private String name;
	private LocalDate dob;
	private Qualification qualification;
	private String phoneNo;
	private String email;
	private String address;
	private static final String collegeName;
	private static int rollNoGenerator=0;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		collegeName="LTI College";
	}

	public Student(String name, LocalDate dob, Qualification qualification, String phoneNo, String email,
			String address) {
		super();
//		this.rollNo=++rollNoGenerator;
		this.name = name;
		this.dob = dob;
		this.qualification = qualification;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	

	public static String getCollegename() {
		return collegeName;
	}

}