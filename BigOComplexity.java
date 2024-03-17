
public class abc {
	// O(1)
	public void play(int[] numbers) {
		System.out.println(numbers[0]);
	}

	// O(2)
	public void Play(int[] numbers) {
		System.out.println(numbers[0]);
		System.out.println(numbers[0]);
	}

	// O(n)
	public void PLay(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	// O(n)
	public void PLAy(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	// O(1+n+1)=O(2+n)=O(n) {∵ Since the coefficient is let go as the number
	// increases}
	public void PLAY(int[] numbers) {
		System.out.println(numbers[0]);// O(1)
		for (int number : numbers) {
			System.out.println(number);// O(n)
		}
		System.out.println(numbers[0]);// O(1)
	}

	// O(n+n)=O(2n)=O(n) {∵ Since the coefficient is let go as the number increases}
	public void player(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);// O(n)
		}
		for (int number : numbers) {
			System.out.println(number);// O(n)
		}
	}

	// O(n+m)=O(n) {∵ Because the runtime of this method increases linearly}
	public void Player(int[] numbers, String[] names) {
		for (int number : numbers) {
			System.out.println(number);// O(n)
		}
		for (String name : names) {
			System.out.println(name);// O(m)
		}
	}

	// NESTED LOOPS
	// O(n^2)
	public void PLayer(int[] numbers) {
		for (int first : numbers) {// O(n)
			for (int second : numbers) {// O(n)
				System.out.println(first + " , " + second);
			}
		}
	}

	// O(n+ n^2)=O(n^2) {As n^2 is always greater than n}
	public void PLAyer(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);// O(n)
		}
		for (int first : numbers) {// O(n)
			for (int second : numbers) {// O(n)
				System.out.println(first + " , " + second);
			}
		}
	}

	// O(n^3){O(n^2) is faster than O(n^3)}
	public void PLAYer(int[] numbers) {
		for (int first : numbers) {// O(n)
			for (int second : numbers) {// O(n)
				for (int third : numbers) {// O(n)
					System.out.println(first + " , " + second + " , " + third);
				}
			}
		}
	}
}
