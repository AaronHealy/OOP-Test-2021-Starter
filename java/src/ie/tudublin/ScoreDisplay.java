package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{


	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	// array list
	ArrayList<Note> Notes = new ArrayList<>();

	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore();
	}

	public void draw()
	{
		background(255);

	}

	void drawNotes()
	{

	}

	 public void loadScore()
	{

		String s = score.substring(0, 8);
		System.out.println(s);

        
	}
}
