package com.wuniu.printmanage.service.impl;

import com.wuniu.printmanage.entity.Organization;
import com.wuniu.printmanage.general.GeneralServiceImpl;
import com.wuniu.printmanage.mapper.OrganizationMapper;
import com.wuniu.printmanage.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Yan
 */
@Service
@Transactional
public class OrganizationServiceImpl
    extends GeneralServiceImpl<Organization, Long>
    implements OrganizationService {

    @Autowired
    private OrganizationMapper mapper;

    @Override
    protected Mapper<Organization> getMapper() {
        return mapper;
    }
}
