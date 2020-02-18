package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("A")

public class SuccerCouch implements Couch {
	
	private Players_traning Players_traning;
	
    
	public SuccerCouch(com.spring.annotation.Players_traning players_traning) {
		
		Players_traning = players_traning;
	}

	@Override
	public String doPractic() {
	 return "all the players need to do practic ";

	}

	@Override
	public String doRest() {
	    return "every player need to rest";

	}
	
	public String playersworkout() {
		return Players_traning.dothetrainplayers();
		
	}

}
