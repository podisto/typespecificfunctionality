package com.simba;

import lombok.Setter;

/**
 * @author <a href="mailto:simbadeveloppement@gmail.com">podisto</a>
 * @since 2019-08-04
 */
public class Movie {

    @Setter private MovieType movieType;

    public double getPrice(int daysRented) {
        switch (movieType) {
            case CHILDREN:
                return 1000;
            case REGULAR:
                return 8 + 0.3 * (daysRented - 8);
            case NEW_RELEASE:
                return 10 + 0.5 * daysRented;
            default: throw new IllegalArgumentException();
        }
    }
}
