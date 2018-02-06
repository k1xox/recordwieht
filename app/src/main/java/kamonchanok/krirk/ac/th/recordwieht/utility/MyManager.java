package kamonchanok.krirk.ac.th.recordwieht.utility;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 30/1/2561.
 */

public class MyManager {

    private Context context;
    private MyOpenHelperSQLite myOpenHelperSQLite;
    private SQLiteDatabase sqLiteDatabase;

    public MyManager(Context context) {
        this.context = context;

        myOpenHelperSQLite = new MyOpenHelperSQLite(context);
        sqLiteDatabase = myOpenHelperSQLite.getWritableDatabase();


    }// Constructor

    //Add Value to userTABLE
    public long addValueTOUserTABLE(String nickNameString,
                                    String startAppString,
                                    String wieghtString,
                                    String heightString,
                                    String genderString,
                                    String ageString) {

        ContentValues contentValues = new ContentValues();
        contentValues.put("NickName",nickNameString);
        contentValues.put("StartApp",startAppString);
        contentValues.put("Weight",wieghtString);
        contentValues.put("Height",heightString);
        contentValues.put("Gender",genderString);
        contentValues.put("Age",ageString);


        return sqLiteDatabase.insert("userTABLE",null,contentValues);
    }




}// Main Class
