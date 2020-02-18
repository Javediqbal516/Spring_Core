package com.Soccer.team;

public class Team extends Players_Responsibilities  implements Couch {
	private Players_Meal BLD;

	public Team(Players_Meal bLD) {
		
		BLD = bLD;
	}
	
	String teamName;
	String teamCouch;
	String teamJerseyColor;
	String teamStedium;
	String teamOwner;
	
	
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCouch() {
		return teamCouch;
	}

	public void setTeamCouch(String teamCouch) {
		this.teamCouch = teamCouch;
	}

	public String getTeamJerseyColor() {
		return teamJerseyColor;
	}

	public void setTeamJerseyColor(String teamJerseyColor) {
		this.teamJerseyColor = teamJerseyColor;
	}

	public String getTeamStedium() {
		return teamStedium;
	}

	public void setTeamStedium(String teamStedium) {
		this.teamStedium = teamStedium;
	}

	public String getTeamOwner() {
		return teamOwner;
	}

	public void setTeamOwner(String teamOwner) {
		this.teamOwner = teamOwner;
	}
	
	
	
	

	@Override
	public String parchasingPlayers() {
		// TODO Auto-generated method stub
		return "A best couch always buy phanomenal players";
	}

	@Override
	public String trainTheTeam() {
		// TODO Auto-generated method stub
		return "an expiranced can couch trains the team veay strong";
	}

	@Override
	public String setTheMatches() {
		// TODO Auto-generated method stub
		return "A good couch always selects best players for team matches";
	}

	@Override
	public String SwapThePlayersInMatches() {
		// TODO Auto-generated method stub
		return "The couch of a team always swap the players based on thire prepormance";
	}
	
	public String GoalKeepers() {
		return helpingGoalKeepers();
	}
	public String Defenders() {
		return helpingDefenders();
	}
	public String Midfielders() {
		return helpingMidfielders();
	}
	public String Farwards() {
		return helpingFarwards();
	}
	
	public String Playersbreakfast() {
		return BLD.BrakFast();
	}
	public String PlayersLunch() {
		return BLD.Lunch();
	}
	public String PlayersDinners() {
		return BLD.Dinner();
	}

}
