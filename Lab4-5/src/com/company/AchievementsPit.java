package com.company;

public enum AchievementsPit {
    PART_OF_THE_OLYMPIAD("Участник олимпиады"),
    WINNER_OF_THE_OLYMPIAD("Победитель олимпиады"),
    STUDENT_OF_THE_MONTH("Активист месяца"),
    SCIENTIFIC_ARTICLE_AUTHOR("Автор научной статьйи"),
    ACTIVE_RESEARCHER("Студент исследователь"),
    PART_OF_THE_STUDENT_COUNCIL("Член профкома");

    String ruVersion;

    AchievementsPit(String ruVersion) { this.ruVersion = ruVersion; }
}
