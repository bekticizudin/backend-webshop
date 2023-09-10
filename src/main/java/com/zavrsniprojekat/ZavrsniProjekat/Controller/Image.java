
package com.zavrsniprojekat.ZavrsniProjekat.Controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class Image {
    @GetMapping("/{imageName}")
    public ResponseEntity<Resource> getImage(@PathVariable String imageName) {
        // Kreiramo putanju do slike koristeći ClassPathResource
        ClassPathResource resource = new ClassPathResource("images/" + imageName);

        // Provjerimo da li resurs postoji
        if (resource.exists()) {
            // Postavimo tip sadržaja na osnovu tipa slike
            MediaType mediaType = MediaType.IMAGE_JPEG;
            return ResponseEntity.ok()
                    .contentType(mediaType)
                    .body(resource);
        } else {
            // Ako slika ne postoji, vraćamo 404 Not Found
            return ResponseEntity.notFound().build();
        }
    }
}











