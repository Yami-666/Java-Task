package com.company;

public class Vector {
    //Приватные переменные класса
    private double x;
    private double y;
    private double z;

    //Конструктор
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Вычисление длины вектора
    public double len() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    //Скалярное прозвдение
    public double scalarMulti(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    //Векторное произвдение
    public Vector crossProduct(Vector vector) {
        //Возврат нового вектора без изменения старого
        return new Vector(y * vector.z - z * vector.y,
                          z * vector.x - x * vector.z,
                          x * vector.y - y * vector.x);

    }

    //Угол между векторами
    public double cos(Vector vector) {
        return scalarMulti(vector) / len() * vector.len();
    }

    //Метод суммы
    public Vector sum(Vector vector) {
        return new Vector(x + vector.x,
                          y + vector.y,
                          z + vector.z);
    }

    //Метод разности
    public Vector diff(Vector vector) {
        //
        return new Vector(x - vector.x,
                          y - vector.y,
                          z - vector.z);
    }


    public static Vector[] generateVector(int n) {
        Vector[] vectors = new Vector[n];

        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector( Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    //Перегрузка базового метода toString для вывода объектов класса Vector
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
