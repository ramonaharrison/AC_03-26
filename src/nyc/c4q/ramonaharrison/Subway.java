package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Subway.java
 */

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Subway {

    public static void drawBar(Graphics2D g, Color color, int y, int count, String letter) {
        // Step 4.
        // Implement this method. It takes the Graphics2D instance and some
        // data we need to create a single bar on the bar chart.
        //throw new UnsupportedOperationException("Not implemented yet");
        g.setColor(color);
        g.setFont(new Font("Dialog", Font.PLAIN, 10));
        g.drawString(letter, 2, y+8);
        g.fillRect(10, y, count, 8);

    }

    public static int countEntrances(ArrayList<ArrayList<String>> lines, String subwayLine) {
        // Step 3.
        // Implement this method. It takes an ArrayList of an ArrayList of
        // Strings and the subway line we're interested in and returns the
        // number of entrances for that line.
        // throw new UnsupportedOperationException("Not implemented yet");
        int totalEntrances = 0;
        Iterator<ArrayList<String>> iterator = lines.iterator();

        while (iterator.hasNext()) {
            String checkLines = iterator.next().get(2);
            if (checkLines.contains(subwayLine)) {
                totalEntrances++;
            }
        }


        return totalEntrances;
    }

    public static void main(String[] args) {
        // This creates a 500x250 pixel drawing.
        DrawingPanel panel = new DrawingPanel(500, 250);
        // This gets a Graphics2D object that we can use to draw on the panel.
        Graphics2D g = panel.getGraphics();

        // Step 1:
        // Modify this String to indicate the full path to the subway
        // data on your computer. Run your program. If it does not throw an
        // error, you are referencing the file correctly.
        File f = new File("/Users/mona/Desktop/accesscode/AC_03-26/res/subway.txt");

        // Step 2.
        // Get the lines as a nested ArrayList of Strings from the File
        // instance. Make sure everything is working correctly by
        // printing the data.
        ArrayList<ArrayList<String>> subwayData = f.getLines();
        //System.out.println(subwayData);


        // Step 3.
        // Implement countEntrances().

        //List<String> strings = new ArrayList<String>();
        //Collections.addAll(strings,"A","B","C","D");

        //ArrayList<String> subwayLetters = new ArrayList<String>();
        ArrayList<String> subwayLetters = new ArrayList<String>(Arrays.asList("A", "C", "E", "B", "D", "F", "M", "G", "L", "J", "Z", "N", "Q", "R", "1", "2", "3", "4", "5", "6", "7", "S"));
        Iterator<String> iterator = subwayLetters.iterator();

        int y = 7;
        Color color;
        while (iterator.hasNext()) {
            String currentLine = iterator.next();
            if (y < 40)
                color = Color.blue;
            else if (y < 80)
                color = Color.orange;
            else if (y < 90)
                color = Color.green;
            else if (y < 100)
                color = Color.lightGray;
            else
                color = Color.blue;

            drawBar(g, color, y, countEntrances(subwayData, currentLine), currentLine);
            y += 10;

        }

        // Step 3b.
        // Ensure countEntrances is correct by printing out the counts for a
        // few subway lines!

        // Step 4.
        // Implement drawBar().


    }

}