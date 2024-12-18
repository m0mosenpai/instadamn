package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DX0 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C6MZ A02;
    public final /* synthetic */ InterfaceC118275Wp A03;
    public final /* synthetic */ InterfaceC118305Ws A04;
    public final /* synthetic */ InterfaceC1333460b A05;
    public final /* synthetic */ InterfaceC30904DiH A06;
    public final /* synthetic */ LazyGridState A07;
    public final /* synthetic */ Modifier A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DX0(C6MZ c6mz, InterfaceC118275Wp interfaceC118275Wp, InterfaceC118305Ws interfaceC118305Ws, InterfaceC1333460b interfaceC1333460b, InterfaceC30904DiH interfaceC30904DiH, LazyGridState lazyGridState, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A06 = interfaceC30904DiH;
        this.A08 = modifier;
        this.A07 = lazyGridState;
        this.A05 = interfaceC1333460b;
        this.A0A = z;
        this.A04 = interfaceC118305Ws;
        this.A03 = interfaceC118275Wp;
        this.A02 = c6mz;
        this.A0B = z2;
        this.A09 = interfaceC16660sJ;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC30904DiH interfaceC30904DiH = this.A06;
        Modifier modifier = this.A08;
        LazyGridState lazyGridState = this.A07;
        InterfaceC1333460b interfaceC1333460b = this.A05;
        boolean z = this.A0A;
        InterfaceC118305Ws interfaceC118305Ws = this.A04;
        InterfaceC118275Wp interfaceC118275Wp = this.A03;
        AbstractC27471CAr.A00(this.A02, interfaceC118275Wp, interfaceC118305Ws, interfaceC1333460b, interfaceC30904DiH, lazyGridState, A0S, modifier, this.A09, AbstractC25225BEi.A04(this.A00), this.A01, z, this.A0B);
        return C0eB.A00;
    }
}
