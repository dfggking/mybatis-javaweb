package com.dfgg.main;

import com.dfgg.entity.Feedback;
import com.dfgg.mapper.FeedbackMapper;
import com.dfgg.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author dfggking@hotmail.com
 * @version 1.0
 * @date 2018/4/18
 */
public class MybatisExample {
    
    public static void main(String[] args) {
        SqlSession sqlsession = null;
        sqlsession = MybatisUtil.getSqlSessionFactory().openSession();
        FeedbackMapper feedbackMapper = sqlsession.getMapper(FeedbackMapper.class);
//        sqlsession.close(); // Executor was closed. 报错
        Feedback feedback = feedbackMapper.getFeedback("1");
        sqlsession.close();
        System.out.println(feedback.getContent());
    }
}
