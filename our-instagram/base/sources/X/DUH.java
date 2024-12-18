package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

/* loaded from: classes5.dex */
public final class DUH extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUH(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4) {
        super(2);
        this.A00 = i4;
        this.A05 = obj;
        this.A03 = i;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                CYN.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A05, (ImmutableList) this.A04, (InterfaceC16660sJ) this.A06, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C5Hc c5Hc = (C5Hc) this.A06;
                int i = this.A03;
                CI2.A00(A0S, (Modifier) this.A04, (InterfaceC16660sJ) this.A05, c5Hc, i, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                Integer num = (Integer) this.A05;
                int i2 = this.A03;
                AbstractC28441Cgp.A04(A0S2, num, (Integer) this.A06, (InterfaceC16820sZ) this.A04, i2, this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                ((C26780Bs3) this.A06).A05((LazyListState) this.A05, A0S3, (InterfaceC16820sZ) this.A04, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
        }
        return C0eB.A00;
    }
}
