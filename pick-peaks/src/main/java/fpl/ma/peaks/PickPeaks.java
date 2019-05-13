package fpl.ma.peaks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
	private static Map<String, List<Integer>> map;
	
	static {
		map = new HashMap<String, List<Integer>>();
		map.put("pos", new ArrayList<Integer>());
		map.put("peaks", new ArrayList<Integer>());
	}
	
	public static Map<String,List<Integer>> getPeaks(int[] arr) {
        int index = 1;
        while(index < arr.length - 1) {
        	int temp = 0;
        	if( arr[index - 1] < arr[index] && (temp = isPeakPlateau(index, index - 1, arr)) != -1) {
        		index = temp;
        	} else {
            	if(arr[index] > arr[index - 1] && arr[index] > arr[index + 1]) {
	        		map.get("pos").add(index);
	        		map.get("peaks").add(arr[index]);
        		}
        		index ++;
        	}
        }
		
        return map;
    }
	
	public static int isPeakPlateau(int index, int bIndex, int[] arr) {
		
		int i = index + 1;
		int count = 0;
		while(i < arr.length) {
			if(arr[i] == arr[index] && i != arr.length - 1) {
				i++;
				count ++;
			}else break;		
		}
		if (count < 1) return -1;
		
		if(arr[i] < arr[index]) {
			map.get("pos").add(bIndex + 1);
			map.get("peaks").add(arr[bIndex + 1]);
			return i;
		} else {
			return i;
		}
	}
	
	
}
