/*
通过缓冲区复制一个.java文件。

 */

import java.io.*;

class CopyTestByBufTest
{
    public static void main(String[] args)
    {
        BufferedReader bufr = null;
        BufferedWriter bufw = null;

        try {
            bufr = new BufferedReader(new FileReader("BufferedReaderDemo.java"));
            bufw = new BufferedWriter(new FileWriter("BufferedReaderDemoCopy.txt"));

            String line = null;
            while (null != (line = bufr.readLine())) {
                bufw.write(line);
                bufw.newLine();// 添加换行符
                bufw.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException("读写失败");
        } finally {
            // 关闭资源
            try {
                if (bufr != null) {
                    bufr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException("读取关闭失败");
            }
            try {
                if (bufw != null) {
                    bufw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException("写入关闭失败");
            }
        }
    }
}