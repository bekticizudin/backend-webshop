package com.zavrsniprojekat.ZavrsniProjekat.Controller;

import com.zavrsniprojekat.ZavrsniProjekat.Models.Discount;
import com.zavrsniprojekat.ZavrsniProjekat.Models.Product;
import com.zavrsniprojekat.ZavrsniProjekat.Repo.DiscountRepo;
import com.zavrsniprojekat.ZavrsniProjekat.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountController {

    @Autowired
    private DiscountRepo discountRepo;

    @GetMapping(value = "/popust")
    public List<Discount> getDiscounts() {
        return discountRepo.findAll();
    }

    @PostMapping(value = "/addDiscount")
    public String addDiscount(@RequestBody Discount discount) {
        discountRepo.save(discount);
        return "add";
    }
}
