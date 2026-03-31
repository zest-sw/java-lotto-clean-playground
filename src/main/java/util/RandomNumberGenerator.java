package util;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator{
    public static final int BOUND = 45;
    Random random = new Random();

    public int generate(){
        return random.nextInt(BOUND) + 1;
    }
}
