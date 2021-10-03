package blogapi.server.impl;

import blogapi.mapper.ArticleMapper;
import blogapi.pojo.dto.ArticleDTO;
import blogapi.server.ArticleServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文章 服务层-实现类
 * @author junyangwei
 * @date 2021-10-03
 */
@Service("articleServer")
public class ArticleServerImpl implements ArticleServer {
    @Resource
    private ArticleMapper articleMapper;

    /**
     * 获取文章列表
     * @return articleList
     */
    @Override
    public List<ArticleDTO> getArticleList() {
        // 获取文章(基础信息)列表
        List<ArticleDTO> articleBasicList = this.articleMapper.getArticleBasicList();

        // 校验文章内容的长度是否大于20，是则截断拼接省略号...
        for (ArticleDTO articleDTO : articleBasicList) {
            if (articleDTO.getContent().length() <= 20) {
                continue;
            }
            articleDTO.setContent(articleDTO.getContent().substring(0, 20) + "...");
        }

        // 返回处理后的数据
        return articleBasicList;
    }
}
