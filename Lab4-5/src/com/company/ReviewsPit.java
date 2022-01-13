package com.company;

public enum ReviewsPit {
    A("ОТЛИЧНО"),
    B ("ХОРОШО"),
    C ("УДОВЛЕТВОРИТЕЛЬНО"),
    D ("НЕУДОВЛЕТВОРИТЕЛЬНО");

    String ruVersion;

    ReviewsPit(String ruVersion) { this.ruVersion = ruVersion; }
}
