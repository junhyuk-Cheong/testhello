package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ItemMapper {
    public List<Item> getAll();
}