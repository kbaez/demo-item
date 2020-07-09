package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
