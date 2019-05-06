package com.wuniu.printmanage.controller;

import com.wuniu.printmanage.entity.Course;
import com.wuniu.printmanage.general.GeneralController;
import com.wuniu.printmanage.general.GeneralService;
import com.wuniu.printmanage.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yan
 */
@RestController
@RequestMapping("/courses")
public class CourseController
    implements GeneralController<Course, Long> {

    @Autowired
    private CourseService service;

    @Override
    public GeneralService<Course, Long> getService() {
        return service;
    }
}
