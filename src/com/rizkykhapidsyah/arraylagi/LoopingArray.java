package com.rizkykhapidsyah.arraylagi;

public class LoopingArray {
    public static void main(String[] args) {
        int[] X = new int[1000];

        // Inisiasi dan menampilkan X dari elemen ke 1 sampai 1000000
        for (int i = 0; i < X.length; i++) {
            X[i] = i + 1;
            System.out.println(X[i]);
        }
    }
}
