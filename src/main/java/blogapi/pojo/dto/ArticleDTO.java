package blogapi.pojo.dto;

import lombok.Data;

/**
 * 文章类 数据传输对象
 * @author junyangwei
 * @date 2021-10-03
 */
@Data
public class ArticleDTO {
    /**
     * 文章ID
     */
    private int id;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章内容（超过20字自动省略...）
     */
    private String content;
}
