package com.example.romaniatravelapp;

import android.widget.ImageView;

public class Cities {
    //instead of using an xml file, i choose to store data in a class
    private City[]cities={
            new City(1,
                    "Sighisoara",
                    "sighisoara.jpg",
                    "sighisoara1.jpg",
                    "sighisoara2.jpg",
                    "sighisoara3.jpg",
                    "https://en.wikipedia.org/wiki/Sighi%C8%99oara",
                    "Attractions:\n" +
                            "Citadel Square,\nSighisoara's Clock Tower,\nThe Hill Church",
                    "Sighisoara has a special charm that cannot be described in " +
                            "words. It is a place full of history, where the tourist attr" +
                            "actions are telling stories that are hundreds of years old, " +
                            "marking the evolution of civilization in the Transylvania region."),
            new City(2,
                    "Brasov",
                    "brasov.jpg",
                    "brasov1.jpg",
                    "brasov2.jpg",
                    "brasov3.jpg",
                    "en.wikipedia.org/wiki/Bra%C8%99ov",
                    "Attractions:\nBrasov Historical Center,\nBlack Church,\nCatherine's Gate",
                    "Brasov is one of the most beautiful and visited cities in Romania. " +
                            "It has a rich mix of history, culture, urban fun, and impressive Carpathians’ surroundings. " +
                            "A top tourist attraction, the city has a great location, " +
                            "less than three hours by train from Bucharest, Sibiu, and Sighisoara."),
            new City(3,
                    "Sibiu",
                    "sibiu.jpg",
                    "sibiu1.jpg",
                    "sibiu2.jpg",
                    "sibiu3.jpg",
                    "en.wikipedia.org/wiki/Sibiu",
                    "Attractions:\nThe Big Square,\nAstra Museum,\nBridge of Lies",
                    "Sibiu is one of the most charming city in Romania, a place defined by its joie de vivre and soothing atmosphere in summer and fairy-like Christmas Market in winter." +
                            "Surrounded by wonderful landscapes and a bucolic countryside, the city is a magnet for visitors from all over the world who come to walk on its cobbled streets, admire its colourful buildings and Baroque squares, and discover the traditional architecture in the ASTRA Folk Museum. However, Sibiu is not only defined by what you see today but also by its captivating history. Here are some interesting facts about the city’s old days."),
            new City(4,
                    "Bucuresti",
                    "bucuresti.jpg",
                    "bucuresti1.jpg",
                    "bucuresti2.jpg",
                    "bucuresti3.jpg",
                    "en.wikipedia.org/wiki/Bucharest",
                    "Attractions:\nPalace pf Parliament,\nNational Village Museum,\nHerastrau Park,\nNational Museum of Romanian History",
                    "Bucharest is the capital and largest city of Romania. It is described as the cultural, financial, entertainment, and media center in the country with a significant influence in Eastern and Southeastern Europe as well. It is also a city with a significant influence in terms of education, tourism, research, technology, health care, art, fashion, sports, and politics." +
                            "Bucharest is, without a doubt, an unforgettable experience for those who visit it, whether they are city dwellers or tourists. At the level of impressions, things tend to become eclectic, but this aspect is what really arouses the fascination for those who discover the most important attractions to visit in Bucharest."),
            new City(5,
                    "Suceava",
                    "suceava.jpg",
                    "suceava1.jpg",
                    "suceava2.jpg",
                    "suceava3.jpg",
                    "en.wikipedia.org/wiki/Suceava",
                    "Attractions:\nFortress of Suceava,\nPainted Monasteries of Bukovina,\nMuseum of Natural Sciences",
                    "A city loaded with history and culture, Suceava was the throne of the Medieval Principality of Moldavia until the 1565. You can step inside the churches where the princes were crowned and see the unconquerable fortress they built to repel the Ottomans.\n" +
                            "\n" +
                            "Suceava is also the jumping-off point for trips around the painted monasteries of Bukovina. These are eight UNESCO World Heritage churches with Byzantine architecture and beautiful murals on their outer walls. One is right here in Suceava, while the others will require a drive. But even if you stay put in Suceava there’s lots more to see, like a quaint outdoor village museum opening a window on life in the Bukovina region."),
            new City(6,
                    "Cluj-Napoca",
                    "clujnapoca.jpg",
                    "clujnapoca1.jpg",
                    "clujnapoca2.jpg",
                    "clujnapoca3.jpg",
                    "https://www.romaniaexperience.com/things-to-see-and-do-in-cluj-napoca/",
                    "Attractions:\nSt Michael's Church,\nArt Museum,\nBotanical Garden",
                    "A city loaded with history and culture, Suceava was the throne of the Medieval Principality of Moldavia until the 1565. You can step inside the churches where the princes were crowned and see the unconquerable fortress they built to repel the Ottomans.\n" +
                            "\n" +
                            "Suceava is also the jumping-off point for trips around the painted monasteries of Bukovina. These are eight UNESCO World Heritage churches with Byzantine architecture and beautiful murals on their outer walls. One is right here in Suceava, while the others will require a drive. But even if you stay put in Suceava there’s lots more to see, like a quaint outdoor village museum opening a window on life in the Bukovina region."),
            new City(7,
                    "Constanta",
                    "constanta.jpg",
                    "constanta1.jpg",
                    "constanta2.jpg",
                    "constanta3.jpg",
                    "https://www.romaniaexperience.com/top-things-to-see-and-do-in-constanta-romania/",
                    "Attractions:\nConstanta Casino,\nThe Tower of the Grand Mosque of Constanta,\nCathedral of Saints Peter & Paul",
                    "Constanta, historically known as Tomis, is Romania’s largest port on the Black Sea coast and a popular destination for summer holidays.\n" +
                            "Each city has its own old town area and it’s usually one of the main attractions. Constanta’s old town makes no exception, as this is where you will find most of the attractions below.\n" +
                            "\n" +
                            "But walking around the old town area, starting from the City Hall and ending by the sea near the Tomis Touristic port is something that has to be done.\n" +
                            "\n" +
                            "You will explore the old streets and enjoy the architecture, but also the Capitoline Wolf where, during the summer season, you’ll have a small Roman guar area set up there and enjoy the hourly change of guards."),
            new City(8,
                    "Iasi",
                    "iasi.jpg",
                    "iasi1.jpg",
                    "iasi2.jpg",
                    "iasi3.jpg",
                    "https://www.romaniaexperience.com/top-things-to-see-and-do-in-iasi-romania/",
                    "Attractions:\nCopou Park,\nThe Iasi Botanical Garden,\nIasi Metropolitan Cathedral",
                    "Iasi is a city loaded with history, beautiful architecture, nature and greenery. It doesn’t matter if you are here for one day or for one week, you will definitely find many interesting things to do and see.\n" +
                            "Today, the city offers an impressive mixture of old and new buildings, recreational areas in and around the city, as well as many other attractions that make it a perfect destinations for those interested in visiting Romania."),
            new City(9,
                    "Oradea",
                    "oradea.jpg",
                    "oradea1.jpg",
                    "oradea2.jpg",
                    "oradea3.jpg",
                    "https://www.romaniaexperience.com/top-things-to-do-in-oradea/",
                    "Attractions:\nOradea Citadel,\nBlack Eagle Palace,\nNymphaea Aquapark",
                    "Oradea is one of the most beautiful and fastest growing cities in Romania. From beautiful old buildings that have a unique classical charm, to modern structures, Oradea has a lot to offer to its visitors. An amazing citadel, churches, a palace and an aquapark are just some of the top things we’re going to talk about today.\n" +
                            "\n" +
                            "It’s also worth noting that Oradea is the only Romanian city that is part of the international network of Art Nouveau cities. So if you’re a fan of this style, you’ll have an extra reason to love the city."),
            new City(10,
                    "Alba-Iulia",
                    "alba_iulia.jpg",
                    "alba_iulia1.jpg",
                    "alba_iulia2.jpg",
                    "alba_iulia3.jpg",
                    "https://romaniatourism.com/alba-iulia.html",
                    "Attractions:\nUnion Museum,\nThe prison cells of Horea and Crișan,\nAlba Iulia Fortress",
                    "Alba Iulia or ‘the other capital’ is one of the most interesting travel destinations in Romania. " +
                            "Its wonderful citadel has enough attractions to keep you occupied for a full day, " +
                            "and the entire Alba county is a labyrinth of ancient and medieval monuments, " +
                            "caves and mountains, beautiful villages, and plenty of options for having fun.\n" +
                            "One of the oldest settlements in Romania, known in ancient time as Apulum, " +
                            "Alba Iulia served as the largest military and economic center during the Roman occupation. " +
                            "Temples, mosaics, thermae and statues, amphitheaters, the governor's palace \"Daciarum Trium\" – " +
                            "all rendered the original Dacian Apulul as the miniature copy of the mother Rome.")

    };

    public City[] getData(){return cities;}
    public City getCity(int i){return cities[i];}
    public int getCount(){return cities.length;}
}
