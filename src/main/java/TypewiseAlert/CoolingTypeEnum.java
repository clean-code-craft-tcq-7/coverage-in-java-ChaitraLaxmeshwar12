package TypewiseAlert;

public enum CoolingTypeEnum {
	
     PASSIVE_COOLING(0,35),
     HI_ACTIVE_COOLING(0,45),
     MED_ACTIVE_COOLING(0,40)
	     
     Integer lowerLimit = null;
     Integer upperLimit = null;

	public ECoolingType(Integer lowerLimit, Integer upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	} 

}
