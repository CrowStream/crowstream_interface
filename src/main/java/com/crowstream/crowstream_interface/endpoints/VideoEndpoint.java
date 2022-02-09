package com.crowstream.crowstream_interface.endpoints;

import com.crowstream.crowstream_interface.repositories.VideoRepository;
import com.crowstream.crowstream_interface.soap.GetVideoRequest;
import com.crowstream.crowstream_interface.soap.GetVideoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class VideoEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    private final VideoRepository videoRepository;

    @Autowired
    public VideoEndpoint(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getVideoRequest")
    @ResponsePayload
    public GetVideoResponse getVideo(@RequestPayload GetVideoRequest request) {
        GetVideoResponse response = new GetVideoResponse();
        response.setVideo(videoRepository.findVideo(request.getId()));
        return response;
    }

}
