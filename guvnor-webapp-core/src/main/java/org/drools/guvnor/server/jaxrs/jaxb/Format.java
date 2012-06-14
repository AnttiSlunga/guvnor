package org.drools.guvnor.server.jaxrs.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "format")
@XmlAccessorType(XmlAccessType.FIELD)
public class Format {
    @XmlElement
    private String value;
    public String getValue() {
        return value;  //To change body of created methods use File | Settings | File Templates.
    }

    public void setValue(String format) {
        value = format;
    }
}