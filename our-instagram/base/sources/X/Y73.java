package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.crudolib.sqliteproc.annotations.DefaultDataMigrator;
import com.facebook.crudolib.sqliteproc.annotations.DropAllTablesDataMigrator;
import com.facebook.crudolib.sqliteproc.annotations.DropTableDataMigrator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class Y73 {
    public static void A01(SQLiteDatabase sQLiteDatabase, C72677Xkx c72677Xkx) {
        try {
            InterfaceC73602YNe interfaceC73602YNe = (InterfaceC73602YNe) Class.forName(null).newInstance();
            Y2W.A00(sQLiteDatabase, "migrate_data_savepoint");
            try {
                try {
                    interfaceC73602YNe.Cpc(sQLiteDatabase, c72677Xkx);
                } catch (XPN | SQLException unused) {
                    Y2W.A02(sQLiteDatabase, "migrate_data_savepoint");
                }
            } finally {
                Y2W.A01(sQLiteDatabase, "migrate_data_savepoint");
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused2) {
        }
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, String str, C72716Xlo[] c72716XloArr) {
        int length = c72716XloArr.length;
        for (int i = 0; i < length; i = 1) {
            C72716Xlo c72716Xlo = c72716XloArr[i];
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("CREATE ");
            A1C.append("UNIQUE ");
            A1C.append("INDEX ");
            A1C.append(str);
            String[] strArr = c72716Xlo.A00;
            int length2 = strArr.length;
            for (String str2 : strArr) {
                A1C.append("_");
                A1C.append(str2);
            }
            A1C.append(" ON ");
            A1C.append(str);
            A1C.append("(");
            A1C.append(strArr[0]);
            String[] strArr2 = c72716Xlo.A01;
            String str3 = strArr2[0];
            if (!str3.isEmpty()) {
                A1C.append(" ");
                A1C.append(str3);
            }
            for (int i2 = 1; i2 < length2; i2 = 2) {
                A1C.append(',');
                A1C.append(strArr[i2]);
                if (!strArr2[i2].isEmpty()) {
                    A1C.append(" ");
                    A1C.append(strArr2[i2]);
                }
            }
            String A0x = AbstractC166997dE.A0x(")", A1C);
            C0fW.A00(-1493524764);
            sQLiteDatabase.execSQL(A0x);
            C0fW.A00(-1741596280);
        }
    }

    public static void A07(String str, Map map, C72868Xpe[] c72868XpeArr) {
        for (C72868Xpe c72868Xpe : c72868XpeArr) {
            String str2 = c72868Xpe.A02;
            if (str2 != null) {
                java.util.Set set = (java.util.Set) map.get(str2);
                if (set == null) {
                    set = AbstractC166987dD.A1H();
                    map.put(str2, set);
                }
                set.add(str);
            }
        }
    }

    public static boolean A08() {
        if (!TextUtils.isEmpty(null) && !DefaultDataMigrator.class.getName().equals(null) && !DropTableDataMigrator.class.getName().equals(null) && !DropAllTablesDataMigrator.class.getName().equals(null)) {
            return true;
        }
        return false;
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str, C72868Xpe[] c72868XpeArr, C72716Xlo[] c72716XloArr) {
        AbstractC09780fb.A01("createTableWithIndices", 1251039575);
        try {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("CREATE TABLE ");
            A1C.append(str);
            A1C.append(" (");
            int length = c72868XpeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C72868Xpe c72868Xpe = c72868XpeArr[i];
                if (c72868Xpe.A09) {
                    i++;
                } else {
                    A05(c72868Xpe, A1C);
                    break;
                }
            }
            while (true) {
                i++;
                if (i < length) {
                    C72868Xpe c72868Xpe2 = c72868XpeArr[i];
                    if (!c72868Xpe2.A09) {
                        A1C.append(", ");
                        A05(c72868Xpe2, A1C);
                    }
                } else {
                    String A0p = AbstractC167017dG.A0p(A1C);
                    C0fW.A00(-1434718027);
                    sQLiteDatabase.execSQL(A0p);
                    C0fW.A00(478050478);
                    A03(sQLiteDatabase, str, c72716XloArr);
                    AbstractC09780fb.A00(-16535361);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC09780fb.A00(1228390264);
            throw th;
        }
    }

    public static void A05(C72868Xpe c72868Xpe, StringBuilder sb) {
        sb.append(c72868Xpe.A03);
        sb.append(" ");
        sb.append(c72868Xpe.A06);
        sb.append(" ");
        String str = c72868Xpe.A00;
        if (str != null) {
            sb.append("DEFAULT ");
            sb.append(str);
            sb.append(" ");
        }
        if (!c72868Xpe.A0A) {
            sb.append("NOT NULL ");
        }
        if (c72868Xpe.A0B) {
            sb.append("PRIMARY KEY ");
        }
        if (c72868Xpe.A08) {
            sb.append("AUTOINCREMENT ");
        }
        String str2 = c72868Xpe.A02;
        if (str2 != null || c72868Xpe.A01 != null) {
            sb.append("REFERENCES ");
            sb.append(str2);
            sb.append("(");
            sb.append(c72868Xpe.A01);
            sb.append(")");
            sb.append(" ON UPDATE ");
            sb.append(c72868Xpe.A05);
            sb.append(" ON DELETE ");
            sb.append(c72868Xpe.A04);
        }
    }

    public static void A06(String str, String str2) {
        throw AbstractC166987dD.A1D(AnonymousClass001.A0u("[", str, "]: ", str2));
    }

    public static void A00(SQLiteDatabase sQLiteDatabase, XSB xsb, C72868Xpe[] c72868XpeArr, C72716Xlo[] c72716XloArr) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        int length = c72868XpeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C72868Xpe c72868Xpe = c72868XpeArr[i];
            if (c72868Xpe.A09) {
                i++;
            } else {
                A1C.append(c72868Xpe.A03);
                break;
            }
        }
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            C72868Xpe c72868Xpe2 = c72868XpeArr[i];
            if (!c72868Xpe2.A09) {
                A1C.append(", ");
                A1C.append(c72868Xpe2.A03);
            }
        }
        String obj = A1C.toString();
        if (!TextUtils.isEmpty(obj)) {
            Y2W.A00(sQLiteDatabase, "recreate_table_savepoint");
            SQLException e = null;
            try {
                try {
                    String str = xsb.A01;
                    String A0R = AnonymousClass001.A0R("_temp_", str);
                    A02(sQLiteDatabase, A0R, c72868XpeArr, c72716XloArr);
                    String format = String.format("INSERT OR IGNORE INTO %s (%s) SELECT %s FROM %s", A0R, obj, obj, str);
                    C0fW.A00(787066303);
                    sQLiteDatabase.execSQL(format);
                    C0fW.A00(777775661);
                    String A0R2 = AnonymousClass001.A0R("DROP TABLE ", str);
                    C0fW.A00(-2036823505);
                    sQLiteDatabase.execSQL(A0R2);
                    C0fW.A00(1172688247);
                    A02(sQLiteDatabase, str, c72868XpeArr, c72716XloArr);
                    String format2 = String.format("INSERT OR IGNORE INTO %s (%s) SELECT %s FROM %s", str, obj, obj, A0R);
                    C0fW.A00(787066303);
                    sQLiteDatabase.execSQL(format2);
                    C0fW.A00(777775661);
                    String A0R3 = AnonymousClass001.A0R("DROP TABLE ", A0R);
                    C0fW.A00(875723827);
                    sQLiteDatabase.execSQL(A0R3);
                    C0fW.A00(-567561128);
                } catch (SQLException e2) {
                    e = e2;
                    Y2W.A02(sQLiteDatabase, "recreate_table_savepoint");
                }
                if (e == null) {
                    return;
                }
            } finally {
                Y2W.A01(sQLiteDatabase, "recreate_table_savepoint");
            }
        }
        String str2 = xsb.A01;
        String A0R4 = AnonymousClass001.A0R("DROP TABLE IF EXISTS ", str2);
        C0fW.A00(-463443053);
        sQLiteDatabase.execSQL(A0R4);
        C0fW.A00(-474708895);
        A02(sQLiteDatabase, str2, c72868XpeArr, c72716XloArr);
    }

    public static void A04(YQO yqo, String str, Map map, java.util.Set set) {
        if (!set.contains(str)) {
            if (map.containsKey(str)) {
                Iterator it = ((java.util.Set) map.get(str)).iterator();
                while (it.hasNext()) {
                    A04(yqo, AbstractC166987dD.A1B(it), map, set);
                }
            }
            SQLiteDatabase AX9 = yqo.AX9();
            String A0R = AnonymousClass001.A0R("DROP TABLE IF EXISTS ", str);
            C0fW.A00(1523472672);
            AX9.execSQL(A0R);
            C0fW.A00(-2022094031);
            SQLiteDatabase AX92 = yqo.AX9();
            AX92.delete("sqliteproc_schema", "table_name = ?", new String[]{str});
            AX92.delete("sqliteproc_metadata", "table_name = ?", new String[]{str});
            set.add(str);
        }
    }
}
