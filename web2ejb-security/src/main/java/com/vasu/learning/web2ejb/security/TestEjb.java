package com.vasu.learning.web2ejb.security;

import javax.ejb.Remote;

@Remote
public interface TestEjb {
	public void sayHello();
}
