package com.dioc.demo;

public class BikeEngine implements Engine{

    private EngineAction action;

    public EngineAction getAction() {
        return action;
    }

    public void setAction(EngineAction action) {
        this.action = action;
    }

    public BikeEngine(){
        System.out.println("Bike Engine started");
    }

    @Override
    public String doWork() {
        return "Bike Engine is running";
    }

    @Override
    public String doAction() {
        return action.engineAction();
    }
}
