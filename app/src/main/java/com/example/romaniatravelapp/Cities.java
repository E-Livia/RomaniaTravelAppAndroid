package com.example.romaniatravelapp;

public class Cities {
    //instead of using an xml file, i choose to store data in a class
    private City[]cities={
            new City(1,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(2,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(3,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(4,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(5,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(6,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(7,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(8,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(9,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(10,
                    "Sighisoara",
                    "sighisoara1.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region.")

    };

    public City[] getData(){return cities;}
    public City getCity(int i){return cities[i];}
    public int getCount(){return cities.length;}
}
