package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class JYD implements InterfaceC50519MRw {
    public final C31606DuY A00;
    public final C31603DuV A01;
    public final C43631JRo A02;
    public final C48748LhG A03;
    public final C43787JYa A04;
    public final C44141Jf6 A05;
    public final MSI A06;
    public final MSJ A07;
    public final InterfaceC50513MRq A08;

    public JYD(C31606DuY c31606DuY, C31603DuV c31603DuV, C43631JRo c43631JRo, C48748LhG c48748LhG, C43787JYa c43787JYa, C44141Jf6 c44141Jf6, InterfaceC50513MRq interfaceC50513MRq) {
        C14360o3.A0B(interfaceC50513MRq, 2);
        this.A02 = c43631JRo;
        this.A08 = interfaceC50513MRq;
        this.A05 = c44141Jf6;
        this.A01 = c31603DuV;
        this.A04 = c43787JYa;
        this.A00 = c31606DuY;
        this.A03 = c48748LhG;
        this.A06 = c43787JYa.A08;
        this.A07 = c43787JYa.A09;
    }

    @Override // X.InterfaceC50519MRw
    public final void A8d(Map map) {
        map.put("direct_inbox_infra_type", "open");
    }

    @Override // X.InterfaceC50519MRw
    public final InterfaceC50513MRq B5I() {
        return this.A08;
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
        return this.A05;
    }

    @Override // X.InterfaceC50519MRw
    public final C48748LhG BcH() {
        return this.A03;
    }

    @Override // X.InterfaceC50519MRw
    public final /* bridge */ /* synthetic */ MRN C0B() {
        return this.A04;
    }

    @Override // X.InterfaceC50519MRw
    public final /* bridge */ /* synthetic */ InterfaceC37234Gaj C77() {
        return this.A01;
    }

    @Override // X.InterfaceC50519MRw
    public final MSJ C7c() {
        return this.A07;
    }
}
