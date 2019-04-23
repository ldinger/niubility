package com.rxt.springstudy.shabi;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;


 // 生命周期勾子
public class TestSmartLifecycle  implements SmartLifecycle {


    private boolean isRunning  = false ;
    @Override
    public void start() {  // srping 容器初始化完成时 且 isRunning  = false 时 调用

        System.out.println("start-----------------");
        isRunning = true;

    }

    @Override
    public void stop() {  // srping 关闭时 且 isRunning  = true 时 调用
        System.out.println("stop-----------------");
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
