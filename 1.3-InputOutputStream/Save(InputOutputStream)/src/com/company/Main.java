package com.company;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        GameProgress gameProgress1 = new GameProgress(94, 10, 2, 254.32);
        GameProgress gameProgress2 = new GameProgress(95, 11, 3, 254.33);
        GameProgress gameProgress3 = new GameProgress(96, 11, 4, 254.34);

        String path = "C://Games/savegames/";
        String zip = "C://Games/savegames/zip.zip";


        GameProgress.saveGame(path, "save1.dat", gameProgress1);
        GameProgress.saveGame(path, "save2.dat", gameProgress2);
        GameProgress.saveGame(path, "save3.dat", gameProgress3);

        GameProgress.zipFiles(zip, path, "save1.dat");
        GameProgress.delete(path, "save1.dat");
        GameProgress.zipFiles(zip, path, "save2.dat");
        GameProgress.delete(path, "save2.dat");
        GameProgress.zipFiles(zip, path, "save3.dat");
        GameProgress.delete(path, "save3.dat");


    }
}
