package com.huqingzhong.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CountThread extends Thread {
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    //@Override
    public void run()  {  //throws InterruptedException
        Random random = new Random(20);
        while (true) {
            this.setCounter(random.nextInt(20));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("service count=" + this.getCounter());
        }
    }
}

