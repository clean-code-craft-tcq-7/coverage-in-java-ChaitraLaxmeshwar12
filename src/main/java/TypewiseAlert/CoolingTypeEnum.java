package TypewiseAlert;

public enum CoolingTypeEnum {
	
     PASSIVE_COOLING(0,35),
     HI_ACTIVE_COOLING(0,45),
     MED_ACTIVE_COOLING(0,40)
	     
     int lowerLimit = 0;
     int upperLimit = 0;

     CoolingTypeEnum(Integer lowerLimit, Integer upperLimit) {
     this.lowerLimit = lowerLimit;
     this.upperLimit = upperLimit;
   } 

}
