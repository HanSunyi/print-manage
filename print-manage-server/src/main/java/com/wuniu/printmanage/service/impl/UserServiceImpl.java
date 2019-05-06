package com.wuniu.printmanage.service.impl;

import com.wuniu.printmanage.entity.User;
import com.wuniu.printmanage.general.GeneralServiceImpl;
import com.wuniu.printmanage.mapper.UserMapper;
import com.wuniu.printmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Yan
 */
@Service
@Transactional
public class UserServiceImpl
    extends GeneralServiceImpl<User, Long>
    implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    protected Mapper<User> getMapper() {
        return mapper;
    }
}
