package com.nishant.itemapi.service;

import com.nishant.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    private List<Item> items= new ArrayList<>();

    private Item addItem(Item item){
        items.add(item);
        return item;
    }

    private Item getById(int id){
        for(Item item: items){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }
}
