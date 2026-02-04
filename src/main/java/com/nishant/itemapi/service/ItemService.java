package com.nishant.itemapi.service;

import com.nishant.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    private final List<Item> items= new ArrayList<>();
    private int currentId=1;

    public Item addItem(Item item){
        item.setId(currentId++);
        items.add(item);
        return item;
    }

    public Item getById(int id){
        for(Item item: items){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }
}
