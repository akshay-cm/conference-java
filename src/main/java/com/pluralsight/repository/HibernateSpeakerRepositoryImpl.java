package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements HibernateSpeakerRepository {

    @Override
    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<>();

        speakers.add(new Speaker("Akshay", "S"));

        return speakers;
    }
}
