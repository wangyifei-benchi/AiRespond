package com.yifei.airespond.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yifei.airespond.model.dto.userAnswer.UserAnswerQueryRequest;
import com.yifei.airespond.model.entity.UserAnswer;
import com.yifei.airespond.model.vo.UserAnswerVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户答案服务
 *
 * @author yifei
 *
 */
public interface UserAnswerService extends IService<UserAnswer> {

    /**
     * 校验数据
     *
     * @param userAnswer
     * @param add 对创建的数据进行校验
     */
    void validUserAnswer(UserAnswer userAnswer, boolean add);

    /**
     * 获取查询条件
     *
     * @param userAnswerQueryRequest
     * @return
     */
    QueryWrapper<UserAnswer> getQueryWrapper(UserAnswerQueryRequest userAnswerQueryRequest);

    /**
     * 获取用户答案封装
     *
     * @param userAnswer
     * @param request
     * @return
     */
    UserAnswerVO getUserAnswerVO(UserAnswer userAnswer, HttpServletRequest request);

    /**
     * 分页获取用户答案封装
     *
     * @param userAnswerPage
     * @param request
     * @return
     */
    Page<UserAnswerVO> getUserAnswerVOPage(Page<UserAnswer> userAnswerPage, HttpServletRequest request);
}
