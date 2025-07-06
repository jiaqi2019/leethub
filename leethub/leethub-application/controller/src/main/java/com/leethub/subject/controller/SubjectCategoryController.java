package com.leethub.subject.controller;

import com.leethub.subject.domain.entity.SubjectCategoryBO;
import com.leethub.subject.domain.service.SubjectCategoryDomainService;
import com.leethub.subject.convert.SubjectCategoryDTOConverter;
import com.leethub.subject.dto.SubjectCategoryDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import com.leethub.subject.common.entity.Result;

@RestController
@RequestMapping("/subject/category")
public class SubjectCategoryController {
    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;

    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO) {
        System.out.println(subjectCategoryDTO.toString());
        try {
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convertDTOToBO(subjectCategoryDTO);
            System.out.println(subjectCategoryBO.toString());
            subjectCategoryDomainService.add(subjectCategoryBO);
            return Result.ok(true);
        } catch (Exception e) {
            return Result.fail();
        }
    }
}
