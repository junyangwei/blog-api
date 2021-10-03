package blogapi.controller;

import blogapi.server.ArticleServer;
import blogapi.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 文章 控制层
 * @author junyangwei
 * @date 2021-10-03
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    @Resource(name = "articleServer")
    private ArticleServer articleServer;

    @GetMapping("/list")
    public Result<?> getArticleList() {
        return Result.success(this.articleServer.getArticleList());
    }

}
