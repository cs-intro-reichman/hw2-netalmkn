
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int countSeed = 0;
		int seedAdd;
		if (mode.equals("v")) {
			for (int i = 1; i <= seed ; i++) {
			System.out.print(i);
			seedAdd = i;
			while (seedAdd != 1) {
			if (seedAdd % 2 == 0) {
				seedAdd = seedAdd / 2;
				System.out.print(" " + seedAdd);
				countSeed++;
			}	
			else{
				seedAdd = (seedAdd * 3) + 1;
				System.out.print(" " + seedAdd);
				countSeed++;
			}		
			}
			System.out.print(" (" + countSeed + ")");
			System.out.println();
			}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1");	
		}
		else{
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1");
		}
	}
		
}

