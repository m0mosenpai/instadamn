package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUQ extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUQ(Object obj, Object obj2, String str, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A00 = i2;
        this.A04 = str;
        this.A03 = obj;
        this.A02 = obj2;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A04;
                InterfaceC30801Dgc interfaceC30801Dgc = (InterfaceC30801Dgc) this.A03;
                AbstractC28505Chy.A08(A0S, (Modifier) this.A02, interfaceC30801Dgc, str, AbstractC25225BEi.A04(this.A01), this.A05, this.A06);
                break;
            case 1:
                String str2 = this.A04;
                boolean z = this.A06;
                boolean z2 = this.A05;
                CYU.A01(A0S, str2, (InterfaceC16820sZ) this.A03, (InterfaceC16660sJ) this.A02, AbstractC25225BEi.A04(this.A01), z, z2);
                break;
            default:
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
                C5Hc c5Hc = (C5Hc) this.A02;
                CYx.A01(A0S, this.A04, interfaceC16660sJ, c5Hc, AbstractC25225BEi.A04(this.A01), this.A05, this.A06);
                break;
        }
        return C0eB.A00;
    }
}
