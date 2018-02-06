package kamonchanok.krirk.ac.th.recordwieht;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kamonchanok.krirk.ac.th.recordwieht.utility.MyManager;

public class MainActivity extends AppCompatActivity {

    private MyManager myManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManager = new MyManager(MainActivity.this);

//        Test Add User
        myManager.addValueTOUserTABLE("nick", "start",
                "wight", "height", "gender",
                "age");


    }//Main Method
}//Main Class
