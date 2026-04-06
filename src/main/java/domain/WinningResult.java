package domain;

import java.util.Collections;
import java.util.List;

public class WinningResult {

    public static final int WINNING_COUNT = 1;
    public static final int LOTTO_COUNT_BASE = 0;

    List<Integer> winningResult = Collections.nCopies(6, LOTTO_COUNT_BASE);

    public WinningResult() {
    }

    public void add(int matchedCount){
        winningResult.set(matchedCount, winningResult.get(matchedCount) + WINNING_COUNT);
    }

    public int getCountOf(int MatchedCount){
        return winningResult.get(MatchedCount);
    }
}
