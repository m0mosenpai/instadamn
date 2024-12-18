package X;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes10.dex */
public final class Rc6 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C7NM A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rc6(C7NM c7nm) {
        super(676);
        this.A00 = c7nm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7NO A00 = C7NO.A00(this.A00.A01);
        SQLiteDatabase A01 = C7NQ.A00().A01();
        if (A01 != null) {
            C0fW.A01(A01, 1008738445);
            try {
                A01.delete("recent_searches", AnonymousClass001.A0g("user_id=='", A00.A00.userId, "'"), null);
                A01.setTransactionSuccessful();
                C0fW.A03(A01, 1777318772);
            } catch (Throwable th) {
                C0fW.A03(A01, -462770975);
                throw th;
            }
        }
    }
}
