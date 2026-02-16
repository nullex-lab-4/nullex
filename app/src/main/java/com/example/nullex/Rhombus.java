package com.example.nullex;

public class Rhombus extends Shape {

    private double side;      // length of each side
    private double diagonal1;  // first diagonal
    private double diagonal2;  // second diagonal

    public Rhombus(double side, double diagonal1, double diagonal2) {
        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
}
