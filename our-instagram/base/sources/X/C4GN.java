package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: X.4GN, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4GN {
    public static final void A00(SQLiteDatabase sQLiteDatabase) {
        C49692Qc c49692Qc;
        try {
            try {
                try {
                    C0fW.A03(sQLiteDatabase, 1442574722);
                    c49692Qc = C49682Qb.A06;
                } catch (IllegalStateException e) {
                    c49692Qc = C49682Qb.A06;
                    c49692Qc.A02(e);
                }
            } catch (SQLiteException e2) {
                c49692Qc = C49682Qb.A06;
                c49692Qc.A02(e2);
            }
            if (c49692Qc.A03()) {
                c49692Qc.A01();
            }
        } catch (Throwable th) {
            C49692Qc c49692Qc2 = C49682Qb.A06;
            if (c49692Qc2.A03()) {
                c49692Qc2.A01();
            }
            throw th;
        }
    }
}
