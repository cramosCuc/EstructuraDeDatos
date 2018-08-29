/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edatos;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author cramos
 */
public class NewClass {
    
    public static void main(String arglist[]) {
    Timer timer;
    timer = new Timer();

    TimerTask task = new TimerTask() {
        int tic=0;

        @Override
        public void run()
        {
            if (tic%2==0)
            System.out.println("TIC");
            else
            System.out.println("TOC");
            tic++;
        }
        };
             // Empezamos dentro de 10ms y luego lanzamos la tarea cada 1000ms
    timer.schedule(task, 10, 1000);
    }
}
//    TimerTask timerTask = new TimerTask() 
//     { 
//         public void run()  
//         { 
//             // Aquí el código que queremos ejecutar. 
//         } 
//     }; 
//     
//
//      // Aquí se pone en marcha el timer cada segundo. 
//     Timer timer = new Timer(); 
//     // Dentro de 0 milisegundos avísame cada 1000 milisegundos 
//     timer.scheduleAtFixedRate(timerTask, 0, 1000);

