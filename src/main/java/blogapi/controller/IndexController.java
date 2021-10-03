package blogapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 默认访问路径类
 * @author junyangwei
 * @date 2021-10-03
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "Blog API";
    }
}
