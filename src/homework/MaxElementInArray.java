package homework;
/*Задача1
Создать класс MaxElementInArray, содержащий метод, который находит максимальный
элемент массива и возвращает его:

создать класс MaxElementInArray, содержащую имя массива (private int[] ints)
Создать конструктор , принимающий массив public MaxElementInArray( int[] ints ){ this.ints = ints;}
Написать метод, находящий максимальный элемент массива
В классе Main: создать массив целых чисел, cоздать обьект (экземпляр) класса
MaxElementInArray для этого массива и вывести на экран значение максимального элемента этого массива*/

public class MaxElementInArray {
    private int[] ints;

    public MaxElementInArray(int[] ints) {
        this.ints = ints;
    }

    public int maxValue(int[] ints) {
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) ;
            max = ints[i];
        }return max;
    }

}
