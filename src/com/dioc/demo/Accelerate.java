package com.dioc.demo;

public class Accelerate implements EngineAction {

    @Override
    public String engineAction() {
        return "Engine is accelerating";
    }

    public void onInit(){
        System.out.println("Engine is acceleration ready");
    }

    public void onDest(){
        System.out.println("Engine is not accelerating anymore");
    }
}
