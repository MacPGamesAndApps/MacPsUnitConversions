package com.MacPGames.MacPsUnitConversions;

public class USgal_L extends SimpleConversions {
    public USgal_L(boolean toMetric)
    {
        super.conversionFactorMetric = 3.7854118;
        super.conversionFactorImperial = 1 / super.conversionFactorMetric;
        super.SetConvertionFactor(toMetric);
    }
}
