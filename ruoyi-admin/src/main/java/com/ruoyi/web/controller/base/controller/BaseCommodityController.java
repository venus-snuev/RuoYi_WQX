package com.ruoyi.web.controller.base.controller;

import java.util.List;

import com.ruoyi.web.controller.base.domain.BaseCommodity;
import com.ruoyi.web.controller.base.service.IBaseCommodityService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础信息_商品Controller
 * 
 * @author ruoyi
 * @date 2024-10-27
 */
@Controller
@RequestMapping("/base/commodity")
public class BaseCommodityController extends BaseController
{
    private String prefix = "base/commodity";

    @Autowired
    private IBaseCommodityService baseCommodityService;

    @RequiresPermissions("base:commodity:view")
    @GetMapping()
    public String commodity()
    {
        return prefix + "/commodity";
    }

    /**
     * 查询基础信息_商品列表
     */
    @RequiresPermissions("base:commodity:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BaseCommodity baseCommodity)
    {
        startPage();
        List<BaseCommodity> list = baseCommodityService.selectBaseCommodityList(baseCommodity);
        return getDataTable(list);
    }

    /**
     * 导出基础信息_商品列表
     */
    @RequiresPermissions("base:commodity:export")
    @Log(title = "基础信息_商品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BaseCommodity baseCommodity)
    {
        List<BaseCommodity> list = baseCommodityService.selectBaseCommodityList(baseCommodity);
        ExcelUtil<BaseCommodity> util = new ExcelUtil<BaseCommodity>(BaseCommodity.class);
        return util.exportExcel(list, "基础信息_商品数据");
    }

    /**
     * 新增基础信息_商品
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存基础信息_商品
     */
    @RequiresPermissions("base:commodity:add")
    @Log(title = "基础信息_商品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BaseCommodity baseCommodity)
    {
        return toAjax(baseCommodityService.insertBaseCommodity(baseCommodity));
    }

    /**
     * 修改基础信息_商品
     */
    @RequiresPermissions("base:commodity:edit")
    @GetMapping("/edit/{commodityId}")
    public String edit(@PathVariable("commodityId") String commodityId, ModelMap mmap)
    {
        BaseCommodity baseCommodity = baseCommodityService.selectBaseCommodityByCommodityId(commodityId);
        mmap.put("baseCommodity", baseCommodity);
        return prefix + "/edit";
    }

    /**
     * 修改保存基础信息_商品
     */
    @RequiresPermissions("base:commodity:edit")
    @Log(title = "基础信息_商品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BaseCommodity baseCommodity)
    {
        return toAjax(baseCommodityService.updateBaseCommodity(baseCommodity));
    }

    /**
     * 删除基础信息_商品
     */
    @RequiresPermissions("base:commodity:remove")
    @Log(title = "基础信息_商品", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(baseCommodityService.deleteBaseCommodityByCommodityIds(ids));
    }
}
