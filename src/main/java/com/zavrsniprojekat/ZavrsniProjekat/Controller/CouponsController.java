package com.zavrsniprojekat.ZavrsniProjekat.Controller;

import com.zavrsniprojekat.ZavrsniProjekat.Models.Coupons;
import com.zavrsniprojekat.ZavrsniProjekat.Models.Discount;
import com.zavrsniprojekat.ZavrsniProjekat.Repo.CouponsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CouponsController {

    @Autowired
    private CouponsRepo couponsRepo;

    @GetMapping(value = "/kuponi")
    public List<Coupons> getCoupons() {
        return couponsRepo.findAll();
    }

    @PostMapping(value = "/addCoupons")
    public String addCoupons(@RequestBody Coupons coupons) {
        couponsRepo.save(coupons);
        return "add";
    }
}
