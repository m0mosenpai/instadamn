package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.HashMap;

/* renamed from: X.Dyj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31825Dyj extends AbstractC52922bZ {
    public final C2GS A00;
    public final C2GS A01;
    public final C2GS A02;
    public final C2GS A03;
    public final C2GS A04;
    public final BusinessFlowAnalyticsLogger A05;
    public final C34406FEw A06;
    public final AbstractC12990ll A07;
    public final String A08;

    public C31825Dyj(BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, C34406FEw c34406FEw, AbstractC12990ll abstractC12990ll, String str) {
        AbstractC25233BEq.A0w(1, abstractC12990ll, businessFlowAnalyticsLogger, str);
        this.A07 = abstractC12990ll;
        this.A06 = c34406FEw;
        this.A05 = businessFlowAnalyticsLogger;
        this.A08 = str;
        this.A04 = new C2GS();
        this.A03 = new C2GS();
        this.A01 = new C2GS();
        this.A02 = new C2GS();
        this.A00 = new C2GS();
    }

    public final void A00(String str, int i) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AbstractC111324zv.A00(3245), String.valueOf(i));
        this.A05.Cm3(new Y7A("intro", this.A08, str, null, null, null, A1G, null));
    }
}
