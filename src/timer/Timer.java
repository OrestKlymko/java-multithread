package timer;

public class Timer {


	private int second=0;

	public void increaseSec(){
			try {
				Thread.sleep(1000);
				second++;
				System.out.println(second);

			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
	}

	public void fiveSecNotification(){
		try {
			Thread.sleep(5000);
			System.out.println("Минуло 5 секунд");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}


	public int getSecond() {
		return second;
	}

}
