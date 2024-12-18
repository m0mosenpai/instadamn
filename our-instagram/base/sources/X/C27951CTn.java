package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.CTn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27951CTn {
    public final Map A01 = AbstractC166987dD.A1I();
    public final Handler A00 = AbstractC167007dF.A0J();

    public final void A00(C120985dq c120985dq, UserSession userSession, C75113Zb c75113Zb, long j) {
        EnumC138786Qj enumC138786Qj;
        if (!C18U.A06(C06090Tz.A05, userSession, 36323105357966318L)) {
            C38321qM c38321qM = c120985dq.A02;
            EnumC138786Qj enumC138786Qj2 = null;
            if (c38321qM != null) {
                enumC138786Qj = c38321qM.A1w();
            } else {
                enumC138786Qj = null;
            }
            if (enumC138786Qj != EnumC138786Qj.A08) {
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null) {
                    enumC138786Qj2 = c38321qM2.A1w();
                }
                if (enumC138786Qj2 != EnumC138786Qj.A09) {
                    return;
                }
            }
        }
        int hashCode = c75113Zb.hashCode();
        Map map = this.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) map.get(valueOf);
        if (runnable != null) {
            this.A00.removeCallbacks(runnable);
            map.remove(valueOf);
        }
        RunnableC29581D1i runnableC29581D1i = new RunnableC29581D1i(this, c75113Zb);
        AbstractC25227BEk.A1O(runnableC29581D1i, map, c75113Zb.hashCode());
        this.A00.postDelayed(runnableC29581D1i, j);
    }
}
