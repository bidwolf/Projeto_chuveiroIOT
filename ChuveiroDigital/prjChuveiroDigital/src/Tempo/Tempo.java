
package Tempo;

import java.util.Timer;
import java.util.TimerTask;


public class Tempo {
    
    public static int segundos = 0;
    
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            segundos++;
            System.out.println("Segundos:" + segundos);
        }
    };
    public void start(){
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
    
    public static void main(String [] args){
        Tempo tempo = new Tempo();
        tempo.start();
    }
            
}
