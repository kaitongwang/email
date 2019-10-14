# email

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-mail</artifactId>
    </dependency>`
`
   # 在yml 文件配置`

        `spring:
          mail:
            host: smtp.qq.com  服务地址
            username: 1825793811@qq.com  用户账户
            password: *********** 用户密码
            default-encoding: utf-8` 格式

   # 发送邮件。发送者地址写死，可以使用继承的关系

        `public class KtwSimpleMailMessage extends SimpleMailMessage {
            public KtwSimpleMailMessage() {
                super();
                this.setFrom("1825793811@qq.com");
            }
        }`

   # 实现发送邮件
            `SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage .setSentDate(new Date());
            simpleMailMessage.setFrom(configValue.sendMailAddress);
            simpleMailMessage.setTo(sendReqVo.getEmailAddress());
            simpleMailMessage.setSubject(sendReqVo.getTitle());
            simpleMailMessage.setText(sendReqVo.getText());
            javaMailSender.send(simpleMailMessage);`