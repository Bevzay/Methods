package com.company;

public class Main {

    public static void main(String[] args) {

    	calculateScore(true, 800, 5, 100);
    	calculateScore(true, 10000, 8, 200);

    	/*
    	Challenge 1:
    		Create a method called displayedHighScorePosition
			it should be a players name as a parameter, and a 2nd parameter as a position in the high score table
			you should display the players name along with a message like "managed to get into position" and the
			position they got and a further message "on the high score table"
    	 */

		/*
		Challenge 2:
			It should be sent one argument only, the player score
			it should return an int
			the return data should be:
			- 1 if the score is >1000
			- 2 if the score is >500 and <1000
			- 3 if the score is >100 and <500
			- 4 in all other cases
			call both methods and display the results of the following:
			- a score of 1500, 900, 400 and 50
		 */

    }

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		} else {
			return -1; //shows as an error
		}
	}

}
