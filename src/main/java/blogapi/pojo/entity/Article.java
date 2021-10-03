package blogapi.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 文章 实体类
 * @author junyangwei
 * @date 2021-10-03
 */
@Data
public class Article implements Serializable {
    /**
     * 文章ID
     */
    private int id;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 作者ID
     */
    private int creatorId;
    /**
     * 状态 0无效 1有效
     */
    private int status;
    /**
     * 创建时间
     */
    private LocalDateTime createdTime;
    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;
}
