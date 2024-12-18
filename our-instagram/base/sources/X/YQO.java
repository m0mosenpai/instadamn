package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes12.dex */
public interface YQO {
    static Cursor A00(YQO yqo, Object[] objArr) {
        return yqo.AX9().rawQuery((String) objArr[5], (String[]) objArr[6]);
    }

    SQLiteDatabase AX9();
}
