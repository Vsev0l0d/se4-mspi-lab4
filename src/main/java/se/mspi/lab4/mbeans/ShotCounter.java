package se.mspi.lab4.mbeans;

import se.mspi.lab4.Shot;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class ShotCounter extends NotificationBroadcasterSupport implements ShotCounterMBean {
    long countOfAllShots = 0;
    long countOfSuccessfulShots = 0;
    long missesInRow = 0;

    @Override
    public void addShot(Shot shot) {
        countOfAllShots++;
        if (shot.isSuccessful()) {
            countOfSuccessfulShots++;
            missesInRow = 0;
        } else {
            missesInRow++;
            if (missesInRow >= 4) {
                Notification notification = new Notification(
                        "fourOrMoreMissedShotsInRow", this, missesInRow,
                        System.currentTimeMillis(), "4 or more missed shots in row"
                );
                this.sendNotification(notification);
            }
        }
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
