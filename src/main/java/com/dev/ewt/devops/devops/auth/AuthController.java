/**
 * 
 */
package com.dev.ewt.devops.devops.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sid
 *
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

	public static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	/**
	 * function is used to handle the user who wants to register for the first time and after successfull entry the complete details is
	 * returned back to teh user.
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.OPTIONS, consumes = {MediaType.APPLICATION_JSON_VALUE},produces = { MediaType.APPLICATION_JSON_VALUE
	 })	
	public ResponseEntity<?> doRegister(@RequestBody User user) {
		
		 if (user == null || user.getUserName()== null || user.getUserName().isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
		//register the new user and generate a new token and set it and send back the token along with the user complete details.
		return new ResponseEntity<Principle>(new Principle(0,user.getUserName(),"Male","26/6/2017",true), HttpStatus.OK);
	}
	
	/**
	 * Function is used to handle the login action made by hte user on successfull validation the response of the complete
	 * user details is sent back along with the token
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.OPTIONS, consumes = {MediaType.APPLICATION_JSON_VALUE},produces = { MediaType.APPLICATION_JSON_VALUE
		 })	
	public ResponseEntity<?> doLogin(@RequestBody User user) {
		 
		if (user == null || user.getUserName()== null || user.getUserName().isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
		//generate a new token and set it and send back the token along with the user complet details.
		return  new ResponseEntity<Principle>(new Principle(0,user.getUserName(),"Male","26/6/2017",true), HttpStatus.OK);
	}	
	
	/**
	 * Function is used to validate the passed user is valid or not on invalid a null value is set to the user and sent back with boolean value set to false
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/validuser", method = RequestMethod.POST)
	public ResponseEntity<?> isValidUser(User user) {
		return new ResponseEntity<Principle>(new Principle(0,user.getUserName(),"Male","26/6/2017",true), HttpStatus.OK);
	}	
	
	/**
	 * validate the set token is valid or not.
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/validtoken", method = RequestMethod.POST)
	public ResponseEntity<?> isValidToken(User user) {
		//retrun token if valid else null as the token placeholder
		Principle princ = new Principle(0,"","","",false);
		princ.setToken("1234567890");
		return new ResponseEntity<Principle>(princ, HttpStatus.OK);
	}	


}
