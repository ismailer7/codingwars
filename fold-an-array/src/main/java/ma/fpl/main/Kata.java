package ma.fpl.main;

import ma.fpl.utility.FoldArray;

public class Kata {

	public static void main(String[] args) {
		
		for (Integer integer : FoldArray.foldArray(new int[] { 1,  2, 3, 4, 5 }, 3)) {
			System.out.print(integer + " ");
		}

	}

}
