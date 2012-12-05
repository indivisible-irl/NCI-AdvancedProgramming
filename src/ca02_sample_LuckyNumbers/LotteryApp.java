package ca02_sample_LuckyNumbers;

public class LotteryApp {

	public static void main(String[] args) {
		
		String[] lotteries = new String[] {"Lotto", "Lotto Plus", "Lotto Plus 1"};
		int[] priorities = new int[] {Thread.MIN_PRIORITY, Thread.MAX_PRIORITY, Thread.NORM_PRIORITY};
		
		for (int i=0; i<lotteries.length; i++)
		{
			Lottery lotto = new Lottery(lotteries[i]);
			Thread runLottery = new Thread(lotto);
			runLottery.setPriority(priorities[i]);
			runLottery.start();
		}
	}
}
