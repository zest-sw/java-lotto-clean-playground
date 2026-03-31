package damain;

import java.util.List;

public class LottoTicket {
    List<Integer> lottoNumbers;

    public LottoTicket (List<Integer> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public List<Integer> getTicketNumbers() {
        return this.lottoNumbers;
    }

}
