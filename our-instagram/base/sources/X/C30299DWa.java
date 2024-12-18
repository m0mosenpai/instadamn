package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DWa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30299DWa extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ CTG A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30299DWa(Modifier modifier, CTG ctg, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A02 = i;
        this.A07 = interfaceC16660sJ;
        this.A06 = interfaceC16820sZ;
        this.A0A = z;
        this.A09 = z2;
        this.A03 = j;
        this.A05 = ctg;
        this.A04 = modifier;
        this.A08 = z3;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i = this.A02;
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        InterfaceC16820sZ interfaceC16820sZ = this.A06;
        boolean z = this.A0A;
        boolean z2 = this.A09;
        long j = this.A03;
        CTG ctg = this.A05;
        AbstractC28461ChD.A05(A0S, this.A04, ctg, interfaceC16820sZ, interfaceC16660sJ, i, AbstractC25225BEi.A04(this.A00), this.A01, j, z, z2, this.A08);
        return C0eB.A00;
    }
}
