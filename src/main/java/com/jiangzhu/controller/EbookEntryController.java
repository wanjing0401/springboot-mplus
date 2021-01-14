package com.jiangzhu.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiangzhu.entity.EbookCategory;
import com.jiangzhu.entity.EbookEntry;
import com.jiangzhu.service.EbookCategoryService;
import com.jiangzhu.service.EbookEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**1
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jiangzhu
 * @since 2020-10-30
 */
@Controller
public class EbookEntryController {

    @Autowired
    private EbookEntryService ebookEntryService;

    @Autowired
    private EbookCategoryService ebookCategoryService;

    @RequestMapping("/index")
    public  String index(Integer category_id, Integer pageNum, Model model){
        if (pageNum==null){
            pageNum=1;
        }
        Page<EbookEntry> page=new Page<>(pageNum,1);
        QueryWrapper<EbookEntry> queryWrapper=new QueryWrapper<>();
        if(category_id!=null&&category_id!=0){
            queryWrapper.eq("categoryId",category_id);
        }
        IPage<EbookEntry> pageInfo=ebookEntryService.findAllBy(page,queryWrapper);
        model.addAttribute("pageInfo",pageInfo);
        List<EbookCategory> list = ebookCategoryService.list();
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("/toInsert")
    public String toInsert(){
        return "insert";
    }
    @RequestMapping("/insert")
    public String insert(EbookEntry ebookEntry,String create_time) throws Exception {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=simpleDateFormat.parse(create_time);
        ebookEntry.setCreatedate(date);     //将时间字符串转化为date类型
        ebookEntry.setCategoryId(1); //默认计算机专业
        ebookEntryService.save(ebookEntry); //新增
        return  "redirect:/index";
    }
    @RequestMapping("/toupdate")
    public  String toupdate(Integer id,Model model){
        EbookEntry ebookEntry = ebookEntryService.getById(id);
        model.addAttribute("ebookEntry",ebookEntry);
        return "/update";
    }
    @RequestMapping("/update")
    public  String update(EbookEntry ebookEntry, String create_time) throws Exception{
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=simpleDateFormat.parse(create_time);
        ebookEntry.setCreatedate(date);     //将时间字符串转化为date类型
        ebookEntry.setCategoryId(1); //默认计算机专业
        ebookEntryService.updateById(ebookEntry); //修改
        return "redirect:/index";
    }
}

