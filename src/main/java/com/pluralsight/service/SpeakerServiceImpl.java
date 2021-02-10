package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private HibernateSpeakerRepository repository;


    @Autowired
    public SpeakerServiceImpl(HibernateSpeakerRepository repository) {
        System.out.println("HibernateSpeakerRepository repository ctor");
        this.repository = repository;
    }

    public SpeakerServiceImpl() {
        System.out.println("Default ctor");
    }

    @PostConstruct
    private void initialize(){
        System.out.println("called after the ctors");
    }

    public List<Speaker> findAll(){
        return repository.findAll();

    }

    public void setRepository(HibernateSpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
