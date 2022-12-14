package com.dioc.demo;

public class CarEngine implements Engine{

    private EngineAction action;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    private String carModel;

    public CarEngine(EngineAction action){

        this.action = action;

        System.out.println("Car Engine started");
    }

    @Override
    public String doWork() {
        return "Car Engine is running";
    }

    @Override
    public String doAction() {
        return action.engineAction();
    }


}
