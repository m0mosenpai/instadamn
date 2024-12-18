package X;

import android.database.sqlite.SQLiteDatabase;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.RcC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60952RcC extends AbstractRunnableC14200nk {
    public final /* synthetic */ C7NM A00;
    public final /* synthetic */ DirectShareTarget A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60952RcC(C7NM c7nm, DirectShareTarget directShareTarget) {
        super(675);
        this.A00 = c7nm;
        this.A01 = directShareTarget;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A09;
        C7NO A00 = C7NO.A00(this.A00.A01);
        DirectShareTarget directShareTarget = this.A01;
        SQLiteDatabase A01 = C7NQ.A00().A01();
        if (A01 != null) {
            C0fW.A01(A01, 970974333);
            try {
                UserSession userSession = A00.A00;
                String str = userSession.userId;
                if (C18U.A06(C06090Tz.A05, userSession, 36320382349025693L) && directShareTarget.A08() != null) {
                    A09 = directShareTarget.A08();
                } else {
                    A09 = directShareTarget.A09();
                }
                A01.delete("recent_searches", AnonymousClass001.A15("user_id=='", str, "' AND ", "target_key", "=='", A09, "'"), null);
                A01.setTransactionSuccessful();
                C0fW.A03(A01, 1861863361);
            } catch (Throwable th) {
                C0fW.A03(A01, -1151299138);
                throw th;
            }
        }
    }
}
