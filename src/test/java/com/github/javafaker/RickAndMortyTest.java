package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class RickAndMortyTest extends AbstractFakerTest {

    @Test
    public void character() throws Exception {
        assertThat(faker.rickAndMorty().character(), matchesRegularExpression("^([\\w'-.]+ ?){2,}$"));
    }

    @Test
    public void location() throws Exception {
        assertThat(faker.rickAndMorty().location(), matchesRegularExpression("^([\\w-.]+ ?){2,}$"));
    }

    @Test
    public void quote() throws Exception {
        assertThat(faker.rickAndMorty().quote(), not(isEmptyOrNullString()));
    }
}
