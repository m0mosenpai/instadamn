package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.Closeable;
import java.util.List;

/* renamed from: X.RMl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60693RMl extends AbstractC60694RMm implements Closeable {
    public static final String A03 = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    public static final String A04 = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    public final SYI A00;
    public final SYI A01;
    public final Q28 A02;

    public static final long A01(C60693RMl c60693RMl, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = c60693RMl.A0J().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j = cursor.getLong(0);
                    cursor.close();
                    return j;
                }
                cursor.close();
                return 0L;
            } catch (SQLiteException e) {
                AbstractC63371Sic.A08(c60693RMl, str, e, null, "Database error", 6);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final SQLiteDatabase A0J() {
        try {
            return this.A02.getWritableDatabase();
        } catch (SQLiteException e) {
            A0F("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        r5 = new java.util.HashMap(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r5.startsWith("?") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        r5 = X.AbstractC58321PtD.A0w("?", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r5 = X.AbstractC62872SUw.A00(new java.net.URI(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        A0G("Error parsing hit parameters", r5);
        r5 = new java.util.HashMap(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        if (r8.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        r19 = r8.getLong(0);
        r17 = r8.getLong(1);
        r5 = r8.getString(2);
        r6 = r8.getString(3);
        r16 = r8.getInt(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A0K(long r23) {
        /*
            r22 = this;
            java.lang.String r6 = "hit_id"
            r9 = 1
            r1 = 0
            r2 = 0
            int r0 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1))
            boolean r0 = X.MSY.A1R(r0)
            X.C3U5.A07(r0)
            X.SX6.A00()
            r10 = r22
            r10.A0I()
            android.database.sqlite.SQLiteDatabase r11 = r10.A0J()
            r14 = 0
            java.lang.String r12 = "hits2"
            java.lang.String r8 = "hit_time"
            java.lang.String r7 = "hit_string"
            r3 = 2
            java.lang.String r5 = "hit_url"
            r2 = 3
            java.lang.String r4 = "hit_app_id"
            r0 = 4
            java.lang.String[] r13 = new java.lang.String[]{r6, r8, r7, r5, r4}     // Catch: android.database.sqlite.SQLiteException -> Lbd java.lang.Throwable -> Lc4
            java.lang.String r5 = "%s ASC"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch: android.database.sqlite.SQLiteException -> Lbd java.lang.Throwable -> Lc4
            java.lang.String r18 = java.lang.String.format(r5, r4)     // Catch: android.database.sqlite.SQLiteException -> Lbd java.lang.Throwable -> Lc4
            java.lang.String r19 = java.lang.Long.toString(r23)     // Catch: android.database.sqlite.SQLiteException -> Lbd java.lang.Throwable -> Lc4
            r15 = r14
            r16 = r14
            r17 = r14
            android.database.Cursor r8 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: android.database.sqlite.SQLiteException -> Lbd java.lang.Throwable -> Lc4
            java.util.ArrayList r7 = X.AbstractC166987dD.A1E()     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            boolean r4 = r8.moveToFirst()     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            if (r4 == 0) goto Lb3
        L4e:
            long r19 = r8.getLong(r1)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            long r17 = r8.getLong(r9)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            java.lang.String r5 = r8.getString(r3)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            java.lang.String r6 = r8.getString(r2)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            int r16 = r8.getInt(r0)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            java.lang.String r4 = "?"
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            if (r11 == 0) goto L93
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
        L6f:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            r21 = 1
            if (r4 != 0) goto L81
            java.lang.String r4 = "http:"
            boolean r4 = r6.startsWith(r4)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            if (r4 == 0) goto L81
            r21 = 0
        L81:
            X.SZ8 r4 = new X.SZ8     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            r15 = r5
            r12 = r4
            r13 = r10
            r12.<init>(r13, r14, r15, r16, r17, r19, r21)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            r7.add(r4)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            boolean r4 = r8.moveToNext()     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            if (r4 != 0) goto L4e
            goto Lb3
        L93:
            boolean r11 = r5.startsWith(r4)     // Catch: java.net.URISyntaxException -> La7 java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            if (r11 != 0) goto L9d
            java.lang.String r5 = X.AbstractC58321PtD.A0w(r4, r5)     // Catch: java.net.URISyntaxException -> La7 java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
        L9d:
            java.net.URI r4 = new java.net.URI     // Catch: java.net.URISyntaxException -> La7 java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            r4.<init>(r5)     // Catch: java.net.URISyntaxException -> La7 java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            java.util.Map r5 = X.AbstractC62872SUw.A00(r4)     // Catch: java.net.URISyntaxException -> La7 java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            goto L6f
        La7:
            r5 = move-exception
            java.lang.String r4 = "Error parsing hit parameters"
            r10.A0G(r4, r5)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Lb7 android.database.sqlite.SQLiteException -> Lba
            goto L6f
        Lb3:
            r8.close()
            return r7
        Lb7:
            r0 = move-exception
            r14 = r8
            goto Lc5
        Lba:
            r1 = move-exception
            r14 = r8
            goto Lbe
        Lbd:
            r1 = move-exception
        Lbe:
            java.lang.String r0 = "Error loading hits from the database"
            r10.A0G(r0, r1)     // Catch: java.lang.Throwable -> Lc4
            throw r1     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r0 = move-exception
        Lc5:
            if (r14 == 0) goto Lca
            r14.close()
        Lca:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60693RMl.A0K(long):java.util.ArrayList");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        String str;
        try {
            this.A02.close();
        } catch (SQLiteException e) {
            e = e;
            str = "Sql error closing database";
            A0G(str, e);
        } catch (IllegalStateException e2) {
            e = e2;
            str = "Error closing database";
            A0G(str, e);
        }
    }

    public C60693RMl(C63335Shm c63335Shm) {
        super(c63335Shm);
        InterfaceC65253Tgj interfaceC65253Tgj = ((AbstractC63371Sic) this).A00.A04;
        this.A00 = new SYI(interfaceC65253Tgj);
        this.A01 = new SYI(interfaceC65253Tgj);
        this.A02 = new Q28(c63335Shm.A00, this);
    }

    public static final long A00(C60693RMl c60693RMl) {
        SX6.A00();
        c60693RMl.A0I();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = c60693RMl.A0J().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                AbstractC63371Sic.A08(c60693RMl, "SELECT COUNT(*) FROM hits2", e, null, "Database error", 6);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void A0L() {
        A0I();
        C0fW.A03(A0J(), 1331138944);
    }

    public final void A0M(List list) {
        SX6.A00();
        A0I();
        if (!list.isEmpty()) {
            StringBuilder A0s = AbstractC58318PtA.A0s("hit_id");
            A0s.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Number number = (Number) list.get(i);
                if (number != null && number.longValue() != 0) {
                    if (i > 0) {
                        A0s.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                    A0s.append(number);
                } else {
                    throw new SQLiteException("Invalid hit id");
                }
            }
            String A0x = AbstractC166997dE.A0x(")", A0s);
            try {
                SQLiteDatabase A0J = A0J();
                A0D("Deleting dispatched hits. count", AbstractC43592JPx.A0s(list));
                int delete = A0J.delete("hits2", A0x, null);
                if (delete != list.size()) {
                    AbstractC63371Sic.A08(this, AbstractC43592JPx.A0s(list), Integer.valueOf(delete), A0x, "Deleted fewer hits then expected", 5);
                }
            } catch (SQLiteException e) {
                A0G("Error deleting hits", e);
                throw e;
            }
        }
    }
}
