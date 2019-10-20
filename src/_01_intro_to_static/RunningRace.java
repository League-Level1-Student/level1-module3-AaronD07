package _01_intro_to_static;

import javax.swing.JOptionPane;

public class RunningRace {
	 public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	Athlete athlete = new Athlete("Person1", 100);
	    	Athlete athlete2 = new Athlete("Person2", 20);
	    	JOptionPane.showMessageDialog(null, "Person1 " + athlete.BibNumber + athlete.raceLocation);
	    	JOptionPane.showMessageDialog(null, "Person2 " + athlete2.nextBibNumber + athlete2.raceLocation);
	}
}
class Athlete {
	static int BibNumber = 1;
    static int nextBibNumber=BibNumber + 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

   
}