package com.cohortThree;

public class Television {
    private int channelId;
    private int volume;
    private boolean isTvOn;


    public void changeChannel(int newChannel){
        if (isTvOn) {
            channelId = newChannel;
        }
    }
    public int getChannelId(){

        return channelId;
    }
    public void channelUp(){
        if (isTvOn) {
            channelId++;
        }
    }
    public void channelDown(){
        if (isTvOn) {
            channelId--;
        }
    }
    public void turnTvOn(){
        isTvOn = true;
    }
    public boolean isTvOn(){
        return isTvOn;
    }
}
