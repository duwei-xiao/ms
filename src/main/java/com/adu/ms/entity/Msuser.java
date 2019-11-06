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
@TableName("msuser")
public class Msuser extends Model<Msuser> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户账号
     */
    private String useraccount;

    /**
     * 用户密码
     */
    private String userpassword;

    /**
     * 用户性别
     */
    private Integer usersex;

    /**
     * 用户年龄
     */
    private Integer userage;

    /**
     * 用户的地址
     */
    private String useraddress;

    /**
     * 用户的邮箱
     */
    private String useremail;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Msuser{" +
        "id=" + id +
        ", name=" + name +
        ", useraccount=" + useraccount +
        ", userpassword=" + userpassword +
        ", usersex=" + usersex +
        ", userage=" + userage +
        ", useraddress=" + useraddress +
        ", useremail=" + useremail +
        "}";
    }
}
