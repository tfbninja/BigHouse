package BigHouse;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
 *
 * @author Tim Barber
 */
public class BigHouse extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();

        canvas = new Canvas(WIDTH, HEIGHT);

        root.getChildren().add(canvas);

        Scene primaryScene = new Scene(root, WIDTH, HEIGHT);
        HouseBuilder house = new HouseBuilder();

        double xLeft = 175.0;
        double xRight = 615.0;
        double xMiddle = ((xRight - xLeft) / 2) + xLeft;
        double yBottom = 225.0;
        double yPoint = 115.0;
        double roomSpacing = 35.0;
        double windowSize = 60;
        double middleWindowSize = 75;
        double leftWindowX = xLeft + 45.0;
        double rightWindowX = xRight - 45 - windowSize;
        double middleWindowX = xMiddle - (middleWindowSize / 2);
        double windowY = yBottom + 100;
        double middleWindowY = windowY - 85;

        house.createRoof(canvas, new double[]{xLeft, xMiddle, xRight}, new double[]{yBottom, yPoint, yBottom}, "211614");
        /* Parameters for createRoof() method:
         * 1: Where to 'paint' it
         * 2: List of x-coordinates for all points of triangle
         * 3: List of y-coordinates for all points of triangle
         * 4: Color of roof
         */
        house.createRoom(canvas, xLeft + roomSpacing, yBottom, xRight - xLeft - (roomSpacing * 2), 300, "b22508", true, 80, 150, "3f1b01");
        /* Parameters for createRoom() method:
         * 1: Where to 'paint' it 
         * 2 & 3: Top left corner coordinates
         * 4 & 5: Width and height
         * 6: Color of room
         * 7: Door option, true for a door, false for no door
         * 8 & 9: If door is true, will make a door in the center at the bottom with the given width and height
         * 10: Color for the door
         */
        house.createWindow(canvas, leftWindowX, windowY, windowSize, "969594", true);
        house.createWindow(canvas, rightWindowX, windowY, windowSize, "969594", true);
        house.createWindow(canvas, middleWindowX, middleWindowY, middleWindowSize, "969594", false);

        /* Paramaters for createSquareWindow() method:
         * 1: Where to 'paint' it
         * 2: X position of top left corner
         * 3: Y position of top left corner
         * 4: Diameter
         * 5: Color of window
         * 6: Type of window, 1 for square, and 0 for circle
         */
        stage.setScene(primaryScene);
        stage.setTitle("Yeet");
        stage.show();
    }
}
/*
 * The MIT License
 *
 * Copyright 2018 Tim Barber.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
