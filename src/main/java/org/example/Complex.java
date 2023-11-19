package org.example;

import lombok.Data;

@Data
public class Complex {

    private double x;
    private double y;

    public Complex() {
        this.x = 0;
        this.y = 0;
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public String str() {
        return x + "+" + y + "i";
    }

    public Complex add(Complex other) {
        double newX = x + other.getX();
        double newY = y + other.getY();
        return new Complex(newX, newY);
    }

    public Complex sub(Complex other) {
        double newX = x - other.getX();
        double newY = y - other.getY();
        return new Complex(newX, newY);
    }

    public Complex mul(Complex other) {
        double newX = x * other.getX() - y * other.getY();
        double newY = x * other.getY() + y * other.getX();
        return new Complex(newX, newY);
    }

    public Complex div(Complex other) {
        double newX = (x * other.getX() + y * other.getY()) / (Math.pow(other.getX(), 2) + Math.pow(other.getY(), 2));
        double newY = (y * other.getX() - x * other.getY()) / (Math.pow(other.getX(), 2) + Math.pow(other.getY(), 2));
        return new Complex(newX, newY);
    }

    public double modulus() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public boolean equals(Complex other) {
        return x == other.getX() && y == other.getY();
    }
}

