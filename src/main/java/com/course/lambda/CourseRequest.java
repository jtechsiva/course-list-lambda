/**
 * 
 */
package com.course.lambda;

/**
 * @author rpdar
 *
 */
public class CourseRequest {
	
	private String httpMethod;
	
	private int id;
	
	private Course courseName;

	/**
	 * @return the httpMethod
	 */
	public String getHttpMethod() {
		return httpMethod;
	}

	/**
	 * @param httpMethod the httpMethod to set
	 */
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
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
	 * @return the course
	 */
	public Course getCourse() {
		return courseName;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.courseName = course;
	}

}
