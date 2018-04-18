package com.dfgg.mapper;

import com.dfgg.entity.Feedback;

/**
 * @author dfggking@hotmail.com
 * @version 1.0
 * @date 2018/4/18
 */
public interface FeedbackMapper {
    /**
     * 获得反馈信息
     * @param id
     * @return
     */
    Feedback getFeedback(String id);
}
