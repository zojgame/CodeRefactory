package com.rvafin.springjwt.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.rvafin.springjwt.models.History;
import com.rvafin.springjwt.payload.response.HistoryDTO;
import org.springframework.stereotype.Component;

@Component
public class HistoryMapper {
    Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public HistoryDTO mapToHistoryDTO(History history){
        HistoryDTO historyDTO = mapper.map(history, HistoryDTO.class);
        return historyDTO;
    }
}
