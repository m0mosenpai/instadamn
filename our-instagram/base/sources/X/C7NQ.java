package X;

import android.database.DefaultDatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.7NQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NQ extends SQLiteOpenHelper {
    public static C7NQ A01;
    public SQLiteDatabase A00;

    public final synchronized SQLiteDatabase A01() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = this.A00;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            try {
                this.A00 = getWritableDatabase();
            } catch (SQLException | IllegalStateException unused) {
                AbstractC12290kX.A00.deleteDatabase("recent_searches.db");
            }
            sQLiteDatabase = this.A00;
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.sqlite.SQLiteOpenHelper, X.7NQ] */
    public static synchronized C7NQ A00() {
        C7NQ c7nq;
        synchronized (C7NQ.class) {
            C7NQ c7nq2 = A01;
            c7nq = c7nq2;
            if (c7nq2 == null) {
                ?? sQLiteOpenHelper = new SQLiteOpenHelper(AbstractC12290kX.A00, "recent_searches.db", null, 1, new DefaultDatabaseErrorHandler());
                A01 = sQLiteOpenHelper;
                c7nq = sQLiteOpenHelper;
            }
        }
        return c7nq;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C0fW.A00(-1359514729);
        sQLiteDatabase.execSQL("create table if not exists recent_searches(user_id text not null, target_key text not null, target_info text not null, last_picked_time_ms text not null,  primary key(user_id, target_key));");
        C0fW.A00(-1451991036);
    }
}
