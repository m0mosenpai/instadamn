package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.POe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56937POe implements Runnable {
    public final /* synthetic */ C147716kw A00;

    public RunnableC56937POe(C147716kw c147716kw) {
        this.A00 = c147716kw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C147716kw c147716kw = this.A00;
        UserSession userSession = c147716kw.A0N;
        if (!MSZ.A1a(((O97) AbstractC147816l6.A00(userSession).A03.getValue()).A01)) {
            if (c147716kw.A01 != null) {
                AbstractC166997dE.A1Y(AbstractC147816l6.A00(userSession).A02().A0H, true);
                C147716kw.A02(c147716kw);
            }
            C147776l2 c147776l2 = c147716kw.A03;
            if (c147776l2 != null) {
                String sessionId = c147716kw.A0S.getSessionId();
                C14360o3.A0B(sessionId, 0);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c147776l2.A08, "ig_live_viewer_end_screen_impression");
                AbstractC25225BEi.A1P(A0f, sessionId);
                A0f.AAP("a_pk", c147776l2.A03);
                AbstractC37300Gc1.A0l(A0f, c147776l2.A04);
                A0f.Cht();
            }
        }
    }
}
