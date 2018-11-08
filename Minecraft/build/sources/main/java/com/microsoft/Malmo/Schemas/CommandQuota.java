//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.10 at 03:51:00 PM EDT 
//


package com.microsoft.Malmo.Schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Set up a quota for a group of commands. {{{AgentQuitFromReachingCommandQuota}}} will fire once the quota is exceeded.
 *       
 * 
 * <p>Java class for CommandQuota complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandQuota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="commands" use="required" type="{http://ProjectMalmo.microsoft.com}CommandList" />
 *       &lt;attribute name="quota" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandQuota")
public class CommandQuota {

    @XmlAttribute(name = "commands", required = true)
    protected List<String> commands;
    @XmlAttribute(name = "quota", required = true)
    protected int quota;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the commands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommands() {
        if (commands == null) {
            commands = new ArrayList<String>();
        }
        return this.commands;
    }

    /**
     * Gets the value of the quota property.
     * 
     */
    public int getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     */
    public void setQuota(int value) {
        this.quota = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        if (description == null) {
            return "";
        } else {
            return description;
        }
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
