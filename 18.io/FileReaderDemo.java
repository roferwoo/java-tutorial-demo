/*

 */

import java.io.*;

class FileReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        // 创建一个文件读取流对象，和指定名称的文件相关联
        // 要保证该文件已经存在，如果不存在，会发生FileNotFoundException异常
        FileReader fr = new FileReader("demo.txt");

        // 调用读取流对象的read()方法，一次读一个字符，而且会自动往下读
        //int ch = fr.read();
        //System.out.println("ch=" + (char)ch);
        // 多次循环读取
        int ch = 0;
        while (-1 != (ch = fr.read())) {
            System.out.println((char)ch);
        }

        fr.close();
    }

}