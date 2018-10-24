/** 
* Name: Stephen Griffith
* Date: 10/23/2018
* Source File Name: MaleComparator.java
* Lab: Lab3
*/

package Lab3;

//import required java libraries
import java.util.Comparator;

/**
 * The MaleComparator class performs a sort 
 * for gender from the bank records and returns
 * the comparison data for gender and region
 */
public class MaleComparator implements Comparator<BankRecords> {

	@Override
	public int compare(BankRecords o1, BankRecords o2) {
		// use compareTo to compare strings
		int result = o1.getGender().compareTo(o2.getGender());
		if(result !=0) {return result;}
		
		return o1.getRegion().compareTo(o2.getRegion());
	}
}
