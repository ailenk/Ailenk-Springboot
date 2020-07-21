package ink.bignose.multipledatasources.mapper.db1;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ink.bignose.multipledatasources.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jinhaoxun
 * @since 2020-02-13
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * @Author: jinhaoxun
     * @Description:
     * @param name 姓名
     * @Date: 2020/2/13 下午12:06
     * @Return: com.jinhaoxun.mybatisplusdemo.entity.User
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
    int updateName(@Param("id") int id, @Param("name") String name);

}
