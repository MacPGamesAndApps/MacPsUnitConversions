package com.MacPGames.MacPsUnitConversions;

public class USoz_mL extends SimpleConversions {
    public USoz_mL(boolean   toMetric)
    {
        super.conversionFactorMetric = 29.5735;
        super.conversionFactorImperial = 1 / super.conversionFactorMetric;
        super.SetConvertionFactor(toMetric);
    }
}
