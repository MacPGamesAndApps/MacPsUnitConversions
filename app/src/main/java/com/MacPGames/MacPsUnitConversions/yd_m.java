package com.MacPGames.MacPsUnitConversions;

public class yd_m extends SimpleConversions {
    public yd_m(boolean toMetric)
    {
        super.conversionFactorMetric = 0.9144;
        super.conversionFactorImperial = 1 / super.conversionFactorMetric;
        super.SetConvertionFactor(toMetric);
    }
}
