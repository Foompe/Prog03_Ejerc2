package com.prog03.Figuras;

public class Rectangulo {

    //Declaramos los atributos
    private float base;
    private float altura;

    //declaramos constructor vacio que inicializa los atributos a 0
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    //Declaramos un constructor que inicializa base y altura
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //metodos getter y setter

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //metodo que devuelve el area del rectangulo
    public float getArea() {
        return base * altura;
    }

    //metodo string to string que devuelve  una cadena conteniando su base y altura
    public String toString() {
        return "El rectangulo tiene " + base + " de base y " + altura + " de altura";
    }

    //metodo booleano que indica si es rectangulo o cuadrado
    public boolean isCuadrado() {
        return base == altura;
    }
}
