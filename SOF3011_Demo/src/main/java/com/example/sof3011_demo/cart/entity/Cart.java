package com.example.sof3011_demo.cart.entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartItem> items = new ArrayList<>();

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    public void addItem(CartItem item) {
        // Kiểm tra xem sản phẩm đã có trong giỏ hàng chưa
        for (CartItem i : items) {
            if (i.getProductId() == item.getProductId()) {
                i.setQuantity(i.getQuantity() + 1);
                return;
            }
        }
        // Nếu chưa có, thêm sản phẩm mới vào giỏ hàng
        items.add(item);
    }


    public List<CartItem> getItems() {
        return items;
    }
}
