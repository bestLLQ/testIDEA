package com.llq.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(value="com-com.llq-pojo-SysCity")
@Data
@TableName(value = "sys_city")
public class SysCity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "name")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "pid")
    @ApiModelProperty(value="")
    private Integer pid;

    @TableField(exist = false)
    private List<SysCar> listCars;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PID = "pid";
}