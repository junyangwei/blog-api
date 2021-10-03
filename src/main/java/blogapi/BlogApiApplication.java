package blogapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * 	- @MapperScan 注解用来指定要加载的Mapper类的包路径
 * @author junyangwei
 * @date 2021-09-26
 */
@SpringBootApplication
@MapperScan("blogapi.mapper")
public class BlogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApiApplication.class, args);
	}

}
