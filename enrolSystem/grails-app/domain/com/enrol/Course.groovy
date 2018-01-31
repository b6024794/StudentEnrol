package com.enrol

class Course {

	String department
	String title
	String leader
	String code
	Date startDate
	Date endDate
	String desc
	int numberOfStudents
	double tuitionFees
	String studyMode

double calculateFees(){

4*tuitionFees
}






	static constraints = {
		department blank: false, nullable: false

		leader blank: false, nullable: false

		code blank: false, nullable: false

		numberOfStudents blank: false, nullable: false , min:20, max:60

		startDate blank: false, nullable: false
		
		endDate blank:false, nullable: false

		studymode blank:false, nullable: false, size:20		
		
		desc blank: false, nullable: false, maxSize: 5000
		
		tuitionFees blank: false, nullable: false
		

	}
}
