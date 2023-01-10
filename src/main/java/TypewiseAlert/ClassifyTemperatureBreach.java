package TypewiseAlert;

public class ClassifyTemperatureBreach {
	
	 public static BreachTypeEnum classifyTemperatureBreach(CoolingTypeEnum coolingType, double temperatureInC) {
		      return InferBreach.inferBreach(temperatureInC, lowerLimit, upperLimit);
		    }

}
