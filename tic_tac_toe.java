/*
Project 1
Numaan Cheema
COS 220-01

 */

import doodlepad.*;

public class tic_tac_toe {

    //nearly all initializations and declarationsare static so theyre accessible across the program
    static int counter = 0;
    static int redNum = 1, blueNum = 1;
    static Pad p = new Pad(500, 510);

    static RoundRect p1wins = new RoundRect(50, 450, 100, 50, 10, 10);
    static RoundRect drawButton = new RoundRect(200, 450, 100, 50, 10, 10);
    static RoundRect p2wins = new RoundRect(350, 450, 100, 50, 10, 10);

    static Text p1text = new Text("Red Wins!", 65, 470, 15);
    static Text drawB = new Text("Draw/Reset", 210, 470, 15);
    static Text p2text = new Text("Blue Wins!", 365, 470, 15);

    static Text redScore = new Text (" ", 100, 20, 25);
    static Text blueScore = new Text (" ", 300, 20, 25);

    //'O and X' initialization
    static Oval o1 = new Oval(0, 0, 55, 55);
    static Oval o2 = new Oval(0, 0, 55, 55);
    static Oval o3 = new Oval(0, 0, 55, 55);
    static Oval o4 = new Oval(0, 0, 55, 55);
    static Oval o5 = new Oval(0, 0, 55, 55);
    static Oval o6 = new Oval(0, 0, 55, 55);
    static Oval o7 = new Oval(0, 0, 55, 55);
    static Oval o8 = new Oval(0, 0, 55, 55);
    static Oval o9 = new Oval(0, 0, 55, 55);

    static Text t1 = new Text("X", 0, 0, 65);
    static Text t2 = new Text("X", 0, 0, 65);
    static Text t3 = new Text("X", 0, 0, 65);
    static Text t4 = new Text("X", 0, 0, 65);
    static Text t5 = new Text("X", 0, 0, 65);
    static Text t6 = new Text("X", 0, 0, 65);
    static Text t7 = new Text("X", 0, 0, 65);
    static Text t8 = new Text("X", 0, 0, 65);
    static Text t9 = new Text("X", 0, 0, 65);


    public static void main(String[] args) {
        //mouseHandlers for the pad and the buttons
        p.setMouseClickedHandler(Project1_Test::onMousePress1);
        p1wins.setMouseClickedHandler(Project1_Test::onRedButton);
        p2wins.setMouseClickedHandler(Project1_Test::onBlueButton);
        drawButton.setMouseClickedHandler(Project1_Test::onDrawButton);

        //tic tic toe grid
        Line l1 = new Line(200, 100, 200, 400);
        Line l2 = new Line(300, 100, 300, 400);
        Line l3h = new Line(100, 200, 400, 200);
        Line l4h = new Line(100, 300, 400, 300);

        blueScore.setFillColor(0, 0, 255);
        redScore.setFillColor(255,0,0);

        //Red Button
        p1wins.setFillColor(255, 0, 0);
        p1text.setFillColor(255, 255, 255);

        //Draw Button
        drawButton.setFillColor(0, 0, 0);
        drawB.setFillColor(255, 255, 255);

        //Blue Button
        p2wins.setFillColor(0, 0, 255);
        p2text.setFillColor(255, 255, 255);

        o1.setVisible(false);
        o2.setVisible(false);
        o3.setVisible(false);
        o4.setVisible(false);
        o5.setVisible(false);
        o6.setVisible(false);
        o7.setVisible(false);
        o8.setVisible(false);
        o9.setVisible(false);

        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);
        t5.setVisible(false);
        t6.setVisible(false);
        t7.setVisible(false);
        t8.setVisible(false);
        t9.setVisible(false);

        o1.setX(127);
        o1.setY(127);
        o2.setX(227);
        o2.setY(127);
        o3.setX(327);
        o3.setY(127);
        o4.setX(127);
        o4.setY(227);
        o5.setX(227);
        o5.setY(227);
        o6.setX(327);
        o6.setY(227);
        o7.setX(127);
        o7.setY(327);
        o8.setX(227);
        o8.setY(327);
        o9.setX(327);
        o9.setY(327);

