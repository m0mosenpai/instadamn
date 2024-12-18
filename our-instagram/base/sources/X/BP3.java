package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BP3 {
    public static final InterfaceC09390do A03 = AbstractC09440dt.A01(BP4.A00);
    public C37734Gj9 A00;
    public final Map A02 = AbstractC166987dD.A1I();
    public final Handler A01 = AbstractC167007dF.A0J();

    public final void A00(C120985dq c120985dq, UserSession userSession, C75113Zb c75113Zb, long j) {
        C37734Gj9 c37734Gj9;
        if (C18U.A06(C06090Tz.A05, userSession, 36321692313724601L) && (((c37734Gj9 = this.A00) != null && c37734Gj9.A03(c120985dq)) || c75113Zb.A29)) {
            return;
        }
        A01(c75113Zb);
        RunnableC29580D1h runnableC29580D1h = new RunnableC29580D1h(this, c75113Zb);
        AbstractC25227BEk.A1O(runnableC29580D1h, this.A02, c75113Zb.hashCode());
        this.A01.postDelayed(runnableC29580D1h, j);
    }

    public final void A01(C75113Zb c75113Zb) {
        int hashCode = c75113Zb.hashCode();
        Map map = this.A02;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) map.get(valueOf);
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            map.remove(valueOf);
        }
    }
}
