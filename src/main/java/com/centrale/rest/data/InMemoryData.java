package com.centrale.rest.data;

import com.centrale.rest.domain.Profile;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Getter
@NoArgsConstructor
public class InMemoryData {

    ConcurrentHashMap<Long, Integer> occurrences = new ConcurrentHashMap<>();
    ArrayList<Profile> profiles = new ArrayList<>();

}
