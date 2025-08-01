package com.example.spring_project;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface NodeCrudRepository extends CrudRepository<Node,Integer> {

    @Query("update Node p set name=\"raveena\" , location = \"ericsson\" , latitude = 9088373,longitude = 93784939 where p.id = ?1")
    @Modifying(clearAutomatically = true)
    @Transactional
    int updateNode(int id, Node node);

    @Query("delete Node p  where p.id = ?1")
    @Modifying(clearAutomatically = true)
    @Transactional
    boolean deleteNode(int id);

}
