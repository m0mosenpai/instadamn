package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DV1 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DV1(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4, int i5) {
        super(2);
        this.A00 = i5;
        this.A03 = i;
        this.A04 = i2;
        this.A07 = obj;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A01 = i3;
        this.A02 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i2 = this.A03;
        if (i != 0) {
            AbstractC28298Cdk.A00(A0S, (Modifier) this.A06, (CRJ) this.A07, (InterfaceC16660sJ) this.A05, i2, this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
        } else {
            int i3 = this.A04;
            C5Hc c5Hc = (C5Hc) this.A07;
            CEH.A00(A0S, (Modifier) this.A05, (InterfaceC16820sZ) this.A06, c5Hc, i2, i3, AbstractC25225BEi.A04(this.A01), this.A02);
        }
        return C0eB.A00;
    }
}
