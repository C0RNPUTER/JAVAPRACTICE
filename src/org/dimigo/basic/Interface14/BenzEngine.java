package org.dimigo.basic.Interface14;

public class BenzEngine implements IEngine {
    @Override
    public void startEngine() {
        System.out.println("Mercedes-Benz 엔진 가동");
    }

    @Override
    public void stopEngine() {
        System.out.println("Mercedes-Benz 엔진 정지");
    }
}
