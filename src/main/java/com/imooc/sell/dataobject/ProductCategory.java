package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 商品类型实体类
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /**类目ID */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**类目名称 */
    private String categoryName;

    /**类目类型 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory(){

    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
