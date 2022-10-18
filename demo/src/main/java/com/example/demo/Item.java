package com.example.demo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Item {
    int itemId;
    String name;
    int quantity;
}
