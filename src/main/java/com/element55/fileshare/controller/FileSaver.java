package com.element55.fileshare.controller;

import com.element55.fileshare.domain.Animal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@Service
@Slf4j
public class FileSaver {

    public void saveJsonToLocalFile(Animal animal) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(animal);
            log.info("object is succesfully saved:{}", animal);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
