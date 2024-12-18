package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DXW extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C6MZ A05;
    public final /* synthetic */ C6M3 A06;
    public final /* synthetic */ InterfaceC1333460b A07;
    public final /* synthetic */ InterfaceC30772Dg9 A08;
    public final /* synthetic */ LazyStaggeredGridState A09;
    public final /* synthetic */ Modifier A0A;
    public final /* synthetic */ InterfaceC16660sJ A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXW(C6MZ c6mz, C6M3 c6m3, InterfaceC1333460b interfaceC1333460b, InterfaceC30772Dg9 interfaceC30772Dg9, LazyStaggeredGridState lazyStaggeredGridState, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, float f, float f2, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A09 = lazyStaggeredGridState;
        this.A06 = c6m3;
        this.A08 = interfaceC30772Dg9;
        this.A0A = modifier;
        this.A07 = interfaceC1333460b;
        this.A0C = z;
        this.A05 = c6mz;
        this.A0D = z2;
        this.A01 = f;
        this.A00 = f2;
        this.A0B = interfaceC16660sJ;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        LazyStaggeredGridState lazyStaggeredGridState = this.A09;
        C6M3 c6m3 = this.A06;
        InterfaceC30772Dg9 interfaceC30772Dg9 = this.A08;
        Modifier modifier = this.A0A;
        InterfaceC1333460b interfaceC1333460b = this.A07;
        boolean z = this.A0C;
        C6MZ c6mz = this.A05;
        boolean z2 = this.A0D;
        AbstractC27472CAt.A00(c6mz, c6m3, interfaceC1333460b, interfaceC30772Dg9, lazyStaggeredGridState, A0S, modifier, this.A0B, this.A01, this.A00, AbstractC25225BEi.A04(this.A02), AbstractC128295qy.A00(this.A03), this.A04, z, z2);
        return C0eB.A00;
    }
}
