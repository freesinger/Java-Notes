import javax.sound.midi.*;
import java.lang.reflect.Modifier;

public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine miniPlayer = new MiniMusicCmdLine();
        if (args.length < 2) {
            System.out.println("Specify the instrument and note");
            System.out.println(-1);
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            miniPlayer.play(instrument, note);
            System.exit(0);
        }
    }

    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent start = new MidiEvent(a, 1);
            track.add(start);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent stop = new MidiEvent(b, 16);
            track.add(stop);

            player.setSequence(seq);
            player.start();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

}
