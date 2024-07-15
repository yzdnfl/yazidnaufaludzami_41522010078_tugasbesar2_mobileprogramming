package com.example.yazidnaufalhudzami_41522010078_tugasbesar2.database;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

import com.example.yazidnaufalhudzami_41522010078_tugasbesar2.model.TableRowCount;

import static com.example.yazidnaufalhudzami_41522010078_tugasbesar2.util.Constants.*;

public class TableRowCountQueryImplementation implements com.example.yazidnaufalhudzami_41522010078_tugasbesar2.database.QueryContract.TableRowCountQuery {

    @Override
    public void getTableRowCount(com.example.yazidnaufalhudzami_41522010078_tugasbesar2.database.QueryResponse<TableRowCount> response) {
        DatabaseHelper databaseHelper = DatabaseHelper.getInstance();
        SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();

        try {
            long studentCount = DatabaseUtils.queryNumEntries(sqLiteDatabase, TABLE_STUDENT);
            long subjectCount = DatabaseUtils.queryNumEntries(sqLiteDatabase, TABLE_SUBJECT);
            long takenSubjectCount = DatabaseUtils.queryNumEntries(sqLiteDatabase, TABLE_STUDENT_SUBJECT);

            TableRowCount tableRowCount = new TableRowCount(studentCount, subjectCount, takenSubjectCount);
            response.onSuccess(tableRowCount);

        } catch (Exception e){
            response.onFailure(e.getMessage());
        } finally {
            sqLiteDatabase.close();
        }

    }
}
