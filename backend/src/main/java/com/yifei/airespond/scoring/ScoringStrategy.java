package com.yifei.airespond.scoring;

import com.yifei.airespond.model.entity.App;
import com.yifei.airespond.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 *
 * @author yifei
 *
 */
public interface ScoringStrategy {

    /**
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}
