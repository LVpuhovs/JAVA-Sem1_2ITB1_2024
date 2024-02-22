package javasem01;
import java.util.Arrays;
import java.util.Random;

public class JavaSem01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
			"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
			"Kate" };
	
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393,
			299, 343, 317, 265 };
		
		for (int i=0; i < names.length;i++) {
			System.out.println("|" + names[i]+", " + times[i] + "|");
		}
	}
	
	class Seminar_1_PART1 {
		
		public static void main(String[] arguments) {
			
			double gravity = -9.81; // Earth's gravity in m/s^2
			double initialVelocity = 0.0;
			double fallingTime = 10.0;
			double initialPosition = 0.0;
			double finalPosition = 0.0;
			System.out.println("Pos in "+fallingTime+"sec :"+finalPosition);
			System.out.println(positionCalc(gravity, initialVelocity, initialPosition,fallingTime));
			
		}
		static double positionCalc(double gravity, double initialVelocity, double
				initialPosition, double fallingTime) {
			return (0.5 * gravity * Math.pow(fallingTime,2) + initialVelocity * fallingTime + initialPosition);
			
		}
	}
	
	class Seminar_1_PART2 {
		
		public static void main(String[] arguments) {
			
			System.out.println(factorialForLoop(5));
			System.out.println(factorialRecursive(5));
		}
		static int factorialForLoop(int N) {
			int f = 1;
			if (N < 0) {
				System.out.println(0);
			}else {
				for (int i = 1; i < N; i++) {
					f = f * i;
				}
			}
			return f;
			
		}
		static int factorialRecursive(int N) {
			int f = 1;
			if (N < 0) {
				System.out.println(0);
			}else {
				for (int i = 1; i < N; i++) {
					f = f * (N-i);
				}
			}
			return f;
		}
	}
	
	class Seminar_1_PART3 {
		public static void main(String[] arguments) {
		
			try {
				double[] mas = generateArray(5,2.3,4.5);
				System.out.println(Arrays.toString(mas));
				System.out.println("Avg: " + getMean(mas));
				System.out.println("Min: " + getMin(mas));
				System.out.println(Arrays.toString(arraySort(mas)));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		static double[] generateArray(int N, double lower, double upper) throws Exception {
			Random rand = new Random();

			if (N <= 0  || (upper < lower)) throw new Exception("Wrong input parametrs");
			
			double[] result = new double[N];
			for (int i = 0; i < result.length; i++) {
				result[i] = rand.nextDouble(lower, upper);
			}
			return result;
		}
		static double getMean(double[] array) throws Exception {
			if (array == null) throw new Exception("Wrong input parametrs");
			
			double sum = 0;
			for (double temp: array) {
				sum += temp;
			}
			return sum/array.length;
		}
		static double getMin(double[] array) throws Exception{
			if (array == null) throw new Exception("Wrong input parametrs");
			double temp = 100;
			for (int i = 0; i < array.length; i++) {
				if (array[i]> temp) {
					temp = array[i];
				}
			}
			
			return temp;
		}
		static double getMax(double[] array) throws Exception{
			if (array == null) throw new Exception("Wrong input parametrs");
			return 0;
		}
		static double[] arraySort(double[] array) throws Exception{
			if (array == null) throw new Exception("Wrong input parametrs");
			Arrays.sort(array);
			return array;
		}
	}
	
	class Seminar_1_PART4 {
		public static void main(String[] arguments) {
			
			try {
				System.out.println(generateMatrix(5));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		static double[][] generateMatrix(int N) throws Exception{
			if (N <= 0 ) throw new Exception("Wrong input parametrs");
			
			double [][] result = new double[N][N];
			Random rand = new Random();
			
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] = rand.nextDouble();
				}
			}
			
			return result;
			
		}
		static double getProduct(double[][] matrix, int i, int j) throws Exception {
			if (matrix == null) throw new Exception("Wrong input parametrs");
			
			
			return j;
		}
	}
	
	class Seminar_1_PART5 {
		public static void main(String[] arguments) {
			try {
				System.out.println(coinFlip(5));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		static int[] coinFlip(int N) throws Exception {
			if (N <= 0 ) throw new Exception("Wrong input parametrs");
			
			int[] result = new int[N];
			
			Random rand = new Random();
			for (int i = 1; i <= N; i++) {
				boolean isHead = rand.nextBoolean();
				if (isHead) result[0] = result[0] + 1;
				else result[1] = result[1] + 1;
			}
			result[2] = result[0]/result[1];
			
			return result;
			
		}
	}
}
