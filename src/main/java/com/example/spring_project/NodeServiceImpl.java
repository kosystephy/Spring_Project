package com.example.spring_project;

import java.util.HashMap;
import java.util.Map;

public class NodeServiceImpl implements NodeService{
    private Map<Integer, Node> nodes = new HashMap<>();
    private int currentId = 1;

    @Override
    public Node addNode(Node newNode) {
        newNode.setId(currentId++);
        nodes.put(newNode.getId(), newNode);
        return newNode;
    }

    @Override
    public boolean deleteNode(int id) {
        return nodes.remove(id)!=null;
    }

    @Override
    public Node updateNode(int id, Node updatedNode) {
        if (nodes.containsKey(id)) {
            updatedNode.setId(id);
            nodes.put(id, updatedNode);
            return updatedNode;
        }
        return null;

    }

    @Override
    public Node getNodeById(int id) {
        return nodes.get(id);
    }
}
