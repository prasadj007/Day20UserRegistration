package com.bridgelabz.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;


class RegistrationTest {

	 @Test
	    public void givenAPatternWhenMatchedShouldReturnTrue(){
	        UserRegistration user = new UserRegistration();
	        boolean name = user.firstName("John");
	        Assert.assertTrue(name);
	    }
	  @Test
	    public void givenLastName_WhenMatchedShouldReturnTrue(){
	        UserRegistration user = new UserRegistration();
	        boolean lastName = user.lastName("Wick");
	        Assert.assertTrue(lastName);
	    }
	  @Test
	    public void givenAEmailPatternWhenMatchedShouldReturnTrue(){
	        UserRegistration user = new UserRegistration();
	        boolean email = user.emailCheck("abc.xyz@bl.co.in");
	        Assert.assertTrue(email);
	    }
	  @Test
	  public void givenAMobileNumberPatternWhenMatchedShouldReturnTrue(){
	        UserRegistration user = new UserRegistration();
	        boolean number = user.numberCheck("91 7003321213");
	        Assert.assertTrue(number);
	    }
}
