
package com.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.5.0
 * Thu Sep 29 10:07:54 CEST 2016
 * Generated source version: 2.5.0
 */

@XmlRootElement(name = "getUsuario", namespace = "http://service.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsuario", namespace = "http://service.com/")

public class GetUsuario {

    @XmlElement(name = "arg0")
    private long arg0;

    public long getArg0() {
        return this.arg0;
    }

    public void setArg0(long newArg0)  {
        this.arg0 = newArg0;
    }

}
