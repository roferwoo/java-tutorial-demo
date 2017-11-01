/*
将一个文件复制到另一个地方

复制的原理：将一个地方的文件数据存储到另一个地方的文件中
步聚：从A处复制到B处
1、在B处创建一个文件，用于存储A文件中的数据
2、定义读取流和A处文件关联
3、通过不断的读写完成数据存储
4、关闭资源
 */

import java.io.*;

class CopyTest
{
    public static void main(String[] args) throws IOException
    {
        //copy1();
        copy2();
    }
    // try catch方式处理
    public static void copy2()
    {
        FileWriter fw = null;
        FileReader fr = null;

        try {
            fw = new FileWriter("FileReaderDemoCopy.txt");
            fr = new FileReader("FileReaderDemo.java");

            char[] buf = new char[1024];
            int len = 0;
            while(-1 != (len = fr.read(buf))) {
                fw.write(buf, 0, len);
            }

        } catch (IOException e) {
            throw new RuntimeException("读写失败");
        } finally {
            if (null != fr) {
                try {
                    fr.close();
                } catch (IOException e) {

                }
            }
            if (null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {

                }
            }
        }

    }
    // throws方式
    public static void copy1() throws IOException
    {
        // 创建目的地
        FileWriter fw = new FileWriter("FileWriterDemoCopy.txt");
        // 与已有文件关联
        FileReader fr = new FileReader("FileWriterDemo.java");
        int ch = 0;
        while(-1 != (ch = fr.read())) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }

}