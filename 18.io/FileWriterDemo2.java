/*
IO异常的处理方式
new FileWriter()、wirte()、close()三个方法都会抛出异常 IOException
 */

import java.io.*;

class FileWriterDemo2
{
    public static void main(String[] args)
    {
        FileWriter fw = null;// finally块fw可使用
        try {
            fw = new FileWriter("demo.txt");// IOException FileNotFoundException是IOException的子类

            fw.write("abcdef exception");
        } catch (IOException e) {
            System.out.println("try-catch:" + e.toString());
        } finally {
            // 始终要关闭资源
            try {
                // 防止fw为null时，fw.close()产生NullPointerException异常
                if (null != fw) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("finally-catch:" + e.toString());
            }

        }
        // 以上是标准的IO异常的处理方式

    }
}