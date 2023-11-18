package de.cooltechno.rankedcrystal.RankedAlgorithm;

public class EloRatingSystem {

    public static void calculateNewRatings(double ratingA, double ratingB, double scoreA, double scoreB) {

        // Calculate the expected outcome for both players
        double expectedOutcomeA = 1.0 / (1.0 + Math.pow(10, (ratingB - ratingA) / 400.0));
        double expectedOutcomeB = 1.0 / (1.0 + Math.pow(10, (ratingA - ratingB) / 400.0));

        // Calculate the change in ratings for both players
        double K = 32; // K-factor determines the sensitivity of rating changes (can be adjusted)
        double changeA = K * (scoreA - expectedOutcomeA);
        double changeB = K * (scoreB - expectedOutcomeB);

        double newRatingA = ratingA + changeA;
        double newRatingB = ratingB + changeB;

        // for debugging
        //System.out.println("Player A's new rating: " + newRatingA);
        //System.out.println("Player B's new rating: " + newRatingB);

    }


}