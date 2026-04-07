package domain;

import java.util.List;

public class Statistic {


    public static final int MATCHED_THREE_PRIZE = 5000;
    public static final int MATCHED_FOUR_PRIZE = 50000;
    public static final int MATCHED_FIVE_PRIZE = 1500000;
    public static final int MATCHED_SIX_PRIZE = 2000000000;
    public static final int MATCHED_THREE_COUNT = 3;
    public static final int MATCHED_FOUR_COUNT = 4;
    public static final int MATCHED_FIVE_COUNT = 5;
    public static final int MATCHED_SIX_COUNT = 6;

    public WinningResult getWinningResult(List<LottoTicket> lottoTickets, List<Integer> winningNumbers) {
        WinningResult winningResult = new WinningResult();

        for(LottoTicket lottoTicket: lottoTickets) {
            int matchedCount = lottoTicket.getMatchedNumbers(winningNumbers);

            winningResult.add(matchedCount);
        }
        return winningResult;
    }

    public double getRevenue(int money, WinningResult winningResult){
        double prize = MATCHED_THREE_PRIZE * winningResult.getCountOf(MATCHED_THREE_COUNT)
                     + MATCHED_FOUR_PRIZE  * winningResult.getCountOf(MATCHED_FOUR_COUNT)
                     + MATCHED_FIVE_PRIZE  * winningResult.getCountOf(MATCHED_FIVE_COUNT)
                     + MATCHED_SIX_PRIZE   * winningResult.getCountOf(MATCHED_SIX_COUNT);
        return prize/money;
    }
}
