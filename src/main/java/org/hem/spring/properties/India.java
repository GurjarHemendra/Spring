package org.hem.spring.properties;

import java.util.Properties;

public class India {
    private Properties stateAndLanguages;

    public Properties getStateAndLanguages() {
        return stateAndLanguages;
    }

    public void setStateAndLanguages(Properties stateAndLanguages) {
        this.stateAndLanguages = stateAndLanguages;
    }

    @Override
    public String toString() {
        return "India{" +
                "stateAndLanguages=" + stateAndLanguages +
                '}';
    }
}
