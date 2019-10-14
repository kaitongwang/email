package cn.com.email.email.web;

import cn.com.email.email.domain.vo.SendReqVo;
import cn.com.email.email.service.MailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : MailController
 * @description : 发送邮件
 * @Author : wangkaitong
 * @Date : 2019/10/14
 * @Version : 1.0
 * @Since : 1.0
 * @Copyright : 四川去哪游科技有限公司
 */

@Api(description = "发送邮件api")
@RestController
@RequestMapping("/mail")
public class MailController {


    @Autowired
    private MailService mailService;

    @ApiOperation("发送邮件api")
    @PostMapping("/send")
    public String  send(@RequestBody SendReqVo sendReqVo){
        return mailService.send(sendReqVo);
    }

}
