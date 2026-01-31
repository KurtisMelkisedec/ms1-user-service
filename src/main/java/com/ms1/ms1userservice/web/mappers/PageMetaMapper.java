package com.ms1.ms1userservice.web.mappers;

import com.ms1.ms1userservice.web.dtos.response.PageMeta;
import org.springframework.data.domain.Page;

public class PageMetaMapper {

    public static PageMeta from(Page<?> page) {
        return new PageMeta(
            page.getNumber(),
            page.getSize(),
            page.getTotalElements(),
            page.getTotalPages(),
            page.isLast()
        );
    }
}

