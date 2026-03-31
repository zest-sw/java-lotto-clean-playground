package damain;

import util.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class LottoService {
    NumberGenerator numberGenerator;

    public LottoService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public List<LottoTicket> buyTickets(int money) {
        validateMoney(money);
        int ticketCount = money/1000;

        List<LottoTicket> tickets = new ArrayList<>();

        for(int i=0;i<ticketCount;i++){
            tickets.add(generateTicket());
        }

        return tickets;
    }

    private LottoTicket generateTicket() {

        List<Integer> ticketNumbers = new ArrayList<>();

        for(int i=0;i<6;i++){
            ticketNumbers.add(numberGenerator.generate());
        }

        return new LottoTicket(ticketNumbers);
    }

    private void validateMoney(int money) {
        if(money < 1000) {
            throw new IllegalArgumentException("1000원 이상의 금액을 입력해주세요.");
        }
    }
}
