package org.hemmersonrosa.servicos;

import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.ws.Endpoint;
import org.hemmersonrosa.daos.VideoDAO;
import org.hemmersonrosa.modelos.Video;

import java.util.List;

@WebService
public class VideoService {

    @WebResult(name = "video")
    public List<Video> listarVideos(){
        VideoDAO videoDAO = obterDao();
        return videoDAO.listarVideos();
    }

    public void criarVideo(@WebParam(name = "video") Video video) throws SOAPException {
        obterDao().criarVideo(video);
    }


    private VideoDAO obterDao() {
        return new VideoDAO();
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/videos", new VideoService());
        System.out.println("Serviço inicializado");
    }
}
