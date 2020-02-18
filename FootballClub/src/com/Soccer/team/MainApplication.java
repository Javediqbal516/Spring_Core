package com.Soccer.team;

import javax.xml.crypto.Data;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Team.xml");
		
		Team obj = context.getBean("myteam", Team.class);
		
		System.out.println(obj.getTeamName());
		System.out.println(obj.getTeamCouch());
		System.out.println(obj.getTeamJerseyColor());
		System.out.println(obj.getTeamStedium());
		System.out.println(obj.getTeamOwner());
		System.out.println(obj.parchasingPlayers());
		System.out.println(obj.trainTheTeam());
		System.out.println(obj.setTheMatches());
		System.out.println(obj.GoalKeepers());
		System.out.println(obj.Defenders());
		System.out.println(obj.Midfielders());
		System.out.println(obj.Playersbreakfast());
		System.out.println(obj.PlayersLunch());
		System.out.println(obj.PlayersDinners());
		
		
		
		
		
		
		
		
		
		

	}

}
