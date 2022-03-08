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
}
