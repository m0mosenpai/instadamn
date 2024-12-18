package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DUX extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUX(Object obj, Object obj2, String str, String str2, String str3, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = obj;
        this.A06 = str3;
        this.A03 = obj2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            String str = this.A04;
            String str2 = this.A05;
            AbstractC28299Cdl.A02(A0S, (Modifier) this.A03, (ImageUrl) this.A02, str, str2, this.A06, AbstractC25225BEi.A04(this.A01));
        } else {
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A03;
            AbstractC28432Cgg.A02(A0S, (Modifier) this.A02, this.A06, this.A05, this.A04, interfaceC16820sZ, AbstractC25225BEi.A04(this.A01));
        }
        return C0eB.A00;
    }
}
