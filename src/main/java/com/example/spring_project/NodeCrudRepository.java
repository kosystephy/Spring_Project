package com.example.spring_project;

import org.springframework.data.repository.CrudRepository;

public interface NodeCrudRepository extends CrudRepository<Node,Integer> {
    Node addNode(Node newNode);
    boolean deleteNode(int id);
    Node updateNode(int id,Node updatedNode);
    Node getNodeById(int id);
}
