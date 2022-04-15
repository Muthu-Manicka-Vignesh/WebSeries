package com.myprogramming.SpringApp.Manager;

import com.myprogramming.SpringApp.Gallery.Gallery;
import com.myprogramming.SpringApp.Model.Series;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Manager {

    @Autowired
    private Gallery gallery;

    @PostMapping("addSeries")
    public Series addSeries(@RequestBody Series series){
        return gallery.save(series);
    }
    @GetMapping("series")
    public List<Series> getAllSeries(){
        return gallery.findAll();
    }
    @GetMapping("series/id/{id}")
    public Optional<Series> getSeriesById(@PathVariable int id){
        return gallery.findById(id);
    }
    @GetMapping("series/name/{name}")
    public Series getSeriesByName(@PathVariable String name){
        return gallery.findByName(name);
    }
    @PutMapping("update")
    public Series updateSeries(Series series){
        return gallery.save(series);
    }

}
