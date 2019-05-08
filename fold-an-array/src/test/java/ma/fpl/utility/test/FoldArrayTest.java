package ma.fpl.utility.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import ma.fpl.utility.FoldArray;

public class FoldArrayTest {

	@Test
	public void foldArrayTest() {
		assertArrayEquals(new int[] { 6, 6, 3 }, FoldArray.foldArray(new int[] { 1,  2, 3, 4, 5 }, 1));
		assertArrayEquals(new int[] { 9, 6 }, FoldArray.foldArray(new int[] { 1,  2, 3, 4, 5 }, 2));
		assertArrayEquals(new int[] { 15 }, FoldArray.foldArray(new int[] { 1,  2, 3, 4, 5 }, 3));
		assertArrayEquals(new int[] { 14, 75, 0 }, FoldArray.foldArray(new int[] { -9, 9, -8, 8, 66, 23 }, 1));
	}
	
	
	
}
