package com.MacPGames.MacPsUnitConversions;

public class SimpleConversions extends Conversions {
    private double conversionFactor;
    protected double conversionFactorMetric;
    protected double conversionFactorImperial;

    public SimpleConversions()
    {
        //logic implemented in derived classes
    }

    protected void SetConvertionFactor(boolean toMetric)
    {
        if (toMetric)
        {
            conversionFactor = conversionFactorMetric;
        }
        else
        {
            conversionFactor = conversionFactorImperial;
        }
    }

    public double ConvertValue(double fromValue)
    {
        return (fromValue * conversionFactor);
    }
}
