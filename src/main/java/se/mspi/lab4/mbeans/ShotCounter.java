package se.mspi.lab4.mbeans;

import se.mspi.lab4.Shot;

public class ShotCounter implements ShotCounterMBean {
    long countOfAllShots = 0;
    long countOfSuccessfulShots = 0;

    @Override
    public void addShot(Shot shot) {
        countOfAllShots++;
        if (shot.isSuccessful()) countOfSuccessfulShots++;
    }

    @Override
    public long getCountOfAllShots() {
        return countOfAllShots;
    }

    @Override
    public long getCountOfSuccessfulShots() {
        return countOfSuccessfulShots;
    }
}
