package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        
        // catching null or empty lists
        if (bpms == null || bpms.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty.");
        }

        // calculating the average
        int avg = 0;
        for (int bpm : bpms)
            avg += bpm;

        // determining the classification
        if (avg < 100)
            return "HIGH";
        else if (avg >= 100 && avg < 140)
            return "LOW";
        else
            return "HIGH";

    }

    public static boolean isValidTrackTitle(String title) {

        for (char c : title.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ')
                return false;
        }

        return true;

    }

    public static int normalizeVolume(int volumeDb) {
       
        if (volumeDb > 100)
            return 100;
        else if (volumeDb < 0)
            return 0;
        else
            return volumeDb;

    }
}
