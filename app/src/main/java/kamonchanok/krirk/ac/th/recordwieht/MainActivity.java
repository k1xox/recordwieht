package kamonchanok.krirk.ac.th.recordwieht;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kamonchanok.krirk.ac.th.recordwieht.utility.MyManager;
import kamonchanok.krirk.ac.th.recordwieht.utility.MyOpenHelperSQLite;

public class MainActivity extends AppCompatActivity {

    private MyManager myManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManager = new MyManager(MainActivity.this);

//        Test Add User
//        testAddUser();

//        Delete All userTABlE
//        deleteAllUserTABlE();


    }//Main Method

    private void deleteAllUserTABlE() {
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelperSQLite.databaseName,
                MODE_PRIVATE, null);
        sqLiteDatabase.delete("userTABLE", null, null);
    }

    private void testAddUser() {
        myManager.addValueTOUserTABLE("nick", "start",
                "wight", "height", "gender",
                "age");
    }
}//Main Class
