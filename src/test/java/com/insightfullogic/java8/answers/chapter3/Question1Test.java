package com.insightfullogic.java8.answers.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import com.insightfullogic.java8.exercises.chapter3.Question1;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static com.insightfullogic.java8.examples.chapter1.SampleData.aLoveSupreme;
import static com.insightfullogic.java8.examples.chapter1.SampleData.manyTrackAlbum;
import static com.insightfullogic.java8.examples.chapter1.SampleData.sampleShortAlbum;
import static com.insightfullogic.java8.exercises.chapter3.Question1.addUp;
import static com.insightfullogic.java8.exercises.chapter3.Question1.getNamesAndOrigins;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Question1Test {

    @Test
    public void addsEmptyList() {
        int result = addUp(Stream.empty());
        assertEquals(0, result);
    }

    @Test
    public void addsListWithValues() {
        int result = addUp(Stream.of(1, 3, -2));
        assertEquals(2, result);
    }

    @Test
    public void extractsNamesAndOriginsOfArtists() {
        List<String> namesAndOrigins = getNamesAndOrigins(SampleData.getThreeArtists());
        assertEquals(asList("John Coltrane", "US", "John Lennon", "UK", "The Beatles", "UK"), namesAndOrigins);
    }

    @Test
    public void findsShortAlbums() {
        List<Album> input = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        List<Album> result = Question1.getAlbumsWithAtMostThreeTracks(input);
        assertEquals(asList(sampleShortAlbum, aLoveSupreme), result);
    }

}
