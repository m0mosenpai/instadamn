package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* loaded from: classes11.dex */
public final class WjG implements InterfaceC37153GYq {
    public final /* synthetic */ WD9 A00;

    @Override // X.InterfaceC37153GYq
    public final void D8P(String str) {
        C14360o3.A0B(str, 0);
        WD9 wd9 = this.A00;
        if (wd9.A02) {
            C69349Vlv c69349Vlv = new C69349Vlv(wd9.A04, wd9.A06, str);
            C2DS c2ds = c69349Vlv.A03;
            String str2 = c69349Vlv.A05;
            C14360o3.A0B(str2, 0);
            if (((C2DU) c2ds).A0N(str2) != null) {
                WD9 wd92 = c69349Vlv.A04.A00;
                wd92.A02 = false;
                WD9.A00(wd92);
                wd92.A07.A00();
                wd92.A05.En8(str2);
            } else {
                UserSession userSession = c69349Vlv.A02;
                AbstractC25651Mw.A00(userSession).A01(c69349Vlv.A01, C2Io.class);
                C28811aJ.A00(userSession).A08(ThreadFetchReason.THREAD_SUMMARY, null, str2, true);
                c69349Vlv.A00.postDelayed(new RunnableC71349WsK(c69349Vlv), 2000L);
            }
            wd9.A00 = c69349Vlv;
        }
    }

    public WjG(WD9 wd9) {
        this.A00 = wd9;
    }

    @Override // X.InterfaceC37153GYq
    public final void D8O(Throwable th) {
        WD9 wd9 = this.A00;
        wd9.A02 = false;
        wd9.A07.A00();
        WD9.A01(wd9, AbstractC166997dE.A0p(wd9.A03, 2131976811));
    }
}
