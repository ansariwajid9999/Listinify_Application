package songApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Album a1 = new Album("Old Hindi Songs","Kishore Kumar");

        a1.addNewSongToAlbum("Nile Nile Ambar",6.0);
        a1.addNewSongToAlbum("Meri bheegi si",5.0);
        a1.addNewSongToAlbum("Dil Kya kare",5.5);
        a1.addNewSongToAlbum("Ek ajnabi haseena",3.5);

        Album a2 = new Album("Latest Bollywood songs","Jubin Natiyal");

        a2.addNewSongToAlbum("itti si hassi",4.5);
        a2.addNewSongToAlbum("Tere vaaste",3.5);
        a2.addNewSongToAlbum("Rataan Lambiyaan",4.6);
        a2.addNewSongToAlbum("Barish Ban Ja",3.2);
        a2.addNewSongToAlbum("Pasoori",3.5);


        ArrayList<Song> playList = new ArrayList<>();

        a1.addSongToPlayList(2,playList);
        a1.addSongToPlayList(4,playList);

        a2.addSongToPlayList("Pasoori",playList);
        a2.addSongToPlayList("itti si hassi",playList);

        play(playList);
    }

    public static void play(ArrayList<Song> playList){

        printMenu();

        System.out.println("Now Playing : ");
        System.out.println(playList.get(0).toString());

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int currentIndex = 0;


        boolean isOver = false;

        while(!isOver){

            switch(choice){
                case 1:
                    if(currentIndex==(playList.size()-1)){
                        System.out.println("You are at the last song");
                    }else{
                        currentIndex++;
                        System.out.println(playList.get(currentIndex).toString());
                    }
                    break;
                case 2:
                    if(currentIndex==0)
                        System.out.println("You are at the first Song");
                    else {
                        currentIndex--;
                        System.out.println(playList.get(currentIndex).toString());
                    }
                    break;
                case 3:
                    System.out.println(playList.get(currentIndex).toString());
                    break;
                case 4:
                    printMenu();
                    break;
                case 5:
                    printAllSongs(playList);
                    break;
                case 6:
                        //1 line code : self completion exercie
                    break;
                case 7:
                    isOver = true;
                    break;
                case 8:
                    //shuffle song and
                case 9:
                    //Print song from an artist
            }
            choice = sc.nextInt();
        }


    }

    public static void printAllSongs(ArrayList<Song> playList){

        for(Song song : playList){
            System.out.println(song.toString());
        }


    }

    public static void printMenu(){

        System.out.println("Enter your choice");
        System.out.println("1. Go to Next Song");
        System.out.println("2. Go to Previous Song");
        System.out.println("3. Repeat this Song");
        System.out.println("4. Print the Choice Menu");
        System.out.println("5. Print PlayList");
        System.out.println("6. Delete the current Song");
        System.out.println("7. Close the playlist");

    }
}