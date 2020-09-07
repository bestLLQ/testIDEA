package com.llq.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-com.llq-pojo-SysCar")
@Data
@TableName(value = "sys_car")
public class SysCar {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "type")
    @ApiModelProperty(value="")
    private String type;

    @TableField(value = "sitnum")
    @ApiModelProperty(value="")
    private Integer sitnum;

    @TableField(value = "cid")
    @ApiModelProperty(value="")
    private Integer cid;

    @TableField(value = "price")
    @ApiModelProperty(value="")
    private Double price;

    @TableField(value = "number")
    @ApiModelProperty(value="")
    private Integer number;

    @TableField(value = "picture")
    @ApiModelProperty(value="")
    private String picture;

    @TableField(exist = false)
    private SysCity sysCity;

}