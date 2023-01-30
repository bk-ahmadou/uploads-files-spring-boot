package com.example.pocfilesuploadsspring;

import com.example.pocfilesuploadsspring.services.FilesStorageService;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocFilesUploadsSpringApplication implements CommandLineRunner {

    @Resource
    FilesStorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(PocFilesUploadsSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        storageService.init();
    }
}
