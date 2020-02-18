package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("B")

public class ValiballCouch implements Couch {
	
	private Players_traning CouchAssistant;
	
    @Autowired
	public void setCouchAssistant(Players_traning couchAssistant) {
		CouchAssistant = couchAssistant;
	}

	@Override
	public String doPractic() {
		// TODO Auto-generated method stub
		return "Couch will decide the practic days for players";
	}

	@Override
	public String doRest() {
		// TODO Auto-generated method stub
		return "Each practic day players will rest for at least 10 to 15 minutes";
	}
	public String playerstrainday() {
		return CouchAssistant.dothetrainplayers();
	}

}
