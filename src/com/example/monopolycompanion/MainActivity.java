package com.example.monopolycompanion;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.ToggleButton;


public class MainActivity extends Activity implements OnItemSelectedListener {

	private ToggleButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, 
	btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, 
	btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28;
	private Spinner sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp10, sp11, sp12, sp13, sp14, 
	sp15, sp16, sp17, sp18, sp19, sp20, sp21, sp22, sp23, sp24, sp25, sp26, sp27, sp28;
//	ToggleButton[] theButton = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, 
//			btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, 
//			btn21, btn22};
	int rrcount = -1;
	private ArrayAdapter<CharSequence> adapter1, adapter2;
	int m1l = 2, m1h = 4, m2l = 6, m2h = 8, m3l = 10, m3h = 12, m4l = 14, m4h = 16, m5l = 18, m5h=20,
			m6l = 22, m6h = 24, m7l = 26, m7h = 28, m8l = 35, m8h = 50;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (ToggleButton) findViewById(R.id.ToggleButton01);
		btn1.setOnClickListener(ButtonMenuListener1);
		btn2 = (ToggleButton) findViewById(R.id.ToggleButton02);
		btn2.setOnClickListener(ButtonMenuListener1);
		btn3 = (ToggleButton) findViewById(R.id.ToggleButton03);
		btn3.setOnClickListener(ButtonMenuListener2);
		btn4 = (ToggleButton) findViewById(R.id.ToggleButton04);
		btn4.setOnClickListener(ButtonMenuListener2);
		btn5 = (ToggleButton) findViewById(R.id.ToggleButton05);
		btn5.setOnClickListener(ButtonMenuListener2);
		btn6 = (ToggleButton) findViewById(R.id.ToggleButton06);
		btn6.setOnClickListener(ButtonMenuListener3);
		btn7 = (ToggleButton) findViewById(R.id.ToggleButton07);
		btn7.setOnClickListener(ButtonMenuListener3);
		btn8 = (ToggleButton) findViewById(R.id.ToggleButton08);
		btn8.setOnClickListener(ButtonMenuListener3);
		btn9 = (ToggleButton) findViewById(R.id.ToggleButton09);
		btn9.setOnClickListener(ButtonMenuListener4);
		btn10 = (ToggleButton) findViewById(R.id.ToggleButton10);
		btn10.setOnClickListener(ButtonMenuListener4);
		btn11 = (ToggleButton) findViewById(R.id.ToggleButton11);
		btn11.setOnClickListener(ButtonMenuListener4);
		btn12 = (ToggleButton) findViewById(R.id.ToggleButton12);
		btn12.setOnClickListener(ButtonMenuListener5);
		btn13 = (ToggleButton) findViewById(R.id.ToggleButton13);
		btn13.setOnClickListener(ButtonMenuListener5);
		btn14 = (ToggleButton) findViewById(R.id.ToggleButton14);
		btn14.setOnClickListener(ButtonMenuListener5);
		btn15 = (ToggleButton) findViewById(R.id.ToggleButton15);
		btn15.setOnClickListener(ButtonMenuListener6);
		btn16 = (ToggleButton) findViewById(R.id.ToggleButton16);
		btn16.setOnClickListener(ButtonMenuListener6);
		btn17 = (ToggleButton) findViewById(R.id.ToggleButton17);
		btn17.setOnClickListener(ButtonMenuListener6);
		btn18 = (ToggleButton) findViewById(R.id.ToggleButton18);
		btn18.setOnClickListener(ButtonMenuListener7);
		btn19 = (ToggleButton) findViewById(R.id.ToggleButton19);
		btn19.setOnClickListener(ButtonMenuListener7);
		btn20 = (ToggleButton) findViewById(R.id.ToggleButton20);
		btn20.setOnClickListener(ButtonMenuListener7);
		btn21 = (ToggleButton) findViewById(R.id.ToggleButton21);
		btn21.setOnClickListener(ButtonMenuListener8);
		btn22 = (ToggleButton) findViewById(R.id.ToggleButton22);
		btn22.setOnClickListener(ButtonMenuListener8);
		btn23 = (ToggleButton) findViewById(R.id.ToggleButton23);
		btn23.setOnClickListener(ButtonMenuListener9);
		btn24 = (ToggleButton) findViewById(R.id.ToggleButton24);
		btn24.setOnClickListener(ButtonMenuListener9);
		btn25 = (ToggleButton) findViewById(R.id.ToggleButton25);
		btn25.setOnClickListener(ButtonMenuListener10);
		btn26 = (ToggleButton) findViewById(R.id.ToggleButton26);
		btn26.setOnClickListener(ButtonMenuListener11);
		btn27 = (ToggleButton) findViewById(R.id.ToggleButton27);
		btn27.setOnClickListener(ButtonMenuListener12);
		btn28 = (ToggleButton) findViewById(R.id.ToggleButton28);
		btn28.setOnClickListener(ButtonMenuListener13);
		sp1 = (Spinner) findViewById(R.id.Spinner1);
		sp1.setVisibility(View.INVISIBLE);
		sp1.setOnItemSelectedListener(this);
		sp2 = (Spinner) findViewById(R.id.Spinner2);
		sp2.setVisibility(View.INVISIBLE);
		sp2.setOnItemSelectedListener(this);
		sp3 = (Spinner) findViewById(R.id.Spinner3);
		sp3.setVisibility(View.INVISIBLE);
		sp3.setOnItemSelectedListener(this);
		sp4 = (Spinner) findViewById(R.id.Spinner4);
		sp4.setVisibility(View.INVISIBLE);
		sp4.setOnItemSelectedListener(this);
		sp5 = (Spinner) findViewById(R.id.Spinner5);
		sp5.setVisibility(View.INVISIBLE);
		sp5.setOnItemSelectedListener(this);
		sp6 = (Spinner) findViewById(R.id.Spinner6);
		sp6.setVisibility(View.INVISIBLE);
		sp6.setOnItemSelectedListener(this);
		sp7 = (Spinner) findViewById(R.id.Spinner7);
		sp7.setVisibility(View.INVISIBLE);
		sp7.setOnItemSelectedListener(this);
		sp8 = (Spinner) findViewById(R.id.Spinner8);
		sp8.setVisibility(View.INVISIBLE);
		sp8.setOnItemSelectedListener(this);
		sp9 = (Spinner) findViewById(R.id.Spinner9);
		sp9.setVisibility(View.INVISIBLE);
		sp9.setOnItemSelectedListener(this);
		sp10 = (Spinner) findViewById(R.id.Spinner10);
		sp10.setVisibility(View.INVISIBLE);
		sp10.setOnItemSelectedListener(this);
		sp11 = (Spinner) findViewById(R.id.Spinner11);
		sp11.setVisibility(View.INVISIBLE);
		sp11.setOnItemSelectedListener(this);
		sp12 = (Spinner) findViewById(R.id.Spinner12);
		sp12.setVisibility(View.INVISIBLE);
		sp12.setOnItemSelectedListener(this);
		sp13 = (Spinner) findViewById(R.id.Spinner13);
		sp13.setVisibility(View.INVISIBLE);
		sp13.setOnItemSelectedListener(this);
		sp14 = (Spinner) findViewById(R.id.Spinner14);
		sp14.setVisibility(View.INVISIBLE);
		sp14.setOnItemSelectedListener(this);
		sp15 = (Spinner) findViewById(R.id.Spinner15);
		sp15.setVisibility(View.INVISIBLE);
		sp15.setOnItemSelectedListener(this);
		sp16 = (Spinner) findViewById(R.id.Spinner16);
		sp16.setVisibility(View.INVISIBLE);
		sp16.setOnItemSelectedListener(this);
		sp17 = (Spinner) findViewById(R.id.Spinner17);
		sp17.setVisibility(View.INVISIBLE);
		sp17.setOnItemSelectedListener(this);
		sp18 = (Spinner) findViewById(R.id.Spinner18);
		sp18.setVisibility(View.INVISIBLE);
		sp18.setOnItemSelectedListener(this);
		sp19 = (Spinner) findViewById(R.id.Spinner19);
		sp19.setVisibility(View.INVISIBLE);
		sp19.setOnItemSelectedListener(this);
		sp20 = (Spinner) findViewById(R.id.Spinner20);
		sp20.setVisibility(View.INVISIBLE);
		sp20.setOnItemSelectedListener(this);
		sp21 = (Spinner) findViewById(R.id.Spinner21);
		sp21.setVisibility(View.INVISIBLE);
		sp21.setOnItemSelectedListener(this);
		sp22 = (Spinner) findViewById(R.id.Spinner22);
		sp22.setVisibility(View.INVISIBLE);
		sp22.setOnItemSelectedListener(this);
		sp23 = (Spinner) findViewById(R.id.Spinner23);
		sp23.setVisibility(View.INVISIBLE);
		sp23.setOnItemSelectedListener(this);
		sp24 = (Spinner) findViewById(R.id.Spinner24);
		sp24.setVisibility(View.INVISIBLE);
		sp24.setOnItemSelectedListener(this);
		sp25 = (Spinner) findViewById(R.id.Spinner25);
		sp25.setVisibility(View.INVISIBLE);
		sp25.setOnItemSelectedListener(this);
		sp26 = (Spinner) findViewById(R.id.Spinner26);
		sp26.setVisibility(View.INVISIBLE);
		sp26.setOnItemSelectedListener(this);
		sp27 = (Spinner) findViewById(R.id.Spinner27);
		sp27.setVisibility(View.INVISIBLE);
		sp27.setOnItemSelectedListener(this);
		sp28 = (Spinner) findViewById(R.id.Spinner28);
		sp28.setVisibility(View.INVISIBLE);
		sp28.setOnItemSelectedListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private OnClickListener ButtonMenuListener1 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn1) == true && onToggleClicked(btn2) == true){
				btn1.setText(getString(R.string.p1s1) + (m1l * 2));
				btn2.setText(getString(R.string.p2s1) + (m1h * 2));
				sp1.setVisibility(View.VISIBLE);
				spinner2(sp1);
				sp2.setVisibility(View.VISIBLE);
				spinner2(sp2);
			}
			else if (onToggleClicked(btn1) == true && onToggleClicked(btn2) == false){
				btn1.setText(getString(R.string.p1s1) + m1l);
				btn2.setText(getString(R.string.p2s0));
				sp1.setVisibility(View.VISIBLE);
				spinner1(sp1);
				sp2.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn1) == false && onToggleClicked(btn2) == true){
				btn1.setText(getString(R.string.p1s0));
				btn2.setText(getString(R.string.p2s1) + m1h);
				sp1.setVisibility(View.INVISIBLE);
				sp2.setVisibility(View.VISIBLE);
				spinner1(sp2);
			}
			else{
				btn1.setText(getString(R.string.p1s0));
				btn2.setText(getString(R.string.p2s0));
				sp1.setVisibility(View.INVISIBLE);
				sp2.setVisibility(View.INVISIBLE);
			}
		}
		
	};
	
	private OnClickListener ButtonMenuListener2 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn3) == true && onToggleClicked(btn4) == true && onToggleClicked(btn5) == true){
				btn3.setText(getString(R.string.p3s1) + (m2l * 2));
				btn4.setText(getString(R.string.p4s1) + (m2l * 2));
				btn5.setText(getString(R.string.p5s1) + (m2h * 2));
				sp3.setVisibility(View.VISIBLE);
				spinner2(sp3);
				sp4.setVisibility(View.VISIBLE);
				spinner2(sp4);
				sp5.setVisibility(View.VISIBLE);
				spinner2(sp5);
			}
			else if (onToggleClicked(btn3) == true && onToggleClicked(btn4) == true && onToggleClicked(btn5) == false){
				btn3.setText(getString(R.string.p3s1) + m2l);
				btn4.setText(getString(R.string.p4s1) + m2l);
				btn5.setText(getString(R.string.p5s0));
				sp3.setVisibility(View.VISIBLE);
				spinner1(sp3);
				sp4.setVisibility(View.VISIBLE);
				spinner1(sp4);
				sp5.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn3) == true && onToggleClicked(btn4) == false && onToggleClicked(btn5) == true){
				btn3.setText(getString(R.string.p3s1) + m2l);
				btn4.setText(getString(R.string.p4s0));
				btn5.setText(getString(R.string.p5s1) + m2h);
				sp3.setVisibility(View.VISIBLE);
				spinner1(sp3);
				sp4.setVisibility(View.INVISIBLE);
				sp5.setVisibility(View.VISIBLE);
				spinner1(sp5);
			}
			else if (onToggleClicked(btn3) == true && onToggleClicked(btn4) == false && onToggleClicked(btn5) == false){
				btn3.setText(getString(R.string.p3s1) + m2l);
				btn4.setText(getString(R.string.p4s0));
				btn5.setText(getString(R.string.p5s0));
				sp3.setVisibility(View.VISIBLE);
				spinner1(sp3);
				sp4.setVisibility(View.INVISIBLE);
				sp5.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn3) == false && onToggleClicked(btn4) == true && onToggleClicked(btn5) == true){
				btn3.setText(getString(R.string.p3s0));
				btn4.setText(getString(R.string.p4s1) + m2l);
				btn5.setText(getString(R.string.p5s1) + m2h);
				sp3.setVisibility(View.INVISIBLE);
				sp4.setVisibility(View.VISIBLE);
				spinner1(sp4);
				sp5.setVisibility(View.VISIBLE);
				spinner1(sp5);
			}
			else if (onToggleClicked(btn3) == false && onToggleClicked(btn4) == true && onToggleClicked(btn5) == false){
				btn3.setText(getString(R.string.p3s0));
				btn4.setText(getString(R.string.p4s1) + m2l);
				btn5.setText(getString(R.string.p5s0));
				sp3.setVisibility(View.INVISIBLE);
				sp4.setVisibility(View.VISIBLE);
				spinner1(sp4);
				sp5.setVisibility(View.INVISIBLE);				
			}
			else if (onToggleClicked(btn3) == false && onToggleClicked(btn4) == false && onToggleClicked(btn5) == true){
				btn3.setText(getString(R.string.p3s0));
				btn4.setText(getString(R.string.p4s0));
				btn5.setText(getString(R.string.p5s1) + m2h);
				sp3.setVisibility(View.INVISIBLE);
				sp4.setVisibility(View.INVISIBLE);
				sp5.setVisibility(View.VISIBLE);
				spinner1(sp5);
			}
			else {
				btn3.setText(getString(R.string.p3s0));
				btn4.setText(getString(R.string.p4s0));
				btn5.setText(getString(R.string.p5s0));
				sp3.setVisibility(View.INVISIBLE);
				sp4.setVisibility(View.INVISIBLE);
				sp5.setVisibility(View.INVISIBLE);
			}
		}
	};
	
	private OnClickListener ButtonMenuListener3 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn6) == true && onToggleClicked(btn7) == true && onToggleClicked(btn8) == true){
				btn6.setText(getString(R.string.p6s1) + (m3l * 2));
				btn7.setText(getString(R.string.p7s1) + (m3l * 2));
				btn8.setText(getString(R.string.p8s1) + (m3h * 2));
				sp6.setVisibility(View.VISIBLE);
				spinner2(sp6);
				sp7.setVisibility(View.VISIBLE);
				spinner2(sp7);
				sp8.setVisibility(View.VISIBLE);
				spinner2(sp8);
			}
			else if (onToggleClicked(btn6) == true && onToggleClicked(btn7) == true && onToggleClicked(btn8) == false){
				btn6.setText(getString(R.string.p6s1) + m3l);
				btn7.setText(getString(R.string.p7s1) + m3l);
				btn8.setText(getString(R.string.p8s0));
				sp6.setVisibility(View.VISIBLE);
				spinner1(sp6);
				sp7.setVisibility(View.VISIBLE);
				spinner1(sp7);
				sp8.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn6) == true && onToggleClicked(btn7) == false && onToggleClicked(btn8) == true){
				btn6.setText(getString(R.string.p6s1) + m3l);
				btn7.setText(getString(R.string.p7s0));
				btn8.setText(getString(R.string.p8s1) + m3h);
				sp6.setVisibility(View.VISIBLE);
				spinner1(sp6);
				sp7.setVisibility(View.INVISIBLE);
				sp8.setVisibility(View.VISIBLE);
				spinner1(sp8);
			}
			else if (onToggleClicked(btn6) == true && onToggleClicked(btn7) == false && onToggleClicked(btn8) == false){
				btn6.setText(getString(R.string.p6s1) + m3l);
				btn7.setText(getString(R.string.p7s0));
				btn8.setText(getString(R.string.p8s0));
				sp6.setVisibility(View.VISIBLE);
				spinner1(sp6);
				sp7.setVisibility(View.INVISIBLE);
				sp8.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn6) == false && onToggleClicked(btn7) == true && onToggleClicked(btn8) == true){
				btn6.setText(getString(R.string.p6s0));
				btn7.setText(getString(R.string.p7s1) + m3l);
				btn8.setText(getString(R.string.p8s1) + m3h);
				sp6.setVisibility(View.INVISIBLE);
				sp7.setVisibility(View.VISIBLE);
				spinner1(sp7);
				sp8.setVisibility(View.VISIBLE);
				spinner1(sp8);
			}
			else if (onToggleClicked(btn6) == false && onToggleClicked(btn7) == true && onToggleClicked(btn8) == false){
				btn6.setText(getString(R.string.p6s0));
				btn7.setText(getString(R.string.p7s1) + m3l);
				btn8.setText(getString(R.string.p8s0));
				sp6.setVisibility(View.INVISIBLE);
				sp7.setVisibility(View.VISIBLE);
				spinner1(sp7);
				sp8.setVisibility(View.INVISIBLE);				
			}
			else if (onToggleClicked(btn6) == false && onToggleClicked(btn7) == false && onToggleClicked(btn8) == true){
				btn6.setText(getString(R.string.p6s0));
				btn7.setText(getString(R.string.p7s0));
				btn8.setText(getString(R.string.p8s1) + m3h);
				sp6.setVisibility(View.INVISIBLE);
				sp7.setVisibility(View.INVISIBLE);
				sp8.setVisibility(View.VISIBLE);
				spinner1(sp8);
			}
			else {
				btn6.setText(getString(R.string.p6s0));
				btn7.setText(getString(R.string.p7s0));
				btn8.setText(getString(R.string.p8s0));
				sp6.setVisibility(View.INVISIBLE);
				sp7.setVisibility(View.INVISIBLE);
				sp8.setVisibility(View.INVISIBLE);
			}
		}
	};
	
	private OnClickListener ButtonMenuListener4 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn9) == true && onToggleClicked(btn10) == true && onToggleClicked(btn11) == true){
				btn9.setText(getString(R.string.p9s1) + (m4l * 2));
				btn10.setText(getString(R.string.p10s1) + (m4l * 2));
				btn11.setText(getString(R.string.p11s1) + (m4h * 2));
				sp9.setVisibility(View.VISIBLE);
				spinner2(sp9);
				sp10.setVisibility(View.VISIBLE);
				spinner2(sp10);
				sp11.setVisibility(View.VISIBLE);
				spinner2(sp11);
			}
			else if (onToggleClicked(btn9) == true && onToggleClicked(btn10) == true && onToggleClicked(btn11) == false){
				btn9.setText(getString(R.string.p9s1) + m4l);
				btn10.setText(getString(R.string.p10s1) + m4l);
				btn11.setText(getString(R.string.p11s0));
				sp9.setVisibility(View.VISIBLE);
				spinner1(sp9);
				sp10.setVisibility(View.VISIBLE);
				spinner1(sp10);
				sp11.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn9) == true && onToggleClicked(btn10) == false && onToggleClicked(btn11) == true){
				btn9.setText(getString(R.string.p9s1) + m4l);
				btn10.setText(getString(R.string.p10s0));
				btn11.setText(getString(R.string.p11s1) + m4h);
				sp9.setVisibility(View.VISIBLE);
				spinner1(sp9);
				sp10.setVisibility(View.INVISIBLE);
				sp11.setVisibility(View.VISIBLE);
				spinner1(sp11);
			}
			else if (onToggleClicked(btn9) == true && onToggleClicked(btn10) == false && onToggleClicked(btn11) == false){
				btn9.setText(getString(R.string.p9s1) + m4l);
				btn10.setText(getString(R.string.p10s0));
				btn11.setText(getString(R.string.p11s0));
				sp9.setVisibility(View.VISIBLE);
				spinner1(sp9);
				sp10.setVisibility(View.INVISIBLE);
				sp11.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn9) == false && onToggleClicked(btn10) == true && onToggleClicked(btn11) == true){
				btn9.setText(getString(R.string.p9s0));
				btn10.setText(getString(R.string.p10s1) + m4l);
				btn11.setText(getString(R.string.p11s1) + m4h);
				sp9.setVisibility(View.INVISIBLE);
				sp10.setVisibility(View.VISIBLE);
				spinner1(sp10);
				sp11.setVisibility(View.VISIBLE);
				spinner1(sp11);
			}
			else if (onToggleClicked(btn10) == false && onToggleClicked(btn11) == true && onToggleClicked(btn12) == false){
				btn10.setText(getString(R.string.p10s0));
				btn11.setText(getString(R.string.p11s1) + m4l);
				btn12.setText(getString(R.string.p12s0));
				sp10.setVisibility(View.INVISIBLE);
				sp11.setVisibility(View.VISIBLE);
				spinner1(sp11);
				sp12.setVisibility(View.INVISIBLE);				
			}
			else if (onToggleClicked(btn9) == false && onToggleClicked(btn10) == false && onToggleClicked(btn11) == true){
				btn9.setText(getString(R.string.p9s0));
				btn10.setText(getString(R.string.p10s0));
				btn11.setText(getString(R.string.p11s1) + m4h);
				sp9.setVisibility(View.INVISIBLE);
				sp10.setVisibility(View.INVISIBLE);
				sp11.setVisibility(View.VISIBLE);
				spinner1(sp11);
			}
			else {
				btn9.setText(getString(R.string.p9s0));
				btn10.setText(getString(R.string.p10s0));
				btn11.setText(getString(R.string.p11s0));
				sp9.setVisibility(View.INVISIBLE);
				sp10.setVisibility(View.INVISIBLE);
				sp11.setVisibility(View.INVISIBLE);
			}
		}
	};
	private OnClickListener ButtonMenuListener5 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn12) == true && onToggleClicked(btn13) == true && onToggleClicked(btn14) == true){
				btn12.setText(getString(R.string.p12s1) + (m5l * 2));
				btn13.setText(getString(R.string.p13s1) + (m5l * 2));
				btn14.setText(getString(R.string.p14s1) + (m5h * 2));
				sp12.setVisibility(View.VISIBLE);
				spinner2(sp12);
				sp13.setVisibility(View.VISIBLE);
				spinner2(sp13);
				sp14.setVisibility(View.VISIBLE);
				spinner2(sp14);
			}
			else if (onToggleClicked(btn12) == true && onToggleClicked(btn13) == true && onToggleClicked(btn14) == false){
				btn12.setText(getString(R.string.p12s1) + m5l);
				btn13.setText(getString(R.string.p13s1) + m5l);
				btn14.setText(getString(R.string.p14s0));
				sp12.setVisibility(View.VISIBLE);
				spinner1(sp12);
				sp13.setVisibility(View.VISIBLE);
				spinner1(sp13);
				sp14.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn12) == true && onToggleClicked(btn13) == false && onToggleClicked(btn14) == true){
				btn12.setText(getString(R.string.p12s1) + m5l);
				btn13.setText(getString(R.string.p13s0));
				btn14.setText(getString(R.string.p14s1) + m5h);
				sp12.setVisibility(View.VISIBLE);
				spinner1(sp12);
				sp13.setVisibility(View.INVISIBLE);
				sp14.setVisibility(View.VISIBLE);
				spinner1(sp14);
			}
			else if (onToggleClicked(btn12) == true && onToggleClicked(btn13) == false && onToggleClicked(btn14) == false){
				btn12.setText(getString(R.string.p12s1) + m5l);
				btn13.setText(getString(R.string.p13s0));
				btn14.setText(getString(R.string.p14s0));
				sp12.setVisibility(View.VISIBLE);
				spinner1(sp12);
				sp13.setVisibility(View.INVISIBLE);
				sp14.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn12) == false && onToggleClicked(btn13) == true && onToggleClicked(btn14) == true){
				btn12.setText(getString(R.string.p12s0));
				btn13.setText(getString(R.string.p13s1) + m5l);
				btn14.setText(getString(R.string.p14s1) + m5h);
				sp12.setVisibility(View.INVISIBLE);
				sp13.setVisibility(View.VISIBLE);
				spinner1(sp13);
				sp14.setVisibility(View.VISIBLE);
				spinner1(sp14);
			}
			else if (onToggleClicked(btn12) == false && onToggleClicked(btn13) == true && onToggleClicked(btn14) == false){
				btn12.setText(getString(R.string.p12s0));
				btn13.setText(getString(R.string.p13s1) + m5l);
				btn14.setText(getString(R.string.p14s0));
				sp12.setVisibility(View.INVISIBLE);
				sp13.setVisibility(View.VISIBLE);
				spinner1(sp13);
				sp14.setVisibility(View.INVISIBLE);				
			}
			else if (onToggleClicked(btn12) == false && onToggleClicked(btn13) == false && onToggleClicked(btn14) == true){
				btn12.setText(getString(R.string.p12s0));
				btn13.setText(getString(R.string.p13s0));
				btn14.setText(getString(R.string.p14s1) + m5h);
				sp12.setVisibility(View.INVISIBLE);
				sp13.setVisibility(View.INVISIBLE);
				sp14.setVisibility(View.VISIBLE);
				spinner1(sp14);
			}
			else {
				btn12.setText(getString(R.string.p12s0));
				btn13.setText(getString(R.string.p13s0));
				btn14.setText(getString(R.string.p14s0));
				sp12.setVisibility(View.INVISIBLE);
				sp13.setVisibility(View.INVISIBLE);
				sp14.setVisibility(View.INVISIBLE);
			}
		}
	};
	
	private OnClickListener ButtonMenuListener6 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn15) == true && onToggleClicked(btn16) == true && onToggleClicked(btn17) == true){
				btn15.setText(getString(R.string.p15s1) + (m6l * 2));
				btn16.setText(getString(R.string.p16s1) + (m6l * 2));
				btn17.setText(getString(R.string.p17s1) + (m6h * 2));
				sp15.setVisibility(View.VISIBLE);
				spinner2(sp15);
				sp16.setVisibility(View.VISIBLE);
				spinner2(sp16);
				sp17.setVisibility(View.VISIBLE);
				spinner2(sp17);
			}
			else if (onToggleClicked(btn15) == true && onToggleClicked(btn16) == true && onToggleClicked(btn17) == false){
				btn15.setText(getString(R.string.p15s1) + m6l);
				btn16.setText(getString(R.string.p16s1) + m6l);
				btn17.setText(getString(R.string.p17s0));
				sp15.setVisibility(View.VISIBLE);
				spinner1(sp15);
				sp16.setVisibility(View.VISIBLE);
				spinner1(sp16);
				sp17.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn15) == true && onToggleClicked(btn16) == false && onToggleClicked(btn17) == true){
				btn15.setText(getString(R.string.p15s1) + m6l);
				btn16.setText(getString(R.string.p16s0));
				btn17.setText(getString(R.string.p17s1) + m6h);
				sp15.setVisibility(View.VISIBLE);
				spinner1(sp15);
				sp16.setVisibility(View.INVISIBLE);
				sp17.setVisibility(View.VISIBLE);
				spinner1(sp17);
			}
			else if (onToggleClicked(btn15) == true && onToggleClicked(btn16) == false && onToggleClicked(btn17) == false){
				btn15.setText(getString(R.string.p15s1) + m6l);
				btn16.setText(getString(R.string.p16s0));
				btn17.setText(getString(R.string.p17s0));
				sp15.setVisibility(View.VISIBLE);
				spinner1(sp15);
				sp16.setVisibility(View.INVISIBLE);
				sp17.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn15) == false && onToggleClicked(btn16) == true && onToggleClicked(btn17) == true){
				btn15.setText(getString(R.string.p15s0));
				btn16.setText(getString(R.string.p16s1) + m6l);
				btn17.setText(getString(R.string.p17s1) + m6h);
				sp15.setVisibility(View.INVISIBLE);
				sp16.setVisibility(View.VISIBLE);
				spinner1(sp16);
				sp17.setVisibility(View.VISIBLE);
				spinner1(sp17);
			}
			else if (onToggleClicked(btn15) == false && onToggleClicked(btn16) == true && onToggleClicked(btn17) == false){
				btn15.setText(getString(R.string.p15s0));
				btn16.setText(getString(R.string.p16s1) + m6l);
				btn17.setText(getString(R.string.p17s0));
				sp15.setVisibility(View.INVISIBLE);
				sp16.setVisibility(View.VISIBLE);
				spinner1(sp16);
				sp17.setVisibility(View.INVISIBLE);				
			}
			else if (onToggleClicked(btn15) == false && onToggleClicked(btn16) == false && onToggleClicked(btn17) == true){
				btn15.setText(getString(R.string.p15s0));
				btn16.setText(getString(R.string.p16s0));
				btn17.setText(getString(R.string.p17s1) + m6h);
				sp15.setVisibility(View.INVISIBLE);
				sp16.setVisibility(View.INVISIBLE);
				sp17.setVisibility(View.VISIBLE);
				spinner1(sp17);
			}
			else {
				btn15.setText(getString(R.string.p15s0));
				btn16.setText(getString(R.string.p16s0));
				btn17.setText(getString(R.string.p17s0));
				sp15.setVisibility(View.INVISIBLE);
				sp16.setVisibility(View.INVISIBLE);
				sp17.setVisibility(View.INVISIBLE);
			}
		}
	};
	
	private OnClickListener ButtonMenuListener7 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn18) == true && onToggleClicked(btn19) == true && onToggleClicked(btn20) == true){
				btn18.setText(getString(R.string.p18s1) + (m7l * 2));
				btn19.setText(getString(R.string.p19s1) + (m7l * 2));
				btn20.setText(getString(R.string.p20s1) + (m7l * 2));
				sp18.setVisibility(View.VISIBLE);
				spinner2(sp18);
				sp19.setVisibility(View.VISIBLE);
				spinner2(sp19);
				sp20.setVisibility(View.VISIBLE);
				spinner2(sp20);
			}
			else if (onToggleClicked(btn18) == true && onToggleClicked(btn19) == true && onToggleClicked(btn20) == false){
				btn18.setText(getString(R.string.p18s1) + m7l);
				btn19.setText(getString(R.string.p19s1) + m7l);
				btn20.setText(getString(R.string.p20s0));
				sp18.setVisibility(View.VISIBLE);
				spinner1(sp18);
				sp19.setVisibility(View.VISIBLE);
				spinner1(sp19);
				sp20.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn18) == true && onToggleClicked(btn19) == false && onToggleClicked(btn20) == true){
				btn18.setText(getString(R.string.p18s1) + m7l);
				btn19.setText(getString(R.string.p19s0));
				btn20.setText(getString(R.string.p20s1) + m7h);
				sp18.setVisibility(View.VISIBLE);
				spinner1(sp18);
				sp19.setVisibility(View.INVISIBLE);
				sp20.setVisibility(View.VISIBLE);
				spinner1(sp20);
			}
			else if (onToggleClicked(btn18) == true && onToggleClicked(btn19) == false && onToggleClicked(btn20) == false){
				btn18.setText(getString(R.string.p18s1) + m7l);
				btn19.setText(getString(R.string.p19s0));
				btn20.setText(getString(R.string.p20s0));
				sp18.setVisibility(View.VISIBLE);
				spinner1(sp18);
				sp19.setVisibility(View.INVISIBLE);
				sp20.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn18) == false && onToggleClicked(btn19) == true && onToggleClicked(btn20) == true){
				btn18.setText(getString(R.string.p18s0));
				btn19.setText(getString(R.string.p19s1) + m7l);
				btn20.setText(getString(R.string.p20s1) + m7h);
				sp18.setVisibility(View.INVISIBLE);
				sp19.setVisibility(View.VISIBLE);
				spinner1(sp19);
				sp20.setVisibility(View.VISIBLE);
				spinner1(sp20);
			}
			else if (onToggleClicked(btn18) == false && onToggleClicked(btn19) == true && onToggleClicked(btn20) == false){
				btn18.setText(getString(R.string.p18s0));
				btn19.setText(getString(R.string.p19s1) + m7l);
				btn20.setText(getString(R.string.p20s0));
				sp18.setVisibility(View.INVISIBLE);
				sp19.setVisibility(View.VISIBLE);
				spinner1(sp19);
				sp20.setVisibility(View.INVISIBLE);				
			}
			else if (onToggleClicked(btn18) == false && onToggleClicked(btn19) == false && onToggleClicked(btn20) == true){
				btn18.setText(getString(R.string.p18s0));
				btn19.setText(getString(R.string.p19s0));
				btn20.setText(getString(R.string.p20s1) + m7h);
				sp18.setVisibility(View.INVISIBLE);
				sp19.setVisibility(View.INVISIBLE);
				sp20.setVisibility(View.VISIBLE);
				spinner1(sp20);
			}
			else {
				btn18.setText(getString(R.string.p18s0));
				btn19.setText(getString(R.string.p19s0));
				btn20.setText(getString(R.string.p20s0));
				sp18.setVisibility(View.INVISIBLE);
				sp19.setVisibility(View.INVISIBLE);
				sp20.setVisibility(View.INVISIBLE);
			}
		}
	};
	
	private OnClickListener ButtonMenuListener8 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn21) == true && onToggleClicked(btn22) == true){
				btn21.setText(getString(R.string.p21s1) + (m8l * 2));
				btn22.setText(getString(R.string.p22s1) + (m8h * 2));
				sp21.setVisibility(View.VISIBLE);
				spinner2(sp21);
				sp22.setVisibility(View.VISIBLE);
				spinner2(sp22);
			}
			else if (onToggleClicked(btn21) == true && onToggleClicked(btn22) == false){
				btn21.setText(getString(R.string.p21s1) + m8l);
				btn22.setText(getString(R.string.p22s0));
				sp21.setVisibility(View.VISIBLE);
				spinner1(sp21);
				sp22.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn21) == false && onToggleClicked(btn22) == true){
				btn21.setText(getString(R.string.p21s0));
				btn22.setText(getString(R.string.p22s1) + m8h);
				sp21.setVisibility(View.INVISIBLE);
				sp22.setVisibility(View.VISIBLE);
				spinner1(sp22);
			}
			else{
				btn21.setText(getString(R.string.p21s0));
				btn22.setText(getString(R.string.p22s0));
				sp21.setVisibility(View.INVISIBLE);
				sp22.setVisibility(View.INVISIBLE);
			}
		}
		
	};
	
	private OnClickListener ButtonMenuListener9 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn23) == true && onToggleClicked(btn24) == true){
				btn23.setText(getString(R.string.p23s2));
				btn24.setText(getString(R.string.p24s2));
				sp23.setVisibility(View.VISIBLE);
				spinner1(sp23);
				sp24.setVisibility(View.VISIBLE);
				spinner1(sp24);
			}
			else if (onToggleClicked(btn23) == true && onToggleClicked(btn24) == false){
				btn23.setText(getString(R.string.p23s1));
				btn24.setText(getString(R.string.p24s0));
				sp23.setVisibility(View.VISIBLE);
				spinner1(sp23);
				sp24.setVisibility(View.INVISIBLE);
			}
			else if (onToggleClicked(btn23) == false && onToggleClicked(btn24) == true){
				btn23.setText(getString(R.string.p23s0));
				btn24.setText(getString(R.string.p24s1));
				sp23.setVisibility(View.INVISIBLE);
				sp24.setVisibility(View.VISIBLE);
				spinner1(sp24);
			}
			else{
				btn23.setText(getString(R.string.p23s0));
				btn24.setText(getString(R.string.p24s0));
				sp23.setVisibility(View.INVISIBLE);
				sp24.setVisibility(View.INVISIBLE);
			}
		}
		
	};
	
	private OnClickListener ButtonMenuListener10 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn25) == true){
				rrcount++;
				btn25.setText(getString(R.string.p25s1) + (int) (25 * Math.pow(2, rrcount)));
				sp25.setVisibility(View.VISIBLE);
				spinner1(sp25);
				if(onToggleClicked(btn26) == true){
					btn26.setText(getString(R.string.p26s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn27) == true){
					btn27.setText(getString(R.string.p27s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn28) == true){
					btn28.setText(getString(R.string.p28s1) + (int) (25 * Math.pow(2, rrcount)));
				}
			}
			else{
				rrcount--;
				btn25.setText(getString(R.string.p25s0));
				sp25.setVisibility(View.INVISIBLE);
				if(onToggleClicked(btn26) == true){
					btn26.setText(getString(R.string.p26s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn27) == true){
					btn27.setText(getString(R.string.p27s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn28) == true){
					btn28.setText(getString(R.string.p28s1) + (int) (25 * Math.pow(2, rrcount)));
				}
			}
		}
	};
	
	private OnClickListener ButtonMenuListener11 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn26) == true){
				rrcount++;
				btn26.setText(getString(R.string.p26s1) + (int) (25 * Math.pow(2, rrcount)));
				sp26.setVisibility(View.VISIBLE);
				spinner1(sp26);
				if(onToggleClicked(btn25) == true){
					btn25.setText(getString(R.string.p25s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn27) == true){
					btn27.setText(getString(R.string.p27s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn28) == true){
					btn28.setText(getString(R.string.p28s1) + (int) (25 * Math.pow(2, rrcount)));
				}
			}
			else{
				rrcount--;
				btn26.setText(getString(R.string.p26s0));
				sp26.setVisibility(View.INVISIBLE);
				if(onToggleClicked(btn25) == true){
					btn25.setText(getString(R.string.p25s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn27) == true){
					btn27.setText(getString(R.string.p27s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn28) == true){
					btn28.setText(getString(R.string.p28s1) + (int) (25 * Math.pow(2, rrcount)));
				}
			}
		}
	};
	
	private OnClickListener ButtonMenuListener12 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn27) == true){
				rrcount++;
				btn27.setText(getString(R.string.p27s1) + (int) (25 * Math.pow(2, rrcount)));
				sp27.setVisibility(View.VISIBLE);
				spinner1(sp27);
				if(onToggleClicked(btn25) == true){
					btn25.setText(getString(R.string.p25s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn26) == true){
					btn26.setText(getString(R.string.p26s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn28) == true){
					btn28.setText(getString(R.string.p28s1) + (int) (25 * Math.pow(2, rrcount)));
				}
			}
			else{
				rrcount--;
				btn27.setText(getString(R.string.p27s0));
				sp27.setVisibility(View.INVISIBLE);
				if(onToggleClicked(btn25) == true){
					btn25.setText(getString(R.string.p25s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn26) == true){
					btn26.setText(getString(R.string.p26s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn28) == true){
					btn28.setText(getString(R.string.p28s1) + (int) (25 * Math.pow(2, rrcount)));
				}
			}
		}
	};
	
	private OnClickListener ButtonMenuListener13 = new OnClickListener(){
		public void onClick(View v){
			if (onToggleClicked(btn28) == true){
				rrcount++;
				btn28.setText(getString(R.string.p28s1) + (int) (25 * Math.pow(2, rrcount)));
				sp28.setVisibility(View.VISIBLE);
				spinner1(sp28);
				if(onToggleClicked(btn25) == true){
					btn25.setText(getString(R.string.p25s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn26) == true){
					btn26.setText(getString(R.string.p26s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn27) == true){
					btn27.setText(getString(R.string.p27s1) + (int) (25 * Math.pow(2, rrcount)));
				}
			}
			else{
				rrcount--;
				btn28.setText(getString(R.string.p28s0));
				sp28.setVisibility(View.INVISIBLE);
				if(onToggleClicked(btn25) == true){
					btn25.setText(getString(R.string.p25s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn27) == true){
					btn26.setText(getString(R.string.p26s1) + (int) (25 * Math.pow(2, rrcount)));
				}
				if(onToggleClicked(btn27) == true){
					btn27.setText(getString(R.string.p27s1) + (int) (25 * Math.pow(2, rrcount)));
				}
			}
		}
	};
	
	public boolean onToggleClicked(View view) {
	    // Is the toggle on?
	    boolean on = ((ToggleButton) view).isChecked();
	    
	    if (on) {
	       return true;
	    } else {
	        return false;
	    }
	}
	
	void spinner1(Spinner spinner){
		ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
		        R.array.p1a, android.R.layout.simple_spinner_item);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter1);
	}
	
	void spinner2(Spinner spinner){
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
		        R.array.p1b, android.R.layout.simple_spinner_item);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter2);
	}
	
	void spinnerselect(Spinner spinner, int pos, int btn){
		
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int pos,
			long id) {
		Spinner spinner = (Spinner) parent;
		switch(parent.getId()){
		case R.id.Spinner1:
			if(pos == 1){
				btn1.performClick();
				btn1.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn1.setText(getString(R.string.p1s1) + (10));
			}
			else if(pos ==3){
				btn1.setText(getString(R.string.p1s1) + (30));
			}
			else if(pos == 4){
				btn1.setText(getString(R.string.p1s1) + (90));
			}
			else if (pos == 5){
				btn1.setText(getString(R.string.p1s1) + (160));
			}
			else if(pos == 6){
				btn1.setText(getString(R.string.p1s1) + (250));
			}
			else if (pos == 7){
				btn1.setText(getString(R.string.p1s1) + (m1l * 2));
			}
			break;
		
		case R.id.Spinner2:
			if(pos == 1){
				btn2.performClick();
				btn2.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn2.setText(getString(R.string.p2s1) + (20));
			}
			else if(pos ==3){
				btn2.setText(getString(R.string.p2s1) + (60));
			}
			else if(pos == 4){
				btn2.setText(getString(R.string.p2s1) + (180));
			}
			else if (pos == 5){
				btn2.setText(getString(R.string.p2s1) + (320));
			}
			else if(pos == 6){
				btn2.setText(getString(R.string.p2s1) + (450));
			}
			else if (pos == 7){
				btn2.setText(getString(R.string.p2s1) + (m1h * 2));
			}
			break;
			
		case R.id.Spinner3:
			if(pos == 1){
				btn3.performClick();
				btn3.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn3.setText(getString(R.string.p3s1) + (30));
			}
			else if(pos == 3){
				btn3.setText(getString(R.string.p3s1) + (90));
			}
			else if(pos == 4){
				btn3.setText(getString(R.string.p3s1) + (270));
			}
			else if(pos == 5){
				btn3.setText(getString(R.string.p3s1) + (400));
			}
			else if(pos == 6){
				btn3.setText(getString(R.string.p3s1) + (550));
			}
			else if (pos == 7){
				btn3.setText(getString(R.string.p3s1) + (m2l * 2));
			}
			break;
			
		case R.id.Spinner4:
			if(pos == 1){
				btn4.performClick();
				btn4.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn4.setText(getString(R.string.p4s1) + (30));
			}
			else if(pos == 3){
				btn4.setText(getString(R.string.p4s1) + (90));
			}
			else if(pos == 4){
				btn4.setText(getString(R.string.p4s1) + (270));
			}
			else if(pos == 5){
				btn4.setText(getString(R.string.p4s1) + (440));
			}
			else if(pos == 6){
				btn4.setText(getString(R.string.p4s1) + (550));
			}
			else if (pos == 7){
				btn4.setText(getString(R.string.p4s1) + (m2l * 2));
			}
			break;
			
		case R.id.Spinner5:
			if(pos == 1){
				btn5.performClick();
				btn5.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn5.setText(getString(R.string.p5s1) + (40));
			}
			else if(pos == 3){
				btn5.setText(getString(R.string.p5s1) + (100));
			}
			else if(pos == 4){
				btn5.setText(getString(R.string.p5s1) + (300));
			}
			else if(pos == 5){
				btn5.setText(getString(R.string.p5s1) + (450));
			}
			else if(pos == 6){
				btn5.setText(getString(R.string.p5s1) + (600));
			}
			else if (pos == 7){
				btn5.setText(getString(R.string.p5s1) + (m2h * 2));
			}
			break;
			
		case R.id.Spinner6:
			if(pos == 1){
				btn6.performClick();
				btn6.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn6.setText(getString(R.string.p6s1) + (50));
			}
			else if(pos == 3){
				btn6.setText(getString(R.string.p6s1) + (150));
			}
			else if(pos == 4){
				btn6.setText(getString(R.string.p6s1) + (450));
			}
			else if(pos == 5){
				btn6.setText(getString(R.string.p6s1) + (625));
			}
			else if(pos == 6){
				btn6.setText(getString(R.string.p6s1) + (750));
			}
			else if (pos == 7){
				btn6.setText(getString(R.string.p6s1) + (m3l * 2));
			}
			break;
			
		case R.id.Spinner7:
			if(pos == 1){
				btn7.performClick();
				btn7.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn7.setText(getString(R.string.p7s1) + (50));
			}
			else if(pos == 3){
				btn7.setText(getString(R.string.p7s1) + (150));
			}
			else if(pos == 4){
				btn7.setText(getString(R.string.p7s1) + (450));
			}
			else if(pos == 5){
				btn7.setText(getString(R.string.p7s1) + (625));
			}
			else if(pos == 6){
				btn7.setText(getString(R.string.p7s1) + (750));
			}
			else if (pos == 7){
				btn7.setText(getString(R.string.p7s1) + (m3l * 2));
			}
			break;
			
		case R.id.Spinner8:
			if(pos == 1){
				btn8.performClick();
				btn8.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn8.setText(getString(R.string.p8s1) + (60));
			}
			else if(pos == 3){
				btn8.setText(getString(R.string.p8s1) + (180));
			}
			else if(pos == 4){
				btn8.setText(getString(R.string.p8s1) + (500));
			}
			else if(pos == 5){
				btn8.setText(getString(R.string.p8s1) + (700));
			}
			else if(pos == 6){
				btn8.setText(getString(R.string.p8s1) + (900));
			}
			else if (pos == 7){
				btn8.setText(getString(R.string.p8s1) + (m3h * 2));
			}
			break;
			
		case R.id.Spinner9:
			if(pos == 1){
				btn9.performClick();
				btn9.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn9.setText(getString(R.string.p9s1) + (70));
			}
			else if(pos == 3){
				btn9.setText(getString(R.string.p9s1) + (200));
			}
			else if(pos == 4){
				btn9.setText(getString(R.string.p9s1) + (550));
			}
			else if(pos == 5){
				btn9.setText(getString(R.string.p9s1) + (750));
			}
			else if(pos == 6){
				btn9.setText(getString(R.string.p9s1) + (950));
			}
			else if (pos == 7){
				btn9.setText(getString(R.string.p9s1) + (m4l * 2));
			}
			break;
			
		case R.id.Spinner10:
			if(pos == 1){
				btn10.performClick();
				btn10.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn10.setText(getString(R.string.p10s1) + (70));
			}
			else if(pos == 3){
				btn10.setText(getString(R.string.p10s1) + (200));
			}
			else if(pos == 4){
				btn10.setText(getString(R.string.p10s1) + (550));
			}
			else if(pos == 5){
				btn10.setText(getString(R.string.p10s1) + (750));
			}
			else if(pos == 6){
				btn10.setText(getString(R.string.p10s1) + (950));
			}
			else if (pos == 7){
				btn10.setText(getString(R.string.p10s1) + (m4l * 2));
			}
			break;
			
		case R.id.Spinner11:
			if(pos == 1){
				btn11.performClick();
				btn11.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn11.setText(getString(R.string.p11s1) + (80));
			}
			else if(pos == 3){
				btn11.setText(getString(R.string.p11s1) + (220));
			}
			else if(pos == 4){
				btn11.setText(getString(R.string.p11s1) + (600));
			}
			else if(pos == 5){
				btn11.setText(getString(R.string.p11s1) + (800));
			}
			else if(pos == 6){
				btn11.setText(getString(R.string.p11s1) + (1000));
			}
			else if (pos == 7){
				btn11.setText(getString(R.string.p11s1) + (m4h * 2));
			}
			break;
			
		case R.id.Spinner12:
			if(pos == 1){
				btn12.performClick();
				btn12.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn12.setText(getString(R.string.p12s1) + (90));
			}
			else if(pos == 3){
				btn12.setText(getString(R.string.p12s1) + (250));
			}
			else if(pos == 4){
				btn12.setText(getString(R.string.p12s1) + (700));
			}
			else if(pos == 5){
				btn12.setText(getString(R.string.p12s1) + (875));
			}
			else if(pos == 6){
				btn12.setText(getString(R.string.p12s1) + (1050));
			}
			else if (pos == 7){
				btn12.setText(getString(R.string.p12s1) + (m5l * 2));
			}
			break;
			
		case R.id.Spinner13:
			if(pos == 1){
				btn13.performClick();
				btn13.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn13.setText(getString(R.string.p13s1) + (90));
			}
			else if(pos == 3){
				btn13.setText(getString(R.string.p13s1) + (250));
			}
			else if(pos == 4){
				btn13.setText(getString(R.string.p13s1) + (700));
			}
			else if(pos == 5){
				btn13.setText(getString(R.string.p13s1) + (875));
			}
			else if(pos == 6){
				btn13.setText(getString(R.string.p13s1) + (1050));
			}
			else if (pos == 7){
				btn13.setText(getString(R.string.p13s1) + (m5l * 2));
			}
			break;
			
		case R.id.Spinner14:
			if(pos == 1){
				btn14.performClick();
				btn14.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn14.setText(getString(R.string.p14s1) + (100));
			}
			else if(pos == 3){
				btn14.setText(getString(R.string.p14s1) + (300));
			}
			else if(pos == 4){
				btn14.setText(getString(R.string.p14s1) + (750));
			}
			else if(pos == 5){
				btn14.setText(getString(R.string.p14s1) + (925));
			}
			else if(pos == 6){
				btn14.setText(getString(R.string.p14s1) + (1100));
			}
			else if (pos == 7){
				btn14.setText(getString(R.string.p14s1) + (m5h * 2));
			}
			break;
			
		case R.id.Spinner15:
			if(pos == 1){
				btn15.performClick();
				btn15.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn15.setText(getString(R.string.p15s1) + (110));
			}
			else if(pos == 3){
				btn15.setText(getString(R.string.p15s1) + (330));
			}
			else if(pos == 4){
				btn15.setText(getString(R.string.p15s1) + (800));
			}
			else if(pos == 5){
				btn15.setText(getString(R.string.p15s1) + (975));
			}
			else if(pos == 6){
				btn15.setText(getString(R.string.p15s1) + (1150));
			}
			else if (pos == 7){
				btn15.setText(getString(R.string.p15s1) + (m6l * 2));
			}
			break;
			
		case R.id.Spinner16:
			if(pos == 1){
				btn16.performClick();
				btn16.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn16.setText(getString(R.string.p16s1) + (110));
			}
			else if(pos == 3){
				btn16.setText(getString(R.string.p16s1) + (330));
			}
			else if(pos == 4){
				btn16.setText(getString(R.string.p16s1) + (800));
			}
			else if(pos == 5){
				btn16.setText(getString(R.string.p16s1) + (975));
			}
			else if(pos == 6){
				btn16.setText(getString(R.string.p16s1) + (1150));
			}
			else if (pos == 7){
				btn16.setText(getString(R.string.p16s1) + (m6l * 2));
			}
			break;
			
		case R.id.Spinner17:
			if(pos == 1){
				btn17.performClick();
				btn17.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn17.setText(getString(R.string.p17s1) + (120));
			}
			else if(pos == 3){
				btn17.setText(getString(R.string.p17s1) + (360));
			}
			else if(pos == 4){
				btn17.setText(getString(R.string.p17s1) + (850));
			}
			else if(pos == 5){
				btn17.setText(getString(R.string.p17s1) + (1025));
			}
			else if(pos == 6){
				btn17.setText(getString(R.string.p17s1) + (1200));
			}
			else if (pos == 7){
				btn17.setText(getString(R.string.p17s1) + (m6h * 2));
			}
			break;
			
		case R.id.Spinner18:
			if(pos == 1){
				btn18.performClick();
				btn18.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn18.setText(getString(R.string.p18s1) + (130));
			}
			else if(pos == 3){
				btn18.setText(getString(R.string.p18s1) + (390));
			}
			else if(pos == 4){
				btn18.setText(getString(R.string.p18s1) + (900));
			}
			else if(pos == 5){
				btn18.setText(getString(R.string.p18s1) + (1100));
			}
			else if(pos == 6){
				btn18.setText(getString(R.string.p18s1) + (1275));
			}
			else if (pos == 7){
				btn18.setText(getString(R.string.p18s1) + (m7l * 2));
			}
			break;
			
		case R.id.Spinner19:
			if(pos == 1){
				btn19.performClick();
				btn19.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn19.setText(getString(R.string.p19s1) + (130));
			}
			else if(pos == 3){
				btn19.setText(getString(R.string.p19s1) + (390));
			}
			else if(pos == 4){
				btn19.setText(getString(R.string.p19s1) + (900));
			}
			else if(pos == 5){
				btn19.setText(getString(R.string.p19s1) + (1100));
			}
			else if(pos == 6){
				btn19.setText(getString(R.string.p19s1) + (1275));
			}
			else if (pos == 7){
				btn19.setText(getString(R.string.p19s1) + (m7l * 2));
			}
			break;
			
		case R.id.Spinner20:
			if(pos == 1){
				btn20.performClick();
				btn20.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn20.setText(getString(R.string.p20s1) + (150));
			}
			else if(pos == 3){
				btn20.setText(getString(R.string.p20s1) + (450));
			}
			else if(pos == 4){
				btn20.setText(getString(R.string.p20s1) + (1000));
			}
			else if(pos == 5){
				btn20.setText(getString(R.string.p20s1) + (1200));
			}
			else if(pos == 6){
				btn20.setText(getString(R.string.p20s1) + (1400));
			}
			else if (pos == 7){
				btn20.setText(getString(R.string.p20s1) + (m7h * 2));
			}
			break;
			
		case R.id.Spinner21:
			if(pos == 1){
				btn21.performClick();
				btn21.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn21.setText(getString(R.string.p21s1) + (175));
			}
			else if(pos == 3){
				btn21.setText(getString(R.string.p21s1) + (500));
			}
			else if(pos == 4){
				btn21.setText(getString(R.string.p21s1) + (1100));
			}
			else if(pos == 5){
				btn21.setText(getString(R.string.p21s1) + (1300));
			}
			else if(pos == 6){
				btn21.setText(getString(R.string.p21s1) + (1500));
			}
			else if (pos == 7){
				btn21.setText(getString(R.string.p21s1) + (m8l * 2));
			}
			break;
			
		case R.id.Spinner22:
			if(pos == 1){
				btn22.performClick();
				btn22.setText("MORTGAGED!");
			}
			else if(pos == 2){
				btn22.setText(getString(R.string.p22s1) + (200));
			}
			else if(pos == 3){
				btn22.setText(getString(R.string.p22s1) + (600));
			}
			else if(pos == 4){
				btn22.setText(getString(R.string.p22s1) + (1400));
			}
			else if(pos == 5){
				btn22.setText(getString(R.string.p22s1) + (1700));
			}
			else if(pos == 6){
				btn22.setText(getString(R.string.p22s1) + (2000));
			}
			else if (pos == 7){
				btn22.setText(getString(R.string.p18s1) + (m8h * 2));
			}
			break;
			
		case R.id.Spinner23:
			if(pos == 1){
				btn23.performClick();
				btn23.setText("MORTGAGED!");
			}
			break;
			
		case R.id.Spinner24:
			if(pos == 1){
				btn24.performClick();
				btn24.setText("MORTGAGED!");
			}
			break;
			
		case R.id.Spinner25:
			if(pos == 1){
				btn25.performClick();
				btn25.setText("MORTGAGED!");
			}
			break;
		
		case R.id.Spinner26:
			if(pos == 1){
				btn26.performClick();
				btn26.setText("MORTGAGED!");
			}
			break;
			
		case R.id.Spinner27:
			if(pos == 1){
				btn27.performClick();
				btn27.setText("MORTGAGED!");
			}
			break;
			
		case R.id.Spinner28:
			if(pos == 1){
				btn28.performClick();
				btn28.setText("MORTGAGED!");
			}
			break;
		}
		
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
