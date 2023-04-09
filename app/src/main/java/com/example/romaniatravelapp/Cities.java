package com.example.romaniatravelapp;

public class Cities {
    //instead of using an xml file, i choose to store data in a class
    private City[]cities={
            new City(1,
                    "Sighisoara",
                    "sighisoara.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Citadel Square, Sighisoara's Clock Tower, The Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(2,
                    "Brasov",
                    "brasov.jpg",
                    "en.wikipedia.org/wiki/Bra%C8%99ov",
                    "Brasov Historical Center, Black Church, Catherine's Gate",
                    "Brasov is one of the most beautiful and visited cities in Romania. " +
                            "It has a rich mix of history, culture, urban fun, and impressive Carpathians’ surroundings. " +
                            "A top tourist attraction, the city has a great location, " +
                            "less than three hours by train from Bucharest, Sibiu, and Sighisoara."),
            new City(3,
                    "Sibiu",
                    "sibiu.jpg",
                    "en.wikipedia.org/wiki/Sibiu",
                    "The Big Square, Astra Museum, Bridge of Lies",
                    "Sibiu is one of the most charming city in Romania, a place defined by its joie de vivre and soothing atmosphere in summer and fairy-like Christmas Market in winter." +
                            "Surrounded by wonderful landscapes and a bucolic countryside, the city is a magnet for visitors from all over the world who come to walk on its cobbled streets, admire its colourful buildings and Baroque squares, and discover the traditional architecture in the ASTRA Folk Museum. However, Sibiu is not only defined by what you see today but also by its captivating history. Here are some interesting facts about the city’s old days."),
            new City(4,
                    "Bucuresti",
                    "bucuresti.jpg",
                    "en.wikipedia.org/wiki/Bucharest",
                    "",
                    ""),
            new City(5,
                    "Suceava",
                    "suceava.jpg",
                    "en.wikipedia.org/wiki/Suceava",
                    "",
                    ""),
            new City(6,
                    "Cluj-Napoca",
                    "clujnapoca.jpg",
                    "en.wikipedia.org/wiki/Cluj-Napoca",
                    "",
                    ""),
            new City(7,
                    "Constanta",
                    "constanta.jpg",
                    "en.wikipedia.org/wiki/Constan%C8%9Ba",
                    "",
                    ""),
            new City(8,
                    "Iasi",
                    "iasi.jpg",
                    "en.wikipedia.org/wiki/Ia%C8%99i",
                    "",
                    ""),
            new City(9,
                    "Oradea",
                    "oradea.jpg",
                    "en.wikipedia.org/wiki/Oradea",
                    "",
                    ""),
            new City(10,
                    "Alba-Iulia",
                    "alba_iulia.jpg",
                    "en.wikipedia.org/wiki/Alba_Iulia",
                    "",
                    "")

    };

    public City[] getData(){return cities;}
    public City getCity(int i){return cities[i];}
    public int getCount(){return cities.length;}
}
