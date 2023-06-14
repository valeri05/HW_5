package ru.netology.services;
public class BudgetService {
    public int calculate(int income, int expense, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expense) / 3;
            } else {
                money = money + income - expense;
            }
        }
        return count;
    }
}