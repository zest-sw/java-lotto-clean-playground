package util;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator{
    public static final int LOTTO_MAX_VALUE = 45;
    public static final int ADJUSTED_VALUE = 1;
    Random random = new Random();

    public int generate(){
        return random.nextInt(LOTTO_MAX_VALUE) + ADJUSTED_VALUE;
    }
}
