package com.dioc.demo;

public class TrainEngine implements Engine {
    private int bogeyCount;
    private String destination;

    private EngineAction action;

    public EngineAction getAction() {
        return action;
    }

    public void setAction(EngineAction action) {
        this.action = action;
    }

    public int getBogeyCount() {
        return bogeyCount;
    }

    public void setBogeyCount(int bogeyCount) {
        this.bogeyCount = bogeyCount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TrainEngine() {
        System.out.println("Train Engine started");
    }

    @Override
    public String doWork() {
        return "Train Engine is running";
    }

    @Override
    public String doAction() {
        return "Engine is";
    }
}
