package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUO extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUO(Object obj, String str, int i, int i2, int i3, int i4, long j) {
        super(2);
        this.A00 = i4;
        this.A03 = i;
        this.A06 = str;
        this.A04 = j;
        this.A05 = obj;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            CH6.A00(A0S, (Modifier) this.A05, this.A06, this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A04);
        } else {
            int i2 = this.A03;
            AbstractC28041CXt.A00(A0S, this.A06, (InterfaceC16820sZ) this.A05, i2, AbstractC25225BEi.A04(this.A01), this.A02, this.A04);
        }
        return C0eB.A00;
    }
}
