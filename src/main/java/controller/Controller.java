package controller;

import domain.LottoService;
import domain.LottoTicket;
import domain.Statistic;
import domain.WinningResult;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Controller {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    LottoService lottoService = new LottoService();
    Statistic statistic = new Statistic();


    public void run(){
        int money = inputView.getMoney();

        List<LottoTicket> lottoTickets = lottoService.buyTickets(money);

        outputView.printLottoList(lottoTickets.size(), lottoTickets);

        List<Integer> winningNumbers = inputView.getWinningNumbers();

        WinningResult winningResult = statistic.getWinningResult(lottoTickets, winningNumbers);
        double revenue = statistic.getRevenue(money, winningResult);

        outputView.printResult(winningResult, revenue);
    }
}
