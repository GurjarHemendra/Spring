package org.hem.spring.list;

import java.util.List;

public class Shop {
    private List<String> items;

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "items=" + items +
                '}';
    }
}
