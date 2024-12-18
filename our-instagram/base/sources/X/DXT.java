package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DXT extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXT(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, float f, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A01 = i3;
        this.A04 = obj;
        this.A09 = obj2;
        this.A0A = obj3;
        this.A06 = obj4;
        this.A0B = z;
        this.A00 = f;
        this.A08 = obj5;
        this.A07 = obj6;
        this.A0C = z2;
        this.A05 = obj7;
        this.A03 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            InterfaceC30775DgC interfaceC30775DgC = (InterfaceC30775DgC) this.A04;
            Modifier modifier = (Modifier) this.A09;
            LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) this.A0A;
            InterfaceC1333460b interfaceC1333460b = (InterfaceC1333460b) this.A06;
            boolean z = this.A0B;
            float f = this.A00;
            InterfaceC118275Wp interfaceC118275Wp = (InterfaceC118275Wp) this.A08;
            AbstractC28011CWj.A00((C6MZ) this.A07, interfaceC118275Wp, interfaceC1333460b, lazyStaggeredGridState, interfaceC30775DgC, A0S, modifier, (InterfaceC16660sJ) this.A05, f, AbstractC25225BEi.A04(this.A03), this.A02, z, this.A0C);
        } else {
            InterfaceC30775DgC interfaceC30775DgC2 = (InterfaceC30775DgC) this.A08;
            Modifier modifier2 = (Modifier) this.A07;
            LazyStaggeredGridState lazyStaggeredGridState2 = (LazyStaggeredGridState) this.A09;
            InterfaceC1333460b interfaceC1333460b2 = (InterfaceC1333460b) this.A05;
            boolean z2 = this.A0B;
            InterfaceC118305Ws interfaceC118305Ws = (InterfaceC118305Ws) this.A0A;
            float f2 = this.A00;
            AbstractC28011CWj.A01((C6MZ) this.A06, interfaceC118305Ws, interfaceC1333460b2, lazyStaggeredGridState2, interfaceC30775DgC2, A0S, modifier2, (InterfaceC16660sJ) this.A04, f2, AbstractC25225BEi.A04(this.A03), this.A02, z2, this.A0C);
        }
        return C0eB.A00;
    }
}
