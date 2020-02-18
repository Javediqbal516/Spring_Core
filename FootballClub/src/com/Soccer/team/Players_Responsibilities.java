package com.Soccer.team;

public class Players_Responsibilities implements AssistanceCouch {

	@Override
	public String helpingGoalKeepers() {
		// TODO Auto-generated method stub
		return "All goal keepers need to catch the ball for 30 minute";
	}

	@Override
	public String helpingDefenders() {
		// TODO Auto-generated method stub
		return "All defenders must run 100 meters for 40 minute";
	}

	@Override
	public String helpingMidfielders() {
		// TODO Auto-generated method stub
		return "All middfielders need to work with defenders and farwards";
	}

	@Override
	public String helpingFarwards() {
		// TODO Auto-generated method stub
		return "All the farwards need to pass and shot the ball on the goal side";
	}

}
