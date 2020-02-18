package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component

public class Players_traning implements Assistant_Couch {

	@Override
	public String dothetrainplayers() {
		
    return "All the players need to train";
	}

}
