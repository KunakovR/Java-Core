package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    static void saveGame(String path, String fileName, GameProgress gameProgress){
        try {File saveFile = new File(path + fileName);
            saveFile.createNewFile();

            try (FileOutputStream fos = new FileOutputStream(saveFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(gameProgress);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void zipFiles(String zip, String path, String fileName ){
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zip));
             FileInputStream fis = new FileInputStream(path + fileName);) {
                 ZipEntry entry = new ZipEntry(fileName);
                 zout.putNextEntry(entry);
                 byte[] buffer = new byte[fis.available()];
                 fis.read(buffer);
                 zout.write(buffer);
                 zout.closeEntry();
             } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    static void delete(String path, String fileName) {
        try {
            Path del = Path.of(path + fileName);
            Files.delete(del);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }
}
