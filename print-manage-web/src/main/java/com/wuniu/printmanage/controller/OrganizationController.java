package com.wuniu.printmanage.controller;

import com.wuniu.printmanage.entity.Organization;
import com.wuniu.printmanage.general.GeneralController;
import com.wuniu.printmanage.general.GeneralService;
import com.wuniu.printmanage.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yan
 */
@RestController
@RequestMapping("/organizations")
public class OrganizationController
    implements GeneralController<Organization, Long> {

    @Autowired
    private OrganizationService service;

    @Override
    public GeneralService<Organization, Long> getService() {
        return service;
    }
}
