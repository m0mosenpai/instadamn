package X;

import android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final class Y0B {
    public final String A00;
    public final String A01;
    public final String[] A02;
    public final String[] A03;
    public final WeakHashMap A04 = new WeakHashMap(1);

    public static C72776Xmv A00(SQLiteDatabase sQLiteDatabase, Y0B y0b) {
        WeakHashMap weakHashMap = y0b.A04;
        C72776Xmv c72776Xmv = (C72776Xmv) weakHashMap.get(sQLiteDatabase);
        if (c72776Xmv == null) {
            C72776Xmv c72776Xmv2 = new C72776Xmv();
            weakHashMap.put(sQLiteDatabase, c72776Xmv2);
            return c72776Xmv2;
        }
        return c72776Xmv;
    }

    public Y0B(String str, String str2, String[] strArr, String[] strArr2) {
        this.A00 = str;
        this.A03 = strArr;
        this.A02 = strArr2;
        this.A01 = str2;
    }
}
