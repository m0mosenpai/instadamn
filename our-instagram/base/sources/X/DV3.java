package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DV3 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DV3(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, long j) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A03 = j;
        this.A06 = obj2;
        this.A07 = obj3;
        this.A05 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AbstractC28413CgJ.A00(AbstractC25226BEj.A0S(obj, obj2), (Alignment) this.A04, (CUY) this.A07, (InterfaceC16820sZ) this.A06, (InterfaceC16620sF) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, this.A03);
                break;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C5Hc c5Hc = (C5Hc) this.A04;
                long j = this.A03;
                AbstractC28027CXb.A00(A0S, (Modifier) this.A05, (InterfaceC16820sZ) this.A07, (InterfaceC16620sF) this.A06, c5Hc, AbstractC25225BEi.A04(this.A01), this.A02, j);
                break;
            case 2:
                AbstractC28462ChE.A01((LazyListState) this.A04, AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A05, (C25814BbV) this.A07, (InterfaceC166347c3) this.A06, AbstractC25225BEi.A04(this.A01), this.A02, this.A03);
                break;
            default:
                C168937gS c168937gS = (C168937gS) obj;
                AbstractC167007dF.A1K(c168937gS, obj2);
                C75933ay c75933ay = C51722Yv.A02;
                Integer num = C05F.A00;
                C51722Yv A00 = C9CU.A00(C9CU.A00(null, num, 0, ((C15100pQ) this.A05).A00 | 9221401712017801216L), C05F.A04, 0, this.A02 | 9221401712017801216L);
                CVB cvb = (CVB) this.A06;
                C51762Yz c51762Yz = (C51762Yz) this.A04;
                int i = this.A01;
                long j2 = this.A03;
                Object obj3 = this.A07;
                return AbstractC25227BEk.A0W(new C26433BmG(AbstractC25230BEn.A0e(AbstractC25234BEr.A0N(null, C05F.A01, num, 100.0f, 0), C05F.A0Y, new DHO(i, 25, obj3), null), cvb.A00, new BFI(i, 39, obj3, cvb), j2, AbstractC167007dF.A1P(AbstractC166987dD.A0H(c51762Yz.A03), i)), AbstractC167007dF.A0P(c168937gS.A00), c168937gS, A00);
        }
        return C0eB.A00;
    }
}
