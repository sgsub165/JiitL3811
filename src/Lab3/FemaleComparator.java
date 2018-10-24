/** 
* Name: Stephen Griffith
* Date: 10/24/2018
* Source File Name: FemaleComparator.java
* Lab: Lab3
*/

package Lab3;

//import required java libraries
import java.util.Comparator;

/**
 * The FemaleComparator class performs a sort 
 * for gender from the bank records and returns
 * the comparison data for gender and mortgage
 */
public class FemaleComparator implements Comparator<BankRecords> {

	@Override
	public int compare(BankRecords o1, BankRecords o2) {
		// use compareTo to compare strings
		int result = o1.getGender().compareTo(o2.getGender());
		if(result !=0) {return result;}
		
		return o1.getMortgage().compareTo(o2.getMortgage());
	}

}
