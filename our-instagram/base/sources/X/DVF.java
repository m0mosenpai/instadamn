package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DVF extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVF(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A06 = str;
        this.A07 = z;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                boolean z = this.A07;
                String str = this.A06;
                BY5.A01((C5XO) this.A03, A0S, (C2DC) this.A05, str, (InterfaceC16820sZ) this.A04, (InterfaceC16620sF) this.A02, AbstractC25225BEi.A04(this.A01), z);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                String str2 = this.A06;
                boolean z2 = this.A07;
                C68 c68 = (C68) this.A05;
                AbstractC28507Ci0.A05(A0S2, (Modifier) this.A03, (InterfaceC11380iw) this.A02, c68, str2, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), z2);
                break;
            case 2:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A03;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A04;
                String str3 = this.A06;
                AbstractC28445Cgt.A02(A0S3, (EnumC27396C6z) this.A02, str3, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ2, AbstractC25225BEi.A04(this.A01), this.A07);
                break;
            default:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                String str4 = this.A06;
                boolean z3 = this.A07;
                CZI.A01(A0S4, (InterfaceC58202Pr8) this.A05, str4, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01), z3);
                break;
        }
        return C0eB.A00;
    }
}
