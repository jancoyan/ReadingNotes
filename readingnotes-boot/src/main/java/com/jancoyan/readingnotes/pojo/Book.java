package com.jancoyan.readingnotes.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author YanJingcun
 * @since 2021-11-19
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("book")
public class Book extends Model<Book> {

    private static final long serialVersionUID = 1L;

    /**
     * 书籍id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 作者
     */
    private String bookAuthor;

    /**
     * 读完的日期
     */
    private Date finishDate;

    /**
     * 字数（个）
     */
    private Integer wordCount;

    /**
     * 出版社名称
     */
    private String bookPublisher;

    /**
     * 书籍类型

     */
    private Integer bookType;

    /**
     * 出版时间
     */
    private Date publishTime;

    private Date gmtCreate;

    private Date gmtModify;

}
