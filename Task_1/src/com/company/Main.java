package com.company;

public class Main {

    public static void main(String[] args) {
        Vector[] vectors = Vector.generateVector(10);

        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[2].len());
        System.out.println(vectors[3].scalarMulti(vectors[1]));
        System.out.println(vectors[4].crossProduct(vectors[2]));
        System.out.println(vectors[5].cos(vectors[3]));
        System.out.println(vectors[6].sum(vectors[0]));
        System.out.println(vectors[7].diff(vectors[0]));

    }
}
