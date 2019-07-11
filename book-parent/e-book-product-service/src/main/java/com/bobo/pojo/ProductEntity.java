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
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private int id;
    private String name;
    private byte status;
    private int price;
    private String detail;
    private byte deleted;
    private Timestamp createTime;
    private Timestamp updateTime;
}
