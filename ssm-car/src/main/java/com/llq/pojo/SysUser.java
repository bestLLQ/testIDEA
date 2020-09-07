package com.llq.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-com.llq-pojo-SysUser")
@Data
@TableName(value = "sys_user")
public class SysUser {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "tel")
    @ApiModelProperty(value="")
    private String tel;

    @TableField(value = "password")
    @ApiModelProperty(value="")
    private String password;

    @TableField(value = "email")
    @ApiModelProperty(value="")
    private String email;

    @TableField(value = "invitation")
    @ApiModelProperty(value="")
    private String invitation;

    public static final String COL_ID = "id";

    public static final String COL_TEL = "tel";

    public static final String COL_PASSWORD = "password";

    public static final String COL_EMAIL = "email";

    public static final String COL_INVITATION = "invitation";
}