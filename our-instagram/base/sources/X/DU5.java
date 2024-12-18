package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DU5 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU5(Modifier modifier, float f, float f2, int i, int i2, long j, boolean z) {
        super(2);
        this.A01 = f;
        this.A04 = j;
        this.A05 = modifier;
        this.A06 = z;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        float f = this.A01;
        long j = this.A04;
        AbstractC28397Cg3.A00(A0S, this.A05, f, this.A00, AbstractC25225BEi.A04(this.A02), this.A03, j, this.A06);
        return C0eB.A00;
    }
}
