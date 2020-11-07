/*
 * 11. Define a class and store the names of ten cities in a single dimensional array. Sort these names in
 * alphabetical order using the bubble sort technique. Print the sorted array.
 */

public class cities {
   public static void main() {
	String str[] = { "kochi","London","Delhi","Tokyo","New York","Mexico City","Los Angeles","Cairo","Paris","Bengaluru"};
	String temp;
	for (int j = 0; j < str.length; j++) {
   	   for (int i = j + 1; i < str.length; i++) {
		if (str[i].compareTo(str[j]) < 0) {
			temp = str[j];
			str[j] = str[i];
			str[i] = temp;
		}
	   }
	   System.out.println(str[j]);
	}
   }
}