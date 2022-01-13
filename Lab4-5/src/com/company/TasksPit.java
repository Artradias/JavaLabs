package com.company;

public enum TasksPit {
    LABORATORY_WORK("Лабораторная работа"),
    PRACTICAL_WORK("Практическая работа"),
    COURSE_WORK("Курсовая работа"),
    EQUATIONS("Уравнения"),
    TEST("Тест"),
    EXAM_TEST("Экзамен");

    String ruVersion;

    TasksPit(String ruVersion) {
        this.ruVersion = ruVersion;
    }
}
