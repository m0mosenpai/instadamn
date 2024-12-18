package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DUS extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUS(Object obj, Object obj2, Object obj3, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A05 = str;
        this.A04 = obj;
        this.A03 = obj2;
        this.A06 = z;
        this.A02 = obj3;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A05;
                Integer num = (Integer) this.A02;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                AbstractC27512CCi.A00(A0S, num, str, (InterfaceC16820sZ) this.A03, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A06);
                break;
            case 1:
                CKD.A00(A0S, this.A05, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A06);
                break;
            default:
                String str2 = this.A05;
                AbstractC28339CeR.A02(A0S, (MOE) this.A02, (C69749Vuj) this.A04, (ImageUrl) this.A03, str2, AbstractC25225BEi.A04(this.A01), this.A06);
                break;
        }
        return C0eB.A00;
    }
}
