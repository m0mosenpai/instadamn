package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes12.dex */
public final class YAC implements YQO {
    public static YAC A01;
    public final SQLiteOpenHelper A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.XgD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.XgE] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Xog, java.lang.Object] */
    public YAC(Context context) {
        this.A00 = new XPO(context, new Object(), new Object(), new C72717Xlp("location_sharing.db", "3b5dcd93f5e7177914a5563a91f2383481c797df-53f769b8cd72a898ebbf56276cf53c61b5826d95-"), new Object());
    }

    public static YAC A00(Context context) {
        YAC yac = A01;
        if (yac == null) {
            YAC yac2 = new YAC(context);
            A01 = yac2;
            return yac2;
        }
        return yac;
    }

    @Override // X.YQO
    public final SQLiteDatabase AX9() {
        return this.A00.getWritableDatabase();
    }
}
