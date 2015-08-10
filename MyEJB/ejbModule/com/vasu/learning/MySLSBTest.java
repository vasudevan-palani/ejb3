package com.vasu.learning;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.vasu.learning.MySLSBEJB;

@Stateless(mappedName="myejb")
@Remote(MySLSBEJB.class)
@WebService(serviceName="TestService")
public class MySLSBTest implements MySLSBEJB {
	@WebMethod(operationName="hello")
	public void sayHello() {
		System.out.println("Hello from EJB MySLSB");
	}
}
