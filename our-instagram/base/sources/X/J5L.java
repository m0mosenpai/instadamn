package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class J5L implements Runnable {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ C111344zx A01;
    public final /* synthetic */ boolean A02;

    public J5L(InterfaceC1116050z interfaceC1116050z, C111344zx c111344zx, boolean z) {
        this.A01 = c111344zx;
        this.A02 = z;
        this.A00 = interfaceC1116050z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C111344zx c111344zx = this.A01;
        UserSession userSession = c111344zx.A04;
        C17790uH A00 = AbstractC17610tw.A00(userSession);
        C17590tu c17590tu = new C17590tu(A00);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        C70810WhQ A002 = C70810WhQ.A00(c111344zx.A03.getApplicationContext(), userSession);
        C70810WhQ.A01(A002);
        C69018Vfu c69018Vfu = A002.A01;
        if (!AbstractC37301Gc2.A1b(c69018Vfu.A01)) {
            try {
                String A003 = AbstractC69964Vyf.A00(c69018Vfu);
                if (A003 != null) {
                    A1I.put(AbstractC111324zv.A00(4095), A003);
                }
            } catch (IOException unused) {
            }
        }
        C1EN c1en = C1EN.A04;
        Long l = null;
        if (C18U.A06(C06090Tz.A05, userSession, 36328057456639061L)) {
            l = Long.valueOf(C1AT.A01(userSession).A03(C1AV.A2A).getLong("lastHeadLoadTimeMs", -1L));
        }
        String A004 = C1EP.A00();
        C1EU c1eu = new C1EU(null, c17590tu, c1en, C1ER.A00(userSession, c1en, null, null, false), l, A004, null, null, null, AbstractC167017dG.A0j(), null, AbstractC06930Yk.A0E(), A1I, C1EU.A0G.incrementAndGet(), false, false);
        C62272sS c62272sS = new C62272sS(C23491Cl.A00(c1eu, c111344zx.A06.A01, C43324JCr.A00, 0, 14), c1eu);
        C14360o3.A0C(c62272sS, "null cannot be cast to non-null type com.instagram.mainfeed.api.MainFeedRequest.Rest.Http");
        C1EU c1eu2 = ((C1I1) c62272sS).A00;
        C1ON c1on = c62272sS.A00;
        c1on.A00 = new C39029HGf(this.A00, A00, c62272sS, c1eu2, c111344zx, this.A02);
        C1GJ.A03(c1on);
    }
}
