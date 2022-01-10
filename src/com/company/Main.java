package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        List<Integer> list = inputParameters(scanner);
        logger.log("Создаем и наполняем список");
        System.out.print("Вот случайный список ");
        System.out.println(list.toString());
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int treshold = setTreshold(scanner);
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        list = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        System.out.println(list.toString());
        logger.log("Завершаем программу");
    }

    public static List<Integer> inputParameters(Scanner scanner) {
        int arraySize = 0;
        int maxValue = 0;
        Random random = new Random();
        System.out.println("Введите размер списка: ");
        try {
            arraySize = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Некорректный ввод размера списка. Конец работы программы");
        }

        System.out.println("Введите верхнюю границу для значений: ");
        try {
            maxValue = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Некорректный ввод размера списка. Конец работы программы");
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }

    public static int setTreshold(Scanner scanner) {
        int treshold = 0;
        System.out.println("Введите порог для фильтра: ");
        try {
            treshold = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Некорректный ввод размера списка. Конец работы программы");
        }
        return treshold;
    }
}
