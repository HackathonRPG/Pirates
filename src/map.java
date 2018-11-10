package pirate;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.*;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

public class map extends Application {
	private static char[][] world = new char[15][15];
	private static Pane pane = new Pane();
	static int x, y;

	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			for (int k = 0; k < 15; k++) {

				world[i][k] = '0';
			}
		}
		// player loc
		x = 5;
		y = 5;
		world[5][5] = '1';

		world[2][0] = '2';
		world[1][4] = '2';

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// island data (player position) , user input

		BorderPane border = new BorderPane();
		Pane pane1 = new Pane();
		for (int j = 0; j < 15; j++) {
			for (int p = 0; p < 15; p++) {

				Rectangle rec = new Rectangle(15 * j, 15 * p, 15, 15);

				if (world[j][p] == '0') {
					rec.setFill(Color.BLACK);
					rec.setStroke(Color.YELLOW);
				} else if (world[j][p] == '2') {
					rec.setFill(Color.RED);
					rec.setStroke(Color.YELLOW);
				}
				else if (world[j][p] == 'w') {
					rec.setFill(Color.BLUE);
					rec.setStroke(Color.YELLOW);
				}
				else {
					rec.setFill(Color.WHITE);
					rec.setStroke(Color.YELLOW);
				}
				pane1.getChildren().add(rec);
			}

		}

		Button up = new Button("Up");
		Button down = new Button("Down");
		Button left = new Button("Left");
		Button right = new Button("Right");
		HBox butPane = new HBox();

		butPane.getChildren().addAll(up, down, left, right);
		butPane.setAlignment(Pos.CENTER);
		border.setTop(pane1);
		border.setBottom(butPane);

		Scene scene = new Scene(border, 225, 250);
		primaryStage.setTitle("game");
		primaryStage.setScene(scene);
		primaryStage.show();
		
			right.setOnAction(e -> {

				move("right", primaryStage, pane1);
				
			});
			left.setOnAction(e -> {

				move("left", primaryStage, pane1);
				
			});
			down.setOnAction(e -> {

				move("down", primaryStage, pane1);
				
			});
			up.setOnAction(e -> {

				move("up", primaryStage, pane1);
				
			});
		
			
		

		// move left
		// world[x][y]= 0;
		// rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
		// rec1.setFill(Color.BLACK);
		// rec1.setStroke(Color.YELLOW);
		// pane1.getChildren().add(rec1);
		// x =-1;
		// world[x][y]= 1;
		// rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
		// rec1.setFill(Color.WHITE);
		// rec1.setStroke(Color.YELLOW);
		// pane1.getChildren().add(rec1);

		// move up
		// y = y+1;
		// move down
		// y = y-1;

		// for (int j = 0; j < 15; j++) {
		// for (int p = 0; p < 15; p++) {
		//
		// Rectangle rec = new Rectangle(15 * j, 15 * p, 15, 15);
		//
		//
		// if (world[j][p]=='0'){
		// rec.setFill(Color.BLACK);
		// rec.setStroke(Color.YELLOW);
		// } else if (world[j][p]== '2') {
		// rec.setFill(Color.RED);
		// rec.setStroke(Color.YELLOW);
		// } else {
		// rec.setFill(Color.WHITE);
		// rec.setStroke(Color.YELLOW);
		// }
		// pane1.getChildren().addAll(rec);
		// }
		//
		// }
		// primaryStage.show();
		// for (int j = 0; j < 5; j++) {
		// for (int p = 0; p < 5; p++) {
		//
		// Rectangle rec = new Rectangle(100 * j, 100 * p, 100, 100);
		//

		// if (world[j+1][p].equals("0")) {
		// rec.setFill(Color.BLACK);
		// rec.setStroke(Color.YELLOW);
		// } else if (world[j+1][p].equals("2")) {
		// rec.setFill(Color.RED);
		// } else {
		// rec.setFill(Color.WHITE);
		// }
		// pane1.getChildren().add(rec);
		// }
		// primaryStage.show();
		// }
	}

	private void move(String string, Stage primaryStage, Pane pane1) {
		if (string.equals("right")) {
			world[x][y] = 0;
			Rectangle rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
			rec1.setFill(Color.BLACK);
			rec1.setStroke(Color.YELLOW);
			pane1.getChildren().add(rec1);
			x++;
			world[x][y] = 1;
			rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
			rec1.setFill(Color.WHITE);
			rec1.setStroke(Color.YELLOW);
			pane1.getChildren().add(rec1);
			primaryStage.show();
		} 
		else if (string.equals("left")) {
			// move left
			world[x][y] = 0;
			Rectangle rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
			rec1.setFill(Color.BLACK);
			rec1.setStroke(Color.YELLOW);
			pane1.getChildren().add(rec1);
			x--;
			world[x][y] = 1;
			rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
			rec1.setFill(Color.WHITE);
			rec1.setStroke(Color.YELLOW);
			pane1.getChildren().add(rec1);
		} 
		else if (string.equals("down")) {
			world[x][y] = 0;
			Rectangle rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
			rec1.setFill(Color.BLACK);
			rec1.setStroke(Color.YELLOW);
			pane1.getChildren().add(rec1);
			y++;
			world[x][y] = 1;
			rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
			rec1.setFill(Color.WHITE);
			rec1.setStroke(Color.YELLOW);
			pane1.getChildren().add(rec1);
		} 
		else {
			world[x][y] = 0;
			Rectangle rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
			rec1.setFill(Color.BLACK);
			rec1.setStroke(Color.YELLOW);
			pane1.getChildren().add(rec1);
			y--;
			world[x][y] = 1;
			rec1 = new Rectangle(15 * x, 15 * y, 15, 15);
			rec1.setFill(Color.WHITE);
			rec1.setStroke(Color.YELLOW);
			pane1.getChildren().add(rec1);
		}
	}
}
