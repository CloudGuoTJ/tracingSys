package com.tracingSys.dao.mysql.impl;


import com.tracingSys.dao.common.AbstractJPADao;
import com.tracingSys.dao.mysql.BookDao;
import com.tracingSys.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * @Author joway
 * @Email joway.w@gmail.com
 * @Date 16/2/21.
 */
@Repository //用于标注数据访问组件
public class BookDaoImpl extends AbstractJPADao<Book> implements BookDao {
    public BookDaoImpl() {
        super();
        setClazz(Book.class);
    }
}
