package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DVC extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVC(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3, int i4) {
        super(2);
        this.A00 = i4;
        this.A06 = obj;
        this.A05 = obj2;
        this.A07 = str;
        this.A03 = i;
        this.A04 = obj3;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Object obj3 = this.A06;
        if (i != 0) {
            CZ8.A01(A0S, (Modifier) this.A05, (C27955CTv) obj3, this.A07, (InterfaceC16620sF) this.A04, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
        } else {
            AbstractC28032CXg.A01(A0S, (Modifier) this.A05, (C136936Hw) obj3, this.A07, (InterfaceC16620sF) this.A04, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
        }
        return C0eB.A00;
    }
}
