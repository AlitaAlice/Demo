package com.alita.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Title:
 * Description:
 * Company: http://www.biyouxinli.com/
 *
 * @author zhangxl@biyouxinli.com
 * @date Created in 20:53 2020/7/28
 */
@Controller
public class DemoController {

    @RequestMapping("")
    @ResponseBody
    public String main(@RequestParam int id) {

        return "hello world"+id;
    }


    //路径地址映射
    @RequestMapping("to/{ids}")
    public String to (@PathVariable("ids") int ids)
    {
        return "hello world " + ids;
    }

}
