package cn.com.email.email.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName : SendReqVo
 * @description : 发送邮件实体
 * @Author : wangkaitong
 * @Date : 2019/10/14
 * @Version : 1.0
 * @Since : 1.0
 * @Copyright : 四川去哪游科技有限公司
 */
@Data
@ApiModel("发送邮件请求实体")
public class SendReqVo {

    @ApiModelProperty("邮件地址")
    private String emailAddress;

    @ApiModelProperty("邮件标题")
    private String title;

    @ApiModelProperty("邮件内容")
    private String text;

}
