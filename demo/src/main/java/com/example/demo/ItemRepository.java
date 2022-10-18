package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

    private final ItemMapper itemMapper;

    public List<Item> getAll() {
        return itemMapper.getAll();
    }

}
