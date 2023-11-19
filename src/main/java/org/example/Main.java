package org.example;

import lombok.Data;

@Data
public class Main {
    public static void main(String[] args) {

        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 5);

        Complex sum = a.add(b);
        System.out.println("Сумма: " + sum.str());

        Complex difference = a.sub(b);
        System.out.println("Разность: " + difference.str());

        Complex product = a.mul(b);
        System.out.println("Произведение: " + product.str());

        Complex quotient = a.div(b);
        System.out.println("Частное: " + quotient.str());

        double modulus = a.modulus();
        System.out.println("Модуль: " + modulus);

        boolean isEqual = a.equals(b);
        System.out.println("Равны ли числа: " + isEqual);
    }
}