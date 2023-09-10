package com.zavrsniprojekat.ZavrsniProjekat.Controller;

import com.zavrsniprojekat.ZavrsniProjekat.Models.Contact;
import com.zavrsniprojekat.ZavrsniProjekat.Repo.ContactRepo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
        @CrossOrigin(origins = "http://localhost:4200")
public class ContactController {

   @Autowired
   private ContactRepo contactRepo;


    @GetMapping(value = "/contacts")
    public List<Contact> getContacts() {
        return contactRepo.findAll();
    }

   @PostMapping(value = "/save")
   public ResponseEntity<String> saveContact(@RequestBody Contact contact) {
       try {
           Contact savedContact = contactRepo.save(contact);
           // Vraća JSON response za uspješnu poruku
           return ResponseEntity.ok("{\"message\": \"Contact saved successfully with ID: " + savedContact.getId() + "\"}");
       } catch (Exception e) {
           // Vraća JSON response za grešku
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\": \"Failed to save contact\"}");
       }
   }
}
