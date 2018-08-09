package br.com.ciclic.brewery.beer.infrastructure.entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeerStyleTest {

    @Test
    public void shouldCalculateTemperatureDifference() {
        BeerStyle entity = BeerStyle.builder().name("Dunkel").maximum(2).minimum(-8).build();
        entity.calculateAverage();
        assertEquals(Integer.valueOf(-3), entity.getAverage());
    }
}