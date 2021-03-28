/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author Tomi
 */
class Location {

    private String type;
    private double[] coordinates;
    private double coordinateN;
    private double coordinateE;

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
        setCoordinateE();
        setCoordinateN();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCoordinateN() {
        return this.coordinates[0];
    }

    public double getCoordinateE() {
        return this.coordinates[1];
    }

    public void setCoordinateN() {
        this.coordinateN = coordinates[0];
    }

    public void setCoordinateE() {
        this.coordinateE = coordinates[1];
    }
}
