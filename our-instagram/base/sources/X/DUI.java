package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DUI extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUI(Object obj, Object obj2, Object obj3, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = z;
        this.A03 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) this.A05;
                AbstractC27469CAp.A00(A0S, (Alignment) this.A04, modifier, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A06);
                break;
            case 1:
                ImageUrl imageUrl = (ImageUrl) this.A03;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
                AbstractC27533CDd.A00(A0S, (Modifier) this.A04, imageUrl, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A02, this.A06);
                break;
            case 2:
                AbstractC28111CaK.A00(A0S, (Modifier) this.A03, (C26009Bex) this.A05, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, this.A06);
                break;
            case 3:
                CEJ.A00(A0S, (Modifier) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, this.A06);
                break;
            case 4:
                boolean z = this.A06;
                C5Hc c5Hc = (C5Hc) this.A05;
                AbstractC28034CXi.A01(A0S, (Modifier) this.A03, (InterfaceC16820sZ) this.A04, c5Hc, AbstractC25225BEi.A04(this.A01), this.A02, z);
                break;
            case 5:
                AbstractC28311Cdx.A02(A0S, (BJF) this.A05, (InterfaceC16620sF) this.A04, (InterfaceC16620sF) this.A03, this.A02, AbstractC25225BEi.A04(this.A01), this.A06);
                break;
            case 6:
                AbstractC136446Fx.A01(A0S, (C132335yC) this.A05, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A06);
                break;
            default:
                N84 n84 = (N84) this.A05;
                AbstractC28444Cgs.A02(A0S, (UQE) this.A04, n84, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A06);
                break;
        }
        return C0eB.A00;
    }
}
