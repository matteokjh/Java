package java_code;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Date;


public class chap6_13 {

    public static String getFileSize(File e) {
        String size = "";
        if(e.exists()&&e.isFile()){
            long fileSize = e.length();
            DecimalFormat df = new DecimalFormat("#.00");
            if(fileSize<1024){
                size = df.format((double)fileSize)+"BT";
            }else if(fileSize<1048576){
                size = df.format((double)fileSize/1024)+"KB";
            }else if(fileSize<1073741824){
                size = df.format((double)fileSize/1048576)+"MB";
            }else{
                size = df.format((double)fileSize/1073741824)+"GB";
            }
        }
        return size;
    }

    public static String getDate(File e){
        String dateTime = "";
        if (e.exists())
        {
            java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            dateTime=df.format(new Date(e.lastModified()));
        }
        return dateTime;
    }

    public static void main(String[] args){
        File dir = new File(".\\src\\java_code");
        File[] fileList = dir.listFiles();
        System.out.print("文件数： ");
        System.out.println(fileList.length+"\n");
        for(File e : fileList){
            //匹配.java文件
            if(e.getName().endsWith(".java")){
                System.out.print("路径： ");
                System.out.println(e.getPath());
                System.out.print("文件名： ");
                System.out.println(e.getName());
                System.out.print("最后修改时间： ");
                System.out.println(getDate(e));
                System.out.print("文件大小： ");//注意此处为文件大小而非占用空间
                System.out.println(getFileSize(e)+"\n");
            }
        }
    }
}
