package X;

import android.view.View;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DV2 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DV2(Object obj, Object obj2, Object obj3, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A07 = z;
        this.A06 = z2;
        this.A03 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                boolean z = this.A07;
                CGE.A00(A0S, (Modifier) this.A03, (C6M) this.A05, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A02, z, this.A06);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                boolean z2 = this.A07;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
                CGL.A00((C5XO) this.A03, A0S2, (Modifier) this.A04, interfaceC16820sZ, AbstractC25225BEi.A04(this.A01), this.A02, z2, this.A06);
                break;
            case 2:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                Modifier modifier = (Modifier) this.A05;
                AbstractC28475ChT.A02((C5XO) this.A04, A0S3, modifier, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A07, this.A06);
                break;
            default:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                C5Hc c5Hc = (C5Hc) this.A04;
                CIS.A00((View) this.A05, A0S4, (Modifier) this.A03, c5Hc, AbstractC25225BEi.A04(this.A01), this.A02, this.A06, this.A07);
                break;
        }
        return C0eB.A00;
    }
}
