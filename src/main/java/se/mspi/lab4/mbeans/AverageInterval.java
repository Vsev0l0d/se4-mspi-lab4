package se.mspi.lab4.mbeans;

public class AverageInterval implements AverageIntervalMBean {
    long sum;
    long number;

    @Override
    public void update(long nextInterval) {
        sum += nextInterval;
        number++;
    }

    @Override
    public double getAverageInterval() {
        return (sum / (double) number) / 1000_000_000;
    }
}
