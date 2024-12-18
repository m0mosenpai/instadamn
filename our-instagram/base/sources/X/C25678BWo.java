package X;

import androidx.compose.foundation.pager.PagerState$scrollToPage$2;

/* renamed from: X.BWo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25678BWo implements InterfaceC137816Mf {
    public final /* synthetic */ BVY A00;
    public final /* synthetic */ boolean A01;

    public C25678BWo(BVY bvy, boolean z) {
        this.A00 = bvy;
        this.A01 = z;
    }

    @Override // X.InterfaceC137816Mf
    public final C6OL AIT() {
        boolean z = this.A01;
        int A04 = this.A00.A04();
        if (z) {
            return new C6OL(A04, 1);
        }
        return new C6OL(1, A04);
    }

    @Override // X.InterfaceC137816Mf
    public final int Ar4() {
        InterfaceC74953Yl interfaceC74953Yl = this.A00.A0C;
        return (-AbstractC25230BEn.A0S(interfaceC74953Yl).A08) + AbstractC25230BEn.A0S(interfaceC74953Yl).A03;
    }

    @Override // X.InterfaceC137816Mf
    public final float BQ2() {
        BVY bvy = this.A00;
        return (float) AbstractC25656BVs.A00((InterfaceC30777DgE) bvy.A0C.getValue(), bvy.A04());
    }

    @Override // X.InterfaceC137816Mf
    public final float Br0() {
        BVY bvy = this.A00;
        return (float) ((bvy.A03() * bvy.A05()) + C1H4.A02(bvy.A0N.A04.B72() * bvy.A05()));
    }

    @Override // X.InterfaceC137816Mf
    public final int CGU() {
        InterfaceC74953Yl interfaceC74953Yl = this.A00.A0C;
        C6M3 c6m3 = AbstractC25230BEn.A0S(interfaceC74953Yl).A09;
        C6M3 c6m32 = C6M3.Vertical;
        long A0s = AbstractC25232BEp.A0s(AbstractC25230BEn.A0S(interfaceC74953Yl).A0J);
        if (c6m3 == c6m32) {
            return C119055aN.A00(A0s);
        }
        return AbstractC25225BEi.A06(A0s);
    }

    @Override // X.InterfaceC137816Mf
    public final Object EMJ(int i, InterfaceC23621Ds interfaceC23621Ds) {
        BVY bvy = this.A00;
        C5C7 c5c7 = BVY.A0b;
        Object A01 = BVY.A01(EnumC27348C5d.Default, bvy, interfaceC23621Ds, new PagerState$scrollToPage$2(bvy, null, 0.0f, i));
        C1JX c1jx = C1JX.A02;
        if (A01 != c1jx) {
            A01 = C0eB.A00;
        }
        if (A01 != c1jx) {
            return C0eB.A00;
        }
        return A01;
    }
}
