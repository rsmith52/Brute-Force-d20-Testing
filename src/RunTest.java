import java.util.Random;

public class RunTest {

	public static void main(String[] args) {
		
		final int SEED = 6;
		final int NUMTESTS = 11000000;
		
		int values;
		
		Random numgen = new Random(SEED);
		
		
		// Normal D20 Roll
		values = 0;
		for (int i = 0; i < NUMTESTS; i++) {
			values += numgen.nextInt(20) + 1;
		}
		System.out.println("Normal Roll: " + (double)values/(double)NUMTESTS);
		
		// Roll With Advantage
		values = 0;
		for (int i = 0; i < NUMTESTS; i++) {
			values += Math.max(numgen.nextInt(20) + 1, numgen.nextInt(20) + 1);
		}
		System.out.println("Roll with Advantage: " + (double)values/(double)NUMTESTS);
		
		// Roll With Advantage
		values = 0;
		for (int i = 0; i < NUMTESTS; i++) {
			values += Math.min(numgen.nextInt(20) + 1, numgen.nextInt(20) + 1);
		}
		System.out.println("Roll with Disadvantage: " + (double)values/(double)NUMTESTS);
		
		// Roll With Advantaged Disadvantage
		values = 0;
		for (int i = 0; i < NUMTESTS; i++) {
			values += Math.max(Math.min(numgen.nextInt(20) + 1, numgen.nextInt(20) + 1),Math.min(numgen.nextInt(20) + 1, numgen.nextInt(20) + 1));
		}
		System.out.println("Roll with Advantaged Disadvantage: " + (double)values/(double)NUMTESTS);
		
		// Roll With Disadvantaged Advantage
				values = 0;
				for (int i = 0; i < NUMTESTS; i++) {
					values += Math.min(Math.max(numgen.nextInt(20) + 1, numgen.nextInt(20) + 1),Math.max(numgen.nextInt(20) + 1, numgen.nextInt(20) + 1));
				}
				System.out.println("Roll with Disadvantaged Advantage: " + (double)values/(double)NUMTESTS);
	}

}
