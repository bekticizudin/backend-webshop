package com.zavrsniprojekat.ZavrsniProjekat.Models;

import jakarta.persistence.*;

    @Entity
    @Table(name = "teamMembers")
    public class Start {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String title;

        @Column
        private String name;

        @Column
        private String imagePath;

        // Constructors, getters, setters


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public Start(Long id, String title, String name, String imagePath) {
            this.id = id;
            this.title = title;
            this.name = name;
            this.imagePath = imagePath;
        }

        public Start() {
        }
    }
