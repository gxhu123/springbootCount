package com.huqingzhong.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Service
public class LogService {

    public void testLog(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        String message="输出内容<br/>";
        PrintWriter out = response.getWriter();
        /*while(true){
            try {
                out.println("<script>");
                out.println("document.write('<div>" + message + "</div>');");
                out.println("</script>");
                out.flush();
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        out.println("<img src='/image/red.png' width='50' height='50'><br/>");
        out.println("<video src='/video/v1.mp4' controls='controls' width='500' height='400'/>");

    }
}
