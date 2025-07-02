package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.UserAnswer;
import generator.service.UserAnswerService;
import generator.mapper.UserAnswerMapper;
import org.springframework.stereotype.Service;

/**
* @author ZhuanZ1
* @description 针对表【user_answer(用户答题记录)】的数据库操作Service实现
* @createDate 2025-03-13 14:10:09
*/
@Service
public class UserAnswerServiceImpl extends ServiceImpl<UserAnswerMapper, UserAnswer>
    implements UserAnswerService{

}




