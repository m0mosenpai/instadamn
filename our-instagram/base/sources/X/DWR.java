package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DWR extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWR(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A07 = obj;
        this.A09 = z;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A08 = str;
        this.A03 = obj5;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C6L1 c6l1 = (C6L1) this.A07;
                boolean z = this.A09;
                AbstractC28495Cho.A06((CWS) this.A04, (CWT) this.A05, c6l1, A0S, (Modifier) this.A06, this.A08, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, z);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                C6GN c6gn = (C6GN) this.A07;
                boolean z2 = this.A09;
                AbstractC28495Cho.A05((CWS) this.A04, (CWT) this.A05, c6gn, A0S2, (Modifier) this.A06, this.A08, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, z2);
                break;
            default:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                String str = this.A08;
                C5Hc c5Hc = (C5Hc) this.A03;
                boolean z3 = this.A09;
                AbstractC28297Cdj.A02(A0S3, (Modifier) this.A04, str, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A07, (InterfaceC16660sJ) this.A06, c5Hc, AbstractC25225BEi.A04(this.A01), this.A02, z3);
                break;
        }
        return C0eB.A00;
    }
}
