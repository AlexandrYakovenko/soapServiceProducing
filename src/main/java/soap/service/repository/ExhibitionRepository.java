package soap.service.repository;

import org.springframework.stereotype.Component;
import soap.service.entity.Exhibition;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class ExhibitionRepository {
    private static  final Map<Long, Exhibition> mapEntities = new HashMap<>();

    @PostConstruct
    public void initData() {
        Exhibition exhibition1 = new Exhibition(1L, "Games");
        Exhibition exhibition2 = new Exhibition(2L, "Furs");
        Exhibition exhibition3 = new Exhibition(3L, "Marvel");
        Exhibition exhibition4 = new Exhibition(4L, "Channel");

        mapEntities.put(exhibition1.getId(), exhibition1);
        mapEntities.put(exhibition2.getId(), exhibition2);
        mapEntities.put(exhibition3.getId(), exhibition3);
        mapEntities.put(exhibition4.getId(), exhibition4);
    }

    public Exhibition findById(Long id) {
        if (id == null) throw new IllegalStateException();
        return mapEntities.get(id);
    }
}
