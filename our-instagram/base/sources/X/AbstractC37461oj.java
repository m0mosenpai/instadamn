package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37461oj {
    public static final C37471ok A00(SQLiteDatabase sQLiteDatabase, C30491d9 c30491d9) {
        C14360o3.A0B(c30491d9, 0);
        C37471ok c37471ok = c30491d9.A00;
        if (c37471ok == null || !C14360o3.A0K(c37471ok.A00, sQLiteDatabase)) {
            C37471ok c37471ok2 = new C37471ok(sQLiteDatabase);
            c30491d9.A00 = c37471ok2;
            return c37471ok2;
        }
        return c37471ok;
    }
}
