package com.example.spring_project;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SeedDb {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
      addValues("computer1","ericsson",656168774,1593474077);
        addValues("computer2","oracle",456138775,904409970);
        addValues("computer3","medtronic",234165628,100127456);
    }

    private void addValues(String name,String location,int latitude,int longitude){
        jdbcTemplate.update("insert into node(name,location,latitude,longitude) values(?,?,?,?)",
                name,location,latitude,longitude);

    }
}
