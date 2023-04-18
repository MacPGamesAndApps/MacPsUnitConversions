package com.MacPGames.MacPsUnitConversions;

public class lb_kg extends SimpleConversions {
    public lb_kg(boolean toMetric)
    {
        super.conversionFactorMetric = 0.45359231;
        super.conversionFactorImperial = 1 / super.conversionFactorMetric;
        super.SetConvertionFactor(toMetric);
    }
}
