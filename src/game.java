import test.dice;
import java.util.Scanner;
public class game {

	private int maximum;
	private int diceRolled;
	
	public game ()
	{
		maximum = 6;
	}
	
	public int rollDice (int number)
	{
		int max = maximum * number;
		diceRolled = ( number + (int) (Math.random() * max) );
		return diceRolled;
	}
	
}