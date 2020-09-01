package android.lab.pictureuploader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button imgButton;
    private ImageView imgID;
    private int array[];

    // function that returns an array of integers that are mapped to corresponding image files.
    public static int[] getImages(){

        int[] images = {R.drawable.meliodas, R.drawable.ban, R.drawable.merlin, R.drawable.diane, R.drawable.escanor, R.drawable.king, R.drawable.gowther};
        return images;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assigning variables with corresponding object IDs
        imgButton = findViewById(R.id.changepicBtn); // sets var to changepicBtn
        imgID = findViewById(R.id.imageID); // sets var to imageID
        array = getImages();

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int rand = (int) (Math.random() * array.length); // generates a random number within the range of the array size
                imgID.setImageResource(array[rand]);

            }
        });
    }
}
