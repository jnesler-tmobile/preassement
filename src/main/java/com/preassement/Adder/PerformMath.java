package com.preassement.Adder;

public class PerformMath {
    
    public int addValues(int value1, int value2) throws NumberFormatException {
        int sumValue = 0;
        //make sure it is realistic to add these together
        if((
            (value1 <  Integer.MAX_VALUE) || (value1 > Integer.MIN_VALUE))        
            &&
            (value2 <  Integer.MAX_VALUE) || (value2 > Integer.MIN_VALUE))
        {
            sumValue = value1 + value2;
            if((sumValue > Integer.MAX_VALUE) || (sumValue < Integer.MIN_VALUE))
            {
                throw new NumberFormatException("The sum exceeded the bounds of primative int.");
            }
        }
        else{
                throw new NumberFormatException("One of the values is above or below the max or min values for int.");
        }
        return sumValue;
    }
}
