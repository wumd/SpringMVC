package com.lagou.edu.service;

import com.lagou.edu.pojo.Resume;

import java.util.List;


public interface ResumeService {

    public Resume selectOneByName(String name);

//    public Resume selectOneById(Long id);

    public List<Resume> queryAll();

    public void delete(Resume resume);

    public void saveById(Resume resume);

    public void saveOne(Resume resume);
}
