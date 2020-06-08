package Exercise4;

import java.lang.Runnable;
import java.security.SecureRandom;
import java.util.Random;

public class ArrayWriter implements Runnable {
	private static final SecureRandom generator = new SecureRandom();
   private final SimpleArray sharedSimpleArray;
   private final int startValue;

   private SecureRandom random;

   public ArrayWriter(int value, SimpleArray array) {
      startValue = value;
      sharedSimpleArray = array;    
   }

   @Override
   public void run() {
	   int num;
	   int i = 0;
      while ( i < 3) {
    	  
		    	  if(startValue == 1) {
		    		  num = generator.nextInt(11);  
		    		  sharedSimpleArray.add(num);
		    	  }
		    	  
		    	  
		    	  if(startValue == 11) {
		    		  num = generator.nextInt(10) + 11;  
		    		  sharedSimpleArray.add(num);
		    	  }
		    	  
		    	  if(startValue == 21) {
		    		  num = generator.nextInt(10) + 21;  
		    		  sharedSimpleArray.add(num);
		    	  }    	
         i++;
      } 
   }
} 


