package blogapi.server;

import blogapi.pojo.dto.ArticleDTO;

import java.util.List;

/**
 * 文章 服务层-接口类
 * @author junyangwei
 * @date 2021-10-03
 */
public interface ArticleServer {
    /**
     * 获取文章列表
     * @return articleList
     */
    List<ArticleDTO> getArticleList();
}
