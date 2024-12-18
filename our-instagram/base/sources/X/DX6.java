package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DX6 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ LazyListState A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C25314BIj A05;
    public final /* synthetic */ C166047bW A06;
    public final /* synthetic */ InterfaceC166277bw A07;
    public final /* synthetic */ C25814BbV A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;
    public final /* synthetic */ C5Hc A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DX6(LazyListState lazyListState, Modifier modifier, C25314BIj c25314BIj, C166047bW c166047bW, InterfaceC166277bw interfaceC166277bw, C25814BbV c25814BbV, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, int i, int i2, long j) {
        super(2);
        this.A0B = c5Hc;
        this.A03 = lazyListState;
        this.A09 = interfaceC16820sZ;
        this.A0A = interfaceC16660sJ;
        this.A08 = c25814BbV;
        this.A07 = interfaceC166277bw;
        this.A04 = modifier;
        this.A06 = c166047bW;
        this.A05 = c25314BIj;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C5Hc c5Hc = this.A0B;
        LazyListState lazyListState = this.A03;
        InterfaceC16820sZ interfaceC16820sZ = this.A09;
        InterfaceC16660sJ interfaceC16660sJ = this.A0A;
        C25814BbV c25814BbV = this.A08;
        InterfaceC166277bw interfaceC166277bw = this.A07;
        Modifier modifier = this.A04;
        C166047bW c166047bW = this.A06;
        AbstractC28462ChE.A00(lazyListState, A0S, modifier, this.A05, c166047bW, interfaceC166277bw, c25814BbV, interfaceC16820sZ, interfaceC16660sJ, c5Hc, AbstractC25225BEi.A04(this.A00), this.A01, this.A02);
        return C0eB.A00;
    }
}
