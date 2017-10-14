package java_code;

import java.io.*;
import java.util.Scanner;

public class chap6_16 {

    public static void main(String[] args) throws Exception {
        System.out.println("请输入新建文件名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        File fileName = new File(".\\src\\java_code\\"+name+".txt");
        System.out.println(createFile(fileName));
        System.out.println("请输入内容：");
        writeTxtFile(fileName);
        readTxtFile(fileName);
    }


    public static boolean createFile(File fileName) throws Exception {
        boolean flag = false;
        try {
            if (!fileName.exists()) {
                fileName.createNewFile();
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }


    public static String readTxtFile(File fileName) throws Exception {
        String result = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            try {
                String read = null;
                while ((read = bufferedReader.readLine()) != null) {
                    result = result + read + "\r\n";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        }
        System.out.println("读取出来的文件内容是：" + "\r\n" + result);
        return result;
    }


    public static void writeTxtFile(File fileName) throws Exception {
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        while(!content.equals("over")){
            writer.write(content);
            writer.newLine();
            sc = new Scanner(System.in);
            content = sc.nextLine();
        }
        System.out.println("输入完毕！\n");
        writer.flush();
        writer.close();
    }
}
