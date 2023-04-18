package com.MacPGames.MacPsUnitConversions;

public class mi_km extends SimpleConversions {
    public mi_km(boolean toMetric)
    {
        super.conversionFactorMetric = 1.609344;
        super.conversionFactorImperial = 1 / super.conversionFactorMetric;
        super.SetConvertionFactor(toMetric);
    }
}
