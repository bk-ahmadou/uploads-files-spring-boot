package com.example.pocfilesuploadsspring.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface IFilesStorageService {
    void init();
    void save(MultipartFile file);
    Resource load(String fileName);
    boolean delete(String fileName);
    void deleteAll();
    Stream<Path> loadAll();
}
