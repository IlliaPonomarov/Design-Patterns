package org.example.Strategy;

public class Airplane implements RoadStrategy{
    @Override
    public String road() {
        return "Airplane in the way...";
    }
}
