package com.jiangzhu.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiangzhu.entity.EbookEntry;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jiangzhu
 * @since 2020-10-30
 */
public interface EbookEntryMapper extends BaseMapper<EbookEntry> {
    IPage<EbookEntry> findAllBy(Page<EbookEntry> page,@Param(Constants.WRAPPER)QueryWrapper<EbookEntry> wrapper);
}
