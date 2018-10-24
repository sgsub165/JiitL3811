/** 
* Name: Stephen Griffith
* Date: 10/23/2018
* Source File Name: GenderComparator.java
* Lab: Lab3
*/

package Lab3;

//import required java libraries
import java.util.Comparator;

/**
 * The GenderComparator class performs a sort 
 * for gender from the bank records and returns
 * the comparison data
 */
public class GenderComparator implements Comparator<BankRecords>{
	 
	@Override
	public int compare(BankRecords male, BankRecords female) {
	// use compareTo to compare strings
	int result = male.getGender().compareTo(female.getGender());
	return result;
	}
 }
