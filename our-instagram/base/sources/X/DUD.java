package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUD extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUD(Object obj, Object obj2, int i, int i2, int i3, long j, boolean z) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A06 = z;
        this.A05 = obj2;
        this.A03 = j;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            boolean z = this.A06;
            CH0.A00(A0S, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, this.A03, z);
        } else {
            Modifier modifier = (Modifier) this.A04;
            boolean z2 = this.A06;
            AbstractC28387Cfq.A01(A0S, modifier, (C26038BfR) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, this.A03, z2);
        }
        return C0eB.A00;
    }
}
