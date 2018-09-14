package BigHouse;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Polygon;


/*
 * 
 * @author Tim Barber
 */
public class HouseBuilder {

    /*
    public void paint(Canvas canvas) {
        createRoom(canvas);
    }*/
    public void createRoom(Canvas canvas, double xPos, double yPos, double width, double height, String color, Boolean door, double doorWidth, double doorHeight, String doorColor) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.BLUE);
        graphics.strokeText("Big House Lab: Tim Barber", 35, 35);
        graphics.setFill(Color.web(color));
        graphics.setStroke(Color.web("FFEEDD"));
        graphics.fillRect(xPos, yPos, width, height);
        if (door) {
            graphics.setFill(Color.web(doorColor));
            double doorX = width / 2 - (doorWidth / 2) + xPos;
            double doorY = yPos + height - doorHeight;
            graphics.fillRect(doorX, doorY, doorWidth, doorHeight);
        }
        //graphics.fillOval(X, Y, width, height);
        //graphics.setLineWidth(width);
        //graphics.strokeArc(centerX, centerY, radiusX, radiusY, startAngle, finishAngle, ArcType.OPEN);
        //graphics.strokeOval(xPos - (eyeSeparation / 2), yPos, width, height);

    }

    public void createRoof(Canvas canvas, double[] xDoubles, double[] yDoubles, String color) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.web(color));
        graphics.fillPolygon(xDoubles, yDoubles, 3);

    }
    
    public void createWindow(Canvas canvas, double xPos, double yPos, double size, String color, Boolean type){
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.web(color));
        if (type){
            graphics.fillRect(xPos, yPos, size, size); // true(1) for square
        }
        else {
            graphics.fillOval(xPos, yPos, size, size); // false(0) for circle
        }
        
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
