package test;

public class dice {
	static int Dice1;
	static int Dice2;
	static int Throwns;
	
	public dice (int Dice1, int Dice2) {
	
	this.Dice1 = Dice1;
	this.Dice2 = Dice2;
	}
	public static int getThrowns(){
		return Throwns;
		
	}
	public static int oneThrow()
	{
		Throwns++;
		
		int randomNumber = 1+(int)(Math.random()*6);
		{
			if  (randomNumber %2==0)
				Dice2++;
			else
				Dice1++;
		}
		return randomNumber;
		
		}
	public static int count (int dices, int bounces){
		int random = (dices*(1+(int)(Math.random()*6))) + bounces;
		return random;
		
		
	}
	public String toString()
	{
		return String.format("\nDice Summary-\nTimes Thrown: %d\nDice1 rolled times: %d\nDice2 rolled Times: %d",
				Throwns,Dice1,Dice2);
		
	}
	
}



	
