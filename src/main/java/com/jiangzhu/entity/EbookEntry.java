package com.jiangzhu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author jiangzhu
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="EbookEntry对象", description="")
public class EbookEntry implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("categoryId")
    private Integer categoryId;

    private String title;

    private String summary;

    private String uploaduser;

    private Date createdate;

    private java.sql.Date createTime;
}
