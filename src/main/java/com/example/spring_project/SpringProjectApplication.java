package com.example.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);
        NodeCrudRepository repo = context.getBean(NodeCrudRepository.class);
        System.out.println("\nAll Node objects are:");
        for (Node nd: repo.findAll()) {
            System.out.println(nd);
        }

        Node addedNodes = repo.save(new Node("computer4","google",656168774,1593474077));
        int id = addedNodes.getId();
        Node newNode = repo.save(new Node("computer5","google1",656168772,1593474072));
        repo.updateNode(id,newNode );

        Node updatedNodes = repo.findById(id).get();
        System.out.printf("\nNode updated details %d, details: %s\n", id, updatedNodes);

    }

}
