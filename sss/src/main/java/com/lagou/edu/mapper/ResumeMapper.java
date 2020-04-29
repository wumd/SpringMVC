package com.lagou.edu.mapper;

import com.lagou.edu.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ResumeMapper extends JpaRepository<Resume,Long>, JpaSpecificationExecutor<Resume> {

    @Query(value = "from Resume where name = ?1")
    public Resume queryByName(String name);

    @Modifying
    @Query(value = "update tb_resume set name = ?2 ,address = ?3 ,phone = ?4 where id=?1",nativeQuery = true)
    public int saveByid(Long id,String name,String address,String phone);

//    @Modifying
//    @Query(value = "inse")
//    public int saveOne(String name,String address,String phone);
}
