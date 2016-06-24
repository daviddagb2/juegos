package com.blanchardspacecorp.RainDrops;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;


import com.blanchardspacecorp.zuchiga.IActivityRequestHandler;
import com.google.android.gms.ads.AdView;


import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication   {

    protected AdView adView;
    private  Button lbtn01;


	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.useAccelerometer = false;
		config.useCompass = false;

		RelativeLayout layout = new RelativeLayout(this);

        // VENTANA
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);


		//Inicializacion original
		// initialize(new RainDropsGame(), config);

        lbtn01 = new Button(this);
        lbtn01.setVisibility(View.GONE);
        lbtn01.setText("hola ke ase este es un boton o ke ase");
        lbtn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lbtn01.setText("presiono en el boton viteh");
            }
        });


        View gameView = initializeForView(new RainDropsGame(), config);

        // Add the libgdx view
        layout.addView(lbtn01);
        layout.addView(gameView);

        // Hook it all up
        setContentView(layout);
	}



}
