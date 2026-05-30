package com.imqh.msproducts.repositories;

import com.imqh.msproducts.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Long> {


}
