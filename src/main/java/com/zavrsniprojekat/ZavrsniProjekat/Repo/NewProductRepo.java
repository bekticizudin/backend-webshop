package com.zavrsniprojekat.ZavrsniProjekat.Repo;

import com.zavrsniprojekat.ZavrsniProjekat.Models.NewProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewProductRepo extends JpaRepository<NewProduct, Long> {
}
