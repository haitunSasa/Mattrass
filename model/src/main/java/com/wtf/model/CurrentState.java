package com.wtf.model;

/**
 * 当前状态
 */
public class CurrentState {

    private Integer side = 0;
    private Integer mode = 0;//0:：待机1：加热2：理疗3:智能加热4:智能理疗
    private Integer currentTemperature = 25;
    private Integer targetTemperature = 35;

    public Integer getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(Integer currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Integer getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Integer targetTemperature) {
        this.targetTemperature = targetTemperature;
    }
}
