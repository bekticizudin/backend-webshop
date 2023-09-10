package com.zavrsniprojekat.ZavrsniProjekat.Controller;

import com.zavrsniprojekat.ZavrsniProjekat.Models.NewProduct;
import com.zavrsniprojekat.ZavrsniProjekat.Models.Product;
import com.zavrsniprojekat.ZavrsniProjekat.Repo.NewProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NewProductController {

    @Autowired
    private NewProductRepo newProductRepo;

    @GetMapping(value = "/noviProizvodi")
    public List<NewProduct> getNewProducts() {
        return newProductRepo.findAll();
    }

    @GetMapping("/noviProizvodi/{id}")
    public ResponseEntity<NewProduct> getProductById(@PathVariable Long id) {
        Optional<NewProduct> newProduct = newProductRepo.findById(id);

        if (newProduct.isPresent()) {
            return new ResponseEntity<>(newProduct.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/addNewProduct")
    public String addNewProduct(@RequestBody NewProduct newProduct) {
        newProductRepo.save(newProduct);
        return "add";
    }
}
