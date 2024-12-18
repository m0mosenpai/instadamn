package X;

import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: classes5.dex */
public final class BIJ implements InterfaceC137816Mf {
    public final /* synthetic */ LazyListState A00;
    public final /* synthetic */ boolean A01;

    public BIJ(LazyListState lazyListState, boolean z) {
        this.A00 = lazyListState;
        this.A01 = z;
    }

    @Override // X.InterfaceC137816Mf
    public final C6OL AIT() {
        if (this.A01) {
            return new C6OL(-1, 1);
        }
        return new C6OL(1, -1);
    }

    @Override // X.InterfaceC137816Mf
    public final int Ar4() {
        LazyListState lazyListState = this.A00;
        return (-((C6IF) lazyListState.A02()).A08) + ((C6IF) lazyListState.A02()).A04;
    }

    @Override // X.InterfaceC137816Mf
    public final float BQ2() {
        LazyListState lazyListState = this.A00;
        float A01 = lazyListState.A01() + (lazyListState.A00() * 500);
        if (lazyListState.Akn()) {
            return A01 + 100.0f;
        }
        return A01;
    }

    @Override // X.InterfaceC137816Mf
    public final float Br0() {
        LazyListState lazyListState = this.A00;
        return lazyListState.A01() + (lazyListState.A00() * 500);
    }

    @Override // X.InterfaceC137816Mf
    public final int CGU() {
        LazyListState lazyListState = this.A00;
        C6M3 c6m3 = ((C6IF) lazyListState.A02()).A0A;
        C6M3 c6m32 = C6M3.Vertical;
        long A0s = AbstractC25232BEp.A0s(((C6IF) lazyListState.A02()).A0G);
        if (c6m3 == c6m32) {
            return C119055aN.A00(A0s);
        }
        return AbstractC25225BEi.A06(A0s);
    }

    @Override // X.InterfaceC137816Mf
    public final Object EMJ(int i, InterfaceC23621Ds interfaceC23621Ds) {
        LazyListState lazyListState = this.A00;
        C5C7 c5c7 = LazyListState.A0O;
        Object A04 = lazyListState.A04(interfaceC23621Ds, i, 0);
        if (A04 != C1JX.A02) {
            return C0eB.A00;
        }
        return A04;
    }
}
