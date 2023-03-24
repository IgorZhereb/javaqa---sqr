package ru.netology.sqr;

public class SQRService {

    public int calc(int minLimit, int maxLimit) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= minLimit) {
                if (sqr <= maxLimit)
                    count++;
            }
        }
        return count;
    }
}