package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUC extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUC(Object obj, Object obj2, int i, int i2, int i3, int i4, int i5) {
        super(2);
        this.A00 = i5;
        this.A03 = i;
        this.A04 = i2;
        this.A05 = obj;
        this.A06 = obj2;
        this.A01 = i3;
        this.A02 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i2 = this.A03;
        int i3 = this.A04;
        if (i != 0) {
            CIH.A00(A0S, (Modifier) this.A05, (InterfaceC16820sZ) this.A06, i2, i3, AbstractC25225BEi.A04(this.A01), this.A02);
        } else {
            CED.A00(A0S, (Modifier) this.A05, (InterfaceC16820sZ) this.A06, i2, i3, AbstractC25225BEi.A04(this.A01), this.A02);
        }
        return C0eB.A00;
    }
}
