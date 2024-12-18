package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HG6 extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C37171oF A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public HG6(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C37171oF c37171oF, String str, String str2) {
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = c37171oF;
        this.A01 = abstractC59962oe;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1458939554);
        C006802i.A0p.markerPoint(387850546, "network_request_failed");
        C006802i.A0p.markerEnd(387850546, (short) 3);
        C0f9.A0A(411366299, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1161786413);
        C38837H8l c38837H8l = (C38837H8l) obj;
        int A0N = AbstractC167017dG.A0N(c38837H8l, -815301523);
        UserSession userSession = this.A02;
        C006802i.A0p.markerPoint(387850546, AbstractC111324zv.A00(1122));
        InterfaceC43481JIt interfaceC43481JIt = c38837H8l.A00;
        if (interfaceC43481JIt == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        if (!((C38755H4v) interfaceC43481JIt).A00) {
            C17280tP A01 = C17280tP.A4E.A01(this.A00);
            if (!AbstractC167017dG.A1b(A01, A01.A1F, C17280tP.A4G, 115)) {
                C006802i.A0p.markerEnd(387850546, (short) 2);
                C0f9.A0A(2034892830, A0N);
                C0f9.A0A(238852141, A03);
            }
        }
        AbstractC59962oe abstractC59962oe = this.A01;
        String str = this.A04;
        String str2 = this.A05;
        C006802i.A0p.markerPoint(387850546, "nudge_will_show");
        LinkedHashMap A1F = AbstractC25232BEp.A1F(AbstractC50532MSl.A00(), str2, AbstractC166987dD.A1L("location", str), AbstractC166987dD.A1L("analytics_module", "app_start"));
        new C688938a(userSession).A00(abstractC59962oe, null, new C40990IDl(userSession), "com.bloks.www.ig.account_status.nudge.async", A1F);
        C0f9.A0A(2034892830, A0N);
        C0f9.A0A(238852141, A03);
    }
}
