import fizzBuzz.FizzBuzz;
import timer.Timer;

public class Main {


	public static void main(String[] args) {

//		Task 1
			Timer timer = new Timer();
			Runnable thread = new Runnable() {
				@Override
				public void run() {
					while (true) {
						timer.increaseSec();
					}
				}
			};

		Runnable thread1 = new Runnable() {
			@Override
			public void run() {
				while (true) {
					timer.fiveSecNotification();
				}
			}
		};

		Thread timerThread1 = new Thread(thread);
		Thread timerThread2 = new Thread(thread1);
			timerThread1.start();
			timerThread2.start();



		//Task 2

		int n = 15;
		FizzBuzz fizzBuzz = new FizzBuzz(n);

		Thread fizzThread = new Thread(() -> fizzBuzz.fizz());
		Thread buzzThread = new Thread(() -> fizzBuzz.buzz());
		Thread fizzBuzzThread = new Thread(() -> fizzBuzz.fizzBuzz());
		Thread numberThread = new Thread(() -> fizzBuzz.number());

		fizzThread.start();
		buzzThread.start();
		fizzBuzzThread.start();
		numberThread.start();

	}
}