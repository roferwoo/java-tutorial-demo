/*
缓冲区的出现是为了提高流的操作效率。
所以在创建缓冲区之前必须要先有流对象。

该缓冲区当中提供了个跨平台的换行符方法：newLine()
 */

import java.io.*;

class BufferedWriterDemo
{
    public static void main(String[] args) throws IOException
    {
        // 创建一个字符写入流对象
        FileWriter fw = new FileWriter("buf.txt");

        // 为了提高字符写入效率，加入缓冲技术，只要将需要被提高效率的流对像作为参数传递给缓冲区的构造函数即可
        BufferedWriter bufw = new BufferedWriter(fw);

        //bufw.write("abcde");

        for (int x = 1; x < 5; x++) {
            bufw.write("abcd" + x);
            bufw.newLine();// 跨平台 换行符
            bufw.flush();
        }

        // 记住，只要用到缓冲区，就要刻刷新
        //bufw.flush();
        // 关闭缓冲区就是在关闭缓冲区中的流对象，所以fw.close()不用写了
        bufw.close();
        //fw.close();
    }
}