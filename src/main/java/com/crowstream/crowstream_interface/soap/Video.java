
package com.crowstream.crowstream_interface.soap;

import javax.xml.bind.annotation.*;

/**
 * <p>Java class for video complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="video"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="video_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="release_year" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "video", namespace = "http://www.baeldung.com/springsoap/gen", propOrder = {
    "id",
    "videoName",
    "releaseYear"
})
public class Video {

    @XmlElement(namespace = "http://www.baeldung.com/springsoap/gen")
    protected int id;
    @XmlElement(name = "video_name", namespace = "http://www.baeldung.com/springsoap/gen", required = true)
    protected String videoName;
    @XmlElement(name = "release_year", namespace = "http://www.baeldung.com/springsoap/gen", required = true)
    protected String releaseYear;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the videoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * Sets the value of the videoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoName(String value) {
        this.videoName = value;
    }

    /**
     * Gets the value of the releaseYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseYear() {
        return releaseYear;
    }

    /**
     * Sets the value of the releaseYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseYear(String value) {
        this.releaseYear = value;
    }

}
