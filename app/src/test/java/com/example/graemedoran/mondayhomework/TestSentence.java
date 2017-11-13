package com.example.graemedoran.mondayhomework;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by graemedoran on 13/11/2017.
 */

public class TestSentence {

    Sentence sentence;

    @Test
    public void getWordCount() {
        Sentence sentence  = new Sentence();
        assertEquals(2, sentence.Count("Glasgow Rangers"));
    }

}






















