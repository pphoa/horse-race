package Lecture23;

import java.util.*;
import Lecture23.strategy.*;

public class Horse{

	private String name = ""; // Horse name
	private float speed; // Maximum speed
	private float distance = 0; // Distance covered
	private IStrategy jockeyStrategy; // Strategy used
	public boolean earlySprint = false;

	// Slow Start strategy booleans
	public boolean slow1 = false;
	public boolean slow2 = false;
	public boolean slow3 = false;

	// Constructor
	public Horse(String name, float sp, IStrategy strategy){
		setName(name);
		setSpeed(sp);
		setStrategy(strategy);
		
		System.out.printf("%s has entered the race. \n", this.getName());
		try{ Thread.sleep(1000); } catch (Exception e) {}	
	}

	// Methods
	
	// Setters
	public void setStrategy(IStrategy strategy){
		this.jockeyStrategy = strategy;
	}

	public void setSpeed(float sp){
		this.speed = sp;
	}

	public void setDistance(float dist){
		this.distance = this.distance + dist;
	}

	public void setName(String str){
		this.name = this.name + str;
	}

	// Getters
	public float getSpeed(){
		return this.speed;
	}

	public float getDistance(){
		return this.distance;
	}

	public String getName(){
		return this.name.toString();
	}

	public IStrategy getStrat(){
		return this.jockeyStrategy;
	}
}
