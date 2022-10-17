package org.example.repository;


import org.example.entity.Customer;
import org.example.entity.Goods;

import java.util.List;

public interface CustomerRepository {
    Customer findById(Long id);
}
