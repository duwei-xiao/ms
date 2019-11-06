package com.adu.ms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 主键
 * </p>
 *
 * @author BaoZhou
 * @since 2019-11-06
 */
@TableName("msproductinfo")
public class Msproductinfo extends Model<Msproductinfo> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    private Integer productid;

    /**
     * 商品标题
     */
    private String producttitle;

    private String productpicture;

    /**
     * 秒杀价格
     */
    private Integer miaoshaprice;

    /**
     * 秒杀原价
     */
    private Integer originalprice;

    /**
     * 商家id
     */
    private Integer msmerchantid;

    /**
     * 添加时间
     */
    private LocalDateTime applydate;

    /**
     * 审核时间
     */
    private LocalDateTime auditdate;

    /**
     * 审核转态
     */
    private Integer auditstate;

    /**
     * 秒杀开始时间
     */
    private LocalDateTime starttime;

    /**
     * 秒杀结束时间
     */
    private LocalDateTime endtime;

    /**
     * 秒杀商品数
     */
    private Integer productcount;

    /**
     * 库存
     */
    private Integer stockcount;

    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProducttitle() {
        return producttitle;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle;
    }

    public String getProductpicture() {
        return productpicture;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture;
    }

    public Integer getMiaoshaprice() {
        return miaoshaprice;
    }

    public void setMiaoshaprice(Integer miaoshaprice) {
        this.miaoshaprice = miaoshaprice;
    }

    public Integer getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Integer originalprice) {
        this.originalprice = originalprice;
    }

    public Integer getMsmerchantid() {
        return msmerchantid;
    }

    public void setMsmerchantid(Integer msmerchantid) {
        this.msmerchantid = msmerchantid;
    }

    public LocalDateTime getApplydate() {
        return applydate;
    }

    public void setApplydate(LocalDateTime applydate) {
        this.applydate = applydate;
    }

    public LocalDateTime getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(LocalDateTime auditdate) {
        this.auditdate = auditdate;
    }

    public Integer getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(Integer auditstate) {
        this.auditstate = auditstate;
    }

    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    public Integer getProductcount() {
        return productcount;
    }

    public void setProductcount(Integer productcount) {
        this.productcount = productcount;
    }

    public Integer getStockcount() {
        return stockcount;
    }

    public void setStockcount(Integer stockcount) {
        this.stockcount = stockcount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Msproductinfo{" +
        "id=" + id +
        ", productid=" + productid +
        ", producttitle=" + producttitle +
        ", productpicture=" + productpicture +
        ", miaoshaprice=" + miaoshaprice +
        ", originalprice=" + originalprice +
        ", msmerchantid=" + msmerchantid +
        ", applydate=" + applydate +
        ", auditdate=" + auditdate +
        ", auditstate=" + auditstate +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        ", productcount=" + productcount +
        ", stockcount=" + stockcount +
        ", description=" + description +
        "}";
    }
}
