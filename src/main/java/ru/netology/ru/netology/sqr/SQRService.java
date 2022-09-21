package ru.netology.ru.netology.sqr;

public class SQRService {

    /**
     * @param minSquare нижняя граница квадратов чисел.
     * @param maxSquare верхняя граница квадратов чисел.
     *                  <p>
     *                  <p>
     *                  В ситуации, когда minSquare > maxSquare, значения границ меняются местами.
     *                  Отрицательные границы, заменяются 0.
     *                  <p>
     * @return Количество квадратов чисел от 10 до 99,
     * лежащих в диапазоне от minSquare до maxSquare включительно.
     */
    public int countSquaresInRange(int minSquare, int maxSquare) {
        if (maxSquare < minSquare) {
            int temp = maxSquare;
            maxSquare = minSquare;
            minSquare = temp;
        }
        if (minSquare < 0) {
            minSquare = 0;
        }
        if (maxSquare < 0) {
            maxSquare = 0;
        }
        int minNumber = 10;
        int upperNumbersLimit = 99;
        int count = 0;

        for (int i = minNumber; i < upperNumbersLimit; i++) {
            long square = i * i;
            if (square >= minSquare) {
                if (square <= maxSquare) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
