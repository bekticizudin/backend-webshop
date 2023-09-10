package com.zavrsniprojekat.ZavrsniProjekat.Controller;

import com.zavrsniprojekat.ZavrsniProjekat.Models.ContactPage;
import com.zavrsniprojekat.ZavrsniProjekat.Models.Coupons;
import com.zavrsniprojekat.ZavrsniProjekat.Models.Discount;
import com.zavrsniprojekat.ZavrsniProjekat.Repo.ContactPageRepo;
import com.zavrsniprojekat.ZavrsniProjekat.Repo.CouponsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactPageController {

    @Autowired
    private ContactPageRepo contactPageRepo;

    @GetMapping(value = "/kontakt")
    public List<ContactPage> getContactPage() {
        return contactPageRepo.findAll();
    }
}
