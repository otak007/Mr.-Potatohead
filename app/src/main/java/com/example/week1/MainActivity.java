package com.example.week1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Create the attributes
    private ImageView mustache;
    private ImageView ears;
    private ImageView hat;
    private ImageView shoes;
    private ImageView glasses;
    private ImageView eyes;
    private ImageView eyebrows;
    private ImageView arms;
    private ImageView mouth;
    private ImageView nose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mustache = (ImageView) findViewById(R.id.mustache);
        ears = (ImageView) findViewById(R.id.ears);
        hat = (ImageView) findViewById(R.id.hat);
        shoes = (ImageView) findViewById(R.id.shoes);
        glasses = (ImageView) findViewById(R.id.glasses);
        eyes = (ImageView) findViewById(R.id.eyes);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        arms = (ImageView) findViewById(R.id.arms);
        mouth = (ImageView) findViewById(R.id.mouth);
        nose = (ImageView) findViewById(R.id.nose);

    }
    // Save the visibilities of the attributes
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("mustacheVisible", mustache.getVisibility());
        outState.putInt("earsVisible", ears.getVisibility());
        outState.putInt("hatVisible", hat.getVisibility());
        outState.putInt("shoesVisible", shoes.getVisibility());
        outState.putInt("glassesVisible", glasses.getVisibility());
        outState.putInt("eyesVisible", eyes.getVisibility());
        outState.putInt("eyebrowsVisible", eyebrows.getVisibility());
        outState.putInt("armsVisible", arms.getVisibility());
        outState.putInt("mouthVisible", mouth.getVisibility());
        outState.putInt("noseVisible", nose.getVisibility());
    }

    // Preserve the visibilities after rotation.
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        mustache.setVisibility(inState.getInt("mustacheVisible"));
        ears.setVisibility(inState.getInt("earsVisible"));
        hat.setVisibility(inState.getInt("hatVisible"));
        shoes.setVisibility(inState.getInt("shoesVisible"));
        glasses.setVisibility(inState.getInt("glassesVisible"));
        eyes.setVisibility(inState.getInt("eyesVisible"));
        eyebrows.setVisibility(inState.getInt("eyebrowsVisible"));
        arms.setVisibility(inState.getInt("armsVisible"));
        mouth.setVisibility(inState.getInt("mouthVisible"));
        nose.setVisibility(inState.getInt("noseVisible"));
    }

    public void checkClicked(View v){
        Log.d( "potato", "checkClicked: ");

        CheckBox checkbox = (CheckBox) v;
        // Check if the checkbox is checked
        boolean checked = ((CheckBox) v).isChecked();

        // Change the visibilities of the attributes by clicking on the checkbox
        switch(v.getId()){
            case R.id.checkBoxMustache:
                if (checked){
                    mustache.setVisibility(View.VISIBLE);
                }
                else{
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEars:

                if (checked){
                    ears.setVisibility(View.VISIBLE);
                }
                else{
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxHat:
                if (checked){
                    hat.setVisibility(View.VISIBLE);
                }
                else{
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxShoes:
                if (checked){
                    shoes.setVisibility(View.VISIBLE);
                }
                else{
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxGlasses:
                if (checked){
                    glasses.setVisibility(View.VISIBLE);
                }
                else{
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEyes:
                if (checked){
                    eyes.setVisibility(View.VISIBLE);
                }
                else{
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEyebrows:
                if (checked){
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else{
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxArms:
                if (checked){
                    arms.setVisibility(View.VISIBLE);
                }
                else{
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxMouth:
                if (checked){
                    mouth.setVisibility(View.VISIBLE);
                }
                else{
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxNose:
                if (checked){
                    nose.setVisibility(View.VISIBLE);
                }
                else{
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

}
