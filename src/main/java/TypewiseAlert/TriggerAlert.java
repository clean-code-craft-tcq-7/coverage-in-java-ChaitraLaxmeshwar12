package TypewiseAlert;

public class TriggerAlert {
	
	 public static void sendToController(BreachTypeEnum breachType) {
	      int header = 0xfeed;
	      System.out.printf("%i : %i\n", header, breachType);
	    }
	    public static void sendToEmail(BreachTypeEnum breachType) {
	      String recepient = "a.b@c.com";
	      switch(breachType) {
	        case TOO_LOW:
	          System.out.printf("To: %s\n", recepient);
	          System.out.println("Hi, the temperature is too low\n");
	          break;
	        case TOO_HIGH:
	          System.out.printf("To: %s\n", recepient);
	          System.out.println("Hi, the temperature is too high\n");
	          break;
	        case NORMAL:
	          break;
	      }
	    }

}
