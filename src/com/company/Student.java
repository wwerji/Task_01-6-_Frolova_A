package com.company;

import java.util.ArrayList;

public class Student {

    private int exam1;
    private String exam2;
    private double middlball1;
    private double middlball2;
    private double middlball3;
    private ArrayList<Integer> estimationList11 = new ArrayList<>();
    private ArrayList<Integer> estimationList12 = new ArrayList<>();
    private ArrayList<Integer> estimationList21 = new ArrayList<>();
    private ArrayList<Integer> estimationList22 = new ArrayList<>();
    private ArrayList<Integer> estimationList31 = new ArrayList<>();
    private ArrayList<Integer> estimationList32 = new ArrayList<>();

    /**
     * @param exam1 - выбор действия/предмета.
     */
    public void setExam1(int exam1) {
        this.exam1 = exam1;
        if (exam1 == 1) {
            this.exam2 = "математике";
        }
        if (exam1 == 2) {
            this.exam2 = "русскому языку";
        }
        if (exam1 == 3) {
            this.exam2 = "информатике";
        }
    }

    public int getExam1() {
        return exam1;
    }

    public String getExam2() {
        return exam2;
    }

    /**
     * Хранение оценок по математике за первый и второй семестры. Вычисление средней оценки по предмету.
     * (List11 - математика 1 семестр; List12 - математика второй семестр; и тд.)
     *
     * @param a - оценка 1
     * @param b - оценка 2
     * @param c - оценка 3
     */
    public void setEstimationList11(int a, int b, int c) {
        estimationList11.add(a);
        estimationList11.add(b);
        estimationList11.add(c);
    }

    public double getEstimationList11() {
        double s = 0;
        for (int i = 0; i < estimationList11.size(); i++) {
            s += estimationList11.get(i);
        }
        s = s / estimationList11.size();
        return s;
    }


    public void setEstimationList12(int a, int b, int c) {
        estimationList12.add(a);
        estimationList12.add(b);
        estimationList12.add(c);
    }

    public double getEstimationList12() {
        double s = 0;
        for (int i = 0; i < estimationList12.size(); i++) {
            s += estimationList12.get(i);
        }
        s = s / estimationList12.size();
        return s;
    }

    /**
     * Хранение оценок по русскому языку за первый и второй семестры. Вычисление средней оценки по предмету.
     * (List11 - математика 1 семестр; List12 - математика второй семестр; и тд.)
     *
     * @param a - оценка 1
     * @param b - оценка 2
     * @param c - оценка 3
     */
    public void setEstimationList21(int a, int b, int c) {
        estimationList21.add(a);
        estimationList21.add(b);
        estimationList21.add(c);
    }

    public double getEstimationList21() {
        double s = 0;
        for (int i = 0; i < estimationList21.size(); i++) {
            s += estimationList21.get(i);
        }
        s = s / estimationList21.size();
        return s;
    }


    public void setEstimationList22(int a, int b, int c) {
        estimationList22.add(a);
        estimationList22.add(b);
        estimationList22.add(c);
    }

    public double getEstimationList22() {
        double s = 0;
        for (int i = 0; i < estimationList22.size(); i++) {
            s += estimationList22.get(i);
        }
        s = s / estimationList22.size();
        return s;
    }

    /**
     * Хранение оценок по математике за первый и второй семестры. Вычисление средней оценки по предмету.
     * (List11 - математика 1 семестр; List12 - математика второй семестр; и тд.)
     *
     * @param a - оценка 1
     * @param b - оценка 2
     * @param c - оценка 3
     */
    public void setEstimationList31(int a, int b, int c) {
        estimationList31.add(a);
        estimationList31.add(b);
        estimationList31.add(c);

    }

    public double getEstimationList31() {
        double s = 0;
        for (int i = 0; i < estimationList31.size(); i++) {
            s += estimationList31.get(i);
        }
        s = s / estimationList31.size();
        return s;
    }


    public void setEstimationList32(int a, int b, int c) {
        estimationList32.add(a);
        estimationList32.add(b);
        estimationList32.add(c);
    }

    public double getEstimationList32() {
        double s = 0;
        for (int i = 0; i < estimationList32.size(); i++) {
            s += estimationList32.get(i);
        }
        s = s / estimationList32.size();
        return s;
    }

    /**
     * Вычисление средней оценки по трём предметам за первый семестр.
     *
     * @param a - средний балл по математике за первый семестр
     * @param b - средний балл по русскому языку за первый семестр
     * @param c - средний балл по информатике за первый семестр
     */
    public void setMiddlball1(double a, double b, double c) {
        this.middlball1 = (a + b + c) / 3;
    }

    public double getMiddlball1() {
        return middlball1;
    }

    /**
     * Вычисление средней оценки по трём предметам за второй семестр.
     *
     * @param a - средний балл по математике за второй семестр
     * @param b - средний балл по русскому языку за второй семестр
     * @param c - средний балл по информатике за второй семестр
     */
    public void setMiddlball2(double a, double b, double c) {
        this.middlball2 = (a + b + c) / 3;
    }

    public double getMiddlball2() {
        return middlball2;
    }

    /**
     * Вычисление средней оценки по трём предметам за всё время.
     *
     * @param a - средней оценки по трём предметам за первый семестр
     * @param b - средней оценки по трём предметам за второй семестр
     */
    public void setMiddlball3(double a, double b) {
        this.middlball3 = (a + b) / 2;
    }

    public double getMiddlball3() {
        return middlball3;
    }
}
