/**
 * Data Model/Object - Course
 * contains the list of courses for students
 */
package com.course.lambda;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * @author rpdar
 *
 */
@DynamoDBTable(tableName = "Courses")
public class Course {

	@DynamoDBHashKey
	private int id;

	@DynamoDBAttribute
	private String courseName;

	public Course() {

	}

	public Course(int id, String name) {
		this.id = id;
		this.courseName = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
