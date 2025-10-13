package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return (temperatureCelsius * 9/5) + 32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather:%.2f °C (%.2f °F) and %s", temperatureCelsius,temperatureFahrenheit(), conditions);

    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       double tempCelsius = (double) 5 /9 * (tempFahrenheit - 32);
       return new WeatherData(tempCelsius, conditions);
    }

    public static void main(String[] args) {
        WeatherData weather = new WeatherData(25,"Sunny");
        System.out.println("Today's weather :"+weather.getSummary());
        WeatherData weather2 = WeatherData.fromFahrenheit(50,"Cloudy");
        System.out.println("Yesterday's weather :"+weather2.getSummary());

    }
}
