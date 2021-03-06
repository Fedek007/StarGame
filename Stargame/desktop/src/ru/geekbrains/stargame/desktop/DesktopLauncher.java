package ru.geekbrains.stargame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ru.geekbrains.stargame.StarGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		float aspect = 4.3f/5f;
		config.width= 350;
		config.height = (int) (config.width / aspect);
		config.resizable = false;
		new LwjglApplication(new StarGame(), config);
	}
}
