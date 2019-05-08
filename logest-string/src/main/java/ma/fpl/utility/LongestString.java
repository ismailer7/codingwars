package ma.fpl.utility;

public class LongestString{
	
	public static String maxConsecutiveString(String[] strarr, int k) {
		if (strarr.length == 0 || k > strarr.length || k <= 0) {
			return "";
		}
		int c = 0;
		int max = 0;
		String maxConsecutiveStrings = "";
		while(c <= strarr.length - k) {
			StringBuilder sb = new StringBuilder();
			int count = 0;
			while(count < k) {
				sb.append(strarr[c + count]);
				count ++;
			}
			if(sb.length() > max) {
				max = sb.length();
				maxConsecutiveStrings = sb.toString();
			}
			c++;
		}
		return maxConsecutiveStrings;
	}

}
