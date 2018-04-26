package com.rest.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.rest.service.EmployeeServiceImpl;

public class EmployeeApplication extends Application {

	private Set<Object> singletons = new HashSet<>();

	public EmployeeApplication() {
		singletons.add(new EmployeeServiceImpl());
	}

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Object> getSingletons() {
		return singletons;
	}

}
