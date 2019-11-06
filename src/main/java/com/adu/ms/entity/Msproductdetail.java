package com.adu.ms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author BaoZhou
 * @since 2019-11-06
 */
@TableName("msproductdetail")
public class Msproductdetail extends Model<Msproductdetail> {

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
     * 商家id
     */
    private Integer merchantid;

    /**
     * 商品产地
     */
    private String productplace;

    /**
     * 商品名称
     */
    private String productname;

    /**
     * 商品品牌
     */
    private String brandname;

    /**
     * 商品重量
     */
    private String productweight;

    /**
     * 规格和包装
     */
    private String specification;

    /**
     * 商品详情图片地址
     */
    private String productdetailpicture;


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

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public String getProductplace() {
        return productplace;
    }

    public void setProductplace(String productplace) {
        this.productplace = productplace;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getProductweight() {
        return productweight;
    }

    public void setProductweight(String productweight) {
        this.productweight = productweight;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getProductdetailpicture() {
        return productdetailpicture;
    }

    public void setProductdetailpicture(String productdetailpicture) {
        this.productdetailpicture = productdetailpicture;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Msproductdetail{" +
        "id=" + id +
        ", productid=" + productid +
        ", merchantid=" + merchantid +
        ", productplace=" + productplace +
        ", productname=" + productname +
        ", brandname=" + brandname +
        ", productweight=" + productweight +
        ", specification=" + specification +
        ", productdetailpicture=" + productdetailpicture +
        "}";
    }
}
