package com.alita.demo.utils;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 16:42 2020/8/5
 */
public class Demo {
    public static void main(String[] args) {

       try {
           div();
       }
       catch (ArithmeticException e)
       {
           e.printStackTrace();
       }
//        div();
    }

    private static void div()  {
        try {
        int i = 10 / 0;
        } catch (Exception e) {
            throw  new ArithmeticException();
        }
        finally {
            System.out.println("测试结束");
        }
    }
    }

