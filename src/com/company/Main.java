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
			Create a 2nd method called calculateHighScorePosition
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

		int highScorePosition = calculateHighScorePosition(1500);
		displayedHighScorePosition("Tim", highScorePosition);

		highScorePosition = calculateHighScorePosition(900);
		displayedHighScorePosition("Bob", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayedHighScorePosition("Percy", highScorePosition);

		highScorePosition = calculateHighScorePosition(50);
		displayedHighScorePosition("Larry", highScorePosition);

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

	public static void displayedHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " managed to get into position " + position + " on the highscore table!");
	}

	public static int calculateHighScorePosition(int playerScore) {

    	if(playerScore > 1000) {
    		return 1;
		} else if(playerScore > 500 && playerScore < 1000) {
    		return 2;
		} else if(playerScore > 100 && playerScore < 500) {
    		return 3;
		} else {
    		return 4;
		}
	}

}
