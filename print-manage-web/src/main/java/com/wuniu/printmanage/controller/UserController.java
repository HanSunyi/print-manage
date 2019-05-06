package com.wuniu.printmanage.controller;

import com.wuniu.printmanage.entity.User;
import com.wuniu.printmanage.general.GeneralController;
import com.wuniu.printmanage.general.GeneralService;
import com.wuniu.printmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yan
 */
@RestController
@RequestMapping("/users")
public class UserController
    implements GeneralController<User, Long> {

    @Autowired
    private UserService service;
    @Override
    public GeneralService<User, Long> getService() {
        return service;
    }
}
