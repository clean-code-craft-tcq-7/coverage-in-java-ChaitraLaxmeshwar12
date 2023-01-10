package TypewiseAlert;

public class TriggerAlert {
	
	 public static void sendToController(BreachTypeEnum breachType) {
	      int header = 0xfeed;
	      System.out.printf("%i : %i\n", header, breachType);
	    }
	    public static void sendToEmail(BreachTypeEnum breachType) {
	      String recepient = "a.b@c.com";
	      if(breachType != BreachTypeEnum.NORMAL)
	      {
	    	  printConsoleBasedOnBreachType(breachType,recepient);
	      }
	    }
	    public static void printConsoleBasedOnBreachType(BreachTypeEnum breachType,String recepient)
	    {
	    	System.out.printf("To: %s\n", recepient);
	        System.out.println("Hi, the temperature is too low\n");
	    }
}
