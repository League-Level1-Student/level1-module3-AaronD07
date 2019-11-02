package _06_gridworld;

import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public  class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Random random = new Random(200);
		Location location = new Location(random, random);
		
	}
	


}





