package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTV extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTV(int i, int i2, int i3, Object obj, Object obj2, boolean z) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A05 = z;
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
                CD4.A00(A0S, (Modifier) this.A03, interfaceC16820sZ, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
                break;
            case 1:
                AbstractC27541CDl.A00(A0S, (Modifier) this.A03, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
                break;
            case 2:
                boolean z = this.A05;
                CE2.A00(A0S, (Modifier) this.A03, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, z);
                break;
            case 3:
                boolean z2 = this.A05;
                AbstractC136726Hb.A01(A0S, (Modifier) this.A03, (C5Hc) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, z2);
                break;
            case 4:
                AbstractC27593CFm.A00(A0S, (Modifier) this.A03, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
                break;
            case 5:
                InterfaceC30937Dir interfaceC30937Dir = (InterfaceC30937Dir) this.A04;
                AbstractC28474ChS.A03(A0S, (C2DC) this.A03, interfaceC30937Dir, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
                break;
            case 6:
                CYF.A01(A0S, (C27866CQd) this.A04, (Integer) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
                break;
            case 7:
                boolean z3 = this.A05;
                AbstractC28311Cdx.A00(A0S, (Modifier) this.A03, (InterfaceC16660sJ) this.A04, this.A02, AbstractC25225BEi.A04(this.A01), z3);
                break;
            case 8:
                C31200Dnj c31200Dnj = (C31200Dnj) this.A03;
                BG8.A05(A0S, (Modifier) this.A04, c31200Dnj, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
                break;
            case 9:
                BG8.A0G(A0S, (InterfaceC31097Dlf) this.A04, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
                break;
            case 10:
                AbstractC28060CYo.A00(A0S, (Modifier) this.A03, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
                break;
            default:
                AbstractC28444Cgs.A04(A0S, (UQE) this.A04, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A05);
                break;
        }
        return C0eB.A00;
    }
}
