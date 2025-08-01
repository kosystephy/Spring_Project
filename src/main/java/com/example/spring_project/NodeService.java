package com.example.spring_project;

import java.util.Map;

public interface NodeService {
    Node addNode(Node newNode);
    boolean deleteNode(int id);
    Node updateNode(int id,Node updatedNode);
    Node getNodeById(int id);
}
