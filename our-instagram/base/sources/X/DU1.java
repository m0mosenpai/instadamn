package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DU1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ InterfaceC16660sJ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU1(Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, float f, float f2, float f3, int i, int i2) {
        super(2);
        this.A02 = f;
        this.A06 = interfaceC16660sJ;
        this.A01 = f2;
        this.A00 = f3;
        this.A05 = modifier;
        this.A03 = i;
        this.A04 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        float f = this.A02;
        AbstractC28395Cg1.A01(A0S, this.A05, this.A06, f, this.A01, this.A00, AbstractC25225BEi.A04(this.A03), this.A04);
        return C0eB.A00;
    }
}
