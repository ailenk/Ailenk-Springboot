package ink.bignose.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ink.bignose.mybatisplus.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jinhaoxun
 * @since 2020-02-13
 */
public interface IUserService extends IService<User> {

    /**
     * @Author: jinhaoxun
     * @Description:
     * @param name 姓名
     * @Date: 2020/2/13 下午12:06
     * @Return: com.jinhaoxun.mybatisplus.entity.User
     * @Throws:
     */
    User selectByName(String name);

    /**
     * @Author: jinhaoxun
     * @Description:
     * @param id id
     * @param name 姓名
     * @Date: 2020/2/13 下午12:06
     * @Return: int
     * @Throws:
     */
    int updateName(int id, String name);

}
