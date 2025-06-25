package edu.walteir.tema.operadores;

public class operadoresLogicos {
// Operadores logicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões

    public static void main(String[] args) {
        int a, b, c, d;
        
        a = 5;
        b = 9;
        c = 1;
        d = 6;

        // && Operador lógico "E"
        if (a > b && a > c) {
            a = a + d;
            System.out.println(a);
        }

        // || Operador lógico "OU"
        if (a > b || a < d) {
            a = a - c;
            System.out.println(a);
        }

        // ! Operador lógico de negação
        if (!(a < b && a > c)) {
            a = b * d + a;
            System.out.println(a);
        } else {
            System.out.println("False");
        }
    }
}
