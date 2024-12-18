package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DXL extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXL(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A06 = obj;
        this.A0A = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A0B = z;
        this.A05 = obj4;
        this.A07 = obj5;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            Modifier modifier = (Modifier) this.A06;
            String str = this.A0A;
            String str2 = this.A09;
            String str3 = this.A08;
            AbstractC28047CXz.A00(A0S, modifier, (C2DC) this.A04, (EnumC27360C5p) this.A05, str, str2, str3, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A07, AbstractC25225BEi.A04(this.A02), this.A01, this.A0B);
        } else {
            C2DC c2dc = (C2DC) this.A07;
            Modifier modifier2 = (Modifier) this.A05;
            String str4 = this.A08;
            String str5 = this.A09;
            CD6.A00(A0S, modifier2, c2dc, (C5YL) this.A03, str4, str5, this.A0A, (InterfaceC16820sZ) this.A06, (InterfaceC16610sE) this.A04, AbstractC25225BEi.A04(this.A02), this.A01, this.A0B);
        }
        return C0eB.A00;
    }
}
