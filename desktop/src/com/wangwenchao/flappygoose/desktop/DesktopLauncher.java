package com.wangwenchao.flappygoose.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.wangwenchao.flappygoose.FGGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Flappy Goose";
        config.width = 272;
        config.height = 408;
		new LwjglApplication(new FGGame(), config);
	}
}
