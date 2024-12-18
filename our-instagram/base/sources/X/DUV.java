package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DUV extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUV(Object obj, Object obj2, String str, String str2, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = z;
        this.A02 = obj2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28488Chg.A00((C6L1) this.A03, A0S, (L66) this.A02, this.A04, this.A05, AbstractC25225BEi.A04(this.A01), this.A06);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                String str = this.A04;
                String str2 = this.A05;
                AbstractC27668CIn.A00(A0S2, (ImageUrl) this.A02, str, str2, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A06);
                break;
            default:
                AbstractC28508Ci2.A09(AbstractC25226BEj.A0S(obj, obj2), this.A05, this.A04, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, AbstractC25225BEi.A04(this.A01), this.A06);
                break;
        }
        return C0eB.A00;
    }
}
