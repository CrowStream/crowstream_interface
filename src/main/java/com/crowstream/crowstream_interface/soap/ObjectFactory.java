
package com.crowstream.crowstream_interface.soap;

import javax.xml.bind.annotation.*;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the crowstream package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: crowstream
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVideoRequest }
     * 
     */
    public GetVideoRequest createGetVideoRequest() {
        return new GetVideoRequest();
    }

    /**
     * Create an instance of {@link GetVideoResponse }
     * 
     */
    public GetVideoResponse createGetVideoResponse() {
        return new GetVideoResponse();
    }

    /**
     * Create an instance of {@link Video }
     * 
     */
    public Video createVideo() {
        return new Video();
    }

}
