package soap.service.endpoint;


import exhibition.soapservice.GetExhibitionRequest;
import exhibition.soapservice.GetExhibitionResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import soap.service.repository.ExhibitionRepository;

@Endpoint
public class ExhibitionEndpoint {
    private static final String NAMESPACE_URI = "http://soapService.exhibition";

    private ExhibitionRepository exhibitionRepository;

    public ExhibitionEndpoint(ExhibitionRepository exhibitionRepository) {
        this.exhibitionRepository = exhibitionRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getExhibitionRequest")
    @ResponsePayload
    public GetExhibitionResponse getExhibition(@RequestPayload GetExhibitionRequest request) {
        GetExhibitionResponse response = new GetExhibitionResponse();
        response.setExhibition(exhibitionRepository.findById(request.getId()));

        return response;
    }
}
