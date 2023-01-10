package TypewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TypewiseAlertTest 
{
    @Test
    public void infersBreachAsPerLimits()
    {
        assertTrue(InferBreach.inferBreach(12, 20, 30) == BreachTypeEnum.TOO_LOW);
        assertTrue(InferBreach.inferBreach(35, 0, 30) == BreachTypeEnum.TOO_HIGH);
        assertTrue(InferBreach.inferBreach(15, 10, 30) == BreachTypeEnum.NORMAL);
    }
}
