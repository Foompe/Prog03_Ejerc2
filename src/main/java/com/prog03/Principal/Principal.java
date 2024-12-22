package com.prog03.Principal;

import com.prog03.Figuras.Rectangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {


        //instanciamos obj1
        Rectangulo obj1Rectangulo = new Rectangulo(5.0f, 5.0f);
        System.out.println("\nRecangulo 1: " + obj1Rectangulo);
        System.out.println(obj1Rectangulo.isCuadrado() ? "Es cuadrado." : "No es cuadrado.\n");

        //probamos los getter y setter del primer objeto
        System.out.println("\nParametros objeto 1: \n - Base: " + obj1Rectangulo.getBase() +
                "\n - Altura: " + obj1Rectangulo.getAltura() + "\n - Area: " +
                obj1Rectangulo.getArea());

        //instanciamos obj2
        Rectangulo obj2Rectangulo = new Rectangulo();
        System.out.println("\nRectangulo 2: " + obj2Rectangulo);
        System.out.println(obj2Rectangulo.isCuadrado() ? "Es cuadrado." : "No es cuadrado.\n");

        //modificamos rectangulo 2
        obj2Rectangulo.setBase(6.0f);
        obj2Rectangulo.setAltura(4.0f);
        System.out.println("\nRectangulo 2 (modificado) : " + obj2Rectangulo);
        System.out.println(obj2Rectangulo.isCuadrado() ? "Es cuadrado." : "No es cuadrado.\n");

    }
}