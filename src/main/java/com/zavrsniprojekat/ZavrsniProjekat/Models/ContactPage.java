package com.zavrsniprojekat.ZavrsniProjekat.Models;

import jakarta.persistence.*;

    @Entity
    @Table(name = "contactPage")
    public class ContactPage {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String storeName;

        @Column
        private String storeEmail;

        @Column
        private String storePhone;

        @Column
        private String storeAddress;

        @Column(length = 1000)
        private String storeBio;

        @Column(length = 1000)
        private String deliveryMethod;

        @Column(length = 1000)
        private String deliveryRest;

        @Column
        private String imagePath;

// Constructors, getters, setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getStoreName() {
            return storeName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public String getStoreEmail() {
            return storeEmail;
        }

        public void setStoreEmail(String storeEmail) {
            this.storeEmail = storeEmail;
        }

        public String getStorePhone() {
            return storePhone;
        }

        public void setStorePhone(String storePhone) {
            this.storePhone = storePhone;
        }

        public String getStoreAddress() {
            return storeAddress;
        }

        public void setStoreAddress(String storeAddress) {
            this.storeAddress = storeAddress;
        }

        public String getStoreBio() {
            return storeBio;
        }

        public void setStoreBio(String storeBio) {
            this.storeBio = storeBio;
        }

        public String getDeliveryMethod() {
            return deliveryMethod;
        }

        public void setDeliveryMethod(String deliveryMethod) {
            this.deliveryMethod = deliveryMethod;
        }

        public String getDeliveryRest() {
            return deliveryRest;
        }

        public void setDeliveryRest(String deliveryRest) {
            this.deliveryRest = deliveryRest;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public ContactPage(Long id, String storeName, String storeEmail, String storePhone, String storeAddress, String storeBio, String deliveryMethod, String deliveryRest, String imagePath) {
            this.id = id;
            this.storeName = storeName;
            this.storeEmail = storeEmail;
            this.storePhone = storePhone;
            this.storeAddress = storeAddress;
            this.storeBio = storeBio;
            this.deliveryMethod = deliveryMethod;
            this.deliveryRest = deliveryRest;
            this.imagePath = imagePath;
        }

        public ContactPage() {
        }
    }
