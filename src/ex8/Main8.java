package ex8;

import java.util.Random;

public class Main8 {
    public static void main(String[] args) {

        Random random = new Random();
        Movie[] movies=new Movie[10];

        //region Create movie object
        Movie movie0 = new Movie();
        movie0.setTitle("Gladiator");
        movies[0]=movie0;

        Movie movie1 = new Movie();
        movie1.setTitle("Godfather");
        movies[1]=movie1;

        Movie movie2 = new Movie();
        movie2.setTitle("Knives out");
        movies[2]=movie2;

        Movie movie3 = new Movie();
        movie3.setTitle("Metropolis");
        movies[3]=movie3;

        Movie movie4 = new Movie();
        movie4.setTitle("Iron Man");
        movies[4]=movie4;

        Movie movie5 = new Movie();
        movie5.setTitle("Harry Potter");
        movies[5]=movie5;

        Movie movie6 = new Movie();
        movie6.setTitle("Peaky Blinders");
        movies[6]=movie6;

        Movie movie7 = new Movie();
        movie7.setTitle("Mafia");
        movies[7]=movie7;

        Movie movie8 = new Movie();
        movie8.setTitle("Forsage");
        movies[8]=movie8;

        Movie movie9 = new Movie();
        movie9.setTitle("Transporter");
        movies[9]=movie9;

//endregion


        for(int i=0;i<movies.length;i++){
            movies[i].setRating(random.nextInt(11));
        }

        //region Sout all ratings
        System.out.println(movie0.getTitle() + "-" + movie0.getRating());
        System.out.println(movie1.getTitle() + "-" + movie1.getRating());
        System.out.println(movie2.getTitle() + "-" + movie2.getRating());
        System.out.println(movie3.getTitle() + "-" + movie3.getRating());
        System.out.println(movie4.getTitle() + "-" + movie4.getRating());
        System.out.println(movie5.getTitle() + "-" + movie5.getRating());
        System.out.println(movie6.getTitle() + "-" + movie6.getRating());
        System.out.println(movie7.getTitle() + "-" + movie7.getRating());
        System.out.println(movie8.getTitle() + "-" + movie8.getRating());
        System.out.println(movie9.getTitle() + "-" + movie9.getRating());
//endregion

        //region max element ratArr
        int max = movies[0].getRating();
        for (int i = 1; i < movies.length; i++) {
            if (movies[i].getRating() > max) {
                max = movies[i].getRating();
            }
        }
        //endregion

        System.out.println();
        System.out.print("Best films : ");
        for (int i = 0; i < movies.length; i++) {
            if(movies[i].getRating()==max){
                System.out.print(movies[i].getTitle()+"-"+movies[i].getRating()+" ");
            }
        }
    }
}
