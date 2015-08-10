package com.vasu.learning.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(name = "MyMDB", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/queue/incoming") })
public class MDBTest implements MessageListener {
	public MDBTest() {
		// TODO Auto-generated constructor stub
	}

	public void onMessage(Message message) {
		try {
			System.out.println("We've received a message: "
					+ message.getJMSMessageID());
			if (message instanceof TextMessage) {
				TextMessage tm = (TextMessage) message;
				System.out.println(tm.getText());
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
