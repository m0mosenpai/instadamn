package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DXV extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C6MZ A03;
    public final /* synthetic */ InterfaceC118275Wp A04;
    public final /* synthetic */ InterfaceC118305Ws A05;
    public final /* synthetic */ InterfaceC1333460b A06;
    public final /* synthetic */ InterfaceC30770Dg7 A07;
    public final /* synthetic */ LazyGridState A08;
    public final /* synthetic */ Modifier A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXV(C6MZ c6mz, InterfaceC118275Wp interfaceC118275Wp, InterfaceC118305Ws interfaceC118305Ws, InterfaceC1333460b interfaceC1333460b, InterfaceC30770Dg7 interfaceC30770Dg7, LazyGridState lazyGridState, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A09 = modifier;
        this.A08 = lazyGridState;
        this.A07 = interfaceC30770Dg7;
        this.A06 = interfaceC1333460b;
        this.A0C = z;
        this.A0B = z2;
        this.A03 = c6mz;
        this.A0D = z3;
        this.A05 = interfaceC118305Ws;
        this.A04 = interfaceC118275Wp;
        this.A0A = interfaceC16660sJ;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Modifier modifier = this.A09;
        LazyGridState lazyGridState = this.A08;
        InterfaceC30770Dg7 interfaceC30770Dg7 = this.A07;
        InterfaceC1333460b interfaceC1333460b = this.A06;
        boolean z = this.A0C;
        boolean z2 = this.A0B;
        C6MZ c6mz = this.A03;
        boolean z3 = this.A0D;
        CAs.A00(c6mz, this.A04, this.A05, interfaceC1333460b, interfaceC30770Dg7, lazyGridState, A0S, modifier, this.A0A, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), this.A02, z, z2, z3);
        return C0eB.A00;
    }
}
