import javax.sound.midi.*;

/**
 * First implementation of BeatBox using MIDI
 * @author Shane
 * @Date 2019/10/16
 */
public class MusicBox {
    public static void main(String[] args) {
        MusicBox musicBox = new MusicBox();
        musicBox.play();
        System.exit(0);
    }

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Sequencer initialized");
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            sequencer.setSequence(seq);
            sequencer.start();

            System.out.println("Play finished");

        } catch (MidiUnavailableException e) {
            System.out.println("Sequencer conflict");
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            System.out.println("Invalid Midi data");
            e.printStackTrace();
        }
    }
}
