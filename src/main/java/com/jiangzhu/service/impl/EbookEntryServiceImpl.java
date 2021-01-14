package com.jiangzhu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiangzhu.entity.EbookEntry;
import com.jiangzhu.mapper.EbookEntryMapper;
import com.jiangzhu.service.EbookEntryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiangzhu
 * @since 2020-10-30
 */
@Service
public class EbookEntryServiceImpl extends ServiceImpl<EbookEntryMapper, EbookEntry> implements EbookEntryService {

    @Resource
    private  EbookEntryMapper ebookEntryMapper;

    @Override
    public IPage<EbookEntry> findAllBy(Page<EbookEntry> page, QueryWrapper<EbookEntry> wrapper) {
        return ebookEntryMapper.findAllBy(page,wrapper);
    }
}
