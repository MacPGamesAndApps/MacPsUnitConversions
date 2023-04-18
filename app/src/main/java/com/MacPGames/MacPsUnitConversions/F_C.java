package com.MacPGames.MacPsUnitConversions;

public class F_C extends Conversions {
    private boolean toCelsius;

    public F_C(boolean toMetric)
    {
        toCelsius = toMetric;
    }

    public double ConvertValue(double fromValue)
    {
        if (toCelsius)
        {
            return (FahrenheitToCelsius(fromValue));
        }
        else
        {
            return (CelsiusToFahrenheit(fromValue));
        }
    }

    private Double CelsiusToFahrenheit(double fromValue)
    {
        return ((fromValue * 9 / 5) + 32);
    }

    private Double FahrenheitToCelsius(double fromValue)
    {
        return ((fromValue - 32) * 5 / 9);
    }
}
