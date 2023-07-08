package com.practica.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;

import com.practica.crud.models.ProductDTO;
@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {

}
