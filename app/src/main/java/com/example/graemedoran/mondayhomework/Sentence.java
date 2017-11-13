package com.example.graemedoran.mondayhomework;

/**
 * Created by graemedoran on 13/11/2017.
 */

public class Sentence {

    public Sentence() {

    }

        public int Count(String sentence){
        String[] Words=sentence.split(" ");
        return (Words.length);

    }

}
