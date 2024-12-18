package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class Q28 extends SQLiteOpenHelper {
    public final /* synthetic */ C60693RMl A00;

    private final boolean A01(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e) {
                this.A00.A0C(str, e, "Error querying for table");
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q28(Context context, C60693RMl c60693RMl) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A00 = c60693RMl;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        C60693RMl c60693RMl = this.A00;
        SYI syi = c60693RMl.A01;
        if (syi.A00(3600000L)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                syi.A00 = SystemClock.elapsedRealtime();
                AbstractC63371Sic.A09(c60693RMl, "Opening the database failed, dropping the table and recreating it", 6);
                ((AbstractC63371Sic) c60693RMl).A00.A00.getDatabasePath("google_analytics_v4.db").delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    syi.A00 = 0L;
                    return writableDatabase;
                } catch (SQLiteException e) {
                    c60693RMl.A0G("Failed to open freshly created database", e);
                    throw e;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r13) {
        /*
            r12 = this;
            java.lang.String r1 = "hits2"
            boolean r0 = r12.A01(r13, r1)
            r6 = 4
            r5 = 0
            if (r0 != 0) goto L35
            java.lang.String r1 = X.C60693RMl.A03
            r0 = 1798324468(0x6b3040f4, float:2.1307768E26)
            X.C0fW.A00(r0)
            r13.execSQL(r1)
            r0 = -1547315388(0xffffffffa3c5d744, float:-2.1449951E-17)
        L18:
            X.C0fW.A00(r0)
        L1b:
            java.lang.String r1 = "properties"
            boolean r0 = r12.A01(r13, r1)
            if (r0 != 0) goto L7d
            r0 = -704795070(0xffffffffd5fdae42, float:-3.486561E13)
            X.C0fW.A00(r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;"
            r13.execSQL(r0)
            r0 = -32037223(0xfffffffffe172699, float:-5.022846E37)
            X.C0fW.A00(r0)
            return
        L35:
            java.util.HashSet r4 = A00(r13, r1)
            java.lang.String r3 = "hit_id"
            java.lang.String r2 = "hit_string"
            java.lang.String r1 = "hit_time"
            java.lang.String r0 = "hit_url"
            java.lang.String[] r3 = new java.lang.String[]{r3, r2, r1, r0}
            r2 = 0
        L46:
            r1 = r3[r2]
            boolean r0 = r4.remove(r1)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "Database hits2 is missing required column: "
            java.lang.String r1 = X.AbstractC58321PtD.A0v(r0, r1)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L5a:
            int r2 = r2 + 1
            if (r2 < r6) goto L46
            java.lang.String r0 = "hit_app_id"
            boolean r0 = r4.remove(r0)
            r1 = r0 ^ 1
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lba
            if (r1 == 0) goto L1b
            r0 = 1723904935(0x66c0b3a7, float:4.550042E23)
            X.C0fW.A00(r0)
            java.lang.String r0 = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER"
            r13.execSQL(r0)
            r0 = -879796319(0xffffffffcb8f5fa1, float:-1.8792258E7)
            goto L18
        L7d:
            java.util.HashSet r4 = A00(r13, r1)
            r3 = 6
            java.lang.String r6 = "app_uid"
            java.lang.String r7 = "cid"
            java.lang.String r8 = "tid"
            java.lang.String r9 = "params"
            java.lang.String r10 = "adid"
            java.lang.String r11 = "hits_count"
            java.lang.String[] r2 = new java.lang.String[]{r6, r7, r8, r9, r10, r11}
        L93:
            r1 = r2[r5]
            boolean r0 = r4.remove(r1)
            if (r0 != 0) goto La7
            java.lang.String r0 = "Database properties is missing required column: "
            java.lang.String r1 = X.AbstractC58321PtD.A0v(r0, r1)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        La7:
            int r5 = r5 + 1
            if (r5 < r3) goto L93
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lb2
            return
        Lb2:
            java.lang.String r1 = "Database properties table has extra columns"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        Lba:
            java.lang.String r1 = "Database hits2 has extra columns"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q28.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public static HashSet A00(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet A1H = AbstractC166987dD.A1H();
        StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(str) + 22);
        A0q.append("SELECT * FROM ");
        A0q.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery(AbstractC166997dE.A0x(" LIMIT 0", A0q), null);
        try {
            for (String str2 : rawQuery.getColumnNames()) {
                A1H.add(str2);
            }
            return A1H;
        } finally {
            rawQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File A11 = AbstractC166987dD.A11(path);
                A11.setReadable(false, false);
                A11.setWritable(false, false);
                A11.setReadable(true, true);
                A11.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            AbstractC62208S2d.A00("Invalid version number", Build.VERSION.SDK);
        }
    }
}
