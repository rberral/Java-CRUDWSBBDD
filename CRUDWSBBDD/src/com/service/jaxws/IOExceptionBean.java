
package com.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.5.0
 * Thu Sep 29 10:07:54 CEST 2016
 * Generated source version: 2.5.0
 */

@XmlRootElement(name = "IOException", namespace = "http://io.java/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IOException", namespace = "http://io.java/")

public class IOExceptionBean {

    private java.lang.String message;

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}

