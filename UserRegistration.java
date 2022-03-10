package com.bridgelabz.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstName(String name){
		boolean check = Pattern.matches("([A-Z][a-z]{2,})",name);
		return check;
	}

	public boolean lastName(String name){
		boolean check = Pattern.matches("([A-Z][a-z]{2,})",name);
		return check;
	}


	public boolean emailCheck(String name){
		boolean check = Pattern.matches("([a-z]{3,})(.)([a-z]*)[@][a-z]{2}(.)([a-z]{2})(.)([in]*)",name);
		return check;
	}

}


