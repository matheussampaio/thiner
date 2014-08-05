/**
 * Copyright (C) 2014 Embedded Systems and Pervasive Computing Lab - UFCG All
 * rights reserved.
 */

package com.thiner.screen.main;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.thiner.R;
import com.thiner.screen.signin.SignInActivity;
import com.thiner.screen.signup.SignUPActivity;

/**
 * The Class MainActivity.
 */
public final class MainActivity extends Activity {
	Button btnSignIn, btnSignUp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Get The Refference Of Buttons
		btnSignIn = (Button) findViewById(R.id.buttonSignIN);
		btnSignUp = (Button) findViewById(R.id.buttonSignUP);

		// Set OnClick Listener on SignUp button
		btnSignUp.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity and Start The Activity
				Intent intentSignUP = new Intent(getApplicationContext(),
						SignUPActivity.class);
				startActivity(intentSignUP);
			}
		});
	}

	// Methos to handleClick Event of Sign In Button
	public void signIn(View V) {
		final Dialog dialog = new Dialog(MainActivity.this);
		dialog.setContentView(R.layout.login);
		dialog.setTitle("Login");

		// get the Refferences of views
		final EditText editTextUserName = (EditText) dialog
				.findViewById(R.id.editTextUserNameToLogin);
		final EditText editTextPassword = (EditText) dialog
				.findViewById(R.id.editTextPasswordToLogin);

		Button btnSignIn = (Button) dialog.findViewById(R.id.buttonSignIn);

		// Set On ClickListener
		btnSignIn.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// get The User name and Password

				// fetch the Password form database for respective user name

				// check if the Stored password matches with Password entered by
				// user

			}
		});

		dialog.show();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();// Close The DatabaseloginDataBaseAdapter.close();
	}
}