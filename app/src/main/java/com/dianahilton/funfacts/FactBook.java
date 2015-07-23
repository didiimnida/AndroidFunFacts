package com.dianahilton.funfacts;

import java.util.Random;

public class FactBook {

    //Member variable (properties about the object)
    public String[] mCompliments = {
            "You are like a brown grizzly bear, gently strolling in the forest.",
            "You have the most beautiful cheeks in the universe.",
            "Enchant! Enchant! Enchant!",
            "You are a supermodel.",
            "The sun never sets when you are around because your sunny personality never sets.",
            "Your eagle eyes and big brain spot the best opportunities around.",
            "Always kind, always caring, always hairy.",
            "When the weather outside is frightful, you are still delightful."
    };

    //Method (abilities: things the object can do)
    public String getCompliment(){

        String compliment = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mCompliments.length);

        compliment = mCompliments[randomNumber];

        return compliment;
    }
}
