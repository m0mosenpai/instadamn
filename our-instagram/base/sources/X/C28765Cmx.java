package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

/* renamed from: X.Cmx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28765Cmx implements InterfaceC137816Mf {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC137816Mf
    public final C6OL AIT() {
        return new C6OL(-1, -1);
    }

    public C28765Cmx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC137816Mf
    public final int Ar4() {
        int i;
        int i2;
        if (this.A00 != 0) {
            InterfaceC74953Yl interfaceC74953Yl = ((LazyStaggeredGridState) this.A01).A0G;
            i = AbstractC25235BEs.A0D(interfaceC74953Yl).A04;
            i2 = AbstractC25235BEs.A0D(interfaceC74953Yl).A03;
        } else {
            LazyGridState lazyGridState = (LazyGridState) this.A01;
            i = -((C28836Co6) lazyGridState.A00()).A08;
            i2 = ((C28836Co6) lazyGridState.A00()).A03;
        }
        return i + i2;
    }

    @Override // X.InterfaceC137816Mf
    public final float BQ2() {
        int BIi;
        int BIi2;
        boolean A1X;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) obj;
            C28356CfG c28356CfG = lazyStaggeredGridState.A0D;
            BIi = c28356CfG.A05.BIi();
            BIi2 = c28356CfG.A06.BIi();
            A1X = AbstractC25230BEn.A1X(lazyStaggeredGridState.A0F);
        } else {
            LazyGridState lazyGridState = (LazyGridState) obj;
            C28354CfE c28354CfE = lazyGridState.A09;
            BIi = c28354CfE.A03.BIi();
            BIi2 = c28354CfE.A04.BIi();
            A1X = AbstractC25230BEn.A1X(lazyGridState.A0G);
        }
        float f = BIi2 + (BIi * 500);
        if (A1X) {
            return f + 100.0f;
        }
        return f;
    }

    @Override // X.InterfaceC137816Mf
    public final float Br0() {
        int BIi;
        InterfaceC119545bC interfaceC119545bC;
        if (this.A00 != 0) {
            C28356CfG c28356CfG = ((LazyStaggeredGridState) this.A01).A0D;
            BIi = c28356CfG.A05.BIi();
            interfaceC119545bC = c28356CfG.A06;
        } else {
            C28354CfE c28354CfE = ((LazyGridState) this.A01).A09;
            BIi = c28354CfE.A03.BIi();
            interfaceC119545bC = c28354CfE.A04;
        }
        return interfaceC119545bC.BIi() + (BIi * 500);
    }

    @Override // X.InterfaceC137816Mf
    public final int CGU() {
        C6M3 c6m3;
        C6M3 c6m32;
        long A0s;
        if (this.A00 != 0) {
            InterfaceC74953Yl interfaceC74953Yl = ((LazyStaggeredGridState) this.A01).A0G;
            c6m3 = AbstractC25235BEs.A0D(interfaceC74953Yl).A0A;
            c6m32 = C6M3.Vertical;
            A0s = AbstractC25235BEs.A0D(interfaceC74953Yl).A09;
        } else {
            LazyGridState lazyGridState = (LazyGridState) this.A01;
            c6m3 = ((C28836Co6) lazyGridState.A00()).A09;
            c6m32 = C6M3.Vertical;
            A0s = AbstractC25232BEp.A0s(((C28836Co6) lazyGridState.A00()).A0G);
        }
        if (c6m3 == c6m32) {
            return C119055aN.A00(A0s);
        }
        return AbstractC25225BEi.A06(A0s);
    }

    @Override // X.InterfaceC137816Mf
    public final Object EMJ(int i, InterfaceC23621Ds interfaceC23621Ds) {
        Object A01;
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            C5C7 c5c7 = LazyStaggeredGridState.A0M;
            A01 = ((LazyStaggeredGridState) obj).A01(i, interfaceC23621Ds);
        } else {
            C5C7 c5c72 = LazyGridState.A0L;
            A01 = ((LazyGridState) obj).A01(interfaceC23621Ds, i, 0);
        }
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }
}
