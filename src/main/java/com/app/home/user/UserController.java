package com.app.home.user;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user/*")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("usernum")
	public String getNum()throws Exception{
		return "user/usernum";
	}
	
	@RequestMapping("setID")
	public ModelAndView setID(UserVO userVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		userVO = userService.setUserID(userVO);
		String jsonResult="{\"result\":\""+userVO.getId()+"\"}";
		mv.addObject("result", jsonResult);
		mv.setViewName("common/ajaxResult");
		return mv;
	}
	
//	@RequestMapping("mail")
//	public ModelAndView setMail(MailVO mailVO)throws Exception{
//		ModelAndView mv = new ModelAndView();
//		
//		String user = "gogkgngg@gmail.com";
//		String password = "6412fd099123!";
//		
//		Properties prop = new Properties();
//		prop.put("mail.smtp.host", "smtp.gmail.com"); 
//		prop.put("mail.smtp.port", "465"); 
//		prop.put("mail.smtp.auth", "true"); 
//		prop.put("mail.smtp.ssl.enable", "true"); 
//		prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//		
//		Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(user, password);
//            }
//        });
//		
//		String receiver = "gogkgxgg@naver.com"; // 메일 받을 주소
//		String title = "테스트 메일입니다.";
//		String content = "<h2 style='color:blue'>안녕하세요</h2>";
//		Message message = new MimeMessage(session);
//		try {
//			message.setFrom(new InternetAddress("gogkgnggl@gmail.com", "관리자", "utf-8"));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
//			message.setSubject(title);
//			message.setContent(content, "text/html; charset=utf-8");
//
//			Transport.send(message);
//        } catch (AddressException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (MessagingException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//		mv.setViewName("redirect:./usernum");
//		return mv;
//	}
	

}
