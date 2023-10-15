package com.artyomka.pw_telegrambot_project.dt;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;


// DTO for working with RFCB API
@XmlRootElement(name = "GetCursOnDateXml", namespace = "http://web.cbr.ru/")
@Data
public class GetCursOnDateXml {
    @XmlElement(name = "On_date", required = true, namespace = "http://web.cbr.ru/")
    protected XMLGregorianCalendar onDate;
}
