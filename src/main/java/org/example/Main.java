package org.example;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Скорик Константин Алексеевич, РИБО-05-22, Д/З 3, Вариант 2");
        Scanner scan = new Scanner(System.in);//вводим путь к исходному файлу
        String path = scan.nextLine();

        boolean isExistWorkDir = FileUtils.chekWorkDirectory("C:\\","Skorik");//проверяем директорию

        if (isExistWorkDir){
            try {
                FileUtils.modificateStrings(path);
            }catch (IOException ex){
                System.out.println("Ошибка "+ ex.getMessage());
            }
        }

    }
}