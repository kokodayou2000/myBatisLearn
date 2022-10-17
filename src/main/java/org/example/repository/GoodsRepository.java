package org.example.repository;


import org.example.entity.Customer;
import org.example.entity.Goods;

public interface GoodsRepository {

    Goods findById(Long id);

}
