package domain;

import util.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class LottoService {
    public static final int TICKET_PRICE = 1000;
    public static final int LOTTO_SIZE = 6;
    NumberGenerator numberGenerator;

    public LottoService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public List<LottoTicket> buyTickets(int money) {
        validateMoney(money);
        int ticketCount = money/ TICKET_PRICE;

        List<LottoTicket> tickets = new ArrayList<>();

        for(int i=0;i<ticketCount;i++){
            tickets.add(generateTicket());
        }

        return tickets;
    }

    private LottoTicket generateTicket() {

        List<Integer> ticketNumbers = new ArrayList<>();

        while (ticketNumbers.size() < LOTTO_SIZE) {
            int randomNumber = numberGenerator.generate();
            if(!ticketNumbers.contains(randomNumber)) {
                ticketNumbers.add(randomNumber);
            }
        }

        return new LottoTicket(ticketNumbers);
    }

    private void validateMoney(int money) {
        if(money < TICKET_PRICE) {
            throw new IllegalArgumentException("1000원 이상의 금액을 입력해주세요.");
        }
    }
}
