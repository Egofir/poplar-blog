package com.by.controller;

import com.by.domain.entity.Article;
import com.by.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * (Article)表控制层
 *
 * @author makejava
 * @since 2023-08-01 20:06:09
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleService articleService;
    @GetMapping("/test")
    public String test1() {
        System.out.println("2");
        return "1";
    }
//
//    /**
//     * 分页查询所有数据
//     *
//     * @param page 分页对象
//     * @param article 查询实体
//     * @return 所有数据
//     */
//    @GetMapping
//    public R selectAll(Page<Article> page, Article article) {
//        return success(this.articleService.page(page, new QueryWrapper<>(article)));
//    }
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("{id}")
//    public R selectOne(@PathVariable Serializable id) {
//        return success(this.articleService.getById(id));
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param article 实体对象
//     * @return 新增结果
//     */
//    @PostMapping
//    public R insert(@RequestBody Article article) {
//        return success(this.articleService.save(article));
//    }
//
//    /**
//     * 修改数据
//     *
//     * @param article 实体对象
//     * @return 修改结果
//     */
//    @PutMapping
//    public R update(@RequestBody Article article) {
//        return success(this.articleService.updateById(article));
//    }
//
//    /**
//     * 删除数据
//     *
//     * @param idList 主键结合
//     * @return 删除结果
//     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.articleService.removeByIds(idList));
//    }
}

