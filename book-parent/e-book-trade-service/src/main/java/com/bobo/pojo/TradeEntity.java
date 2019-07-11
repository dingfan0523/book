package com.bobo.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@ApiModel("订单实体")
@Data
@Entity
@NoArgsConstructor
public class TradeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private int orderId;
    private int userId;
    private int price;
    private byte payStatus;
    private byte payType;
    private String gatewayPayNum;
    private Timestamp gatewayPayTime;
    private int gatewayPayPrice;
    private byte deleted;
    private Timestamp createTime;
    private Timestamp updateTime;
}
