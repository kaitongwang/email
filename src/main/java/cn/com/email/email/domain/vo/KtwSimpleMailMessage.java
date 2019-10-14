package cn.com.email.email.domain.vo;

import org.springframework.mail.SimpleMailMessage;

/**
 * @ClassName : KtwSimpleMailMessage
 * @description :
 * @Author : wangkaitong
 * @Date : 2019/10/14
 * @Version : 1.0
 * @Since : 1.0
 * @Copyright : 四川去哪游科技有限公司
 */
public class KtwSimpleMailMessage extends SimpleMailMessage {
    public KtwSimpleMailMessage() {
        super();
        this.setFrom("1825793811@qq.com");
    }
}
