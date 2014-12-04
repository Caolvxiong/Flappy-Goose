package com.wangwenchao.flappygoose;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.wangwenchao.screens.GameScreen;
import com.wangwenchao.screens.SplashScreen;
import com.wangwenchao.FGHelpers.AssetLoader;

public class FGGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		Gdx.app.log("FGGame", "created");
		AssetLoader.load();
		//setScreen(new GameScreen());
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose(){
		super.dispose();
		AssetLoader.dispose();
	}
}
