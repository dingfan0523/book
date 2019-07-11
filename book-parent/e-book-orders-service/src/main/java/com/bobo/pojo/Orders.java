package com.bobo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@ApiModel("订单实体")
@Data
@Entity
@NoArgsConstructor
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @ApiModelProperty("id")
    private int id;
    @ApiModelProperty("商品id")
    private int productId;
    @ApiModelProperty("价格")
    private Integer price;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("tradeId")
    private Integer tradeId;
    @ApiModelProperty("状态")
    private Byte tradeStatus;
    @ApiModelProperty("删除状态")
    private byte deleted;
    @CreatedDate
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;
    @LastModifiedDate
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp updateTime;

}
