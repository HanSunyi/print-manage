package com.wuniu.printmanage.service.impl;

import com.wuniu.printmanage.entity.Course;
import com.wuniu.printmanage.general.GeneralServiceImpl;
import com.wuniu.printmanage.mapper.CourseMapper;
import com.wuniu.printmanage.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Yan
 */
@Service
@Transactional
public class CourseServiceImpl
    extends GeneralServiceImpl<Course, Long>
    implements CourseService {

    @Autowired
    private CourseMapper mapper;

    @Override
    protected Mapper<Course> getMapper() {
        return mapper;
    }
}
