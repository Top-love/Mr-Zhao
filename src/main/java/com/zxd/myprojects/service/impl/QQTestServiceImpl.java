package com.zxd.myprojects.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zxd.myprojects.bean.Data;
import com.zxd.myprojects.bean.QQTest;
import com.zxd.myprojects.service.QQTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class QQTestServiceImpl implements QQTestService {


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public QQTest getQQTest(String qq) {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://japi.juhe.cn/qqevaluate/qq?key=8d9160d4a96f2a6b5316de5b9d14d09d&qq=" + qq, String.class);
        log.info("forEntity----------->"+forEntity);
        String body = forEntity.getBody();
        ObjectMapper objectMapper=new ObjectMapper();
        QQTest qqTest=null;
        Data data=new Data();
        //String是不可改变的---需把String转换成StringBuilder(可变的)
        StringBuilder sb=null;
        try {
            qqTest = objectMapper.readValue(body, QQTest.class);
            String conclusion = qqTest.getResult().getData().getConclusion();
            for (int i=0;i<conclusion.length();i++){
                //判断是否有凶--如果有凶--把凶改成吉
                if('凶'==conclusion.charAt(i)){
                    sb=new StringBuilder(conclusion);
                    //sb.replace(i,i+1,"吉")---> 第一位(包括i) 第二位（不包括i+1) 第三位(改变的值);
                    sb.replace(i,i+1,"吉");
                }
            }
            String ss= String.valueOf(sb);
            //多层数据结构的插入值
            qqTest.getResult().getData().setConclusion(ss);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            log.info("异常");
        }
        System.out.println(qqTest);
        return qqTest;
    }
}
