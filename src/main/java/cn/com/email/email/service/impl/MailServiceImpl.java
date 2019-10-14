package cn.com.email.email.service.impl;

import cn.com.email.email.domain.config.ConfigValue;
import cn.com.email.email.domain.vo.KtwSimpleMailMessage;
import cn.com.email.email.domain.vo.SendReqVo;
import cn.com.email.email.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName : MailServiceImpl
 * @description :
 * @Author : wangkaitong
 * @Date : 2019/10/14
 * @Version : 1.0
 * @Since : 1.0
 * @Copyright : 四川去哪游科技有限公司
 */
@Service
public class MailServiceImpl implements MailService {


    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private ConfigValue configValue;


    @Override
    public String send(SendReqVo sendReqVo) {
        try {
            System.out.println("发送邮件请求实体为："+sendReqVo.toString());

            System.out.println("发送者为："+configValue.sendMailAddress);

            KtwSimpleMailMessage simpleMailMessage = new KtwSimpleMailMessage();
            simpleMailMessage.setSentDate(new Date());
            simpleMailMessage.setTo(sendReqVo.getEmailAddress());
            simpleMailMessage.setSubject(sendReqVo.getTitle());
            simpleMailMessage.setText(sendReqVo.getText());
            javaMailSender.send(simpleMailMessage);
            return "发送成功";
        } catch (Exception e) {
            System.out.println("出现异常，异常原因为："+e.getMessage());
            e.printStackTrace();
            return "发送失败";
        }
    }
}
