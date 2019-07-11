package org.dimigo.basic.Interface14;

public class Car {
    private IEngine engine;

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.startEngine();
    }

    public void stop(){
        engine.stopEngine();
    }
}
