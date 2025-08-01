package com.example.spring_project;

import java.util.Map;

public interface NodeService {
    void addNode(Node newNode);
    void deleteNode(int id);
    void updateNode(int id,Node updateNode);
    void getNodeById(int id);
}
