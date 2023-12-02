package org.example;

/**
 * Класс сравнения методов двух коллекций
 */
public class Timer {
    /**
     * результат измерения для класса ArrayList
     */
    private long t_array;

    /**
     * результат измерения для класса LinkedList
     */
    private long t_link;

    /**
     * конструктор по умолчанию класса Timer
     */
    public Timer() {
        t_array = 0;
        t_link = 0;
    }

    /**
     * метод get для класса ArrayList
     * @return t_array возвращает время, затраченное на действия с классом ArrayList
     */
    public long getT_array() {
        return t_array;
    }

    /**
     * метод get для класса LinkedList
     * @return t_link возвращает время, затраченное на действия с классом LinkedList
     */
    public long getT_link() {
        return t_link;
    }

    /**
     * метод set для класса ArrayList
     * @param t время, затраченное на действия с классом ArrayList
     */
    public void setT_array(long t) {
        t_array = t;
    }

    /**
     * метод set для класса LinkedList
     * @param t время, затраченное на действия с классом LinkedList
     */
    public void setT_link(long t) {
        t_link = t;
    }
}
