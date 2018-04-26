package com.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.model.Employee;

@Path("/employee")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	@POST
	@Path("/add")
	public boolean add(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("adding employee");
		return false;
	}

	@Override
	@DELETE
	@Path("{id}/delete")
	public boolean delete(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		System.out.println("delete employee");
		return false;
	}

	@Override
	@GET
	@Path("{id}/get")
	public Employee get(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		System.out.println("get employee");
		return null;
	}

	@Override
	@GET
	@Path("/getAll")
	public Employee[] getAll() {
		// TODO Auto-generated method stub
		System.out.println("get all employee");
		return null;
	}

}
