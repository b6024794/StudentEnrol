package com.enrol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CourseSpec extends Specification implements DomainUnitTest<Course> {

    def setup() {
    }

    def cleanup() {
    }

    void totalFees() {
	when:"a Course has a title and fees"

	def computing =new Course(title: 'Bsc Hon Computing',
						tuitionFees: 9500)



	then: "the calculatedFees method will total fees"

	computing.calculateFees()==36000
    }
}
