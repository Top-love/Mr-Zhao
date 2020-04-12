package com.zxd.myprojects.controller;

import com.zxd.myprojects.bean.QQTest;
import com.zxd.myprojects.service.QQTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class QQTestController {

    @Autowired
    private QQTestService qqTestService;

    @RequestMapping("/get/{qq}")
    @ResponseBody
    public QQTest getQQTest(@PathVariable ("qq") String qq){
        QQTest qqTest = qqTestService.getQQTest(qq);
        return qqTest;
    }

}
