package Lecture23.strategy;

import Lecture23.*;

public class EarlySprint implements IStrategy{
	// Maximum speed for the first 4km, then 70% speed
	
	@Override
	public void strategy(Horse horse) {
		float dist = horse.getDistance();
		float speed = horse.getSpeed();

		if(dist > 4.0 && !horse.earlySprint){ 
			horse.setSpeed((float) (speed * 0.7));
			horse.earlySprint = true;
		}
		horse.setDistance(speed);
	} 
}
