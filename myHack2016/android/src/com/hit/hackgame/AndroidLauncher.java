package com.hit.hackgame;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.hit.hackgame.main.Yelling;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new Yelling(new Yelling.Callback() {
			@Override
			public int getLevelOfSound() {
				JumpLevel jump = JumpLevel.getJumpLevel();
				jump.getNoiseLevel();
				int level = jump.jumpLevel;
				return level;
			}
		}), config);
	}
}
