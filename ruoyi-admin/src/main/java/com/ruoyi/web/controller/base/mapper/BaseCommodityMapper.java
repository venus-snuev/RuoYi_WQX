package com.ruoyi.web.controller.base.mapper;

import java.util.List;

import com.ruoyi.web.controller.base.domain.BaseCommodity;

/**
 * 基础信息_商品Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-27
 */
public interface BaseCommodityMapper 
{
    /**
     * 查询基础信息_商品
     * 
     * @param commodityId 基础信息_商品主键
     * @return 基础信息_商品
     */
    public BaseCommodity selectBaseCommodityByCommodityId(String commodityId);

    /**
     * 查询基础信息_商品列表
     * 
     * @param baseCommodity 基础信息_商品
     * @return 基础信息_商品集合
     */
    public List<BaseCommodity> selectBaseCommodityList(BaseCommodity baseCommodity);

    /**
     * 新增基础信息_商品
     * 
     * @param baseCommodity 基础信息_商品
     * @return 结果
     */
    public int insertBaseCommodity(BaseCommodity baseCommodity);

    /**
     * 修改基础信息_商品
     * 
     * @param baseCommodity 基础信息_商品
     * @return 结果
     */
    public int updateBaseCommodity(BaseCommodity baseCommodity);

    /**
     * 删除基础信息_商品
     * 
     * @param commodityId 基础信息_商品主键
     * @return 结果
     */
    public int deleteBaseCommodityByCommodityId(String commodityId);

    /**
     * 批量删除基础信息_商品
     * 
     * @param commodityIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseCommodityByCommodityIds(String[] commodityIds);
}
