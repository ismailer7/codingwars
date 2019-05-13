package ma.fpl.utility.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ma.fpl.utility.LongestString;

public class LongestStringTest {
	
	@Test
	public void test() {
		assertEquals("abigailtheta", LongestString.maxConsecutiveString(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
		assertEquals("oocccffuucccjjjkkkjyyyeehh", LongestString.maxConsecutiveString(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
		assertEquals("wlwsasphmxxowiaxujylentrklctozmymu", LongestString.maxConsecutiveString(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));	
		assertEquals("ixoyx3452zzzzzzzzzzzz", LongestString.maxConsecutiveString(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
		assertEquals("", LongestString.maxConsecutiveString(new String[] {}, 3));
		assertEquals("wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck", LongestString.maxConsecutiveString(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
		assertEquals("", LongestString.maxConsecutiveString(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2));
		assertEquals("", LongestString.maxConsecutiveString(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
		assertEquals("", LongestString.maxConsecutiveString(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0));
	}
	
	
	
	
}