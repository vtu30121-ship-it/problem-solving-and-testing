import java.util.*;
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        } else {
            return Integer.compare(b.score, a.score);
        }
    }
}
