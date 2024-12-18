package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes8.dex */
public final class JSF implements InterfaceC50519MRw {
    public final C31647DvD A00;
    public final C31645DvB A01;
    public final JSI A02;
    public final MRN A03;
    public final C43920JbV A04;
    public final C44040JdR A05;
    public final C48748LhG A06;
    public final MSI A07;
    public final MSJ A08;
    public final InterfaceC50513MRq A09;

    public JSF(Context context, UserSession userSession, JYD jyd, C44040JdR c44040JdR) {
        C14360o3.A0B(userSession, 1);
        this.A05 = c44040JdR;
        C43631JRo c43631JRo = jyd.A02;
        C43632JRq c43632JRq = c44040JdR.A02;
        C43787JYa c43787JYa = jyd.A04;
        this.A02 = new JSI(c43787JYa.Eq6(), userSession, c43631JRo, c43632JRq);
        this.A09 = c44040JdR.A05;
        this.A04 = c44040JdR.A04;
        this.A01 = new C31645DvB(context, userSession, jyd.A01, c44040JdR.A01);
        this.A03 = new JYZ(userSession, c43787JYa, c44040JdR.A03);
        this.A00 = new C31647DvD(userSession, jyd.A00, c44040JdR.A00);
        MRN mrn = this.A03;
        this.A07 = mrn.B7D();
        this.A08 = mrn.C7c();
        this.A06 = jyd.A03;
    }

    @Override // X.InterfaceC50519MRw
    public final void A8d(Map map) {
        this.A05.A8d(map);
        map.put("direct_inbox_infra_type", "btv");
    }

    @Override // X.InterfaceC50519MRw
    public final InterfaceC50513MRq B5I() {
        return this.A09;
    }

    @Override // X.InterfaceC50519MRw
    public final MSI B7D() {
        return this.A07;
    }

    @Override // X.InterfaceC50519MRw
    public final /* bridge */ /* synthetic */ MRP BOD() {
        return this.A02;
    }

    @Override // X.InterfaceC50519MRw
    public final /* bridge */ /* synthetic */ InterfaceC50462MPq BWH() {
        return this.A00;
    }

    @Override // X.InterfaceC50519MRw
    public final /* bridge */ /* synthetic */ InterfaceC50484MQm BcG() {
        return this.A04;
    }

    @Override // X.InterfaceC50519MRw
    public final C48748LhG BcH() {
        return this.A06;
    }

    @Override // X.InterfaceC50519MRw
    public final MRN C0B() {
        return this.A03;
    }

    @Override // X.InterfaceC50519MRw
    public final /* bridge */ /* synthetic */ InterfaceC37234Gaj C77() {
        return this.A01;
    }

    @Override // X.InterfaceC50519MRw
    public final MSJ C7c() {
        return this.A08;
    }
}
