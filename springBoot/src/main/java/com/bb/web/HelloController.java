package com.bb.web;

import com.bb.exception.BusinessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 */
//@RestController

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }


    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://aaaaa.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @RequestMapping("/hello2")
    public String hello2() throws Exception {
        throw new BusinessException("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws BusinessException {
        throw new BusinessException("发生错误2");
    }

}
