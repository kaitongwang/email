package cn.com.email.email.domain.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName : ConfigValue
 * @description :
 * @Author : wangkaitong
 * @Date : 2019/10/14
 * @Version : 1.0
 * @Since : 1.0
 * @Copyright : 四川去哪游科技有限公司
 */
@Component
public class ConfigValue {
    /**
     *   swagger:
     *     contact:
     *       email
     */
    @Value("${spring.mail.username}")
    public String sendMailAddress;


}
