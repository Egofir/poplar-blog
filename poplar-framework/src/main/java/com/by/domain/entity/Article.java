package entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2023-08-01 14:18:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    
    private Long id;
    //标题
    private String title;
    //文章内容
    private String content;
    //文章类型：1 文章 2 草稿
    private String type;
    //文章摘要
    private String summary;
    //所属分类id
    private Long categoryId;
    //缩略图
    private String thumbnail;
    //是否置顶：0 否 1 是
    private String isTop;
    //状态：0 已发布 1 草稿
    private String status;
    //评论数
    private Integer commentCount;
    //访问量
    private Long viewCount;
    //是否允许评论：0 否 1 是
    private String isComment;
    
    private Long createBy;
    
    private Date createTime;
    
    private Long updateBy;
    
    private Date updateTime;
    //删除标志：0 未删除 1 已删除
    private Integer delFlag;
}

