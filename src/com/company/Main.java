package com.company;

import java.util.Scanner;

public class Main {

    /**
     * #6 Реализовать класс студент с возможность хранения оценок по предметам за каждый
     * семестр. Реализовать методы вычисления средней оценки за семестр и за все время
     * обучения.
     */

    public static void main(String[] args) {
        completion();


    }


    public static void completion() {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        while (true) {
            System.out.println();
            System.out.println("Выберите предмет из списка:");
            System.out.println("1-математика");
            System.out.println("2-русский язык");
            System.out.println("3-информатика");
            System.out.println("0-перейти далее");
            student.setExam1(scan.nextInt());
            if (student.getExam1() == 1 || student.getExam1() == 2 || student.getExam1() == 3) {
                System.out.println("Введите три оценки по " + student.getExam2() + " за первый семестр: ");
                if (student.getExam1() == 1) {
                    student.setEstimationList11(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    student.getEstimationList11();
                }
                if (student.getExam1() == 2) {
                    student.setEstimationList21(scan.nextInt(), scan.nextInt(), scan.nextInt());
                }
                if (student.getExam1() == 3) {
                    student.setEstimationList31(scan.nextInt(), scan.nextInt(), scan.nextInt());
                }
                System.out.println("Введите три оценки по " + student.getExam2() + " за второй семестр: ");
                if (student.getExam1() == 1) {
                    student.setEstimationList12(scan.nextInt(), scan.nextInt(), scan.nextInt());
                }
                if (student.getExam1() == 2) {
                    student.setEstimationList22(scan.nextInt(), scan.nextInt(), scan.nextInt());
                }
                if (student.getExam1() == 3) {
                    student.setEstimationList32(scan.nextInt(), scan.nextInt(), scan.nextInt());
                }
            } else if (student.getExam1() == 0) {
                break;
            } else {
                System.out.println("Такого действия нет в списке.");
                continue;
            }
        }

        while (true) {
            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1-узнать среднюю оценку за первый семестр");
            System.out.println("2-узнать среднюю оценку за второй семестр");
            System.out.println("3-узнать среднюю оценку за все время обучения");
            System.out.println("0-выход");
            student.setExam1(scan.nextInt());
            if (student.getExam1() == 1 || student.getExam1() == 2 || student.getExam1() == 3) {
                if (student.getExam1() == 1) {
                    System.out.println("Средняя оценка по математике за первый семестр: " + student.getEstimationList11());
                    System.out.println("Средняя оценка по русскому языку за первый семестр: " + student.getEstimationList21());
                    System.out.println("Средняя оценка по информатике за первый семестр: " + student.getEstimationList31());
                    student.setMiddlball1(student.getEstimationList11(), student.getEstimationList21(), student.getEstimationList31());
                    System.out.println("Средняя оценка за первый семестр: " + student.getMiddlball1());
                }
                if (student.getExam1() == 2) {
                    System.out.println("Средняя оценка по математике за второй семестр: " + student.getEstimationList12());
                    System.out.println("Средняя оценка по русскому языку за второй семестр: " + student.getEstimationList22());
                    System.out.println("Средняя оценка по информатике за второй семестр: " + student.getEstimationList32());
                    student.setMiddlball2(student.getEstimationList12(), student.getEstimationList22(), student.getEstimationList32());
                    System.out.println("Средняя оценка за второй семестр: " + student.getMiddlball2());
                }
                if (student.getExam1() == 3) {
                    student.setMiddlball3(student.getMiddlball1(), student.getMiddlball2());
                    System.out.println("Средняя оценка по предметам за всё время: " + student.getMiddlball3());
                }
            } else if (student.getExam1() == 0) {
                break;
            } else {
                System.out.println("Такого действия нет в списке.");
                continue;
            }
        }
    }
}
