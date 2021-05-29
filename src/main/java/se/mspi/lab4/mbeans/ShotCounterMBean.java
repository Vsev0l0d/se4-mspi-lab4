package se.mspi.lab4.mbeans;


import se.mspi.lab4.Shot;

/*
MBean, считающий общее число установленных пользователем точек, а также число точек, попадающих в область.
В случае, если пользователь совершил 4 "промаха" подряд, разработанный MBean должен
отправлять оповещение об этом событии.
 */
public interface ShotCounterMBean {
    void addShot(Shot shot);

    long getCountOfAllShots();

    long getCountOfSuccessfulShots();
}