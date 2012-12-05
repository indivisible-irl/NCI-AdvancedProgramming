package ca02_sample_LuckyNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery implements Runnable
{

	private String name;
	private List<Integer> possibleNumbers = new ArrayList<Integer>();
	private List<Integer> winningNumbers = new ArrayList<Integer>();
	private Random rand = new Random();
	
	
	public Lottery(String n)
	{
		name = n;
		
		for (int i=1; i<50; i++)
		{
			possibleNumbers.add(new Integer(i));
		}
	}
	
	@Override
	public void run()
	{
		for (int i=0; i<6; i++)
		{
			winningNumbers.add(possibleNumbers.remove(rand.nextInt(possibleNumbers.size())));
		}
		Collections.sort(winningNumbers);
		printLottery();
	}
	
	private void printLottery()
	{
		StringBuilder sb = new StringBuilder("===========================================\n");
		sb.append(name+ " is done!\n");
		sb.append("The numbers are: [ ");
		for (int i=0; i<winningNumbers.size()-1; i++)
		{
			sb.append(winningNumbers.get(i)+ ", ");
		}
		sb.append(winningNumbers.get(winningNumbers.size()-1)+ " ]");
		System.out.println(sb.toString());
	}

}
