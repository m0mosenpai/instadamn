package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUG extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUG(Object obj, Object obj2, Object obj3, int i, int i2, int i3, long j) {
        super(2);
        this.A00 = i3;
        this.A03 = j;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (2 - i != 0) {
            AbstractC28504Chx.A04(A0S, (C27934CSt) this.A04, (CharSequence) this.A06, (InterfaceC16660sJ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, this.A03);
        } else {
            long j = this.A03;
            CY1.A01(A0S, (Modifier) this.A04, (InterfaceC16660sJ) this.A05, (InterfaceC16620sF) this.A06, AbstractC25225BEi.A04(this.A01), this.A02, j);
        }
        return C0eB.A00;
    }
}
