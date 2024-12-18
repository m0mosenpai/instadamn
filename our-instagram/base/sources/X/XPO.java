package X;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class XPO extends SQLiteOpenHelper {
    public SQLiteDatabase A00;
    public final YQO A01;
    public final C72544XgD A02;
    public final C72545XgE A03;
    public final C72717Xlp A04;
    public final C72842Xog A05;

    public XPO(Context context, C72544XgD c72544XgD, C72545XgE c72545XgE, C72717Xlp c72717Xlp, C72842Xog c72842Xog) {
        super(context, "location_sharing.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.A01 = new YAB(this);
        this.A04 = c72717Xlp;
        this.A05 = c72842Xog;
        this.A02 = c72544XgD;
        this.A03 = c72545XgE;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        AbstractC09780fb.A01("onCreate", 1958808839);
        try {
            Y73.A02(sQLiteDatabase, "sqliteproc_metadata", YQK.A00, YQK.A01);
            Y73.A02(sQLiteDatabase, "sqliteproc_schema", YQL.A00, YQL.A01);
            AbstractC09780fb.A00(102040505);
        } catch (Throwable th) {
            AbstractC09780fb.A00(895824256);
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase);
        onCreate(sQLiteDatabase);
        AbstractC166987dD.A1H().add("metadata_version_downgrade");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x03c3 A[Catch: all -> 0x05b8, SQLiteException -> 0x05c1, TryCatch #10 {SQLiteException -> 0x05c1, all -> 0x05b8, blocks: (B:10:0x0063, B:11:0x0096, B:13:0x00ab, B:14:0x03b7, B:15:0x03bd, B:17:0x03c3, B:22:0x03de, B:25:0x03e7, B:26:0x03d4, B:31:0x042c, B:33:0x0432, B:34:0x044d, B:37:0x045c, B:38:0x0467, B:40:0x046d, B:43:0x0478, B:44:0x0482, B:46:0x0488, B:49:0x04a7, B:58:0x04ab, B:60:0x04b2, B:61:0x04c2, B:63:0x04c8, B:66:0x04d1, B:71:0x04da, B:72:0x04e0, B:74:0x04e6, B:77:0x04ef, B:82:0x04f8, B:84:0x04fb, B:86:0x0502, B:88:0x0514, B:90:0x0521, B:93:0x056c, B:94:0x057c, B:96:0x0582, B:98:0x05b0, B:100:0x0524, B:102:0x052b, B:104:0x053d, B:106:0x054a, B:110:0x054e, B:115:0x00b5, B:117:0x00bf, B:284:0x03af, B:299:0x0425, B:300:0x042b, B:119:0x00c7, B:121:0x00ef, B:123:0x00f9, B:125:0x00fd, B:127:0x0109, B:129:0x010f, B:131:0x0113, B:133:0x0117, B:139:0x012a, B:144:0x0139, B:138:0x014e, B:147:0x0144, B:150:0x0151, B:151:0x0155, B:153:0x015b, B:156:0x0165, B:163:0x0169, B:165:0x0172, B:167:0x0176, B:169:0x017a, B:171:0x017e, B:172:0x018a, B:175:0x019a, B:159:0x01a9, B:186:0x01b1, B:188:0x01e0, B:189:0x01e7, B:297:0x01ed, B:265:0x0423, B:191:0x01fc, B:295:0x0202, B:193:0x0211, B:293:0x0217, B:195:0x0228, B:291:0x022e, B:199:0x0241, B:201:0x0247, B:203:0x024e, B:205:0x0285, B:207:0x028b, B:209:0x02b3, B:217:0x02f4, B:219:0x02fd, B:241:0x0369, B:245:0x03ed, B:264:0x0420, B:276:0x0418, B:273:0x0414, B:278:0x02b8, B:279:0x036f, B:281:0x0375, B:283:0x037b, B:285:0x0382, B:286:0x0389, B:289:0x03a9, B:212:0x02e0, B:214:0x02e6, B:216:0x02ec, B:269:0x03ff, B:270:0x0412, B:221:0x0303, B:240:0x0351, B:256:0x035e, B:257:0x0364, B:262:0x0366), top: B:9:0x0063, outer: #8, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.Xlp, X.XSB] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.Xlp, X.XSB] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Xlp, X.XSB] */
    /* JADX WARN: Type inference failed for: r3v16, types: [X.Xlp, X.XSB] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.Xlp, X.XSB] */
    /* JADX WARN: Type inference failed for: r9v66, types: [X.Xlp, X.XSB] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r49) {
        /*
            Method dump skipped, instructions count: 1669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XPO.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (this.A00 == null) {
            onConfigure(sQLiteDatabase);
        }
        if (i < 3) {
            A00(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            AbstractC166987dD.A1H().add("metadata_version_upgrade_old");
            return;
        }
        AbstractC09780fb.A01("upgrade_metadata", -1719321993);
        Y2W.A00(sQLiteDatabase, "update_metadata_savepoint");
        C0fW.A00(-295715942);
        sQLiteDatabase.execSQL("PRAGMA defer_foreign_keys = ON");
        C0fW.A00(774941575);
        SQLException e = null;
        try {
            if (i == 3) {
                try {
                    C0fW.A00(-134207813);
                    sQLiteDatabase.execSQL("ALTER TABLE sqliteproc_metadata ADD COLUMN index_hash TEXT;");
                    C0fW.A00(-1409265254);
                    String A0g = AnonymousClass001.A0g("CREATE TABLE _temp_sqliteproc_schema (", "_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, table_name TEXT NOT NULL, name TEXT NOT NULL, type_name TEXT NOT NULL, default_value TEXT, is_nullable INTEGER NOT NULL, is_primary INTEGER NOT NULL, is_autoincrement INTEGER NOT NULL, is_deleted INTEGER NOT NULL, is_added INTEGER NOT NULL, foreign_table TEXT, foreign_column TEXT, on_foreign_key_update TEXT, on_foreign_key_delete TEXT", ")");
                    C0fW.A00(788577765);
                    sQLiteDatabase.execSQL(A0g);
                    C0fW.A00(228951583);
                    String A11 = AnonymousClass001.A11("INSERT OR IGNORE INTO _temp_sqliteproc_schema (", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", ")SELECT ", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", " FROM sqliteproc_schema;");
                    C0fW.A00(-176873696);
                    sQLiteDatabase.execSQL(A11);
                    C0fW.A00(1393872108);
                    C0fW.A00(1728415561);
                    sQLiteDatabase.execSQL("DROP TABLE sqliteproc_schema;");
                    C0fW.A00(-1817531416);
                    String A0g2 = AnonymousClass001.A0g("CREATE TABLE sqliteproc_schema (", "_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, table_name TEXT NOT NULL, name TEXT NOT NULL, type_name TEXT NOT NULL, default_value TEXT, is_nullable INTEGER NOT NULL, is_primary INTEGER NOT NULL, is_autoincrement INTEGER NOT NULL, is_deleted INTEGER NOT NULL, is_added INTEGER NOT NULL, foreign_table TEXT, foreign_column TEXT, on_foreign_key_update TEXT, on_foreign_key_delete TEXT", ")");
                    C0fW.A00(-564102168);
                    sQLiteDatabase.execSQL(A0g2);
                    C0fW.A00(-1398834549);
                    C0fW.A00(-1008897924);
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX sqliteproc_schema_name_table_name ON sqliteproc_schema(name, table_name)");
                    C0fW.A00(-581202494);
                    String A112 = AnonymousClass001.A11("INSERT OR IGNORE INTO sqliteproc_schema (", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", ")SELECT ", "_id, table_name, name, type_name, default_value, is_nullable, is_primary, is_autoincrement, is_deleted, is_added, foreign_table, foreign_column, on_foreign_key_update, on_foreign_key_delete", " FROM _temp_sqliteproc_schema;");
                    C0fW.A00(-1977747350);
                    sQLiteDatabase.execSQL(A112);
                    C0fW.A00(1503411433);
                    C0fW.A00(-736911587);
                    sQLiteDatabase.execSQL("DROP TABLE _temp_sqliteproc_schema");
                    C0fW.A00(-1718174911);
                } catch (SQLException e2) {
                    e = e2;
                    Y2W.A02(sQLiteDatabase, "update_metadata_savepoint");
                }
            }
            if (e != null) {
                A00(sQLiteDatabase);
                onCreate(sQLiteDatabase);
                AbstractC166987dD.A1H().add("metadata_version_upgrade_error");
            }
            AbstractC09780fb.A00(-813160151);
        } finally {
            Y2W.A01(sQLiteDatabase, "update_metadata_savepoint");
        }
    }

    private void A00(SQLiteDatabase sQLiteDatabase) {
        C0fW.A00(1030865728);
        sQLiteDatabase.execSQL("PRAGMA defer_foreign_keys = ON");
        C0fW.A00(876326482);
        Iterator it = Y6A.A01(this.A01).iterator();
        while (it.hasNext()) {
            String A0R = AnonymousClass001.A0R("DROP TABLE IF EXISTS ", AbstractC166987dD.A1B(it));
            C0fW.A00(-965982083);
            sQLiteDatabase.execSQL(A0R);
            C0fW.A00(-594913825);
        }
        C0fW.A00(1976812883);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sqliteproc_metadata");
        C0fW.A00(-712954275);
        C0fW.A00(1166523650);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sqliteproc_schema");
        C0fW.A00(-1932114081);
    }
}
