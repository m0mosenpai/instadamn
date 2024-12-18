package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DWS extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWS(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A08 = obj;
        this.A03 = obj2;
        this.A09 = str;
        this.A06 = obj3;
        this.A05 = obj4;
        this.A04 = obj5;
        this.A07 = obj6;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
            C136606Go c136606Go = (C136606Go) this.A08;
            C69P c69p = (C69P) this.A03;
            String str = this.A09;
            CEP.A00(c136606Go, A0S, (Modifier) this.A04, c69p, (C72) this.A06, (C28874Coi) this.A07, str, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02);
        } else {
            C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
            Object obj3 = this.A07;
            AbstractC28284CdW.A02(A0S2, (Alignment) this.A04, (Modifier) this.A06, obj3, this.A09, (InterfaceC16660sJ) this.A08, (InterfaceC16660sJ) this.A05, (InterfaceC16600sD) this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
        }
        return C0eB.A00;
    }
}
