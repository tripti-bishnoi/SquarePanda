package com.random.practice;

import java.io.Serializable;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface MyWebServiceInterface {

	@WebMethod
	public boolean deletePerson(int id);

	@WebMethod
	public boolean addPerson(Person p);

	@WebMethod
	public Person getPerson(int id);

	@WebMethod
	public Person[] getPersonaAll();
}