package com.mc.ssm.dao;

import com.mc.ssm.model.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangzhenguo on 2017/2/11.
 */
@Repository
public interface BookDao {

    Book selectBookById(@Param("bookId") long bookId);

}
