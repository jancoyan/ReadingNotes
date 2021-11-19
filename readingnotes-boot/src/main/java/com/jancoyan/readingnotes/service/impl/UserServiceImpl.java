package com.jancoyan.readingnotes.service.impl;

import com.jancoyan.readingnotes.pojo.User;
import com.jancoyan.readingnotes.mapper.UserMapper;
import com.jancoyan.readingnotes.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
