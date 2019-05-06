package com.wuniu.printmanage.controller;

import com.wuniu.printmanage.entity.Detailed;
import com.wuniu.printmanage.general.GeneralController;
import com.wuniu.printmanage.general.GeneralService;
import com.wuniu.printmanage.service.DetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yan
 */
@RestController
@RequestMapping("/details")
public class DetailedController
    implements GeneralController<Detailed, Long> {

    @Autowired
    private DetailedService service;

    @Override
    public GeneralService<Detailed, Long> getService() {
        return service;
    }
}
