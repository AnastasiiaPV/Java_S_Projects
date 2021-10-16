package com.example.mypackage;

public final class MonthUtils extends Month{
    // Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для
// использования (объекты класса Month).
    public final static Month JANUARY =new Month("January",31,22);
    public static Month February =new Month("February",28,20);
    public static Month March =new Month("March",31,23);
    public static Month April =new Month("April",30,21);
    public static Month May =new Month("May",31,22);
    public static Month Jun =new Month("Jun",30,22);
    public static Month July =new Month("July",31,21);
    public static Month Avgust =new Month("Avgust",31,23);
    public static Month September =new Month("September",30,22);
    public static Month October =new Month("October",31,21);
    public static Month November =new Month("November",30,22);
    public static Month December =new Month("December",31,21);

    public static Month[] monthsOfYear = new Month[]{JANUARY,February,March,April,May,Jun,July,Avgust,September,October,November,December};

    public static Month[] winterMonths = new Month[]{December,JANUARY,February};
    public static Month[] springMonths = new Month[]{March,April,May};
    public static Month[] summerMonths = new Month[]{Jun,July,Avgust};
    public static Month[] fallMonths = new Month[]{September,October,November};

    public MonthUtils(String monthName, int daysMonthNumber, int workDaysNumber) {
        super(monthName, daysMonthNumber, workDaysNumber);
    }
}
