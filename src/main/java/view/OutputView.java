package view;

import domain.LottoTicket;
import domain.WinningResult;

import java.util.List;

public class OutputView {

    public void printLottoList(int count, List<LottoTicket> lottoTickets){
        System.out.println( count + "개를 구매했습니다.");

        for (LottoTicket lottoTicket : lottoTickets) {
            System.out.println(lottoTicket.getTicketNumbers().toString());
        }
    }

    public void printResult(WinningResult winningResult, double revenue) {
        System.out.println("당첨 통계");
        System.out.println("---------");
        System.out.println("3개 일치 (5000원)- "+ winningResult.getCountOf(3) +"개");
        System.out.println("4개 일치 (50000원)- "+ winningResult.getCountOf(4) +"개");
        System.out.println("5개 일치 (1500000원)- "+ winningResult.getCountOf(5) +"개");
        System.out.println("6개 일치 (2000000000원)- "+ winningResult.getCountOf(6) +"개");
        System.out.println("총 수익률은 "+ revenue +"입니다.");

    }
}
