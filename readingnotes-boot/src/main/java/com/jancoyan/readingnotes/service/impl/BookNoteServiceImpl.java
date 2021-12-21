package com.jancoyan.readingnotes.service.impl;

import com.jancoyan.readingnotes.pojo.BookNote;
import com.jancoyan.readingnotes.mapper.BookNoteMapper;
import com.jancoyan.readingnotes.service.BookNoteService;
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
public class BookNoteServiceImpl extends ServiceImpl<BookNoteMapper, BookNote> implements BookNoteService {

}
