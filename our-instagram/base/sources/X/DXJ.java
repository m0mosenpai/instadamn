package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DXJ extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXJ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A0B = z;
        this.A0A = obj2;
        this.A07 = obj3;
        this.A09 = obj4;
        this.A08 = obj5;
        this.A06 = obj6;
        this.A03 = obj7;
        this.A05 = obj8;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            AbstractC28502Chv.A03(A0S, (C51739MtM) this.A0A, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A09, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A08, (InterfaceC16660sJ) this.A07, (InterfaceC16660sJ) this.A06, AbstractC25225BEi.A04(this.A02), this.A01, this.A0B);
        } else {
            Modifier modifier = (Modifier) this.A04;
            boolean z = this.A0B;
            C26009Bex c26009Bex = (C26009Bex) this.A0A;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A07;
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A09;
            CXS.A01(A0S, modifier, (InterfaceC30798DgZ) this.A05, c26009Bex, interfaceC16820sZ, (InterfaceC16820sZ) this.A08, interfaceC16660sJ, (InterfaceC16620sF) this.A06, (C5Hc) this.A03, AbstractC25225BEi.A04(this.A02), this.A01, z);
        }
        return C0eB.A00;
    }
}
