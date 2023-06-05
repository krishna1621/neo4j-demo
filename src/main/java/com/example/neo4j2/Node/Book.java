package com.example.neo4j2.Node;


import lombok.*;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.Id;


@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Id
    private int id;
    private String name;
    private String author;
}
