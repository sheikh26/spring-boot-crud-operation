package com.javatpoint.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import com.javatpoint.utilty.CommonUtility;



@Controller
public class SmsController {

       // @GetMapping(value = "/sendSMS")
        @GetMapping("/sendSMS")
        public ResponseEntity<String> sendSMS() {
        	System.out.println("hiiiiiiiiiiiiiiiiiii-");
        	
        	String valouxPropertyFileName = "application.properties";
			Properties prop = new Properties();
			prop = CommonUtility.getProperty(valouxPropertyFileName);
		
			final String ACCOUNT_SID = prop.getProperty("valoux.account.sid");
			final String AUTH_TOKEN = prop.getProperty("valoux.account.token");
			//final String PHONE_NO = prop.getProperty("valoux.account.from.phone.no");
        	
			/*
			 * final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID"); final String
			 * AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
			 */
        	//final String TWILIO_ACCOUNT_SID = "AC5b115e04b4b0670735ae862389a641e1";
        	  // final String TWILIO_AUTH_TOKEN = "f18b04a7b01e69e92ef0ec02dc02ecbc";
               // Twilio.init(System.getenv(ACCOUNT_SID), System.getenv(AUTH_TOKEN));
    			TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
    			//MessageFactory messageFactory = client.getAccount().getMessageFactory();
    			// Build a filter for the MessageList
    			List<NameValuePair> params = new ArrayList<NameValuePair>();
    			params.add(new BasicNameValuePair("Body", "1234"));
    			params.add(new BasicNameValuePair("To", "+919039373108"));
    			params.add(new BasicNameValuePair("From", "+16073605014"));

    			MessageFactory messageFactory = client.getAccount().getMessageFactory();
    			try {
					Message message = messageFactory.create(params);
				} catch (TwilioRestException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*
				 * Message.creator(new PhoneNumber("+919039373108"), new
				 * PhoneNumber("+16073605014"), "Hello from Twilio 📞").create();
				 */

                return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
        }
}
