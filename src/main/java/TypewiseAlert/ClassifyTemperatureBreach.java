package TypewiseAlert;

public class ClassifyTemperatureBreach {
	
	 public static BreachTypeEnum classifyTemperatureBreach(CoolingTypeEnum coolingType, double temperatureInC) {
		      int lowerLimit = 0;
		      int upperLimit = 0;
		      switch(coolingType) {
		        case PASSIVE_COOLING:
		          lowerLimit = 0;
		          upperLimit = 35;
		          break;
		        case HI_ACTIVE_COOLING:
		          lowerLimit = 0;
		          upperLimit = 45;
		          break;
		        case MED_ACTIVE_COOLING:
		          lowerLimit = 0;
		          upperLimit = 40;
		          break;
		      }
		      return InferBreach.inferBreach(temperatureInC, lowerLimit, upperLimit);
		    }

}
