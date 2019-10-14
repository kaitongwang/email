package cn.com.email.email.service;

import cn.com.email.email.domain.vo.SendReqVo;

/**
 * @ClassName : MailService
 * @description : 发送邮件
 * @Author : wangkaitong
 * @Date : 2019/10/14
 * @Version : 1.0
 * @Since : 1.0
 * @Copyright : 四川去哪游科技有限公司
 */
public interface MailService {


    String  send(SendReqVo sendReqVo);
}
