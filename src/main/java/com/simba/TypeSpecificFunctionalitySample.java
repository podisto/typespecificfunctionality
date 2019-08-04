package com.simba;

import lombok.extern.slf4j.Slf4j;

import static com.simba.MovieType.CHILDREN;

/**
 * @author <a href="mailto:simbadeveloppement@gmail.com">podisto</a>
 * @since 2019-08-04
 */
@Slf4j
public class TypeSpecificFunctionalitySample {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovieType(CHILDREN);
        double price = movie.getPrice(10);
        log.info("price = {} ", price);
    }
}
