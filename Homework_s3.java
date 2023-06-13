// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
// 2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
// 3) Найти максимальное значение
// 4) Найти среднее значение

// То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.

import java.util.ArrayList;
import java.util.Random;

public class Homework_s3 {

    public static void main(String[] args) {
        ArrayList<Integer> randArr = getRandomArrList(20);
        System.out.println(randArr);
        removeEven(randArr);
        System.out.println(randArr);
        System.out.printf("минимальное значение = %d\nмаксимальное значение = %d\nсреднее значение = %.2f",
                findMin(randArr), findMax(randArr), findAverage(randArr));
    }

    public static ArrayList<Integer> getRandomArrList(int len) {
        Random rand = new Random();
        ArrayList<Integer> randArr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            randArr.add(rand.nextInt(100));
        }
        return randArr;
    }

    public static void removeEven(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 != 0) {
                arr.remove(i);
                i--;
            }
        }
    }

    public static Integer findMin(ArrayList<Integer> arr) {
        Integer min = arr.get(0);
        for (Integer item : arr) {
            if (item < min)
                min = item;
        }
        return min;
    }

    public static Integer findMax(ArrayList<Integer> arr) {
        Integer max = arr.get(0);
        for (Integer item : arr) {
            if (item > max)
                max = item;
        }
        return max;
    }

    public static Double findAverage(ArrayList<Integer> arr) {
        Double sum = 0.0;
        for (Integer item : arr)
            sum += item;
        return (sum / arr.size());
    }
}