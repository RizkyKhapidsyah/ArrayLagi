package com.rizkykhapidsyah.arraylagi;

public class InisiasiArray {
    public static void main(String[] args) {
        int[] X = new int[]{1, 2, 3, 4, 5, 6};

        //Lebih Efisien
        for (int i = 0; i <= 5; i++) {
            System.out.println(X[i]);
        }

        System.out.println("\n");

        //Lebih Efisien
        for (int i = 0; i < X.length; i++) {
            System.out.println(X[i]);
        }

        /* Tidak Efisien
        System.out.println(X[0]);
        System.out.println(X[1]);
        System.out.println(X[2]);
        System.out.println(X[3]);
        System.out.println(X[4]);
        System.out.println(X[5]);
         */
    }
}
