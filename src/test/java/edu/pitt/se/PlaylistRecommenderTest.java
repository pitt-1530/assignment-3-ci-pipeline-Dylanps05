package edu.pitt.se;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PlaylistRecommenderTest {

    // classifyEnergy tests
    @Test
    public void classifyEnergyHigh() {
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(List.of(130, 150, 180)));
    }

     @Test
    public void classifyEnergyMedium() {
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(List.of(105, 90, 135)));
    }

     @Test
    public void classifyEnergyLow() {
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(List.of(80, 90, 100)));
    }

    // isValidTrackTitle tests
    @Test
    public void ValidTrackTitle() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("This is a track title"));
    }

    @Test
    public void InvalidTrackTitle() {
        assertFalse(PlaylistRecommender.isValidTrackTitle("This is a track title!!!"));
    }

    // normalizeVolume tests
    @Test
    public void normalizeVolumeHigh() {
        assertEquals(100, PlaylistRecommender.normalizeVolume(110));
    }

    public void normalizeVolumeHLow() {
        assertEquals(0, PlaylistRecommender.normalizeVolume(-3));
    }

    public void normalizeVolumeNormal() {
        assertEquals(54, PlaylistRecommender.normalizeVolume(54));
    }

}
