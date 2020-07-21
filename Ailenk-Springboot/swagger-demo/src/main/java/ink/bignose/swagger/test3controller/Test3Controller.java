package ink.bignose.swagger.test3controller;

import ink.bignose.swagger.vo.request.TestVoRequest;
import ink.bignose.swagger.vo.response.TestVoResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jinhaoxun
 * @since 2020-02-13
 */
@RestController
@RequestMapping("/test3")
@Api(value = "Test3Controller", tags = "Test3Controller接口")
public class Test3Controller {

    /**
     * @author jinhaoxun
     * @description 测试接口1
     */
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功！"),
            @ApiResponse(code = 500, message = "服务器内部错误，请联系管理人员！"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping(value = "/gettest1", produces = "application/json; charset=UTF-8")
    @ApiOperation(value = "test1接口名称", notes = "test1接口描述")
    public TestVoResponse getTest1(TestVoRequest request) throws Exception {
        TestVoResponse response = new TestVoResponse();
        BeanUtils.copyProperties(request, response);
        return response;
    }

}
