package com.imqh.msitems.services;

import com.imqh.msitems.models.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Item> findAll();
    Optional<Item> findById(Long id);
}
