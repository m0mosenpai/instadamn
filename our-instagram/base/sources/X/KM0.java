package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class KM0 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C28741aC A00;
    public final /* synthetic */ DirectThreadKey A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM0(C28741aC c28741aC, DirectThreadKey directThreadKey) {
        super(1817872983, 4, false, false);
        this.A00 = c28741aC;
        this.A01 = directThreadKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C28741aC c28741aC = this.A00;
        DirectThreadKey directThreadKey = this.A01;
        C49692Qc c49692Qc = C49682Qb.A06;
        if (!c49692Qc.A03()) {
            SystemClock.uptimeMillis();
            SQLiteDatabase A00 = C28741aC.A00(c28741aC);
            if (A00 != null) {
                C0fW.A01(A00, 78406013);
                try {
                    try {
                        UserSession userSession = c28741aC.A01;
                        C2S2.A00(userSession).A0L(directThreadKey);
                        C2SP.A00(userSession).A0L(directThreadKey);
                        A00.setTransactionSuccessful();
                    } catch (SQLiteException | IllegalStateException e) {
                        c49692Qc.A02(e);
                    }
                    C4GN.A00(A00);
                    SystemClock.uptimeMillis();
                } catch (Throwable th) {
                    C4GN.A00(A00);
                    throw th;
                }
            }
        }
    }
}
