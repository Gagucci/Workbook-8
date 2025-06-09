package com.pluralsight;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class App {
        public static void main(String[] args) throws IOException {
//            String asciiArt = FigletFont.convertOneLine("hi remsey");
//            System.out.println(asciiArt);

            String asciiArt2 = FigletFont.convertOneLine(FigletFont.class.getResourceAsStream("/file2/font2.flf"), "Thanks Claudia");
            System.out.println(asciiArt2);
        }
    }
