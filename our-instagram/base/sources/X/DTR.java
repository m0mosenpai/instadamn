package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTR extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTR(Modifier modifier, float f, int i, int i2, long j, boolean z) {
        super(2);
        this.A04 = modifier;
        this.A03 = j;
        this.A00 = f;
        this.A05 = z;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Modifier modifier = this.A04;
        long j = this.A03;
        AbstractC27717CKk.A00(A0S, modifier, this.A00, AbstractC25225BEi.A04(this.A01), this.A02, j, this.A05);
        return C0eB.A00;
    }
}
