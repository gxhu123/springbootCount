package com.huqingzhong.controller;

import com.huqingzhong.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class testLogController {
    @Autowired
    LogService logService;

    @RequestMapping("/log")
    public void testResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logService.testLog(response);
    }
}
