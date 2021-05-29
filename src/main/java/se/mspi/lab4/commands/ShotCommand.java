package se.mspi.lab4.commands;

import se.mspi.lab4.ShootingRangeSimulator;
import se.mspi.lab4.Shot;

import java.time.LocalTime;

public class ShotCommand extends Command {
    public ShotCommand() {
        super("shot", "X Y R - выстрелить в область радиуса R по координатам X,Y");
    }

    @Override
    public void execute(String args, ShootingRangeSimulator shootingRangeSimulator) {
        String[] s = args.trim().split(" ");
        if (s.length < 3) {
            System.out.println("Недостаточно аргументов (должно быть 3, получено " + s.length + ")");
            return;
        }
        try {
            float x = Float.parseFloat(s[0]);
            float y = Float.parseFloat(s[1]);
            float r = Float.parseFloat(s[2]);
            Shot shot = shootingRangeSimulator.getHitChecker().shoot(x, y, r);

            var lastShotTime = shootingRangeSimulator.getLastShotTime();
            var now = System.nanoTime();
            if (lastShotTime == null) {
                shootingRangeSimulator.setLastShotTime(now);
            } else {
                var diff = now - lastShotTime;
                shootingRangeSimulator.setLastShotTime(now);
                shootingRangeSimulator.getAverageIntervalMBean().update(diff);
//                System.out.println(shootingRangeSimulator.getAverageIntervalMBean().getAverageInterval());
            }

            shootingRangeSimulator.getShotCounterMBean().addShot(shot);

            System.out.println(shot.fancyResult());
            shootingRangeSimulator.getShotHistory().addShot(shot);
        } catch (NumberFormatException e) {
            System.out.println("Аргументы должны быть числами");
        }
    }
}
