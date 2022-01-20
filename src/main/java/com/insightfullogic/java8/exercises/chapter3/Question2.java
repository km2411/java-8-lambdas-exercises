package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;

public class Question2 {
    // Q3
    public static int countBandMembersInternal(List<Artist> artists) {
//        int totalMembers = 0;
//        for (Artist artist : artists) {
//            Stream<Artist> members = artist.getMembers();
//            totalMembers += members.count();
//        }
        return artists.stream()
                .map(artist -> artist.getMembers().count())
                .reduce(0L, Long::sum)
                .intValue();
    }
}
