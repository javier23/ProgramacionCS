package reybarcajavier_tarea4;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;


public class Tarea4 {
    
    class Sonido {

        public Sonido(int instrumento){
             try {
                 Synthesizer synth = MidiSystem.getSynthesizer();
                 synth.open();
                 MidiChannel miCanal = synth.getChannels()[0];
                 int volume = 80; // between 0 et 127
                 int duration = 200; // in milliseconds
                 miCanal.programChange(instrumento);
                 int[] notas={60,62,64,65,67,69,71,72};
                 for(int nota: notas){
                     miCanal.noteOn( nota, volume );
                     Thread.sleep(duration);
                     miCanal.noteOff(nota);
                 }
                 Thread.sleep( 500 );
                 synth.close();
             } catch (Exception ex) {
                 ex.printStackTrace();
             }
    }
 }       
        public static void main(String []args){
           int a1 = 2;
           int a2 = 3;
           int ai= 0;
           Tarea4 tarea = new Tarea4();
           
            for (int i = 1; i <= 10; i++) {
               
                switch (i){
                    case 1:
                        ai = a1;
                        break;
                    case 2 :
                        ai = a2;
                        break;
                    default:
                        ai = a1 + a2;
                        a1 = a2;
                        a2 = ai;
                       break;
                }
                System.out.print(ai + " ");
               Tarea4.Sonido s =  tarea.new  Sonido(ai);
            }
        }

}
