package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUK extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUK(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(2);
        this.A00 = i2;
        this.A05 = obj;
        this.A02 = obj2;
        this.A06 = z;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C50726MaR c50726MaR = (C50726MaR) this.A05;
                boolean z = this.A06;
                AbstractC28496Chp.A02(A0S, c50726MaR, (C28370CfW) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16610sE) this.A04, AbstractC25225BEi.A04(this.A01), z);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                CY9.A00((C6GN) this.A05, A0S2, (C7U) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01), this.A06);
                break;
            case 2:
                AbstractC28311Cdx.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, (InterfaceC16620sF) this.A04, (InterfaceC16620sF) this.A03, (C5Hc) this.A05, AbstractC25225BEi.A04(this.A01), this.A06);
                break;
            default:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                boolean z2 = this.A06;
                AbstractC28509Ci3.A0D(A0S3, (C26081BgA) this.A05, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A01), z2);
                break;
        }
        return C0eB.A00;
    }
}
