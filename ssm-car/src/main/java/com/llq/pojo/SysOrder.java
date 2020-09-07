package com.llq.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-com.llq-pojo-SysOrder")
@Data
@TableName(value = "sys_order")
public class SysOrder {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "cid")
    @ApiModelProperty(value="")
    private Integer cid;

    @TableField(value = "uid")
    @ApiModelProperty(value="")
    private Integer uid;

    @TableField(value = "getid")
    @ApiModelProperty(value="")
    private Integer getid;

    @TableField(value = "backid")
    @ApiModelProperty(value="")
    private Integer backid;

    @TableField(value = "oprice")
    @ApiModelProperty(value="")
    private Double oprice;

    @TableField(value = "status")
    @ApiModelProperty(value="")
    private String status;

    public static final String COL_ID = "id";

    public static final String COL_CID = "cid";

    public static final String COL_UID = "uid";

    public static final String COL_GETID = "getid";

    public static final String COL_BACKID = "backid";

    public static final String COL_OPRICE = "oprice";

    public static final String COL_STATUS = "status";
}