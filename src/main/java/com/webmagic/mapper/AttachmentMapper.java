package com.webmagic.mapper;

import com.webmagic.model.Attachment;
import java.util.List;

public interface AttachmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Attachment record);

    Attachment selectByPrimaryKey(String id);

    List<Attachment> selectAll();

    int updateByPrimaryKey(Attachment record);
}