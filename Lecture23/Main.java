package Lecture23;

import Lecture23.strategy.*;
import java.util.*;

// Pascal Phoa - Lecture23 Homework

public class Main{

	// Main
	public static void main(String[] args){

		// First simulation
		List<Horse> horses1 = new ArrayList<Horse>();	
		Horse horse1 = new Horse("Eleanor", (float) 0.5, new SteadySprint());
		Horse horse2 = new Horse("Chidi", (float) 0.55, new EarlySprint());
		Horse horse3 = new Horse("Jason", (float) 0.6, new SlowStart());
		Horse horse4 = new Horse("Tahani", (float) 0.6, new SteadySprint());
		Horse horse5 = new Horse("Janet", (float) 0.45, new EarlySprint());
		horses1.add(horse1);
		horses1.add(horse2);
		horses1.add(horse3);
		horses1.add(horse4);
		horses1.add(horse5);
		Race race1 = new Race(horses1, (float) 10);
		race1.runRace();

		// Second simulation
		List<Horse> horses2 = new ArrayList<Horse>();	
		Horse horse6 = new Horse("Paul", (float) 1.2, new SteadySprint());
		Horse horse7 = new Horse("John", (float) 1.15, new EarlySprint());
		Horse horse8 = new Horse("Ringo", (float) 1.15, new SlowStart());
		Horse horse9 = new Horse("George", (float) 1.2, new SlowStart());
		Horse horse10 = new Horse("Jude", (float) 1.1, new EarlySprint());
		horses2.add(horse6);
		horses2.add(horse7);
		horses2.add(horse8);
		horses2.add(horse9);
		horses2.add(horse10);
		Race race2 = new Race(horses2, (float) 10);
		race2.runRace();

		// Third simulation
		List<Horse> horses3 = new ArrayList<Horse>();	
		Horse horse11 = new Horse("Freddie", (float) 1.7, new SlowStart());
		Horse horse12 = new Horse("Brian", (float) 1.75, new EarlySprint());
		Horse horse13 = new Horse("Roger", (float) 1.70, new SlowStart());
		Horse horse14 = new Horse("John", (float) 1.65, new SlowStart());
		Horse horse15 = new Horse("Mister Fahrenheit", (float) 1.8, new SteadySprint());
		horses3.add(horse11);
		horses3.add(horse12);
		horses3.add(horse13);
		horses3.add(horse14);
		horses3.add(horse15);
		Race race3 = new Race(horses3, (float) 10);
		race3.runRace();

	}

}
