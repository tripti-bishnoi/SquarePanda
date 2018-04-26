package com.random.practice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.random.practice.MyWebServiceInterface")
public class MyWebServiceImpl implements MyWebServiceInterface{

	@Override
	public boolean deletePerson(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPerson(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person[] getPersonaAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
