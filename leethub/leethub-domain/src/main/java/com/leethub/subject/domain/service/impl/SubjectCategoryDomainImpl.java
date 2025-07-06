package com.leethub.subject.domain.service.impl;

import com.leethub.subject.infra.basic.entity.SubjectCategory;
import com.leethub.subject.infra.basic.service.SubjectCategoryService;
import com.leethub.subject.domain.convert.SubjectCategoryConverter;
import com.leethub.subject.domain.entity.SubjectCategoryBO;
import com.leethub.subject.domain.service.SubjectCategoryDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectCategoryDomainImpl implements SubjectCategoryDomainService {

    @Autowired
    private SubjectCategoryService subjectCategoryService;

    @Override
    public void add(SubjectCategoryBO subjectCategoryBO) {
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE.convertBoToCategory(subjectCategoryBO);
        subjectCategoryService.insert(subjectCategory);
    }
}