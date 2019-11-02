package _05_netflix;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class NetflixQueue {
	
	ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public Movie getBestMovie(){
		this.sortMoviesByRating();
		return movies.get(0);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public Movie getMovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}
	
	public void sortMoviesByRating() {
		Collections.sort(movies);
		
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
	
	public static void main(String[] args) {
		NetflixQueue Netflix = new NetflixQueue();
		Movie movie1 = new Movie("Muddy Puddles", 1);
		Movie movie2 = new Movie("Maleficent", 500);
		Movie movie3 = new Movie("Countdown", 300);
		Movie movie4 = new Movie("Harriet", 400);
		Movie movie5 = new Movie("Doctor Sleep", 200);
		
		movie1.getTicketPrice();
		Netflix.addMovie(movie1);
		Netflix.addMovie(movie2);
		Netflix.addMovie(movie3);
		Netflix.addMovie(movie4);
		Netflix.addMovie(movie5);
		Netflix.printMovies();
		Movie x = Netflix.getBestMovie();
		Netflix.sortMoviesByRating();
		
		JOptionPane.showMessageDialog(null, "The best movie is " + x);
		JOptionPane.showMessageDialog(null, "The second best movie is " + Netflix.getMovie(1));
		
		
	}

}
