package fizzBuzz;

public class FizzBuzz {
	private int n;
	private int currentNumber;

	public FizzBuzz(int n) {
		this.n = n;
		this.currentNumber = 1;
	}

	public synchronized void fizz() {
		while (true) {
				if (currentNumber > n) {
					break;
				}
				if (currentNumber % 3 == 0 && currentNumber % 5 != 0) {
					System.out.println("fizz");
					currentNumber++;
					notifyAll();
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

	}

	public synchronized void buzz() {
		while (true) {

				if (currentNumber > n) {
					break;
				}
				if (currentNumber % 5 == 0 && currentNumber % 3 != 0) {
					System.out.println("buzz");
					currentNumber++;
					notifyAll();
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}


	public synchronized void fizzBuzz() {
		while (true) {

				if (currentNumber > n) {
					break;
				}
				if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
					System.out.println("fizzbuzz");
					currentNumber++;
					notifyAll();
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

	}

	public synchronized void number() {
		while (true) {
				if (currentNumber > n) {
					break;
				}
				if (currentNumber % 3 != 0 && currentNumber % 5 != 0) {
					System.out.println(currentNumber);
					currentNumber++;
					notifyAll();
				} else {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
	}
}
