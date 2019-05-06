package com.wuniu.printmanage.service.impl;

import com.wuniu.printmanage.entity.Detailed;
import com.wuniu.printmanage.general.GeneralServiceImpl;
import com.wuniu.printmanage.mapper.DetailedMapper;
import com.wuniu.printmanage.service.DetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Yan
 */
@Service
@Transactional
public class DetailedServiceImpl
    extends GeneralServiceImpl<Detailed, Long>
    implements DetailedService {

    @Autowired
    private DetailedMapper mapper;

    @Override
    protected Mapper<Detailed> getMapper() {
        return mapper;
    }
}
