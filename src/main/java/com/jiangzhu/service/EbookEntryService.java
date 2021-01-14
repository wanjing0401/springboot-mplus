package com.jiangzhu.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jiangzhu.entity.EbookEntry;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jiangzhu
 * @since 2020-10-30
 */
public interface EbookEntryService extends IService<EbookEntry> {
    IPage<EbookEntry> findAllBy(Page<EbookEntry> page, @Param(Constants.WRAPPER) QueryWrapper<EbookEntry> wrapper);
}
