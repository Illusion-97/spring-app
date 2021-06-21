package com.spring.ioc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pow")
public class Panda {
    @Autowired
    private KungFu kungFu;

    public Panda(KungFu kungFu) {
        this.kungFu = kungFu;
    }

    public Panda() {
    }

    public KungFu getKungFu() {
        return kungFu;
    }

    public void setKungFu(KungFu kungFu) {
        this.kungFu = kungFu;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "kungFu=" + kungFu +
                '}';
    }
}
