/*
文件续写
    对已有文件的数据续写
 */

import java.io.*;

class FileWriterDemo3
{
    public static void main(String[] args)
    {
        FileWriter fw = null;
        try {
            // 传递一个true参数，代表不覆盖已有文件，并在已有文件的末尾处进行数据的续写
            fw = new FileWriter("demo.txt", true);
            fw.write("haah");

            // 换行符Linux下为\n Windows下为\r\n
            fw.write("waha \n waha");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (null != fw) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

    }
}