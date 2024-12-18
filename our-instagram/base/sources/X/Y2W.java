package X;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes12.dex */
public abstract class Y2W {
    public static void A00(SQLiteDatabase sQLiteDatabase, String str) {
        String A0R = AnonymousClass001.A0R("SAVEPOINT ", str);
        C0fW.A00(2024048005);
        sQLiteDatabase.execSQL(A0R);
        C0fW.A00(-409600105);
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, String str) {
        String A0R = AnonymousClass001.A0R("RELEASE SAVEPOINT ", str);
        C0fW.A00(-340401824);
        sQLiteDatabase.execSQL(A0R);
        C0fW.A00(-641267135);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str) {
        String A0R = AnonymousClass001.A0R(";ROLLBACK TRANSACTION TO SAVEPOINT ", str);
        C0fW.A00(884432524);
        sQLiteDatabase.execSQL(A0R);
        C0fW.A00(-1777013282);
    }
}
