package com.rfa;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new VideoDatabase(),
                new EmailService()
        );

        processor.process(video);
    }
}

/**
 * In this the Interfaces are made and method override takes place in the classes
 * Loose coupling and dependency injection is done here.
 *
 *
 *
 */