package com.webmagic.mapper;

import com.webmagic.model.Notice;
import java.util.List;

public interface NoticeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Notice record);

    Notice selectByPrimaryKey(String id);

    List<Notice> selectAll();

    int updateByPrimaryKey(Notice record);
}