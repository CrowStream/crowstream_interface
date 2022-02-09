package com.crowstream.crowstream_interface.repositories;

import com.crowstream.crowstream_interface.soap.Video;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.MonoGraphQLClient;
import com.netflix.graphql.dgs.client.WebClientGraphQLClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Component
public class VideoRepository {

    @Value("${crowstream.proxy.url}")
    private String proxyUrl;

    public Video findVideo(int id) {
        WebClient webClient = WebClient.create(proxyUrl);
        WebClientGraphQLClient client = MonoGraphQLClient.createWithWebClient(webClient);
        Mono<GraphQLResponse> graphQLResponseMono = client.reactiveExecuteQuery(
                "query{\n" +
                        "  retrieveVideoById(videoId: " + id + " ){\n" +
                        "    id,\n" +
                        "  \tvideo_name,\n" +
                        "    release_year\n" +
                        "  }\n" +
                        "}\n");
        Map<String, Object> somefield = (Map<String, Object>) graphQLResponseMono.map(r -> r.extractValue("data.retrieveVideoById")).block();
        Video video = new Video();
        assert somefield != null;
        video.setId((Integer) somefield.get("id"));
        video.setVideoName((String) somefield.get("video_name"));
        video.setReleaseYear(((Integer) somefield.get("release_year")) + "");
        return video;
    }
}
