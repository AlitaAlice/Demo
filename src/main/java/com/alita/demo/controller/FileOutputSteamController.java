package com.alita.demo.controller;

import java.io.FileOutputStream;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 20:33 2020/8/19
 */
public class FileOutputSteamController {
    public static void main(String[] args) {
        FileOutputSteamController fileOutputSteamController = new FileOutputSteamController();
        String filePath = "E:/Demo/abc.txt";
        String content = "今天天气很好，hello world";
        /**
         * it will replace
         */
        fileOutputSteamController.writeFile(filePath, content);
    }



    public void writeFile(String filePath, String content) {
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream(filePath);

            byte[] array = content.getBytes();

            /**
             * array写入到filePath
             */
            fileOutputStream.write(array);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try
            {
                fileOutputStream.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
