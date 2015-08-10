package com.vasu.learning.web2ejb.security;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

@Stateless
public class TestEjbBean implements TestEjb {

	@RolesAllowed(value={"admin"})
	public void sayHello() {
		System.out.println("EJB Hello");
	}
}
