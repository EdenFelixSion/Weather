package com.example.weathersystem;


public class City {

    private String name;
    private double temperature;
    private String weather;

    public City(String initialName,double initialTemprature,String initialWeather) {
        this.name=initialName;
        this.temperature=initialTemprature;
        this.weather = initialWeather;
    }

    public boolean equals(Object object){
        return object instanceof City
                && ((City) object).name.equals(this.name);
    }

    public String getName() {
        return this.name;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public String getWeather() {
        return this.weather;
    }

    public void renew(City city){
//        city = WeatherDataBase.getWeather(city.name);
    }

    public String toString(){
        return name + " " + temperature + " " + weather;
    }

}