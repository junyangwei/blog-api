package blogapi.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 全局的 CORS 配置项
 * @author junyangwei
 * @date 2021-10-07
 */
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    /**
     * 重写 WebMvcConfigurer 接口的 addCorsMappings 方法
     *  - 允许所有请求路径为
     *  - 允许携带 cookie
     *  - 只允许 GET 和 POST 的HTTP请求
     *  - 允许所有请求头
     *  - 设置允许请求的域（白名单）
     * @param registry cors 请求
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedMethods("GET", "POST")
                .allowedHeaders("*")
                .allowedOriginPatterns("http://localhost:3000", "https://junyangwei.com");
//                .exposedHeaders("*")
    }
}
