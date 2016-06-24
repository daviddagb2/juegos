package com.blanchardspacecorp.RainDrops;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RainDropsGame extends Game {
	SpriteBatch batch;
	Texture img;
	BitmapFont font;

	int Vidas = 3;
	int CantidadMonedas = 0;
	int LevelActual = 1;


	public RainDropsGame() {

	}


	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("001bslogo.png");

		//font = new BitmapFont();

		font = new BitmapFont(Gdx.files.internal("zuchigafnt.fnt"),
				Gdx.files.internal("zuchigafnt.png"), false);

		font.setColor(Color.WHITE);

		//myRequestHandler.showAds(true);

		this.setScreen(new GameScreen(this));

	}

	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();
	}


	@Override
	public void render () {
		super.render(); //important!

	//	Gdx.gl.glClearColor(1, 0, 0, 1);
	//	Gdx.gl.glClearColor(.200f, .250f, .255f, 1);
	//	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	//	IntroGame.fadeLogo(intro, batch, img, font);

	}
}
