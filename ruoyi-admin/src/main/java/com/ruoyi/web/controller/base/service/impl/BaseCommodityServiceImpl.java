package com.ruoyi.web.controller.base.service.impl;

import java.util.List;

import com.ruoyi.web.controller.base.domain.BaseCommodity;
import com.ruoyi.web.controller.base.mapper.BaseCommodityMapper;
import com.ruoyi.web.controller.base.service.IBaseCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 基础信息_商品Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-27
 */
@Service
public class BaseCommodityServiceImpl implements IBaseCommodityService
{
    @Autowired
    private BaseCommodityMapper baseCommodityMapper;

    /**
     * 查询基础信息_商品
     * 
     * @param commodityId 基础信息_商品主键
     * @return 基础信息_商品
     */
    @Override
    public BaseCommodity selectBaseCommodityByCommodityId(String commodityId)
    {
        return baseCommodityMapper.selectBaseCommodityByCommodityId(commodityId);
    }

    /**
     * 查询基础信息_商品列表
     * 
     * @param baseCommodity 基础信息_商品
     * @return 基础信息_商品
     */
    @Override
    public List<BaseCommodity> selectBaseCommodityList(BaseCommodity baseCommodity)
    {
        return baseCommodityMapper.selectBaseCommodityList(baseCommodity);
    }

    /**
     * 新增基础信息_商品
     * 
     * @param baseCommodity 基础信息_商品
     * @return 结果
     */
    @Override
    public int insertBaseCommodity(BaseCommodity baseCommodity)
    {
        baseCommodity.setCommodityId("1");
        return baseCommodityMapper.insertBaseCommodity(baseCommodity);
    }

    /**
     * 修改基础信息_商品
     * 
     * @param baseCommodity 基础信息_商品
     * @return 结果
     */
    @Override
    public int updateBaseCommodity(BaseCommodity baseCommodity)
    {
        return baseCommodityMapper.updateBaseCommodity(baseCommodity);
    }

    /**
     * 批量删除基础信息_商品
     * 
     * @param commodityIds 需要删除的基础信息_商品主键
     * @return 结果
     */
    @Override
    public int deleteBaseCommodityByCommodityIds(String commodityIds)
    {
        return baseCommodityMapper.deleteBaseCommodityByCommodityIds(Convert.toStrArray(commodityIds));
    }

    /**
     * 删除基础信息_商品信息
     * 
     * @param commodityId 基础信息_商品主键
     * @return 结果
     */
    @Override
    public int deleteBaseCommodityByCommodityId(String commodityId)
    {
        return baseCommodityMapper.deleteBaseCommodityByCommodityId(commodityId);
    }
}
