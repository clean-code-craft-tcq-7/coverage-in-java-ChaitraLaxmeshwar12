package TypewiseAlert;

public class TypewiseAlert 
{
   

	public static void checkAndAlert(AlertTargetEnum alertTarget, BatteryCharacter batteryChar, double temperatureInC) {

      BreachTypeEnum breachType = ClassifyTemperatureBreach.classifyTemperatureBreach( batteryChar.coolingType, temperatureInC);

      switch(alertTarget) {
        case TO_CONTROLLER:
          TriggerAlert.sendToController(breachType);
          break;
        case TO_EMAIL:
          TriggerAlert.sendToEmail(breachType);
          break;
      }
    }
   
}
