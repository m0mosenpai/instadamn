package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DXF extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C5C8 A04;
    public final /* synthetic */ AbstractC27441C9j A05;
    public final /* synthetic */ BGT A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXF(Modifier modifier, C5C8 c5c8, AbstractC27441C9j abstractC27441C9j, BGT bgt, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, double d, int i, int i2, boolean z) {
        super(2);
        this.A04 = c5c8;
        this.A05 = abstractC27441C9j;
        this.A0B = z;
        this.A06 = bgt;
        this.A03 = modifier;
        this.A09 = interfaceC16660sJ;
        this.A07 = interfaceC16660sJ2;
        this.A08 = interfaceC16660sJ3;
        this.A0A = interfaceC16660sJ4;
        this.A00 = d;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C5C8 c5c8 = this.A04;
        AbstractC27441C9j abstractC27441C9j = this.A05;
        boolean z = this.A0B;
        AbstractC25259BFx.A01(A0S, this.A03, c5c8, abstractC27441C9j, this.A06, this.A09, this.A07, this.A08, this.A0A, this.A00, AbstractC25225BEi.A04(this.A01), this.A02, z);
        return C0eB.A00;
    }
}
