package com.jancoyan.readingnotes.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("book_note")
public class BookNote extends Model<BookNote> {

    private static final long serialVersionUID = 1L;

    /**
     * 书籍id，boot_type的主键
     */
    private Integer bookId;

    /**
     * MD格式的文件
     */
    private String noteMd;

    /**
     * HTML格式的文件
     */
    private String noteHtml;

    /**
     * 字段创建日期
     */
    private Date gmtCreate;

    /**
     * 字段更新日期
     */
    private Date gmtModify;


}
