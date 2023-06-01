package com.driver.test;

import com.driver.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Application.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestCases {

    @Test
    public void addUser() throws Exception {
        SpotifyController spotifyController=new SpotifyController();
        spotifyController.createUser("naaz","1234");
        spotifyController.createArtist("shiv");
        spotifyController.createAlbum("Dream","raju");
        spotifyController.createSong("Jadu","Dream",5);
        spotifyController.createPlaylistOnLength("1234","playlist1",5);
       List<String > list=new ArrayList<String>();
       list.add("Jadu");
        spotifyController.createPlaylistOnName("1234","playlist2",list);
       spotifyController.findPlaylist("1234","playlist1");
        spotifyController.likeSong("1234","Jadu");
        String check=spotifyController.mostPopularSong();

        assertEquals("Jadu",check);
    }

}
