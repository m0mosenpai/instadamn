package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DVH extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVH(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A06 = str;
        this.A07 = str2;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            AbstractC28317Ce3.A01(A0S, (Modifier) this.A04, (ImageUrl) this.A03, this.A06, this.A07, (InterfaceC16660sJ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02);
        } else {
            String str = this.A06;
            C5Hc c5Hc = (C5Hc) this.A03;
            int i2 = this.A02;
            CID.A00(A0S, (BP5) this.A04, str, this.A07, (C0s9) this.A05, c5Hc, i2, AbstractC25225BEi.A04(this.A01));
        }
        return C0eB.A00;
    }
}
