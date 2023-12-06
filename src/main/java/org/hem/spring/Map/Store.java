package org.hem.spring.Map;

import java.util.Map;

public class Store {
    private Map<String , Integer> items;

    public Map<String, Integer> getItems() {
        return items;
    }

    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Store{" +
                "items=" + items +
                '}';
    }
}
