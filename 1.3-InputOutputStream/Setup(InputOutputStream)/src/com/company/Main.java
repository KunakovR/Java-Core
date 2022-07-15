package com.company;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> log = new ArrayList<>();

//      1  и 2 пункт
        File dirSrc = new File("C://Games/src");
        dirSrc.mkdir();
        log.add("Создана директория src");
        File dirRes = new File("C://Games/res");
        dirRes.mkdir();
        log.add("Создана директория res");
        File dirSaveGames = new File("C://Games/savegames");
        dirSaveGames.mkdir();
        log.add("Создана директория savegames");
        File dirTemp = new File("C://Games/temp");
        dirTemp.mkdir();
        log.add("Создана директория temp");
        File dirMain = new File("C://Games/src/main");
        dirMain.mkdir();
        log.add("Создана директория main");
        File dirTest = new File("C://Games/src/test");
        dirTest.mkdir();
        log.add("Создана директория test");
//      3 пункт
        File fileMain = new File("C://Games/src/main/Main.java");
        try{
            fileMain.createNewFile();
        } catch (IIOException ex) {
            System.out.println(ex.getMessage());
        }
        log.add("Создан файл Main.java");
        File fileUtils = new File("C://Games/src/main/Utils.java");
        try{
            fileUtils.createNewFile();
        } catch (IIOException ex) {
            System.out.println(ex.getMessage());
        }
        log.add("Создан файл Utils.java");
//      4 пункт
        File dirDrawables = new File("C://Games/res/drawables");
        dirDrawables.mkdir();
        log.add("Создана директория drawables");
        File dirVectors = new File("C://Games/res/vectors");
        dirVectors.mkdir();
        log.add("Создана директория vectors");
        File dirIcons = new File("C://Games/res/icons");
        dirIcons.mkdir();
        log.add("Создана директория icons");
//      5 пункт
        File fileTempTxt = new File("C://Games/temp/temp.txt");
        try{
            fileTempTxt.createNewFile();
        } catch (IIOException ex) {
            System.out.println(ex.getMessage());
        }
//      запись лога
        try {
            FileWriter writer = new FileWriter("C://Games/temp/temp.txt");
            for (String logs : log){
                writer.write(logs);
                writer.append('\n');
            }
                writer.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
