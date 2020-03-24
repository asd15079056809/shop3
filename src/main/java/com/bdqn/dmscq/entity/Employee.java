package com.bdqn.dmscq.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Employee implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private Integer age;

    private String gender;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer deleted;


}
