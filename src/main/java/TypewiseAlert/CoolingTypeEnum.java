package TypewiseAlert;

public enum CoolingTypeEnum {
    PASSIVE_COOLING(0, 35),
    HI_ACTIVE_COOLING(0, 45),
    MED_ACTIVE_COOLING(0, 40);

    private final int upperLimit;
    private final int lowerLimit;

    CoolingTypeEnum(int lowerLimit, int upperLimit) {
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }
}
