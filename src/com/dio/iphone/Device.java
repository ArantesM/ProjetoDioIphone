package com.dio.iphone;

public class Device {
    private String model;
    private int batteryLevel;

    public Device(String model, int batteryLevel){
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
