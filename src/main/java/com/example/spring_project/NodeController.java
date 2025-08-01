package com.example.spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api/nodes")
@CrossOrigin
public class NodeController {

    @Autowired
    private NodeCrudRepository crudRepository;

    @PostMapping
    public ResponseEntity<Node> addNode(@RequestBody Node node) {
        node= crudRepository.save(node);
        URI uri = URI.create("/node/" + node.getId());
        return ResponseEntity.created(uri).body(node);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Node> getNodeById(@PathVariable int id) {

        Optional<Node> node = crudRepository.findById(id);
        if(node.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok().body(node.get());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Node> updateNode(@PathVariable int id, @RequestBody Node node) {
        if( crudRepository.updateNode(id, node) == null){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok().body(node);
        }
    }

    @DeleteMapping("/{id}")
    public String deleteNode(@PathVariable int id) {
        return crudRepository.deleteNode(id) ? "Node deleted" : "Node not found";
    }
}
