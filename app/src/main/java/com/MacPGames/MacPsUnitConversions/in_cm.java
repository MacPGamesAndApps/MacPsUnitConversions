package com.MacPGames.MacPsUnitConversions;

public class in_cm extends SimpleConversions {
    public in_cm(boolean toMetric)
    {
        super.conversionFactorMetric = 2.54;
        super.conversionFactorImperial = 1 / super.conversionFactorMetric;
        super.SetConvertionFactor(toMetric);
    }
}
