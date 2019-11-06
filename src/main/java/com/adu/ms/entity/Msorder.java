package com.adu.ms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author BaoZhou
 * @since 2019-11-06
 */
@TableName("msorder")
public class Msorder extends Model<Msorder> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 秒杀商品id
     */
    private Integer productid;

    /**
     * 支付金额
     */
    private Integer payamount;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 商家id
     */
    private Integer merchantid;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 支付时间
     */
    private LocalDateTime paytime;

    /**
     * 支付转态
     */
    private Integer paystatus;

    /**
     * 收货人地址
     */
    private String receivingadress;

    /**
     * 收货人电话
     */
    private Integer receivingphone;

    /**
     * 收货人名称
     */
    private String receivingname;

    /**
     * 交易流水号
     */
    private String tradeserialnumber;

    private Integer num;

    private Integer paytype;


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

    public Integer getPayamount() {
        return payamount;
    }

    public void setPayamount(Integer payamount) {
        this.payamount = payamount;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public String getReceivingadress() {
        return receivingadress;
    }

    public void setReceivingadress(String receivingadress) {
        this.receivingadress = receivingadress;
    }

    public Integer getReceivingphone() {
        return receivingphone;
    }

    public void setReceivingphone(Integer receivingphone) {
        this.receivingphone = receivingphone;
    }

    public String getReceivingname() {
        return receivingname;
    }

    public void setReceivingname(String receivingname) {
        this.receivingname = receivingname;
    }

    public String getTradeserialnumber() {
        return tradeserialnumber;
    }

    public void setTradeserialnumber(String tradeserialnumber) {
        this.tradeserialnumber = tradeserialnumber;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Msorder{" +
        "id=" + id +
        ", productid=" + productid +
        ", payamount=" + payamount +
        ", userid=" + userid +
        ", merchantid=" + merchantid +
        ", createtime=" + createtime +
        ", paytime=" + paytime +
        ", paystatus=" + paystatus +
        ", receivingadress=" + receivingadress +
        ", receivingphone=" + receivingphone +
        ", receivingname=" + receivingname +
        ", tradeserialnumber=" + tradeserialnumber +
        ", num=" + num +
        ", paytype=" + paytype +
        "}";
    }
}
