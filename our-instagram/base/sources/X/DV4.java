package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DV4 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DV4(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A06 = obj2;
        this.A07 = z;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                boolean z = this.A07;
                int i = this.A02;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
                AbstractC28294Cdg.A00(A0S, (Modifier) this.A04, (Modifier) this.A06, (InterfaceC156146zi) this.A03, interfaceC16820sZ, i, AbstractC25225BEi.A04(this.A01), z);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                boolean z2 = this.A07;
                C5Hc c5Hc = (C5Hc) this.A06;
                AbstractC28294Cdg.A02(A0S2, (Modifier) this.A04, (InterfaceC156146zi) this.A03, (InterfaceC16660sJ) this.A05, c5Hc, AbstractC25225BEi.A04(this.A01), this.A02, z2);
                break;
            case 2:
                AbstractC28296Cdi.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A06, AbstractC25225BEi.A04(this.A01), this.A02, this.A07);
                break;
            case 3:
                AbstractC28383Cfm.A03(AbstractC25226BEj.A0S(obj, obj2), (CSQ) this.A06, (InterfaceC16660sJ) this.A04, (InterfaceC16660sJ) this.A05, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A07);
                break;
            case 4:
                AbstractC28297Cdj.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC109864xE) this.A03, (InterfaceC16820sZ) this.A06, (InterfaceC16660sJ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, this.A07);
                break;
            default:
                AbstractC28475ChT.A00((C5XO) this.A03, AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC30990Djp) this.A06, (InterfaceC16660sJ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, this.A07);
                break;
        }
        return C0eB.A00;
    }
}
