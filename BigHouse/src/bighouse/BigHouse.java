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
        
        double xLeft = 200.0;
        double xMiddle;
        double xRight = 600.0;
        xMiddle = ((xRight - xLeft) / 2) + xLeft;
        double yBottom = 225.0;
        double yPoint = 125.0;
        double spacing = 25.0;
        house.createRoof(canvas, new double[]{xLeft, xMiddle, xRight}, new double[]{yBottom, yPoint, yBottom}, "b22edb");
        house.createRoom(canvas, xLeft+spacing, yBottom, xRight-spacing, 400, "FF0000");
        // Graphics code goes here
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
