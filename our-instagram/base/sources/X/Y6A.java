package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes12.dex */
public abstract class Y6A {
    public static void A03(SQLiteDatabase sQLiteDatabase, String str, C72868Xpe[] c72868XpeArr) {
        sQLiteDatabase.delete("sqliteproc_schema", "table_name = ?", new String[]{str});
        ContentValues contentValues = new ContentValues();
        for (C72868Xpe c72868Xpe : c72868XpeArr) {
            contentValues.put("table_name", str);
            contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c72868Xpe.A03);
            contentValues.put("type_name", c72868Xpe.A06);
            contentValues.put("default_value", c72868Xpe.A00);
            contentValues.put("is_nullable", Boolean.valueOf(c72868Xpe.A0A));
            contentValues.put("is_primary", Boolean.valueOf(c72868Xpe.A0B));
            contentValues.put("is_autoincrement", Boolean.valueOf(c72868Xpe.A08));
            contentValues.put("is_deleted", Boolean.valueOf(c72868Xpe.A09));
            contentValues.put("is_added", Boolean.valueOf(c72868Xpe.A07));
            contentValues.put("foreign_table", c72868Xpe.A02);
            contentValues.put("foreign_column", c72868Xpe.A01);
            contentValues.put("on_foreign_key_update", c72868Xpe.A05);
            contentValues.put("on_foreign_key_delete", c72868Xpe.A04);
            C0fW.A00(-497728300);
            sQLiteDatabase.insert("sqliteproc_schema", null, contentValues);
            C0fW.A00(1954988663);
        }
    }

    public static String A00(YQO yqo, String str) {
        Cursor query;
        String str2;
        Object[] objArr = {"sqliteproc_metadata ", new String[]{"_id", "hash"}, "table_name = ?", new String[]{String.valueOf(str)}, null, null, null};
        if (objArr[5] != null) {
            query = YQO.A00(yqo, objArr);
        } else {
            query = yqo.AX9().query((String) objArr[0], (String[]) objArr[1], (String) objArr[2], (String[]) objArr[3], null, null, (String) objArr[4]);
        }
        if (query != null) {
            try {
                if (!query.isClosed()) {
                    if (query.moveToFirst()) {
                        str2 = query.getString(1);
                    } else {
                        str2 = null;
                    }
                    return str2;
                }
                String stackTraceString = android.util.Log.getStackTraceString(null);
                C0K8.A0C("AbstractDAOItem", stackTraceString);
                throw AbstractC31175DnJ.A0V(AbstractC111324zv.A00(144), stackTraceString);
            } finally {
                query.close();
            }
        }
        throw AbstractC166987dD.A12("cursor is null");
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("table_name", str);
        contentValues.put("hash", str2);
        contentValues.put("index_hash", str3);
        C0fW.A00(318032543);
        sQLiteDatabase.insertWithOnConflict("sqliteproc_metadata", null, contentValues, 5);
        C0fW.A00(-1918534415);
    }

    public static C72868Xpe[] A04(YQO yqo, String str) {
        Cursor query;
        Object[] objArr = {"sqliteproc_schema ", new String[]{"_id", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "type_name", "default_value", "is_nullable", "is_primary", "is_autoincrement", "is_deleted", "is_added", "foreign_table", "foreign_column", "on_foreign_key_update", "on_foreign_key_delete"}, "table_name = ?", new String[]{String.valueOf(str)}, null, null, null};
        if (objArr[5] != null) {
            query = YQO.A00(yqo, objArr);
        } else {
            query = yqo.AX9().query((String) objArr[0], (String[]) objArr[1], (String) objArr[2], (String[]) objArr[3], null, null, (String) objArr[4]);
        }
        if (query != null) {
            try {
                if (!query.isClosed()) {
                    C72868Xpe[] c72868XpeArr = new C72868Xpe[query.getCount()];
                    int i = 0;
                    while (!query.isClosed()) {
                        if (query.moveToNext()) {
                            if (query.getString(1) != null && query.getString(2) != null) {
                                c72868XpeArr[i] = new C72868Xpe(query.getString(1), query.getString(2), query.getString(3), query.getString(9), query.getString(10), query.getString(11), query.getString(12), AbstractC167007dF.A1M(query.getInt(4)), AbstractC167007dF.A1M(query.getInt(5)), AbstractC167007dF.A1M(query.getInt(6)), AbstractC167007dF.A1M(query.getInt(7)), AbstractC167007dF.A1M(query.getInt(8)));
                            }
                            i++;
                        } else {
                            return c72868XpeArr;
                        }
                    }
                    String stackTraceString = android.util.Log.getStackTraceString(null);
                    C0K8.A0C("AbstractDAOItem", stackTraceString);
                    throw AbstractC31175DnJ.A0V(AbstractC111324zv.A00(144), stackTraceString);
                }
                String stackTraceString2 = android.util.Log.getStackTraceString(null);
                C0K8.A0C("AbstractDAOItem", stackTraceString2);
                throw AbstractC31175DnJ.A0V(AbstractC111324zv.A00(144), stackTraceString2);
            } finally {
                query.close();
            }
        }
        throw AbstractC166987dD.A12("cursor is null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r3.close();
        r1.remove("__database__");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (r3.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        r1.add(r3.getString(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
    
        if (r3.moveToNext() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashSet A01(X.YQO r13) {
        /*
            java.util.HashSet r1 = X.AbstractC166987dD.A1H()
            java.lang.String r6 = "sqliteproc_metadata "
            r5 = 0
            java.lang.String r3 = "_id"
            java.lang.String r0 = "table_name"
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[]{r3, r0}
            r11 = 0
            r4 = 4
            r0 = 5
            r8 = r11
            r9 = r11
            r10 = r11
            r12 = r11
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12}
            r0 = r3[r0]
            if (r0 == 0) goto L24
            android.database.Cursor r3 = X.YQO.A00(r13, r3)
            goto L42
        L24:
            android.database.sqlite.SQLiteDatabase r6 = r13.AX9()
            r7 = r3[r5]
            java.lang.String r7 = (java.lang.String) r7
            r8 = r3[r2]
            java.lang.String[] r8 = (java.lang.String[]) r8
            r0 = 2
            r9 = r3[r0]
            java.lang.String r9 = (java.lang.String) r9
            r0 = 3
            r10 = r3[r0]
            java.lang.String[] r10 = (java.lang.String[]) r10
            r13 = r3[r4]
            java.lang.String r13 = (java.lang.String) r13
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11, r12, r13)
        L42:
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L55
        L48:
            java.lang.String r0 = r3.getString(r2)     // Catch: java.lang.Throwable -> L5e
            r1.add(r0)     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r3.moveToNext()     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L48
        L55:
            r3.close()
            java.lang.String r0 = "__database__"
            r1.remove(r0)
            return r1
        L5e:
            r1 = move-exception
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.lang.Throwable -> L65
            throw r1
        L65:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)
        L69:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y6A.A01(X.YQO):java.util.HashSet");
    }
}
