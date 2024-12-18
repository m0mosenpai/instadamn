package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DUi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30255DUi extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ EnumC27349C5e A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ C5Hc A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30255DUi(Modifier modifier, EnumC27349C5e enumC27349C5e, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, int i, int i2, int i3, long j) {
        super(2);
        this.A02 = i;
        this.A07 = c5Hc;
        this.A06 = interfaceC16660sJ;
        this.A04 = modifier;
        this.A05 = enumC27349C5e;
        this.A03 = j;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i = this.A02;
        C5Hc c5Hc = this.A07;
        InterfaceC16660sJ interfaceC16660sJ = this.A06;
        CY1.A00(A0S, this.A04, this.A05, interfaceC16660sJ, c5Hc, i, AbstractC25225BEi.A04(this.A00), this.A01, this.A03);
        return C0eB.A00;
    }
}
