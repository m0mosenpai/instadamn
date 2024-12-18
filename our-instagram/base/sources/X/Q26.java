package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes10.dex */
public final class Q26 extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C0fW.A00(-827918443);
        sQLiteDatabase.execSQL("CREATE TABLE cached_resources (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, flavor TEXT NOT NULL, build_number INTEGER NOT NULL, version INTEGER NOT NULL, js_segment_hash TEXT)");
        C0fW.A00(1735183231);
        C0fW.A00(-1375424180);
        sQLiteDatabase.execSQL("CREATE INDEX index_name_flavor ON cached_resources (name, flavor)");
        C0fW.A00(763175481);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C0fW.A00(876313557);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cached_resources");
        C0fW.A00(848790150);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C0fW.A00(876313557);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cached_resources");
        C0fW.A00(848790150);
        onCreate(sQLiteDatabase);
    }
}
