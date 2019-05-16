package Implementations;

import cucumberOptions.TestRunner;

import Interfaces.Login;

public class LoginImpl extends TestRunner implements Login {

	

	@Override
	public void navigateToPreviousPage() {
		
		STAXDriver.navigate().back();
	}
	
}
