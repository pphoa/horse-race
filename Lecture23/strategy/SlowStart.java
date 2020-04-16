package Lecture23.strategy;

import Lecture23.*;

public class SlowStart implements IStrategy{
	// 60% for first 5km, 80% for next 4km, 100% for last 1km
	
	@Override
	public void strategy(Horse horse) {
		float dist = horse.getDistance();
		float speed = horse.getSpeed();

		if(dist < 5.0 && !horse.slow1){
			horse.setSpeed((float) (speed * 0.6));
			horse.slow1 = true;
		} else if (dist < 9.0 && !horse.slow2){
			horse.setSpeed((float) (speed * (0.8 / 0.6)));
			horse.slow2 = true;
		} else if (dist < 10.0 && !horse.slow3){
			horse.setSpeed((float) (speed * (1.0 / 0.8)));
			horse.slow3 = true;
		}

		horse.setDistance(speed);
	}
}
