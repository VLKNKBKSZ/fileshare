package com.element55.fileshare.controller;

import com.element55.fileshare.domain.Animal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class FileReceiver {

    private FileSaver fileSaver;

    @Autowired
    public FileReceiver(FileSaver fileSaver) {
        this.fileSaver = fileSaver;
    }

    @PostMapping("/save")
    public void saveAnAnimal(@RequestBody Animal animal) {
        log.info("This type of animal is saved -> :{}", animal);
        fileSaver.saveJsonToLocalFile(animal);
    }
}
