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
@TableName("msmerchant")
public class Msmerchant extends Model<Msmerchant> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商家的姓名
     */
    private String merchantname;

    /**
     * 商家的店铺名称
     */
    private String merchantshopname;

    /**
     * 商家账号
     */
    private String merchantaccount;

    /**
     * 商家密码
     */
    private String merchantpassword;

    /**
     * 商家经营范围
     */
    private String merchantscope;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerchantname() {
        return merchantname;
    }

    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname;
    }

    public String getMerchantshopname() {
        return merchantshopname;
    }

    public void setMerchantshopname(String merchantshopname) {
        this.merchantshopname = merchantshopname;
    }

    public String getMerchantaccount() {
        return merchantaccount;
    }

    public void setMerchantaccount(String merchantaccount) {
        this.merchantaccount = merchantaccount;
    }

    public String getMerchantpassword() {
        return merchantpassword;
    }

    public void setMerchantpassword(String merchantpassword) {
        this.merchantpassword = merchantpassword;
    }

    public String getMerchantscope() {
        return merchantscope;
    }

    public void setMerchantscope(String merchantscope) {
        this.merchantscope = merchantscope;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Msmerchant{" +
        "id=" + id +
        ", merchantname=" + merchantname +
        ", merchantshopname=" + merchantshopname +
        ", merchantaccount=" + merchantaccount +
        ", merchantpassword=" + merchantpassword +
        ", merchantscope=" + merchantscope +
        "}";
    }
}
