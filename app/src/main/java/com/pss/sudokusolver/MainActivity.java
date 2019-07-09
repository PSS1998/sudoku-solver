package com.pss.sudokusolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    Button button;

    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;
    EditText editText9;
    EditText editText10;
    EditText editText11;
    EditText editText12;
    EditText editText13;
    EditText editText14;
    EditText editText15;
    EditText editText16;
    EditText editText17;
    EditText editText18;
    EditText editText19;
    EditText editText20;
    EditText editText21;
    EditText editText22;
    EditText editText23;
    EditText editText24;
    EditText editText25;
    EditText editText26;
    EditText editText27;
    EditText editText28;
    EditText editText29;
    EditText editText30;
    EditText editText31;
    EditText editText32;
    EditText editText33;
    EditText editText34;
    EditText editText35;
    EditText editText36;
    EditText editText37;
    EditText editText38;
    EditText editText39;
    EditText editText40;
    EditText editText41;
    EditText editText42;
    EditText editText43;
    EditText editText44;
    EditText editText45;
    EditText editText46;
    EditText editText47;
    EditText editText48;
    EditText editText49;
    EditText editText50;
    EditText editText51;
    EditText editText52;
    EditText editText53;
    EditText editText54;
    EditText editText55;
    EditText editText56;
    EditText editText57;
    EditText editText58;
    EditText editText59;
    EditText editText60;
    EditText editText61;
    EditText editText62;
    EditText editText63;
    EditText editText64;
    EditText editText65;
    EditText editText66;
    EditText editText67;
    EditText editText68;
    EditText editText69;
    EditText editText70;
    EditText editText71;
    EditText editText72;
    EditText editText73;
    EditText editText74;
    EditText editText75;
    EditText editText76;
    EditText editText77;
    EditText editText78;
    EditText editText79;
    EditText editText80;
    EditText editText81;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
    }


    public void startSolvingSudoku(View v){

        char[][] board = new char[9][9];
        
        editText1 = (EditText) findViewById(R.id.editText1);
        if(editText1.getText().toString().equals("")){
            board[0][0] = '.';
        }
        else{
            board[0][0] = (char) editText1.getText().toString().charAt(0);
        }
        editText2 = (EditText) findViewById(R.id.editText2);
        if(editText2.getText().toString().equals("")){
            board[0][1] = '.';
        }
        else{
            board[0][1] = (char) editText2.getText().toString().charAt(0);
        }
        editText3 = (EditText) findViewById(R.id.editText3);
        if(editText3.getText().toString().equals("")){
            board[0][2] = '.';
        }
        else{
            board[0][2] = (char) editText3.getText().toString().charAt(0);
        }
        editText4 = (EditText) findViewById(R.id.editText4);
        if(editText4.getText().toString().equals("")){
            board[0][3] = '.';
        }
        else{
            board[0][3] = (char) editText4.getText().toString().charAt(0);
        }
        editText5 = (EditText) findViewById(R.id.editText5);
        if(editText5.getText().toString().equals("")){
            board[0][4] = '.';
        }
        else{
            board[0][4] = (char) editText5.getText().toString().charAt(0);
        }
        editText6 = (EditText) findViewById(R.id.editText6);
        if(editText6.getText().toString().equals("")){
            board[0][5] = '.';
        }
        else{
            board[0][5] = (char) editText6.getText().toString().charAt(0);
        }
        editText7 = (EditText) findViewById(R.id.editText7);
        if(editText7.getText().toString().equals("")){
            board[0][6] = '.';
        }
        else{
            board[0][6] = (char) editText7.getText().toString().charAt(0);
        }
        editText8 = (EditText) findViewById(R.id.editText8);
        if(editText8.getText().toString().equals("")){
            board[0][7] = '.';
        }
        else{
            board[0][7] = (char) editText8.getText().toString().charAt(0);
        }
        editText9 = (EditText) findViewById(R.id.editText9);
        if(editText9.getText().toString().equals("")){
            board[0][8] = '.';
        }
        else{
            board[0][8] = (char) editText9.getText().toString().charAt(0);
        }
        editText10 = (EditText) findViewById(R.id.editText10);
        if(editText10.getText().toString().equals("")){
            board[1][0] = '.';
        }
        else{
            board[1][0] = (char) editText10.getText().toString().charAt(0);
        }
        editText11 = (EditText) findViewById(R.id.editText11);
        if(editText11.getText().toString().equals("")){
            board[1][1] = '.';
        }
        else{
            board[1][1] = (char) editText11.getText().toString().charAt(0);
        }
        editText12 = (EditText) findViewById(R.id.editText12);
        if(editText12.getText().toString().equals("")){
            board[1][2] = '.';
        }
        else{
            board[1][2] = (char) editText12.getText().toString().charAt(0);
        }
        editText13 = (EditText) findViewById(R.id.editText13);
        if(editText13.getText().toString().equals("")){
            board[1][3] = '.';
        }
        else{
            board[1][3] = (char) editText13.getText().toString().charAt(0);
        }
        editText14 = (EditText) findViewById(R.id.editText14);
        if(editText14.getText().toString().equals("")){
            board[1][4] = '.';
        }
        else{
            board[1][4] = (char) editText14.getText().toString().charAt(0);
        }
        editText15 = (EditText) findViewById(R.id.editText15);
        if(editText15.getText().toString().equals("")){
            board[1][5] = '.';
        }
        else{
            board[1][5] = (char) editText15.getText().toString().charAt(0);
        }
        editText16 = (EditText) findViewById(R.id.editText16);
        if(editText16.getText().toString().equals("")){
            board[1][6] = '.';
        }
        else{
            board[1][6] = (char) editText16.getText().toString().charAt(0);
        }
        editText17 = (EditText) findViewById(R.id.editText17);
        if(editText17.getText().toString().equals("")){
            board[1][7] = '.';
        }
        else{
            board[1][7] = (char) editText17.getText().toString().charAt(0);
        }
        editText18 = (EditText) findViewById(R.id.editText18);
        if(editText18.getText().toString().equals("")){
            board[1][8] = '.';
        }
        else{
            board[1][8] = (char) editText18.getText().toString().charAt(0);
        }
        editText19 = (EditText) findViewById(R.id.editText19);
        if(editText19.getText().toString().equals("")){
            board[2][0] = '.';
        }
        else{
            board[2][0] = (char) editText19.getText().toString().charAt(0);
        }
        editText20 = (EditText) findViewById(R.id.editText20);
        if(editText20.getText().toString().equals("")){
            board[2][1] = '.';
        }
        else{
            board[2][1] = (char) editText20.getText().toString().charAt(0);
        }
        editText21 = (EditText) findViewById(R.id.editText21);
        if(editText21.getText().toString().equals("")){
            board[2][2] = '.';
        }
        else{
            board[2][2] = (char) editText21.getText().toString().charAt(0);
        }
        editText22 = (EditText) findViewById(R.id.editText22);
        if(editText22.getText().toString().equals("")){
            board[2][3] = '.';
        }
        else{
            board[2][3] = (char) editText22.getText().toString().charAt(0);
        }
        editText23 = (EditText) findViewById(R.id.editText23);
        if(editText23.getText().toString().equals("")){
            board[2][4] = '.';
        }
        else{
            board[2][4] = (char) editText23.getText().toString().charAt(0);
        }
        editText24 = (EditText) findViewById(R.id.editText24);
        if(editText24.getText().toString().equals("")){
            board[2][5] = '.';
        }
        else{
            board[2][5] = (char) editText24.getText().toString().charAt(0);
        }
        editText25 = (EditText) findViewById(R.id.editText25);
        if(editText25.getText().toString().equals("")){
            board[2][6] = '.';
        }
        else{
            board[2][6] = (char) editText25.getText().toString().charAt(0);
        }
        editText26 = (EditText) findViewById(R.id.editText26);
        if(editText26.getText().toString().equals("")){
            board[2][7] = '.';
        }
        else{
            board[2][7] = (char) editText26.getText().toString().charAt(0);
        }
        editText27 = (EditText) findViewById(R.id.editText27);
        if(editText27.getText().toString().equals("")){
            board[2][8] = '.';
        }
        else{
            board[2][8] = (char) editText27.getText().toString().charAt(0);
        }
        editText28 = (EditText) findViewById(R.id.editText28);
        if(editText28.getText().toString().equals("")){
            board[3][0] = '.';
        }
        else{
            board[3][0] = (char) editText28.getText().toString().charAt(0);
        }editText29 = (EditText) findViewById(R.id.editText29);
        if(editText29.getText().toString().equals("")){
            board[3][1] = '.';
        }
        else{
            board[3][1] = (char) editText29.getText().toString().charAt(0);
        }
        editText30 = (EditText) findViewById(R.id.editText30);
        if(editText30.getText().toString().equals("")){
            board[3][2] = '.';
        }
        else{
            board[3][2] = (char) editText30.getText().toString().charAt(0);
        }
        editText31 = (EditText) findViewById(R.id.editText31);
        if(editText31.getText().toString().equals("")){
            board[3][3] = '.';
        }
        else{
            board[3][3] = (char) editText31.getText().toString().charAt(0);
        }
        editText32 = (EditText) findViewById(R.id.editText32);
        if(editText32.getText().toString().equals("")){
            board[3][4] = '.';
        }
        else{
            board[3][4] = (char) editText32.getText().toString().charAt(0);
        }
        editText33 = (EditText) findViewById(R.id.editText33);
        if(editText33.getText().toString().equals("")){
            board[3][5] = '.';
        }
        else{
            board[3][5] = (char) editText33.getText().toString().charAt(0);
        }
        editText34 = (EditText) findViewById(R.id.editText34);
        if(editText34.getText().toString().equals("")){
            board[3][6] = '.';
        }
        else{
            board[3][6] = (char) editText34.getText().toString().charAt(0);
        }
        editText35 = (EditText) findViewById(R.id.editText35);
        if(editText35.getText().toString().equals("")){
            board[3][7] = '.';
        }
        else{
            board[3][7] = (char) editText35.getText().toString().charAt(0);
        }
        editText36 = (EditText) findViewById(R.id.editText36);
        if(editText36.getText().toString().equals("")){
            board[3][8] = '.';
        }
        else{
            board[3][8] = (char) editText36.getText().toString().charAt(0);
        }editText37 = (EditText) findViewById(R.id.editText37);
        if(editText37.getText().toString().equals("")){
            board[4][0] = '.';
        }
        else{
            board[4][0] = (char) editText37.getText().toString().charAt(0);
        }editText38 = (EditText) findViewById(R.id.editText38);
        if(editText38.getText().toString().equals("")){
            board[4][1] = '.';
        }
        else{
            board[4][1] = (char) editText38.getText().toString().charAt(0);
        }
        editText39 = (EditText) findViewById(R.id.editText39);
        if(editText39.getText().toString().equals("")){
            board[4][2] = '.';
        }
        else{
            board[4][2] = (char) editText39.getText().toString().charAt(0);
        }
        editText40 = (EditText) findViewById(R.id.editText40);
        if(editText40.getText().toString().equals("")){
            board[4][3] = '.';
        }
        else{
            board[4][3] = (char) editText40.getText().toString().charAt(0);
        }
        editText41 = (EditText) findViewById(R.id.editText41);
        if(editText41.getText().toString().equals("")){
            board[4][4] = '.';
        }
        else{
            board[4][4] = (char) editText41.getText().toString().charAt(0);
        }
        editText42 = (EditText) findViewById(R.id.editText42);
        if(editText42.getText().toString().equals("")){
            board[4][5] = '.';
        }
        else{
            board[4][5] = (char) editText42.getText().toString().charAt(0);
        }
        editText43 = (EditText) findViewById(R.id.editText43);
        if(editText43.getText().toString().equals("")){
            board[4][6] = '.';
        }
        else{
            board[4][6] = (char) editText43.getText().toString().charAt(0);
        }
        editText44 = (EditText) findViewById(R.id.editText44);
        if(editText44.getText().toString().equals("")){
            board[4][7] = '.';
        }
        else{
            board[4][7] = (char) editText44.getText().toString().charAt(0);
        }
        editText45 = (EditText) findViewById(R.id.editText45);
        if(editText45.getText().toString().equals("")){
            board[4][8] = '.';
        }
        else{
            board[4][8] = (char) editText45.getText().toString().charAt(0);
        }
        editText46 = (EditText) findViewById(R.id.editText46);
        if(editText46.getText().toString().equals("")){
            board[5][0] = '.';
        }
        else{
            board[5][0] = (char) editText46.getText().toString().charAt(0);
        }
        editText47 = (EditText) findViewById(R.id.editText47);
        if(editText47.getText().toString().equals("")){
            board[5][1] = '.';
        }
        else{
            board[5][1] = (char) editText47.getText().toString().charAt(0);
        }
        editText48 = (EditText) findViewById(R.id.editText48);
        if(editText48.getText().toString().equals("")){
            board[5][2] = '.';
        }
        else{
            board[5][2] = (char) editText48.getText().toString().charAt(0);
        }
        editText49 = (EditText) findViewById(R.id.editText49);
        if(editText49.getText().toString().equals("")){
            board[5][3] = '.';
        }
        else{
            board[5][3] = (char) editText49.getText().toString().charAt(0);
        }
        editText50 = (EditText) findViewById(R.id.editText50);
        if(editText50.getText().toString().equals("")){
            board[5][4] = '.';
        }
        else{
            board[5][4] = (char) editText50.getText().toString().charAt(0);
        }editText51 = (EditText) findViewById(R.id.editText51);
        if(editText51.getText().toString().equals("")){
            board[5][5] = '.';
        }
        else{
            board[5][5] = (char) editText51.getText().toString().charAt(0);
        }editText52 = (EditText) findViewById(R.id.editText52);
        if(editText52.getText().toString().equals("")){
            board[5][6] = '.';
        }
        else{
            board[5][6] = (char) editText52.getText().toString().charAt(0);
        }editText53 = (EditText) findViewById(R.id.editText53);
        if(editText53.getText().toString().equals("")){
            board[5][7] = '.';
        }
        else{
            board[5][7] = (char) editText53.getText().toString().charAt(0);
        }editText54 = (EditText) findViewById(R.id.editText54);
        if(editText54.getText().toString().equals("")){
            board[5][8] = '.';
        }
        else{
            board[5][8] = (char) editText54.getText().toString().charAt(0);
        }editText55 = (EditText) findViewById(R.id.editText55);
        if(editText55.getText().toString().equals("")){
            board[6][0] = '.';
        }
        else{
            board[6][0] = (char) editText55.getText().toString().charAt(0);
        }editText56 = (EditText) findViewById(R.id.editText56);
        if(editText56.getText().toString().equals("")){
            board[6][1] = '.';
        }
        else{
            board[6][1] = (char) editText56.getText().toString().charAt(0);
        }
        editText57 = (EditText) findViewById(R.id.editText57);
        if(editText57.getText().toString().equals("")){
            board[6][2] = '.';
        }
        else{
            board[6][2] = (char) editText57.getText().toString().charAt(0);
        }editText58 = (EditText) findViewById(R.id.editText58);
        if(editText58.getText().toString().equals("")){
            board[6][3] = '.';
        }
        else{
            board[6][3] = (char) editText58.getText().toString().charAt(0);
        }editText59 = (EditText) findViewById(R.id.editText59);
        if(editText59.getText().toString().equals("")){
            board[6][4] = '.';
        }
        else{
            board[6][4] = (char) editText59.getText().toString().charAt(0);
        }editText60 = (EditText) findViewById(R.id.editText60);
        if(editText60.getText().toString().equals("")){
            board[6][5] = '.';
        }
        else{
            board[6][5] = (char) editText60.getText().toString().charAt(0);
        }editText61 = (EditText) findViewById(R.id.editText61);
        if(editText61.getText().toString().equals("")){
            board[6][6] = '.';
        }
        else{
            board[6][6] = (char) editText61.getText().toString().charAt(0);
        }editText62 = (EditText) findViewById(R.id.editText62);
        if(editText62.getText().toString().equals("")){
            board[6][7] = '.';
        }
        else{
            board[6][7] = (char) editText62.getText().toString().charAt(0);
        }editText63 = (EditText) findViewById(R.id.editText63);
        if(editText63.getText().toString().equals("")){
            board[6][8] = '.';
        }
        else{
            board[6][8] = (char) editText63.getText().toString().charAt(0);
        }
        editText64 = (EditText) findViewById(R.id.editText64);
        if(editText64.getText().toString().equals("")){
            board[7][0] = '.';
        }
        else{
            board[7][0] = (char) editText64.getText().toString().charAt(0);
        }editText65 = (EditText) findViewById(R.id.editText65);
        if(editText65.getText().toString().equals("")){
            board[7][1] = '.';
        }
        else{
            board[7][1] = (char) editText65.getText().toString().charAt(0);
        }
        editText66 = (EditText) findViewById(R.id.editText66);
        if(editText66.getText().toString().equals("")){
            board[7][2] = '.';
        }
        else{
            board[7][2] = (char) editText66.getText().toString().charAt(0);
        }editText67 = (EditText) findViewById(R.id.editText67);
        if(editText67.getText().toString().equals("")){
            board[7][3] = '.';
        }
        else{
            board[7][3] = (char) editText67.getText().toString().charAt(0);
        }editText68 = (EditText) findViewById(R.id.editText68);
        if(editText68.getText().toString().equals("")){
            board[7][4] = '.';
        }
        else{
            board[7][4] = (char) editText68.getText().toString().charAt(0);
        }
        editText69 = (EditText) findViewById(R.id.editText69);
        if(editText69.getText().toString().equals("")){
            board[7][5] = '.';
        }
        else{
            board[7][5] = (char) editText69.getText().toString().charAt(0);
        }editText70 = (EditText) findViewById(R.id.editText70);
        if(editText70.getText().toString().equals("")){
            board[7][6] = '.';
        }
        else{
            board[7][6] = (char) editText70.getText().toString().charAt(0);
        }
        editText71 = (EditText) findViewById(R.id.editText71);
        if(editText71.getText().toString().equals("")){
            board[7][7] = '.';
        }
        else{
            board[7][7] = (char) editText71.getText().toString().charAt(0);
        }
        editText72 = (EditText) findViewById(R.id.editText72);
        if(editText72.getText().toString().equals("")){
            board[7][8] = '.';
        }
        else{
            board[7][8] = (char) editText72.getText().toString().charAt(0);
        }
        editText73 = (EditText) findViewById(R.id.editText73);
        if(editText73.getText().toString().equals("")){
            board[8][0] = '.';
        }
        else{
            board[8][0] = (char) editText73.getText().toString().charAt(0);
        }
        editText74 = (EditText) findViewById(R.id.editText74);
        if(editText74.getText().toString().equals("")){
            board[8][1] = '.';
        }
        else{
            board[8][1] = (char) editText74.getText().toString().charAt(0);
        }
        editText75 = (EditText) findViewById(R.id.editText75);
        if(editText75.getText().toString().equals("")){
            board[8][2] = '.';
        }
        else{
            board[8][2] = (char) editText75.getText().toString().charAt(0);
        }
        editText76 = (EditText) findViewById(R.id.editText76);
        if(editText76.getText().toString().equals("")){
            board[8][3] = '.';
        }
        else{
            board[8][3] = (char) editText76.getText().toString().charAt(0);
        }
        editText77 = (EditText) findViewById(R.id.editText77);
        if(editText77.getText().toString().equals("")){
            board[8][4] = '.';
        }
        else{
            board[8][4] = (char) editText77.getText().toString().charAt(0);
        }
        editText78 = (EditText) findViewById(R.id.editText78);
        if(editText78.getText().toString().equals("")){
            board[8][5] = '.';
        }
        else{
            board[8][5] = (char) editText78.getText().toString().charAt(0);
        }
        editText79 = (EditText) findViewById(R.id.editText79);
        if(editText79.getText().toString().equals("")){
            board[8][6] = '.';
        }
        else{
            board[8][6] = (char) editText79.getText().toString().charAt(0);
        }
        editText80 = (EditText) findViewById(R.id.editText80);
        if(editText80.getText().toString().equals("")){
            board[8][7] = '.';
        }
        else{
            board[8][7] = (char) editText80.getText().toString().charAt(0);
        }
        editText81 = (EditText) findViewById(R.id.editText81);
        if(editText81.getText().toString().equals("")){
            board[8][8] = '.';
        }
        else {
            board[8][8] = (char) editText81.getText().toString().charAt(0);
        }

        solveSudoku(board);

        editText1.setText(Character.toString(board[0][0]));
        editText2.setText(Character.toString(board[0][1]));
        editText3.setText(Character.toString(board[0][2]));
        editText4.setText(Character.toString(board[0][3]));
        editText5.setText(Character.toString(board[0][4]));
        editText6.setText(Character.toString(board[0][5]));
        editText7.setText(Character.toString(board[0][6]));
        editText8.setText(Character.toString(board[0][7]));
        editText9.setText(Character.toString(board[0][8]));
        editText10.setText(Character.toString(board[1][0]));
        editText11.setText(Character.toString(board[1][1]));
        editText12.setText(Character.toString(board[1][2]));
        editText13.setText(Character.toString(board[1][3]));
        editText14.setText(Character.toString(board[1][4]));
        editText15.setText(Character.toString(board[1][5]));
        editText16.setText(Character.toString(board[1][6]));
        editText17.setText(Character.toString(board[1][7]));
        editText18.setText(Character.toString(board[1][8]));
        editText19.setText(Character.toString(board[2][0]));
        editText20.setText(Character.toString(board[2][1]));
        editText21.setText(Character.toString(board[2][2]));
        editText22.setText(Character.toString(board[2][3]));
        editText23.setText(Character.toString(board[2][4]));
        editText24.setText(Character.toString(board[2][5]));
        editText25.setText(Character.toString(board[2][6]));
        editText26.setText(Character.toString(board[2][7]));
        editText27.setText(Character.toString(board[2][8]));
        editText28.setText(Character.toString(board[3][0]));
        editText29.setText(Character.toString(board[3][1]));
        editText30.setText(Character.toString(board[3][2]));
        editText31.setText(Character.toString(board[3][3]));
        editText32.setText(Character.toString(board[3][4]));
        editText33.setText(Character.toString(board[3][5]));
        editText34.setText(Character.toString(board[3][6]));
        editText35.setText(Character.toString(board[3][7]));
        editText36.setText(Character.toString(board[3][8]));
        editText37.setText(Character.toString(board[4][0]));
        editText38.setText(Character.toString(board[4][1]));
        editText39.setText(Character.toString(board[4][2]));
        editText40.setText(Character.toString(board[4][3]));
        editText41.setText(Character.toString(board[4][4]));
        editText42.setText(Character.toString(board[4][5]));
        editText43.setText(Character.toString(board[4][6]));
        editText44.setText(Character.toString(board[4][7]));
        editText45.setText(Character.toString(board[4][8]));
        editText46.setText(Character.toString(board[5][0]));
        editText47.setText(Character.toString(board[5][1]));
        editText48.setText(Character.toString(board[5][2]));
        editText49.setText(Character.toString(board[5][3]));
        editText50.setText(Character.toString(board[5][4]));
        editText51.setText(Character.toString(board[5][5]));
        editText52.setText(Character.toString(board[5][6]));
        editText53.setText(Character.toString(board[5][7]));
        editText54.setText(Character.toString(board[5][8]));
        editText55.setText(Character.toString(board[6][0]));
        editText56.setText(Character.toString(board[6][1]));
        editText57.setText(Character.toString(board[6][2]));
        editText58.setText(Character.toString(board[6][3]));
        editText59.setText(Character.toString(board[6][4]));
        editText60.setText(Character.toString(board[6][5]));
        editText61.setText(Character.toString(board[6][6]));
        editText62.setText(Character.toString(board[6][7]));
        editText63.setText(Character.toString(board[6][8]));
        editText64.setText(Character.toString(board[7][0]));
        editText65.setText(Character.toString(board[7][1]));
        editText66.setText(Character.toString(board[7][2]));
        editText67.setText(Character.toString(board[7][3]));
        editText68.setText(Character.toString(board[7][4]));
        editText69.setText(Character.toString(board[7][5]));
        editText70.setText(Character.toString(board[7][6]));
        editText71.setText(Character.toString(board[7][7]));
        editText72.setText(Character.toString(board[7][8]));
        editText73.setText(Character.toString(board[8][0]));
        editText74.setText(Character.toString(board[8][1]));
        editText75.setText(Character.toString(board[8][2]));
        editText76.setText(Character.toString(board[8][3]));
        editText77.setText(Character.toString(board[8][4]));
        editText78.setText(Character.toString(board[8][5]));
        editText79.setText(Character.toString(board[8][6]));
        editText80.setText(Character.toString(board[8][7]));
        editText81.setText(Character.toString(board[8][8]));

        
    }


    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.')
                    continue;

                for(int k=1; k<=9; k++){
                    board[i][j] = (char) (k+'0');
                    if(isValid(board, i, j) && solve(board))
                        return true;
                    board[i][j] = '.';
                }

                return false;
            }
        }

        return true; // does not matter
    }

    public boolean isValid(char[][] board, int i, int j){
        HashSet<Character> set = new HashSet<Character>();

        for(int k=0; k<9; k++){
            if(set.contains(board[i][k]))
                return false;

            if(board[i][k]!='.' ){
                set.add(board[i][k]);
            }
        }

        set.clear();

        for(int k=0; k<9; k++){
            if(set.contains(board[k][j]))
                return false;

            if(board[k][j]!='.' ){
                set.add(board[k][j]);
            }
        }

        set.clear();

        for(int m=0; m<3; m++){
            for(int n=0; n<3; n++){
                int x=i/3*3+m;
                int y=j/3*3+n;
                if(set.contains(board[x][y]))
                    return false;

                if(board[x][y]!='.'){
                    set.add(board[x][y]);
                }
            }
        }

        return true;
    }


}
