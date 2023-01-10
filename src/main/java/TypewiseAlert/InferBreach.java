package TypewiseAlert;


public class InferBreach {
	
	 public static BreachTypeEnum inferBreach(double value, double lowerLimit, double upperLimit) {
	      if(value < lowerLimit) {
	        return BreachTypeEnum.TOO_LOW;
	      }
	      else if(value > upperLimit) {
	        return BreachTypeEnum.TOO_HIGH;
	      }
	      else
	      {
	      return BreachTypeEnum.NORMAL;
	      }
	    }
}
