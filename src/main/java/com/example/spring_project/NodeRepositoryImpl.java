package com.example.spring_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

import java.util.Collection;
import java.util.Map;

public class NodeRepositoryImpl implements NodeRepository {
 @PersistenceContext
 protected EntityManager em;

 @Override
 public Map<Integer,Node> getNodes() {
     String jpql = "select n from Node n";
     TypedQuery<Node> query = em.createQuery(jpql, Node.class);
     return (Map<Integer, Node>) query.getResultList();
 }

 @Override
 public Node getNodeById(int id) {
     return em.find(Node.class, id);
 }

 @Override
    @Transactional
    public Node add(Node newNode) {
     em.persist(newNode);
     em.flush();
        return newNode;
 }

 @Override
    @Transactional
    public Node update(Node newNode) {
     em.merge(newNode);
     em.flush();
     return newNode;
 }
 @Override
 @Transactional
     public boolean remove(int id) {
     return false;
     }
 }

