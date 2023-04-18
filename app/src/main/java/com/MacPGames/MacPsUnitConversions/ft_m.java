package com.MacPGames.MacPsUnitConversions;

public class ft_m extends SimpleConversions {
    public ft_m(boolean toMetric)
    {
        super.conversionFactorMetric = 0.3048;
        super.conversionFactorImperial = 1 / super.conversionFactorMetric;
        super.SetConvertionFactor(toMetric);
    }
}
