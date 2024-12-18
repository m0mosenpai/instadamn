package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

/* loaded from: classes5.dex */
public final class DTY extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTY(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = z;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28486Che.A05(A0S, (InterfaceC16820sZ) this.A03, (InterfaceC16620sF) this.A04, (C5Hc) this.A02, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 1:
                AbstractC28486Che.A06(A0S, (InterfaceC16820sZ) this.A03, (InterfaceC16620sF) this.A04, (C5Hc) this.A02, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 2:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A03;
                boolean z = this.A05;
                CXU.A00(A0S, (Modifier) this.A02, interfaceC16820sZ, (C5Hc) this.A04, AbstractC25225BEi.A04(this.A01), z);
                break;
            case 3:
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
                AbstractC28042CXu.A01(A0S, (EnumC166147bi) this.A02, (InterfaceC16820sZ) this.A04, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 4:
                AbstractC28045CXx.A01(A0S, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A02, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 5:
                AbstractC28437Cgl.A01(A0S, (InterfaceC137546La) this.A02, (InterfaceC137546La) this.A03, (C27866CQd) this.A04, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 6:
                EnumC27394C6x enumC27394C6x = (EnumC27394C6x) this.A03;
                AbstractC28312Cdy.A01(A0S, (ImmutableList) this.A04, enumC27394C6x, (InterfaceC16620sF) this.A02, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 7:
                C5Hc c5Hc = (C5Hc) this.A02;
                AbstractC28055CYj.A00(A0S, (InterfaceC74953Yl) this.A04, (InterfaceC16820sZ) this.A03, c5Hc, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 8:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A04;
                C3EW c3ew = (C3EW) this.A02;
                AbstractC28400Cg6.A01(A0S, (C3EZ) this.A03, c3ew, interfaceC16820sZ2, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 9:
                AbstractC28469ChL.A05(A0S, (C26014Bf2) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
            case 10:
                boolean z2 = this.A05;
                AbstractC28471ChN.A04(A0S, (EnumC53144Nex) this.A04, (InterfaceC16660sJ) this.A03, (InterfaceC65696TsI) this.A02, AbstractC25225BEi.A04(this.A01), z2);
                break;
            default:
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A03;
                AbstractC28340CeS.A02(A0S, (InterfaceC58202Pr8) this.A04, (InterfaceC16820sZ) this.A02, interfaceC16660sJ2, AbstractC25225BEi.A04(this.A01), this.A05);
                break;
        }
        return C0eB.A00;
    }
}
