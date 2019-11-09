package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public  class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		
		world.show();
		Bug bug = new Bug();
		Random gen = new Random();
		Bug bug2 = new Bug();
		bug2.setColor(Color.BLUE);
		
		Flower flower = new Flower();
		Flower flower1 = new Flower();
		int x = gen.nextInt(9);
		int y = gen.nextInt(9);
		Location location3 = new Location(x, y+1);
		
		Location location4 = new Location(x, y-1);
	Location location2 = new Location(x, y);
		Location location = new Location(1, 1); 
		
		world.add(location, bug);
		world.add(location2, bug2);
		world.add(location3, flower);
		world.add(location4, flower1);
		
		bug.moveTo(location);
		bug2.moveTo(location2);
		
		bug.setDirection(90);
		
		bug.setColor(null);
		
		
		
		
	}
	


}





