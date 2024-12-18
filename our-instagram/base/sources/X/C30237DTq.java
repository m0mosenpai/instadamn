package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DTq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30237DTq extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30237DTq(Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A04 = z;
        this.A03 = interfaceC16660sJ;
        this.A02 = modifier;
        this.A05 = z2;
        this.A06 = z3;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        boolean z = this.A04;
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        AbstractC28435Cgj.A04(A0S, this.A02, interfaceC16660sJ, AbstractC25225BEi.A04(this.A00), this.A01, z, this.A05, this.A06);
        return C0eB.A00;
    }
}
