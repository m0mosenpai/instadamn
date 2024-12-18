package X;

import java.util.Map;

/* renamed from: X.JdR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44040JdR implements InterfaceC50519MRw {
    public final C31646DvC A00;
    public final InterfaceC37234Gaj A01;
    public final C43632JRq A02;
    public final MRN A03;
    public final C43920JbV A04;
    public final InterfaceC50513MRq A05;
    public final MSI A06;
    public final MSJ A07;

    public C44040JdR(C31646DvC c31646DvC, InterfaceC37234Gaj interfaceC37234Gaj, C43632JRq c43632JRq, MRN mrn, C43920JbV c43920JbV, InterfaceC50513MRq interfaceC50513MRq) {
        C14360o3.A0B(interfaceC50513MRq, 2);
        this.A02 = c43632JRq;
        this.A05 = interfaceC50513MRq;
        this.A04 = c43920JbV;
        this.A01 = interfaceC37234Gaj;
        this.A03 = mrn;
        this.A00 = c31646DvC;
        this.A06 = mrn.B7D();
        this.A07 = mrn.C7c();
    }

    @Override // X.InterfaceC50519MRw
    public final void A8d(Map map) {
        map.put("direct_inbox_infra_type", "msys");
    }

    @Override // X.InterfaceC50519MRw
    public final InterfaceC50513MRq B5I() {
        return this.A05;
    }

    @Override // X.InterfaceC50519MRw
    public final MSI B7D() {
        return this.A06;
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
        return null;
    }

    @Override // X.InterfaceC50519MRw
    public final MRN C0B() {
        return this.A03;
    }

    @Override // X.InterfaceC50519MRw
    public final InterfaceC37234Gaj C77() {
        return this.A01;
    }

    @Override // X.InterfaceC50519MRw
    public final MSJ C7c() {
        return this.A07;
    }
}
