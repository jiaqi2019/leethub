package com.leethub.subject.controller;

 import com.alibaba.fastjson2.JSON;
 import com.google.common.base.Preconditions;
 import com.leethub.subject.domain.entity.SubjectCategoryBO;
import com.leethub.subject.domain.service.SubjectCategoryDomainService;
import com.leethub.subject.convert.SubjectCategoryDTOConverter;
import com.leethub.subject.dto.SubjectCategoryDTO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.leethub.subject.common.entity.Result;

@RestController
@RequestMapping("/subject/category")
@Slf4j
public class SubjectCategoryController {
    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;

    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO) {
        try {
            if(log.isInfoEnabled()){
                log.info("SubjectCategoryController.add.DTO:{}", JSON.toJSONString(subjectCategoryDTO));
            }
            Preconditions.checkNotNull(subjectCategoryDTO.getCategoryName(), "categoryName can not be null");
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convertDTOToBO(subjectCategoryDTO);
            subjectCategoryDomainService.add(subjectCategoryBO);
            return Result.ok(true);
        } catch (Exception e) {
            return Result.fail(e.getMessage());
        }
    }
}
