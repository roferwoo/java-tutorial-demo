/*
字符读取流缓冲区：
该缓冲区提供了一个一次读一行的方法readLine()，方便对文本数据的获取。
当返回null时表示读到文件末尾。

readLine()方法只返回换行符之前的内容，并不返回换行符。

readLine()方法原理：
无论是读一行，获取读取多个字符，其实最终都是在硬盘上一个一个读取，所以最终使用的还是read()方法一次读取一个的方法。
 */

import java.io.*;

class BufferedReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        // 创建一个读取流对象和文件相关联
        FileReader fr = new FileReader("buf.txt");

        // 为了提高效率加入缓冲技术，将字符读取流对象做为参数传递给缓冲对象的构造函数。
        BufferedReader bufr = new BufferedReader(fr);

        //String s1 = bufr.readLine();
        //
        //System.out.println("s1:" + s1);

        String line = null;
        while ((line=bufr.readLine()) != null)
        {
            System.out.println(line);
        }

        bufr.close();
    }

}