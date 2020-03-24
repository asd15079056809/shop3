package com.bdqn.dmscq.service.impl;

import com.bdqn.dmscq.entity.User;
import com.bdqn.dmscq.mapper.UserMapper;
import com.bdqn.dmscq.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-03-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
