package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final ItemService itemService;

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }


    @GetMapping("/list")
    public List<Item> getAll() {
        return itemService.getAll();
    }
}