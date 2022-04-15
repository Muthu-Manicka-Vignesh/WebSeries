package com.myprogramming.SpringApp.Gallery;

import com.myprogramming.SpringApp.Model.Series;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Gallery extends JpaRepository<Series,Integer> {
    public Series findByName(String name);
}
