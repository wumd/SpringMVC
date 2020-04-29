package com.lagou.edu.service.impl;

import com.lagou.edu.mapper.ResumeMapper;
import com.lagou.edu.pojo.Resume;
import com.lagou.edu.service.ResumeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;

    @Override
    public Resume selectOneByName(String name) {

        return resumeMapper.queryByName(name);
    }

    @Override
    public List<Resume> queryAll() {
        return resumeMapper.findAll();
    }

    @Override
    public void delete(Resume resume) {
        resumeMapper.delete(resume);
    }

    @Override
    @Transactional
    public void saveById(Resume resume) {
        resumeMapper.saveByid(resume.getId(),resume.getName(),resume.getAddress(),resume.getPhone());
    }

    @Override
    public void saveOne(Resume resume) {
        resumeMapper.save(resume);
    }

//    @Override
//    public Resume selectOneById(Long id) {
//        return resumeMapper.findById(id).get();
//    }
}
