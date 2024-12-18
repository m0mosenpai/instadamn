package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTS extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTS(Object obj, float f, int i, int i2, int i3, long j) {
        super(2);
        this.A01 = i3;
        this.A05 = obj;
        this.A00 = f;
        this.A04 = j;
        this.A02 = i;
        this.A03 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Modifier modifier = (Modifier) this.A05;
        switch (i) {
            case 0:
                AbstractC137516Kw.A01(A0S, modifier, this.A00, AbstractC25225BEi.A04(this.A02), this.A03, this.A04);
                break;
            case 1:
                AbstractC28389Cfs.A02(A0S, modifier, this.A00, AbstractC25225BEi.A04(this.A02), this.A03, this.A04);
                break;
            case 2:
                BGY.A02(A0S, modifier, this.A00, AbstractC25225BEi.A04(this.A02), this.A03, this.A04);
                break;
            default:
                BGM.A01(A0S, modifier, this.A00, AbstractC25225BEi.A04(this.A02), this.A03, this.A04);
                break;
        }
        return C0eB.A00;
    }
}
