package util;

import java.util.List;

public class SequenceGenerator implements NumberGenerator{
    List<Integer> sequence;
    int index;

    public SequenceGenerator(List<Integer> sequence) {
        this.sequence = sequence;
        index = sequence.size();
    }

    public int generate() {
        return sequence.get(index++ % sequence.size());
    }
}
