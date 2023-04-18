package com.MacPGames.MacPsUnitConversions;

public class UKgal_L extends SimpleConversions {
    public UKgal_L(boolean toMetric)
    {
        super.conversionFactorMetric = 4.5460879;
        super.conversionFactorImperial = 1 / super.conversionFactorMetric;
        super.SetConvertionFactor(toMetric);
    }
}
