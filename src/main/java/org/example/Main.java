package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    /**
     * Измерение времени для метода add
     * @param list_arr объект класса ArrayList
     * @param list_link объект класса LinkedList
     * @param k количество повторений
     * @return объект класса Timer
     */
    public static Timer AddTimer(ArrayList<Integer> list_arr, LinkedList<Integer> list_link, int k) {
        long start; int n = 7;
        Timer result = new Timer();

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++)
            list_arr.add(n);
        result.setT_array(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++)
            list_link.add(n);
        result.setT_link(System.currentTimeMillis() - start);

        return result;
    }

    /**
     * Измерение времени для метода get
     * @param list_arr объект класса ArrayList
     * @param list_link объект класса LinkedList
     * @param k количество повторений
     * @return объект класса Timer
     */
    public static Timer GetTimer(ArrayList<Integer> list_arr, LinkedList<Integer> list_link, int k) {
        long start;
        Object temp;
        Timer result = new Timer();

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++)
            temp = list_arr.get(i);
        result.setT_array(System.currentTimeMillis()- start);

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++)
            temp = list_link.get(i);
        result.setT_link(System.currentTimeMillis() - start);
        return result;
    }
    /**
     * Измерение времени для метода delete
     * @param list_arr объект класса ArrayList
     * @param list_link объект класса LinkedList
     * @param k количество повторений
     * @return объект класса Timer
     */
    public static Timer DeletionTimer(ArrayList<Integer> list_arr, LinkedList<Integer> list_link, int k) {
        long start; int i;
        Timer result = new Timer();

        start = System.currentTimeMillis();
        for (i = k - 1; i >= 0; i--)
            list_arr.remove(i);
        result.setT_array(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (i = k - 1; i >= 0; i--)
            list_link.remove(i);
        result.setT_link(System.currentTimeMillis() - start);

        return result;
    }
    /**
     * Вывод результатов измерений в виде таблицы для класса ArrayList
     * @param result_add результат измерения метода add
     * @param result_get результат измерения метода get
     * @param result_delete результат измерения метода delete
     * @param k количество повторений
     */
    public static void ArrayTable (Timer result_add, Timer result_get, Timer result_delete, int k) {
        System.out.println ("ArrayList:");
        System.out.printf ("%-10s%-10s%-10s%n", "Method" + "\t\t\t", "Repetitions" + "\t", "Time");

        System.out.printf("%-10s", "add");
        System.out.printf("%15s", k);
        System.out.printf("%10s", result_add.getT_array());
        System.out.println();

        System.out.printf("%-10s", "get");
        System.out.printf("%15s", k);
        System.out.printf("%10s", result_get.getT_array());
        System.out.println();

        System.out.printf("%-10s", "delete");
        System.out.printf("%15s", k);
        System.out.printf("%10s", result_delete.getT_array());
        System.out.println();
    }
    /**
     * Вывод результатов измерений в виде таблицы для класса LinkedList
     * @param result_add результат измерения метода add
     * @param result_get результат измерения метода get
     * @param result_delete результат измерения метода delete
     * @param k количество повторений
     */
    public static void LinkTable (Timer result_add, Timer result_get, Timer result_delete, int k) {
        System.out.println ("LinkedList:");
        System.out.printf ("%-10s%-10s%-10s%n", "Method" + "\t\t\t", "Repetitions" + "\t", "Time");

        System.out.printf("%-10s", "add");
        System.out.printf("%15s", k);
        System.out.printf("%10s", result_add.getT_link());
        System.out.println();

        System.out.printf("%-10s", "get");
        System.out.printf("%15s", k);
        System.out.printf("%10s", result_get.getT_link());
        System.out.println();

        System.out.printf("%-10s", "delete");
        System.out.printf("%15s", k);
        System.out.printf("%10s", result_delete.getT_link());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list_arr = new ArrayList<>();
        LinkedList <Integer> list_link = new LinkedList<>();
        int k;

        System.out.println ("Введите количество итераций:");
        k = in.nextInt();

        Timer result_add;
        result_add = AddTimer (list_arr, list_link, k);

        Timer result_get;
        result_get = GetTimer (list_arr, list_link, k);

        Timer result_delete;
        result_delete = DeletionTimer (list_arr, list_link, k);

        ArrayTable (result_add, result_get, result_delete, k);

        LinkTable (result_add, result_get, result_delete, k);
    }
}
