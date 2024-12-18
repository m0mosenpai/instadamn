package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.0fW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fW {
    public static final ThreadLocal A00 = new ThreadLocal() { // from class: X.0fV
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return Boolean.FALSE;
        }
    };

    public static void A03(SQLiteDatabase sQLiteDatabase, int i) {
        try {
            sQLiteDatabase.endTransaction();
            if (!sQLiteDatabase.inTransaction()) {
                A00.set(Boolean.FALSE);
            }
        } finally {
            ExternalProviders.A07.A07().A00(6, 22, i, 0L, 0);
        }
    }

    public static void A00(int i) {
        if (A00.get() == Boolean.FALSE) {
            ExternalProviders.A07.A07().A00(6, 20, i, 0L, 0);
        }
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, int i) {
        ExternalProviders.A07.A07().A00(6, 21, i, 0L, 0);
        sQLiteDatabase.beginTransaction();
        A00.set(Boolean.TRUE);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, int i) {
        ExternalProviders.A07.A07().A00(6, 21, i, 0L, 0);
        sQLiteDatabase.beginTransactionNonExclusive();
        A00.set(Boolean.TRUE);
    }
}
