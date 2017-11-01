/*
第二种方式
通过字符数组进行读取
 */

import java.io.*;

class FileReaderDemo2
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("demo.txt");

        // 定义一个字符数组，用于存储读取的字符
        // read(char[])返回的是读取的字符个数
        char[] buf = new char[1024];// 注意长度的设置，一般设置为1024
        //int num = fr.read(buf);
        //
        //System.out.println("num=" + num + "..." + new String(buf));
        // 循环读取
        int num = 0;
        while (-1 != (num = fr.read(buf))) {
            System.out.println(new String(buf, 0, num));
        }

        fr.close();
    }
}