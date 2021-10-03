package blogapi.mapper;

import blogapi.pojo.dto.ArticleDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 文章 映射类 (mybatis)
 * @author junyangwei
 * @date 2021-10-03
 */
@Repository
public interface ArticleMapper {
    /**
     * 获取文章列表（仅包含基础信息：文章ID，文章标题，文章内容）
     * @return articleList
     */
    List<ArticleDTO> getArticleBasicList();
}
