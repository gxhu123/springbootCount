package com.huqingzhong.controller;

import com.huqingzhong.service.CountThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class testCountController {
    @Autowired
    private CountThread countThread;

    @RequestMapping(value = "/count",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> testCounter(@RequestParam("user") String user ){
        //System.out.println("Ajax param user="+user);
        Map<String,Object> map=new HashMap<String,Object>();
         map.put("currentCount",countThread.getCounter());
        return map;
    }

    @RequestMapping("/")
    public String home(){
        if(!countThread.isAlive()){
            countThread.start();
        }
        return "counter";
    }

}
