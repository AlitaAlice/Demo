package com.alita.demo.controller;

import java.io.FileInputStream;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 20:08 2020/8/19
 */
public class FileInputStreamController {

    public static void main(String[] args) {
        FileInputStreamController fileInputStreamController = new FileInputStreamController();
        String filePath = "E:/Demo/abc.txt";
        String result = fileInputStreamController.readFile(filePath);
        System.out.println(result);

    }

    public String readFile(String filePath) {

        FileInputStream fileInputStream = null;
        String result = "";

        try {
            fileInputStream = new FileInputStream(filePath);
            /**
             * available():返回与之关联的文件的字节数
             */
            int lenth = fileInputStream.available();
            byte[] array = new byte[lenth];
            /**
             * 把数据读到数组中去
             */
            fileInputStream.read(array);


            /**
             * 根据获取到的Byte数组新建一个字符串，然后输出
             */
            result = new String(array);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try
            {
                fileInputStream.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return result;
    }
}