        t1.setX(125);
        t1.setY(125);
        t2.setX(225);
        t2.setY(125);
        t3.setX(325);
        t3.setY(125);
        t4.setX(125);
        t4.setY(225);
        t5.setX(225);
        t5.setY(225);
        t6.setX(325);
        t6.setY(225);
        t7.setX(125);
        t7.setY(325);
        t8.setX(225);
        t8.setY(325);
        t9.setX(325);
        t9.setY(325);

        o1.setStrokeColor(0, 0, 255);
        o2.setStrokeColor(0, 0, 255);
        o3.setStrokeColor(0, 0, 255);
        o4.setStrokeColor(0, 0, 255);
        o5.setStrokeColor(0, 0, 255);
        o6.setStrokeColor(0, 0, 255);
        o7.setStrokeColor(0, 0, 255);
        o8.setStrokeColor(0, 0, 255);
        o9.setStrokeColor(0, 0, 255);

        o1.setStrokeWidth(7);
        o2.setStrokeWidth(7);
        o3.setStrokeWidth(7);
        o4.setStrokeWidth(7);
        o5.setStrokeWidth(7);
        o6.setStrokeWidth(7);
        o7.setStrokeWidth(7);
        o8.setStrokeWidth(7);
        o9.setStrokeWidth(7);

        t1.setFillColor(255, 0, 0);
        t2.setFillColor(255, 0, 0);
        t3.setFillColor(255, 0, 0);
        t4.setFillColor(255, 0, 0);
        t5.setFillColor(255, 0, 0);
        t6.setFillColor(255, 0, 0);
        t7.setFillColor(255, 0, 0);
        t8.setFillColor(255, 0, 0);
        t9.setFillColor(255, 0, 0);

        redScore.setText("Red: ");
        blueScore.setText("Blue: ");
    }

    public static void onMousePress1(Pad pad, double x, double y, int button) {
        //checks to make sure click is inside the grid
        if ((x > 100 && x < 400) && (y > 100 && y < 400)) {

            //checks to see which box the click is in.  Nested loops check whose turn it is
            if ((x > 101 && x < 199) && (y > 101 && y < 199)) {
                if ((counter % 2 == 0)) {
                    o1.setVisible(true);
                } else t1.setVisible(true);
            } else if ((x > 201 && x < 299) && (y > 101 && y < 199)) {
                if ((counter % 2 == 0)) {
                    o2.setVisible(true);
                } else t2.setVisible(true);
            } else if ((x > 301 && x < 399) && (y > 101 && y < 199)) {
                if ((counter % 2 == 0)) {
                    o3.setVisible(true);
                } else t3.setVisible(true);
            } else if ((x > 101 && x < 199) && (y > 201 && y < 299)) {
                if ((counter % 2 == 0)) {
                    o4.setVisible(true);
                } else t4.setVisible(true);
            } else if ((x > 201 && x < 299) && (y > 201 && y < 299)) {
                if ((counter % 2 == 0)) {
                    o5.setVisible(true);
                } else t5.setVisible(true);
            } else if ((x > 301 && x < 399) && (y > 201 && y < 299)) {
                if ((counter % 2 == 0)) {
                    o6.setVisible(true);
                } else t6.setVisible(true);
            } else if ((x > 101 && x < 199) && (y > 301 && y < 399)) {
                if ((counter % 2 == 0)) {
                    o7.setVisible(true);
                } else t7.setVisible(true);
            } else if ((x > 201 && x < 199) && (y > 301 && y < 399)) {
                if ((counter % 2 == 0)) {
                    o8.setVisible(true);
                } else t8.setVisible(true);
            } else if ((x > 301 && x < 399) && (y > 301 && y < 399)) {
                if ((counter % 2 == 0)) {
                    o9.setVisible(true);
                } else t9.setVisible(true); //end of nest
            }
        }
        counter += 1;
    }//end of onMousePress

    public static void onRedButton(Shape shp, double x, double y, int button) {
        redScore.setText("Red: " + redNum);
        redNum += 1;
    }

    public static void onBlueButton(Shape shp, double x, double y, int button) {
        blueScore.setText("Blue: " + blueNum);
        blueNum += 1;
    }

    public static void onDrawButton(Shape shp, double x, double y, int button) {
        String[] args = new String[0];
        main(args);

    }

}
