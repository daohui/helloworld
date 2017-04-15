package music;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class Hello {
    public static void main(String[] args) {
        Player player = new Player();
//        playScale(player);
//
        playCello(player);
    }

    private static void playScale(Player player) {
        // letter without number default to 5
        player.play("C4 D4 E4 F4 G4 A4 B4 C D E F G A B C6 D6 E6 F6 G6 A6 B6 C7w");
    }

    private static void playCello(Player player) {
        // V: voice
        // I: instrument
        // |: indicating measures
        // duration: 'q' quarter, 'qq' half note (or 'h'), 'w' whole note
        //   '.' for dotted duration, 'R' for rest
        Pattern p1 = new Pattern("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq .R");
        Pattern p2 = new Pattern("V1 I[Flute] Rw     | Rw     | GmajQQQ  CmajQ .R");
        player.play(p1, p2);
    }
}
