package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes10.dex */
public final class Q29 extends SQLiteOpenHelper implements X7M {
    public final Object A00;

    public Q29(Context context) {
        super(context, "contacts_db2", (SQLiteDatabase.CursorFactory) null, 201);
        this.A00 = AbstractC58318PtA.A0b();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        if (i != 200) {
            C0fW.A00(-288956788);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts_upload_snapshot");
            C0fW.A00(-638734661);
            onCreate(sQLiteDatabase);
            return;
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(contacts_upload_snapshot)", null);
        do {
            try {
                z = false;
                if (!rawQuery.moveToNext()) {
                    break;
                } else {
                    z = true;
                }
            } finally {
                rawQuery.close();
            }
        } while (!"contact_extra_fields_hash".equalsIgnoreCase(rawQuery.getString(1)));
        if (z) {
            return;
        }
        C0fW.A00(-1058174775);
        sQLiteDatabase.execSQL("ALTER TABLE contacts_upload_snapshot ADD COLUMN contact_extra_fields_hash TEXT;");
        C0fW.A00(-945807519);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C0fW.A00(1099882532);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS contacts_upload_snapshot (local_contact_id INTEGER PRIMARY KEY, contact_hash TEXT, contact_extra_fields_hash TEXT);");
        C0fW.A00(394701484);
    }
}
