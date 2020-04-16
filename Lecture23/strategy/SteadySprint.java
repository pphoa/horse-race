package Lecture23.strategy;

import Lecture23.*;

public class SteadySprint implements IStrategy{
	// Horse runs 80% of speed the entire race
	
	@Override
	public void strategy(Horse horse) {
		float dist = horse.getDistance();
		float speed = horse.getSpeed();

		if(dist == 0) horse.setSpeed((float) (speed * 0.8));

		horse.setDistance(speed);
	}
}
