import java.util.*;

/**
 *   File Name: ComputeAvg.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 21, 2016
 *   
 */

/**
 * ComputeAvg //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class ComputeAvg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subNum = 0;
		int totMarks = 0;
		int avgMarks;
		int mk;
		boolean wantsToContinue = true;
		Scanner scanner = new Scanner(System.in);
		do {
			subNum = subNum + 1;
			System.out.print("Please Enter the marks scored in Subject#" + subNum + ": ");
			mk = Integer.parseInt(scanner.nextLine());
			totMarks = totMarks + mk;
			System.out.print("Would you like to continue adding grades? (Y/N): ");
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("N")) {
				wantsToContinue = false;
			}
		} while (wantsToContinue);

		avgMarks = totMarks / subNum;
		System.out.println("Average score is: " + avgMarks);

	}
}
