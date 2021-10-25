package com.example.mypackage;

public final class MonthUtils{
    // Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для
// использования (объекты класса Month).
    public final static Month JANUARY =new Month("January",31,22);
    public final static Month February =new Month("February",28,20);
    public final static Month March =new Month("March",31,23);
    public final static Month April =new Month("April",30,21);
    public final static Month May =new Month("May",31,22);
    public final static Month Jun =new Month("Jun",30,22);
    public final static Month July =new Month("July",31,21);
    public final static Month Avgust =new Month("Avgust",31,23);
    public final static Month September =new Month("September",30,22);
    public final static Month October =new Month("October",31,21);
    public final static Month November =new Month("November",30,22);
    public final static Month December =new Month("December",31,21);

    public final static Month[] monthsOfYear = new Month[]{JANUARY,February,March,April,May,Jun,July,Avgust,September,October,November,December};

    public final static Month[] winterMonths = new Month[]{December,JANUARY,February};
    public final static Month[] springMonths = new Month[]{March,April,May};
    public final static Month[] summerMonths = new Month[]{Jun,July,Avgust};
    public final static Month[] fallMonths = new Month[]{September,October,November};

    public static Month[] threeMonths(Month one, Month two, Month three){
        Month[] quorter = new Month[3];
        quorter[0] = one;
        quorter[1] = two;
        quorter[2] = three;
        return quorter;
    }

    public static Month[] halfYear(Month one, Month two, Month three, Month four, Month five, Month six){
        Month[] halfYear = new Month[6];
        halfYear[0] = one;
        halfYear[1] = two;
        halfYear[2] = three;
        halfYear[3] = four;
        halfYear[4] = five;
        halfYear[5] = six;

        return halfYear;
    }

    public static Month[] year(Month one, Month two, Month three, Month four, Month five, Month six,
                               Month seven, Month eight, Month nine, Month ten, Month eleven, Month twelve){
        Month[] year = new Month[12];
        year[0] = one;
        year[1] = two;
        year[2] = three;
        year[3] = four;
        year[4] = five;
        year[5] = six;
        year[6] = seven;
        year[7] = eight;
        year[8] = nine;
        year[9] = ten;
        year[10] = eleven;
        year[11] = twelve;

        return year;
    }
}
