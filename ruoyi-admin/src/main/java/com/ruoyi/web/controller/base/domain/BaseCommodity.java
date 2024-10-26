package com.ruoyi.web.controller.base.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础信息_商品对象 base_commodity
 * 
 * @author ruoyi
 * @date 2024-10-27
 */
public class BaseCommodity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String commodityId;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String commodityNoStr;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String commodityNameStr;

    /** 进价 */
    @Excel(name = "进价")
    private BigDecimal commodityCostVal;

    /** 最小单位卖价 */
    @Excel(name = "最小单位卖价")
    private BigDecimal commodityMinSpecVal;

    /** 商品一级分类 */
    @Excel(name = "商品一级分类")
    private String primaryClassVal;

    /** 商品二级分类 */
    @Excel(name = "商品二级分类")
    private String secondaryClassVal;

    public void setCommodityId(String commodityId) 
    {
        this.commodityId = commodityId;
    }

    public String getCommodityId() 
    {
        return commodityId;
    }

    public void setCommodityNoStr(String commodityNoStr) 
    {
        this.commodityNoStr = commodityNoStr;
    }

    public String getCommodityNoStr() 
    {
        return commodityNoStr;
    }

    public void setCommodityNameStr(String commodityNameStr) 
    {
        this.commodityNameStr = commodityNameStr;
    }

    public String getCommodityNameStr() 
    {
        return commodityNameStr;
    }

    public void setCommodityCostVal(BigDecimal commodityCostVal) 
    {
        this.commodityCostVal = commodityCostVal;
    }

    public BigDecimal getCommodityCostVal() 
    {
        return commodityCostVal;
    }

    public void setCommodityMinSpecVal(BigDecimal commodityMinSpecVal) 
    {
        this.commodityMinSpecVal = commodityMinSpecVal;
    }

    public BigDecimal getCommodityMinSpecVal() 
    {
        return commodityMinSpecVal;
    }

    public void setPrimaryClassVal(String primaryClassVal) 
    {
        this.primaryClassVal = primaryClassVal;
    }

    public String getPrimaryClassVal() 
    {
        return primaryClassVal;
    }

    public void setSecondaryClassVal(String secondaryClassVal) 
    {
        this.secondaryClassVal = secondaryClassVal;
    }

    public String getSecondaryClassVal() 
    {
        return secondaryClassVal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("commodityId", getCommodityId())
            .append("commodityNoStr", getCommodityNoStr())
            .append("commodityNameStr", getCommodityNameStr())
            .append("commodityCostVal", getCommodityCostVal())
            .append("commodityMinSpecVal", getCommodityMinSpecVal())
            .append("primaryClassVal", getPrimaryClassVal())
            .append("secondaryClassVal", getSecondaryClassVal())
            .toString();
    }
}
