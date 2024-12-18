package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallFunnelSessionId;

/* renamed from: X.GQw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36979GQw implements Runnable {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C7T2 A02;
    public final /* synthetic */ RtcCallFunnelSessionId A03;
    public final /* synthetic */ C7T3 A04;
    public final /* synthetic */ boolean A05;

    public RunnableC36979GQw(AbstractC59962oe abstractC59962oe, UserSession userSession, C7T2 c7t2, RtcCallFunnelSessionId rtcCallFunnelSessionId, C7T3 c7t3, boolean z) {
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A03 = rtcCallFunnelSessionId;
        this.A02 = c7t2;
        this.A05 = z;
        this.A04 = c7t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC59962oe abstractC59962oe = this.A00;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A01;
        if (!new C1CM(AbstractC31273Dov.A00(requireContext, userSession).A00).A07(false)) {
            C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
            A0I.A0A(2131976772);
            A0I.A09(2131976771);
            AbstractC31176DnK.A1W(A0I);
            AbstractC55155OdJ.A03(userSession, this.A03, C05F.A00);
            return;
        }
        Context requireContext2 = abstractC59962oe.requireContext();
        C7T2 c7t2 = this.A02;
        boolean z = this.A05;
        AbstractC55155OdJ.A01(requireContext2, null, abstractC59962oe, userSession, c7t2, this.A03, this.A04, null, z);
    }
}
