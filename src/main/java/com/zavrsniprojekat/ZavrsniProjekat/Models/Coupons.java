package com.zavrsniprojekat.ZavrsniProjekat.Models;

import jakarta.persistence.*;

    @Entity
    @Table(name = "coupons")
    public class Coupons {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String code;

        @Column(length = 1000)
        private String description;

        @Column
        private String imagePath;

// Constructors, getters, setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public Coupons(Long id, String code, String description, int discountPercent, String imagePath) {
            this.id = id;
            this.code = code;
            this.description = description;
            this.imagePath = imagePath;
        }

        public Coupons() {
        }
    }
