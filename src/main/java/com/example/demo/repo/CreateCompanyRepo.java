package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.CreateCompany;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "createcompany",path="createcompany")
public interface CreateCompanyRepo extends JpaRepository<CreateCompany, Integer> {

}
