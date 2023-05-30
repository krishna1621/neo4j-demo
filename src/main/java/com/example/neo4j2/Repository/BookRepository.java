package com.example.neo4j2.Repository;

import com.example.neo4j2.Node.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends Neo4jRepository<Book,Integer> {

    public  Book findById(int id);
}

