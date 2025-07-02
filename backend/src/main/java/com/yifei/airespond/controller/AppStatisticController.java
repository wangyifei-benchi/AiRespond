package com.yifei.airespond.controller;

import cn.hutool.core.io.FileUtil;
import com.yifei.airespond.common.BaseResponse;
import com.yifei.airespond.common.ErrorCode;
import com.yifei.airespond.common.ResultUtils;
import com.yifei.airespond.constant.FileConstant;
import com.yifei.airespond.exception.BusinessException;
import com.yifei.airespond.exception.ThrowUtils;
import com.yifei.airespond.manager.CosManager;
import com.yifei.airespond.mapper.UserAnswerMapper;
import com.yifei.airespond.model.dto.file.UploadFileRequest;
import com.yifei.airespond.model.dto.statistic.AppAnswerCountDTO;
import com.yifei.airespond.model.dto.statistic.AppAnswerResultCountDTO;
import com.yifei.airespond.model.entity.User;
import com.yifei.airespond.model.enums.FileUploadBizEnum;
import com.yifei.airespond.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * App 统计分析接口
 *
 * @author yifei
 *
 */
@RestController
@RequestMapping("/app/statistic")
@Slf4j
public class AppStatisticController {

    @Resource
    private UserAnswerMapper userAnswerMapper;

    /**
     * 热门应用及回答数统计（top 10）
     *
     * @return
     */
    @GetMapping("/answer_count")
    public BaseResponse<List<AppAnswerCountDTO>> getAppAnswerCount() {
        return ResultUtils.success(userAnswerMapper.doAppAnswerCount());
    }

    /**
     * 某应用回答结果分布统计
     *
     * @param appId
     * @return
     */
    @GetMapping("/answer_result_count")
    public BaseResponse<List<AppAnswerResultCountDTO>> getAppAnswerResultCount(Long appId) {
        ThrowUtils.throwIf(appId == null || appId <= 0, ErrorCode.PARAMS_ERROR);
        return ResultUtils.success(userAnswerMapper.doAppAnswerResultCount(appId));
    }
}
