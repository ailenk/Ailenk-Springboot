package ink.bignose.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("ink.bignose.mybatisplus.mapper")
@SpringBootApplication
public class MybatisplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisplusApplication.class, args);
	}

}
