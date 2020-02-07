package com.cohortThree;
import java.util.Scanner;
public class Television {
    private int channelId;
    private int volume = 0;
    private boolean isTvOn;
    private String channelName = "Apple";

Scanner sc = new Scanner(System.in);

    public void turnTvOn(){
        isTvOn = true;
        System.out.println("***Life\'s Good***");
        System.out.printf("You're watching %s%n", channelName);
    }
    public boolean isTvOn(){
        return isTvOn;
    }

    public void changeChannel() {
        while (isTvOn == true) {
            if (isTvOn) {
                System.out.println("Channel are listed from Number 1 to 10");
                channelId = sc.nextInt();
                switch (channelId) {
                    case 1:
                        channelName = "Apple";
                        break;
                    case 2:
                        channelName = "Semicolon Africa";
                        break;
                    case 3:
                        channelName = "Mongo DB";
                        break;
                    case 4:
                        channelName = "Code Slayer";
                        break;
                    case 5:
                        channelName = "Intellij";
                        break;
                    case 6:
                        channelName = "Big Decimal";
                        break;
                    case 7:
                        channelName = "Maria DB";
                        break;
                    case 8:
                        channelName = "Nacker Movement";
                        break;
                    case 9:
                        channelName = "Mamba Movement";
                        break;
                    case 10:
                        channelName = "Constructor";
                        break;
                    default:
                        channelName = "AV";
                        break;
                }
                System.out.printf("%s%n%n%n%n%n%n%n", channelName);
            }
            else{
                isTvOn = false;
            }
        }

    }
    public int getChannelId(){

        return channelId;
    }
    public int channelUp(int channelId){
        while (isTvOn == true) {
            if (isTvOn) {
                channelId++;
            }
        }
        return channelId;
    }
    public int channelDown(int channelId){
        while (isTvOn == true) {
            if (isTvOn) {
                channelId--;
            }
        }
        return channelId;
    }

    public void setVolumeUp(){

        this.volume++;
    }
    public int getVolumeUp(){
        System.out.printf("Tv volume is at %d%n", volume);
        return volume;
    }

    public void setVolumeDown(){

        this.volume--;
    }
    public int getVolumeDown(){
        return volume;
    }



}
