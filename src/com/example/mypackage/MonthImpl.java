package com.example.mypackage;

public class MonthImpl implements IMonth{

    private String monthName;
    private int daysMonthNumber;
    private int workDaysNumber;

    public MonthImpl(String monthName, int daysMonthNumber, int workDaysNumber) {
        this.monthName = monthName;
        this.daysMonthNumber = daysMonthNumber;
        this.workDaysNumber = workDaysNumber;
    }

    @Override
    public int getWorkDaysNumber() {
        return this.workDaysNumber;
    }
}
