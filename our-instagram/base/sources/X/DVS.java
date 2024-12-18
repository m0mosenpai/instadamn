package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DVS extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ C5W5 A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVS(Modifier modifier, C5W5 c5w5, int i, int i2, int i3, int i4, long j, long j2, boolean z) {
        super(2);
        this.A02 = i;
        this.A06 = modifier;
        this.A03 = i2;
        this.A08 = z;
        this.A04 = j;
        this.A07 = c5w5;
        this.A05 = j2;
        this.A00 = i3;
        this.A01 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i = this.A02;
        Modifier modifier = this.A06;
        int i2 = this.A03;
        boolean z = this.A08;
        long j = this.A04;
        AbstractC28029CXd.A00(A0S, modifier, this.A07, i, i2, AbstractC25225BEi.A04(this.A00), this.A01, j, this.A05, z);
        return C0eB.A00;
    }
}
