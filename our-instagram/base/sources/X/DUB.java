package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUB extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUB(Object obj, Object obj2, float f, int i, int i2, int i3, long j) {
        super(2);
        this.A01 = i3;
        this.A06 = obj;
        this.A00 = f;
        this.A04 = j;
        this.A05 = obj2;
        this.A02 = i;
        this.A03 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            CXV.A01(A0S, (Modifier) this.A06, (C5Hc) this.A05, this.A00, AbstractC25225BEi.A04(this.A02), this.A03, this.A04);
        } else {
            C5Hc c5Hc = (C5Hc) this.A06;
            CXV.A00(A0S, (Modifier) this.A05, c5Hc, this.A00, AbstractC25225BEi.A04(this.A02), this.A03, this.A04);
        }
        return C0eB.A00;
    }
}
