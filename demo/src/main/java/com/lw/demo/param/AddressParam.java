// AddressParam.java
package com.lw.demo.param;

import io.swagger.v3.oas.annotations.media.Schema; // 替换为 SpringDoc 注解
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * address.
 *
 * @author pdai
 */
@Data
@Builder
@AllArgsConstructor
@Schema(name = "Address", description = "地址参数") // 替换 @ApiModel
public class AddressParam {

    @Schema(description = "城市")
    private String city;

    @Schema(description = "邮编")
    private String zipcode;
}
