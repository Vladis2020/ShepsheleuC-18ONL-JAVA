import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        calculateSumOfDiagonalElements();
//        printMatrix();
//        randomDay();
//        amoebaDivision();
//        isPositiveOrNot();
//        System.out.print(summ(5,5));
//        oddArray();
//        printMaxElementOfArray();
//        replaceByZero();
//        replaceMax();
//       int []a={0, 3, 46, 2, 1,3,3,3,5,5};
//        checkDifferences(a);
        goroscope(9, 2);

    }
//        Задачи:
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

    public static void randomDay() {
        int a = 1; // Начальное значение диапазона - "от"
        int b = 7; // Конечное значение диапазона - "до"
        int randomNumber = a + (int) (Math.random() * b);
        switch (randomNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }


    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static void amoebaDivision() {
        int ameoba = 1;
        for (int i = 3; i <= 24; i = i + 3) {
            ameoba = ameoba * 2;
            System.out.println("after " + i + " hours:" + ameoba);
        }

    }

//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    public static void isPositiveOrNot() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = Integer.parseInt(in.nextLine());

        int countOfNumbers = 0;


        if (number == 0) {

            System.out.print("number is zero!");

        }
        if (number > 0) {

            System.out.print("number is positive");

        }
        if (number < 0) {

            System.out.print("number is negative");

        }
        for (; number != 0; number /= 10)
            ++countOfNumbers;
        System.out.println((number + " there are ") + countOfNumbers + " digit(s)");
        System.out.println(number);

    }

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

    // можете,пожалуйста,описать как это должно выгядить по-человечески (немного не понял и сделал самым простым способом)
    //еще придумал как через switch (но тоже не уверен что это то))))
    public static void goroscope(int day, int month) {
        if (month == 1) {
            if (day > 19) {
                System.out.println("Водолей");
            } else {
                System.out.println("Козерог");
            }
        }

        if (month == 2) {
            if (day > 20) {
                System.out.println("Рыбы");
            } else {
                System.out.println("Водолей");
            }
        }

        if (month == 3) {
            if (day > 20) {
                System.out.println("Овен");
            } else {
                System.out.println("Рыбы");
            }
        }

        if (month == 4) {
            if (day > 20) {
                System.out.println("Тилец");
            } else {
                System.out.println("Овен");
            }
        }

        if (month == 5) {
            if (day > 21) {
                System.out.println("Близецы");
            } else {
                System.out.println("Тилец");
            }
        }

        if (month == 6) {
            if (day > 21) {
                System.out.println("Рак");
            } else {
                System.out.println("Близецы");
            }
        }

        if (month == 7) {
            if (day > 22) {
                System.out.println("Лев");
            } else {
                System.out.println("Рак");
            }
        }

        if (month == 8) {
            if (day > 21) {
                System.out.println("Дева");
            } else {
                System.out.println("Лев");
            }
        }

        if (month == 9) {
            if (day > 23) {
                System.out.println("Весы");
            } else {
                System.out.println("Дева");
            }
        }

        if (month == 10) {
            if (day > 23) {
                System.out.println("Скорпион");
            } else {
                System.out.println("Весы");
            }
        }

        if (month == 11) {
            if (day > 22) {
                System.out.println("Стрилец");
            } else {
                System.out.println("Скорпион");
            }
        }

        if (month == 12) {
            if (day > 22) {
                System.out.println("Стрилец");
            } else {
                System.out.println("Козерог");
            }
        }


    }


    //        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static int summ(int a, int b) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {

            sum = sum + b;
        }
        return sum;
    }

//        6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *


    public static int fourTriangels() {


        return 0;
    }

    //        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void oddArray() {
        int[] mas = new int[50];
        for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
            mas[i] = n;
        }
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }


    }

//        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    public static void printMaxElementOfArray() {
        int[] mass = new int[12];
        int max = 0;
        int maxIndex = 0;

        for (int i = 0, n = 0; i < mass.length; n = n + 1, i++) {
            mass[i] = (int) (Math.random() * 15);
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
            if (max <= mass[i])
                max = mass[i];

            if (mass[i] > mass[maxIndex])
                maxIndex = i;// сравниваем занчения - если больше - то макс индекс равняется индексу большего значения
        }
        System.out.println("max number is " + max + " on position " + maxIndex);

//esli element ne max to mi


    }


//        9) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    public static void replaceByZero() {
        int[] mass = new int[20];
        for (int i = 0, n = 0; i < mass.length; n = n + 1, i++) {
            mass[i] = (int) (Math.random() * 20);
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }


        System.out.println("");


        for (int i = 0; i < mass.length; i++) {


            if (i % 2 != 0) {
                mass[i] = 0;
            }

            System.out.print(mass[i] + " ");
        }

    }

//        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    public static void replaceMax() {
        int[] mass = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = 0;
        int maxIndex = 0;
        int first = mass[0];
        for (int i = 0; i < mass.length; i++) {

            if (max <= mass[i])
                max = mass[i];
            mass[0] = max;
            maxIndex = i;


        }
        mass[maxIndex - 1] = first;


        System.out.println(first + " " + maxIndex);

        for (int i = 0; i < mass.length; i++) {

            System.out.print(mass[i] + " ");
        }


// это задание вызвало у меня наибольшую сложность и ступор)) хотя на свежую голову сделал за три минуты
    }

//        11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

    public static void checkDifferences(int[] mass) {
        int repeatElement = 0;
        String repeatElements = "";

        for (int i = 0; i < mass.length; i++) {
            int first = mass[i];


            for (int j = i + 1; j < mass.length; j++) {

                if (first == mass[j]) {
                    int qwe = mass[j];
                    repeatElements += Integer.toString(qwe);
                    repeatElements += " ";
                    repeatElement += 1;


                }

            }

        }
        if (repeatElement >= 1) {
            System.out.println("Массив имеет повторяющиеся элементы " + repeatElements);

        } else {
            System.out.println("Массив не имеет повторяющихся элементов");
        }
    }


//        12) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7


    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
//    public static void calculateSumOfDiagonalElements() {
//        int[][] mass = new int[3][3];
//        Random random = new Random();
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass.length; j++) {
//                mass[i][j] = random.nextInt(100);
//            }
//        }
//
//        int result = 0;
////        for (int i = 0; i < mass.length; i++) {
////            for (int j = 0; j < mass.length; j++) {
////                if (i == j) {
////                    result += mass[i][j];
////                }
////            }
////        }
//
//        for (int i = 0; i < mass.length; i++) {
//            result += mass[i][i];
//        }
//
//        System.out.println(result);
//    }
//

    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
//    public static void printMatrix() {
//        char[][] mass = new char[3][3];
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass.length; j++) {
//                //21
//                if (mass[i][j] % 3 == 0) {
//                    mass[i][j] = '+';
//                } else if (mass[i][j] % 7 == 0) {
//                    mass[i][j] = '-';
//                } else {
//                    mass[i][j] = '*';
//                }
//            }
//        }
//    }

//    Доп задача!
//    Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int) из диапазона от 0 до 10000.
//    Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
//    Пример:
//            *Для простоты пример показан на одномерном массиве размера 10
//            [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:  [2789, 4, 8742]
//    Вывод в консоль:
//            11535 (0,5)
//            *Пояснение. Первое число - сумма тройки  [2789, 4, 8742]. Числа в скобках это 0 строка и 5 столбец - индекс первого элемента тройки, то есть индекс числа 2789.
}