package Lecture23;

import Lecture23.strategy.*;
import java.util.*;

public class Race{

	private List<Horse> horses = new ArrayList<Horse>(); // Racing horses
	private float length; // Length of race

	// Constructor
	public Race(List<Horse> horses, float len){
		this.horses = horses;
		this.length = len;
	}	

	public void runRace(){

		// Initialize race variables
		int time = 0;
		List<String> finishedHorses = new ArrayList<String>();
		boolean firstPlace = false;

		while(horses.size() != 0){

			for(Horse h : horses){
				// Display current race
				if(h.getDistance() <= this.length){
					System.out.printf("\n%d seconds, %s, %.2f km\n", time, h.getName(), h.getDistance());
				}

				// Move horses
				h.getStrat().strategy(h);
			}	
			System.out.println("");

			for(int i = 0; i < horses.size(); i++){
				Horse h = horses.get(i);

				// Check for first place or is finished
				if(h.getDistance() >= this.length && !firstPlace){
					firstPlace = true;
					finishedHorses.add(h.getName());
					horses.remove(h);

				} else if(h.getDistance() >= this.length) {
					finishedHorses.add(h.getName());
					horses.remove(h);
				}
			}

			try { Thread.sleep(1000); } catch (Exception e){}

			// Increase time
			time++;
		}

		System.out.println("Race over!");
		try { Thread.sleep(1000); } catch (Exception e){}
		System.out.println("");
		System.out.println("Ranking:");
		try { Thread.sleep(1000); } catch (Exception e){}

		// Print race rank
		for(int i = 0; i < finishedHorses.size(); i++){
			String h = finishedHorses.get(i);
			System.out.printf("%d: %s\n", i+1, h);
			try { Thread.sleep(1000); } catch (Exception e){}
		}

		System.out.printf("\nWinner: %s!\n", finishedHorses.get(0));
		try { Thread.sleep(1000); } catch (Exception e){}
		System.out.println("");
	}

}
