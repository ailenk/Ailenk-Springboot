package ink.bignose.aop.service;

import ink.bignose.aop.vo.request.TestRequest;
import ink.bignose.aop.vo.response.TestResponse;

/**
 * @Description:
 * @Author: jinhaoxun
 * @Date: 2020/7/10 10:31 上午
 * @Version: 1.0.0
 */
public interface TestService {

    TestResponse get(TestRequest testRequest) throws Exception;

}
