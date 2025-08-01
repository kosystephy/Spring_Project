package com.example.spring_project;

import jakarta.transaction.Transactional;

import java.util.Collection;
import java.util.Map;

public interface NodeRepository {

Map<Integer, Node> getNodes();


Node getNodeById(int id);

@Transactional
Node add(Node node);

@Transactional
Node update(Node node);

@Transactional
boolean remove(int id);

}
