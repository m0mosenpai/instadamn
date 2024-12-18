package X;

import java.util.List;

/* renamed from: X.Bma, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26453Bma extends AbstractC51572Yf {
    public final InterfaceC16660sJ A00;
    public final boolean A01;
    public final boolean A02;
    public final C51722Yv A03;
    public final C27318C3z A04;
    public final C7N A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        EnumC27372C6b enumC27372C6b;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30845DhK interfaceC30845DhK = this.A04.A00;
        if (interfaceC30845DhK instanceof C29510CzO) {
            return new C26327BkY(this.A03, C29910DGy.A01(this, 12));
        }
        boolean z = this.A02;
        AbstractC70653Fc abstractC70653Fc = (AbstractC70653Fc) C29910DGy.A00(c76223bS, this, AbstractC25228BEl.A1b(z), 15);
        List list = (List) DH2.A00(c76223bS, interfaceC30845DhK, this, new Object[]{interfaceC30845DhK}, 20);
        C7N c7n = this.A05;
        if (z) {
            enumC27372C6b = EnumC27372C6b.A04;
        } else {
            enumC27372C6b = EnumC27372C6b.A02;
        }
        C51722Yv c51722Yv = this.A03;
        C30182DRn A01 = C30182DRn.A01(this, 22);
        C30182DRn A012 = C30182DRn.A01(this, 23);
        C30482DbR A00 = C30482DbR.A00(this, 49);
        return new C26576BoZ(abstractC70653Fc, c51722Yv, enumC27372C6b, c7n, list, C29910DGy.A01(this, 13), C29910DGy.A01(this, 14), A01, A012, null, C30182DRn.A01(this, 24), null, A00, null, Integer.MIN_VALUE, false, false);
    }

    public C26453Bma(C51722Yv c51722Yv, C27318C3z c27318C3z, C7N c7n, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        AbstractC25234BEr.A1P(c27318C3z, c7n, interfaceC16660sJ);
        this.A04 = c27318C3z;
        this.A05 = c7n;
        this.A02 = z;
        this.A00 = interfaceC16660sJ;
        this.A01 = z2;
        this.A03 = c51722Yv;
    }
}
