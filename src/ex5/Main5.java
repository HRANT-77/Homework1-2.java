package ex5;

import java.sql.SQLOutput;

public class Main5 {
    public static void main(String[] args) {

        Farenheit farenheit=new Farenheit();
        farenheit.setTemp(100);

        Celsius celsius=new Celsius();
        celsius.setTemp(100);

        Kelvin kelvin=new Kelvin();
        kelvin.setTemp(100);

        TemperatureConverter converter=new TemperatureConverter();

        System.out.println(celsius.getTemp()+" celsius is "+converter.convertCelsiusToKelvin(celsius).getTemp()+" kelvin");
        System.out.println(celsius.getTemp()+" celsius is "+converter.convertCelsiusToFarenheit(celsius).getTemp()+" farenheit");
        System.out.println();
        System.out.println(farenheit.getTemp()+" farenheit is "+converter.convertFarenheitToCelsius(farenheit).getTemp()+" celsius");
        System.out.println(farenheit.getTemp()+" farenheit is "+converter.convertFarenheitToKelvin(farenheit).getTemp()+" kelvin");
        System.out.println();
        System.out.println(kelvin.getTemp()+" kelvin is "+converter.convertKelvinToCelsius(kelvin).getTemp()+" celsius");
        System.out.println(kelvin.getTemp()+" kelvin is "+converter.convertKelvinToFarenheit(kelvin).getTemp()+" farenheit");
    }
}
