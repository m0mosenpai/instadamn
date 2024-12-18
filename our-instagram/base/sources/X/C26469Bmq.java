package X;

import java.util.List;

/* renamed from: X.Bmq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26469Bmq extends AbstractC51572Yf {
    public final C41H A00;
    public final CUS A01;
    public final C79293ga A02;
    public final List A03;
    public final C51722Yv A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16620sF A06;

    public C26469Bmq(C51722Yv c51722Yv, C41H c41h, CUS cus, C79293ga c79293ga, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(list, 1);
        AbstractC25234BEr.A1R(c41h, c79293ga, cus, interfaceC16620sF, interfaceC16660sJ);
        C14360o3.A0B(c51722Yv, 7);
        this.A03 = list;
        this.A00 = c41h;
        this.A02 = c79293ga;
        this.A01 = cus;
        this.A06 = interfaceC16620sF;
        this.A05 = interfaceC16660sJ;
        this.A04 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        return new C26446BmT(this.A04, this.A05, new DRQ(this, 24), this.A06);
    }
}
