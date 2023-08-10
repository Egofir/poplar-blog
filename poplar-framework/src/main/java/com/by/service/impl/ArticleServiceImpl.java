package com.by.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.by.dao.ArticleDao;
import com.by.domain.entity.Article;
import com.by.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * (Article)表服务实现类
 *
 * @author makejava
 * @since 2023-08-01 19:56:07
 */
@Service("articleService")
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

}

