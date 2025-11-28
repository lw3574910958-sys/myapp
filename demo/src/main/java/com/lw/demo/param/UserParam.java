// UserParam.java
package com.lw.demo.param;

import io.swagger.v3.oas.annotations.media.Schema; // 替换为 SpringDoc 注解
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * user.
 *
 * @author pdai
 */
@Data
@Builder
@Schema(name = "User", description = "用户参数") // 替换 @ApiModel
public class UserParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "{user.msg.userId.notEmpty}")
    @Schema(description = "用户ID") // 可添加字段描述
    private String userId;

    @NotEmpty(message = "email could not be empty")
    @Email(message = "invalid email")
    @Schema(description = "邮箱")
    private String email;

    @NotEmpty(message = "cardNo could not be empty")
    @Pattern(regexp = "^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$", message = "invalid ID")
    @Schema(description = "身份证号")
    private String cardNo;

    @NotEmpty(message = "could not be empty")
    @Length(min = 1, max = 10, message = "nick name should be 1-10")
    @Schema(description = "昵称")
    private String nickName;

    @Range(min = 0, max = 1, message = "sex should be 0-1")
    @Schema(description = "性别")
    private int sex;

    @Max(value = 100, message = "Please input valid age")
    @Schema(description = "年龄")
    private int age;

    @Valid
    @Schema(description = "地址信息")
    private AddressParam address;

}
