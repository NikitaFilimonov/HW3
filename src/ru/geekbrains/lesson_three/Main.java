package ru.geekbrains.lesson_three;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GuessTheNumber();
//        GuessTheWord();


    }
    //1 задание
    public static void GuessTheNumber() {

        System.out.println("Добрый день! Сегодня мы сыграем в игру \"Угадай число\".\nНеобходимо угадать число от 0 до 9.\nНа отгадку у Вас есть 3 попытки!\nНе волнуйтесь, если не получится угадать с первого раза - мы подскажем!");

        do {
            int userAnswer = -1;
            int count = 0;
            int start = 0;
            int end = 9;
            int randomNumber = start + (int) (Math.random() * end);
            while (count < 3 && userAnswer != randomNumber) {
                System.out.print("\nВведите число от 0 до 9: ");
                userAnswer = sc.nextInt();

                if (randomNumber != userAnswer) {
                    System.out.println("Ваше чиcло " +
                            ((userAnswer > randomNumber) ? "больше!" : "меньше!"));
                    count++;
                }

            }
            System.out.println("Вы" +
                    ((userAnswer == randomNumber) ? " победили!" : ", к сожалению, проиграли, загаданное число: " + randomNumber));
            System.out.println("Сыграть еще раз? Да - 1, Нет - 0");

        } while (sc.nextInt() == 1);


    }

    // 2 задание. Пробовал сам, вот что получилось, не смог придумать как заменять буквы на ##. Понимаю, что кажду букву отдельно не заменить, нашел решение в интернете, не стал просто копипастить, только разобрался.
//    public static void GuessTheWord() {
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//
//        System.out.println("А теперь давайте поиграем в игру \"Отгадай слово\". Угадайте какое из слов следующего массива загадал компьютер: " + Arrays.toString(words));
//
//        String randomWord = new String();
//        Random rnd = new Random();
//        for (int i = 0; i < words.length; i++) {
//            randomWord = words[rnd.nextInt(words.length)];
//        }
//        String userAnswer = new String();
//        String maskedRandomWord = maskWord(randomWord);
//
//        do {
//            System.out.print("\nКакое слово загадал компьютер? ");
//            userAnswer = sc.nextLine();
//            userAnswer =
//            if (userAnswer.equals(randomWord)) {
//                System.out.println("Вы угадали!");
//            } else {
//                if (userAnswer.charAt(0) == randomWord.charAt(0)) {
//                System.out.println("К сожалению, неверно. Вот подсказка: " + randomWord.charAt(0) + "######");}
//                else System.out.println("Даже букву не угадали!");
//            }
//        } while (!userAnswer.equals(randomWord));
//
//
//    }
//



}

