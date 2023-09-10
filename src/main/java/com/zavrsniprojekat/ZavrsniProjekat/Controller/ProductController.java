package com.zavrsniprojekat.ZavrsniProjekat.Controller;

import com.zavrsniprojekat.ZavrsniProjekat.Models.Product;
import com.zavrsniprojekat.ZavrsniProjekat.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping(value = "/proizvodi")
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

 @GetMapping("proizvodi/{id}")
 public ResponseEntity<Product> getProductById(@PathVariable Long id) {
    Optional<Product> product = productRepo.findById(id);

   if (product.isPresent()) {
       return new ResponseEntity<>(product.get(), HttpStatus.OK);
   } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
   }

     @PostMapping(value = "/add")
     public String addProduct(@RequestBody Product product) {
         productRepo.save(product);
         return "add";
     }

    }

