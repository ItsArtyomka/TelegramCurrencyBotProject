package com.artyomka.pw_telegrambot_project.dto;

import com.artyomka.pw_telegrambot_project.dt.GetCursOnDateXmlResult;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetCursOnDateXMLResponse", namespace = "http://web.cbr.ru/")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class GetCursOnDateXmlResponse {
    @XmlElement(name = "GetCursOnDateXmlResult", namespace = "http://web.cbr.ru/")
    private GetCursOnDateXmlResult getCursOnDateXmlResult;
}
