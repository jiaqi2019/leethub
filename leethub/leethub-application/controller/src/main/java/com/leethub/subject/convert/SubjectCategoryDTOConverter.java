package com.leethub.subject.convert;


import com.leethub.subject.domain.entity.SubjectCategoryBO;
import com.leethub.subject.dto.SubjectCategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectCategoryDTOConverter {

    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

    SubjectCategoryBO convertDTOToBO(SubjectCategoryDTO subjectCategoryDTO);

}
