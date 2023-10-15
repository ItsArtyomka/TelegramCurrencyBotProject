package com.artyomka.pw_telegrambot_project;

import com.artyomka.pw_telegrambot_project.dt.GetCursOnDateXml;
import com.artyomka.pw_telegrambot_project.dt.GetCursOnDateXmlResult;
import com.artyomka.pw_telegrambot_project.dto.GetCursOnDateXmlResponse;
import com.artyomka.pw_telegrambot_project.dto.ValuteCursOnDate;
import jakarta.xml.soap.MessageFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.SOAPConstants;
import java.nio.charset.StandardCharsets;

// Configuration Class
@Configuration
public class AppConfig {
    @Bean
    public CentralRussianBankService cbrService() throws jakarta.xml.soap.SOAPException {
        CentralRussianBankService cbrService = new CentralRussianBankService();
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        MessageFactory msgFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SaajSoapMessageFactory newSoapMessageFactory = new SaajSoapMessageFactory(msgFactory);
        cbrService.setMessageFactory(newSoapMessageFactory);

        jaxb2Marshaller.setClassesToBeBound(
                GetCursOnDateXml.class,
                GetCursOnDateXmlResponse.class,
                GetCursOnDateXmlResult.class,
                ValuteCursOnDate.class);

        cbrService.setMarshaller(jaxb2Marshaller);
        cbrService.setUnmarshaller(jaxb2Marshaller);
        return cbrService;
    }

    @Bean
    public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding(StandardCharsets.UTF_8.name());
        filter.setForceEncoding(true);
        return filter;
    }
}
