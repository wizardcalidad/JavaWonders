package com.cohortThree;

public class TelevisionTest {
    public static void main(String[] args) {
        Television lg = new Television();

        lg.turnTvOn();
       lg.changeChannel();
        lg.channelUp(1);
        lg.setVolumeUp();
        lg.setVolumeUp();
       // lg.VolumeDown();

        System.out.println(lg.getVolumeUp());

    }
}
