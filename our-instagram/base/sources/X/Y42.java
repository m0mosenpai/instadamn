package X;

import android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final class Y42 {
    public static final ThreadLocal A07 = new YKG();
    public boolean A00;
    public final SQLiteDatabase A01;
    public final C72675Xku A02;
    public final Xkw A03;
    public final YQO A04;
    public final C72487Xey A05;
    public final C72487Xey A06;

    public static C69602Vs5 A00(Y42 y42) {
        C72676Xkv c72676Xkv = (C72676Xkv) A07.get();
        SQLiteDatabase sQLiteDatabase = y42.A01;
        WeakHashMap weakHashMap = c72676Xkv.A00;
        C69602Vs5 c69602Vs5 = (C69602Vs5) weakHashMap.get(sQLiteDatabase);
        if (c69602Vs5 == null) {
            C69602Vs5 c69602Vs52 = new C69602Vs5();
            weakHashMap.put(sQLiteDatabase, c69602Vs52);
            return c69602Vs52;
        }
        return c69602Vs5;
    }

    public final void A01() {
        int i;
        try {
            SQLiteDatabase sQLiteDatabase = this.A01;
            C0fW.A03(sQLiteDatabase, -1768553881);
            try {
                boolean inTransaction = sQLiteDatabase.inTransaction();
                int A00 = A00(this).A00(AbstractC167007dF.A1M(this.A00 ? 1 : 0));
                if (inTransaction && A00 <= 0) {
                    C0K8.A0Q("DirectTransaction", "push/popTransaction state imbalance: newDepth=%d", Integer.valueOf(A00));
                }
                AbstractC09780fb.A00(925232199);
            } catch (Throwable th) {
                th = th;
                i = -180753045;
                AbstractC09780fb.A00(i);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                boolean inTransaction2 = this.A01.inTransaction();
                int A002 = A00(this).A00(false);
                if (inTransaction2 && A002 <= 0) {
                    C0K8.A0Q("DirectTransaction", "push/popTransaction state imbalance: newDepth=%d", Integer.valueOf(A002));
                }
                i = -398557115;
            } catch (Throwable th3) {
                th = th3;
                i = 1823735658;
            }
        }
    }

    public final void A02() {
        this.A01.setTransactionSuccessful();
        this.A00 = true;
    }

    public final void A03() {
        C0fW.A01(this.A01, -744652577);
        C69602Vs5 A00 = A00(this);
        A00.A00++;
        if (A00.A01 == null) {
            A00.A01 = this;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.Xey, java.lang.Object] */
    public Y42(Xkw xkw, YQO yqo) {
        ?? obj = new Object();
        obj.A00 = 0;
        this.A05 = obj;
        ?? obj2 = new Object();
        obj2.A00 = 0;
        this.A06 = obj2;
        this.A02 = new C72675Xku(this);
        this.A04 = yqo;
        this.A03 = xkw;
        this.A01 = yqo.AX9();
    }
}
