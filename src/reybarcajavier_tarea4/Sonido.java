/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reybarcajavier_tarea4;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Usuario
 */
public class Sonido {

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
