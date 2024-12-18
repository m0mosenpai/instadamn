package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DWL extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final Object A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWL(Modifier modifier, float f, float f2, float f3, int i, int i2, int i3, long j, long j2, boolean z) {
        super(2);
        this.A03 = i3;
        this.A01 = f;
        this.A08 = modifier;
        this.A06 = j;
        this.A09 = z;
        this.A07 = j2;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = i;
        this.A05 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A03 != 0) {
            C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
            float f = this.A01;
            Modifier modifier = (Modifier) this.A08;
            long j = this.A06;
            boolean z = this.A09;
            BGM.A00(A0S, modifier, f, this.A02, this.A00, AbstractC25225BEi.A04(this.A04), this.A05, j, this.A07, z);
        } else {
            C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
            float f2 = this.A01;
            Modifier modifier2 = (Modifier) this.A08;
            long j2 = this.A06;
            boolean z2 = this.A09;
            BGY.A01(A0S2, modifier2, f2, this.A02, this.A00, AbstractC25225BEi.A04(this.A04), this.A05, j2, this.A07, z2);
        }
        return C0eB.A00;
    }
}
