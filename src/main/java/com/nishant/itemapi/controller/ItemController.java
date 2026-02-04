package com.nishant.itemapi.controller;

import com.nishant.itemapi.model.Item;
import com.nishant.itemapi.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService=itemService;
    }

    @PostMapping
    public ResponseEntity<?> addItem(@RequestBody Item item){
        if(item.getName() == null || item.getName().trim().isEmpty()){
            return ResponseEntity.badRequest().body("Item name is required");
        }
        if(item.getPrice() <=0){
            return ResponseEntity.badRequest().body("Price must be greater than 0");
        }
        if(item.getCategory() == null || item.getCategory().trim().isEmpty()){
            return ResponseEntity.badRequest().body("Category is required");
        }

        Item savedItem=itemService.addItem(item);
        return ResponseEntity.ok(savedItem);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable int id){
        Item item=itemService.getById(id);

        if(item == null){
            return ResponseEntity.status(404).body("No item found");
        }

        return ResponseEntity.ok(item);
    }





}
