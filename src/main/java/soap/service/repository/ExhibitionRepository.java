package soap.service.repository;

import exhibition.soapservice.Exhibition;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class ExhibitionRepository {
    private static  final Map<Long, Exhibition> mapEntities = new HashMap<>();

    @PostConstruct
    public void initData() {
        Exhibition exhibition1 = new Exhibition();
        exhibition1.setId(1L);
        exhibition1.setTitle("Games");
        mapEntities.put(exhibition1.getId(), exhibition1);

        Exhibition exhibition2 = new Exhibition();
        exhibition1.setId(2L);
        exhibition1.setTitle("Furs");
        mapEntities.put(exhibition2.getId(), exhibition2);

        Exhibition exhibition3 = new Exhibition();
        exhibition1.setId(3L);
        exhibition1.setTitle("Marvel");
        mapEntities.put(exhibition3.getId(), exhibition3);

        Exhibition exhibition4 = new Exhibition();
        exhibition1.setId(4L);
        exhibition1.setTitle("Channel");
        mapEntities.put(exhibition4.getId(), exhibition4);
    }

    public Exhibition findById(Long id) {
        if (id == null) throw new IllegalStateException();
        return mapEntities.get(id);
    }
}
