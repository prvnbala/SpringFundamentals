package repository;

import model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setLastName("Bala");
        speaker.setFirstName("Praveen");
        speakers.add(speaker);

        return speakers;
    }
}
