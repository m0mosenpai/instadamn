package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DVG extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVG(Object obj, Object obj2, String str, String str2, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = z;
        this.A04 = obj;
        this.A02 = i;
        this.A03 = obj2;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                boolean z = this.A07;
                AbstractC27523CCt.A00(A0S, (ImageUrl) this.A04, this.A06, this.A05, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, z);
                break;
            case 1:
                String str = this.A05;
                String str2 = this.A06;
                boolean z2 = this.A07;
                AbstractC28382Cfl.A03(A0S, (ImageUrl) this.A04, str, str2, (InterfaceC16660sJ) this.A03, this.A02, AbstractC25225BEi.A04(this.A01), z2);
                break;
            default:
                boolean z3 = this.A07;
                AbstractC28471ChN.A02(A0S, (Modifier) this.A03, this.A05, this.A06, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, z3);
                break;
        }
        return C0eB.A00;
    }
}
