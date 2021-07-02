package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.Hello;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "hello",path="hello")
public interface HelloRepo extends JpaRepository<Hello, Integer> {

}
