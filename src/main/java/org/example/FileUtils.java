package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

public class FileUtils {
    public static boolean chekWorkDirectory(String path,String dirName){
        File workDir = new File(path + dirName);
        if (workDir.exists()){
            return true;
        }else{
            return workDir.mkdir();
        }
    }


    public static void modificateStrings(String path) throws IOException{
        File file = new File(path);//создаем файл с путем path
        //создаем ридер для чтения строк из исходного файла
        BufferedReader reader = new BufferedReader(new FileReader(file));
        //создаем writer для записи в новый файл
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Skorik\\new.txt"));
        String line;
        while ((line=reader.readLine())!=null){
            writer.write(reverseString(line));
            writer.write("\n");

        }
        //Закрываем потоки
        writer.close();
        reader.close();

    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }


}
