/**
 * 
 */
package com.course.lambda;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.amazonaws.services.lambda.runtime.Context;

/**
 * @author rpdar
 *
 */
public class CourseAppHandler {
	
	static final Logger log = LoggerFactory.getLogger(CourseAppHandler.class);

	public  static Object handleRequest(CourseRequest request, Context context) throws ResourceNotFoundException {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
        DynamoDBMapper mapper = new DynamoDBMapper(client);
		Course course = null;
		switch (request.getHttpMethod()) {
		case "GET":
			System.out.println("Inside GET..");
			course = mapper.load(Course.class,request.getId());
			if (course == null) {
				throw new ResourceNotFoundException ("Resource not found" + request.getId());
			}
			return course;
		case "POST":
			System.out.println("Inside POST..");
			course = request.getCourse();
			mapper.save(course);
			return course;
			
		default :
			//throw exception if called method is not implemented
			break;
		}
		
		return null;
	}
}
