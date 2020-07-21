package ink.bignose.aop.controller;

import ink.bignose.aop.aop.HttpCheck;
import ink.bignose.aop.service.TestService;
import ink.bignose.aop.vo.http.HttpRequest;
import ink.bignose.aop.vo.http.HttpResponse;
import ink.bignose.aop.vo.request.TestRequest;
import ink.bignose.aop.vo.response.TestResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: jinhaoxun
 * @Date: 2020/7/10 10:31 上午
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    TestService testService;

    /**
     * @author jinhaoxun
     * @description 测试接口1
     */
    @PostMapping(value = "/get", produces = "application/json; charset=UTF-8")
    @HttpCheck(dataType = TestRequest.class)
    public HttpResponse<TestResponse> get(@RequestBody HttpRequest<TestRequest> httpRequest) throws Exception {
        TestResponse testResponse = testService.get(httpRequest.getData());
        return HttpResponse.build(200, "成功！", testResponse);
    }

}
