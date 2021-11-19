package com.jancoyan.readingnotes.service.impl;

import com.jancoyan.readingnotes.pojo.Book;
import com.jancoyan.readingnotes.mapper.BookMapper;
import com.jancoyan.readingnotes.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YanJingcun
 * @since 2021-11-19
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
