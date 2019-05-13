package ma.fpl.utility;

public class BouncingBall {

	public static int bouncingBall(double h, double bounce, double window) {
	    
		if(h > 0 && bounce > 0 && bounce < 1 && window < h) {
	    	// int count = 0;
	    	int bouncingBall = 0;
	    	if (window <= h) bouncingBall = 1;
	    	while (window <= h * bounce) {
	    		bouncingBall += 2;
	    		h *= bounce; 
	    	}
	    	return bouncingBall;
	    } else {
	    	return -1;
	    }
	}
	
	
}
