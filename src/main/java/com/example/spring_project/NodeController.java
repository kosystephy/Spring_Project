package com.example.spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nodes")
public class NodeController {

    @Autowired
    private NodeServiceImpl nodeService;

    @PostMapping
    public Node addNode(@RequestBody Node node) {
        return nodeService.addNode(node);
    }

    @GetMapping("/{id}")
    public Node getNodeById(@PathVariable int id) {
        return nodeService.getNodeById(id);
    }

    @PutMapping("/{id}")
    public Node updateNode(@PathVariable int id, @RequestBody Node node) {
        return nodeService.updateNode(id, node);
    }

    @DeleteMapping("/{id}")
    public String deleteNode(@PathVariable int id) {
        return nodeService.deleteNode(id) ? "Node deleted" : "Node not found";
    }
}
