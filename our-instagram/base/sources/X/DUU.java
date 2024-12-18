package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DUU extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUU(Object obj, Object obj2, String str, String str2, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A05 = str;
        this.A03 = obj;
        this.A06 = str2;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04;
                AbstractC27546CDq.A00(A0S, (Modifier) this.A03, this.A06, this.A05, interfaceC16820sZ, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                String str = this.A06;
                String str2 = this.A05;
                AbstractC28295Cdh.A01(A0S, (Modifier) this.A03, (ImageUrl) this.A04, str, str2, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 2:
                CEX.A00(A0S, (Modifier) this.A03, this.A06, this.A05, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 3:
                AbstractC28475ChT.A03(A0S, (C2DC) this.A03, (EnumC27364C5t) this.A04, this.A06, this.A05, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 4:
                AbstractC27644CHp.A00(A0S, (Modifier) this.A03, this.A05, this.A06, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            default:
                AbstractC27651CHw.A00(A0S, (Modifier) this.A03, this.A06, this.A05, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
        }
        return C0eB.A00;
    }
}
