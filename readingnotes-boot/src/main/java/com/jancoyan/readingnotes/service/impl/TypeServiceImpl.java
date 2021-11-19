package com.jancoyan.readingnotes.service.impl;

import com.jancoyan.readingnotes.pojo.Type;
import com.jancoyan.readingnotes.mapper.TypeMapper;
import com.jancoyan.readingnotes.service.TypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

}
