package com.blanchardspacecorp.RainDrops.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.blanchardspacecorp.RainDrops.RainDropsGame;

public class DesktopLauncher implements IActivityRequestHandler {

	private static DesktopLauncher application;

	public static void main (String[] arg) {

		if (application == null) {
			application = new DesktopLauncher();
		}
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new RainDropsGame(application), config);
	}

	@Override
	public void showAds(boolean show) {

	}
}
