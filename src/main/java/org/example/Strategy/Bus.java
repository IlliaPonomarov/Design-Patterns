package org.example.Strategy;

public class Bus implements RoadStrategy{
    @Override
    public String road() {
        return "Bus in the way...";
    }
}
