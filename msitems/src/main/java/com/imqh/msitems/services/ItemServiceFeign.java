package com.imqh.msitems.services;

import com.imqh.msitems.clients.ProductFeignClient;
import com.imqh.msitems.models.Item;
import com.imqh.msitems.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ItemServiceFeign implements ItemService {

    private ProductFeignClient client;

    @Override
    public List<Item> findAll() {
        return client.findAll()
                .stream()
                .map(product -> new Item(product, new Random().nextInt(10) + 1))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Item> findById(Long id) {
        Product product = client.details(id);

        if (product == null) {
            return Optional.empty();
        }

        return Optional.of(new Item(product, new Random().nextInt(10) + 1));
    }
}
