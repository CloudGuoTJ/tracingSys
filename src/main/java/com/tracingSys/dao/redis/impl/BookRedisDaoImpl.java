package com.tracingSys.dao.redis.impl;


import com.tracingSys.dao.common.AbstractRedisDao;
import com.tracingSys.dao.redis.BookRedisDao;
import com.tracingSys.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * @Author joway
 * @Email joway.w@gmail.com
 * @Date 16/2/24.
 */
@Repository //用于标注数据访问组件
public class BookRedisDaoImpl extends AbstractRedisDao<Book> implements BookRedisDao {
    public BookRedisDaoImpl() {
        super();
        setClazz(Book.class);
    }
}
