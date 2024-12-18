package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

/* loaded from: classes5.dex */
public final class DWO extends C0YY implements InterfaceC16620sF {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A09 = obj2;
        this.A08 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A04 = obj7;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C136606Go c136606Go = (C136606Go) this.A03;
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A09;
                CGF.A00(c136606Go, (C28729CmL) this.A08, A0S, interfaceC74953Yl, (Modifier) this.A06, (EnumC27361C5q) this.A05, (InterfaceC16660sJ) this.A07, (InterfaceC16620sF) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                C5Tl c5Tl = (C5Tl) obj;
                if ((AbstractC25228BEl.A0C(obj2) ^ 2) == 0 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                    break;
                } else {
                    CU3 cu3 = (CU3) this.A08;
                    cu3.A02.clear();
                    cu3.A00 = 0;
                    c5Tl.Eno(-970882442);
                    COQ coq = cu3.A01;
                    if (coq == null) {
                        coq = new COQ(cu3);
                        cu3.A01 = coq;
                    }
                    CU3 cu32 = coq.A00;
                    CT1 A00 = cu32.A00();
                    CT1 A002 = cu32.A00();
                    CT1 A003 = cu32.A00();
                    C26071Bg0 c26071Bg0 = (C26071Bg0) this.A09;
                    Integer num = c26071Bg0.A02;
                    c5Tl.Eno(1631251677);
                    if (num != null) {
                        int intValue = num.intValue();
                        ImmutableList immutableList = (ImmutableList) this.A04;
                        C2DB A0d = AbstractC25235BEs.A0d(c5Tl, AbstractC25226BEj.A1I(immutableList, intValue));
                        C1130158n c1130158n = Modifier.A00;
                        DNO dno = DNO.A00;
                        AbstractC167017dG.A1O(c1130158n, dno);
                        Modifier A004 = AbstractC27468CAo.A00(c1130158n.Eq3(new C25788Bb4(A00, dno)), AbstractC25231BEo.A03((InterfaceC74953Yl) this.A03), false);
                        C28773Cn5 c28773Cn5 = new C28773Cn5(24.0f);
                        C6LQ.A0B(c5Tl, C6L2.A01(A004, new C5WJ(c28773Cn5, c28773Cn5, c28773Cn5, c28773Cn5)), A0d, C5YJ.A02, C5YD.A00(c5Tl, 2131963196), 24584);
                        c5Tl.Eno(1631267353);
                        if (c26071Bg0.A00 <= 0.0f) {
                            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A00, 1185064929);
                            Object EEc = c5Tl.EEc();
                            if (A1Y || EEc == C5UI.A00) {
                                EEc = AbstractC25230BEn.A0w(c5Tl, A00, 27);
                            }
                            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) EEc;
                            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                            AbstractC167017dG.A1O(c1130158n, interfaceC16660sJ);
                            Modifier Eq3 = c1130158n.Eq3(new C25788Bb4(A003, interfaceC16660sJ));
                            C27829COs c27829COs = (C27829COs) this.A05;
                            int i = this.A02;
                            AbstractC27633CHe.A00(c5Tl, Eq3, c27829COs, i & 112, 0);
                            if (c26071Bg0.A03.size() > 1) {
                                boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, A00, 1185076608);
                                Object EEc2 = c5Tl.EEc();
                                if (A1Y2 || EEc2 == C5UI.A00) {
                                    EEc2 = AbstractC25230BEn.A0w(c5Tl, A00, 28);
                                }
                                InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc2, false);
                                AbstractC167017dG.A1O(c1130158n, A1B);
                                CYN.A00(c5Tl, c1130158n.Eq3(new C25788Bb4(A002, A1B)), immutableList, (InterfaceC16660sJ) this.A07, intValue, (i & 896) | ((i << 9) & 7168), 0);
                            }
                        }
                        AbstractC25225BEi.A1V(c5Tl, false);
                    }
                    C117505Tk.A0L(AbstractC25225BEi.A0K(c5Tl, false), false);
                    break;
                }
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                C26039BfS c26039BfS = (C26039BfS) this.A09;
                CYQ.A01(A0S2, (BP5) this.A03, c26039BfS, (InterfaceC16820sZ) this.A06, (InterfaceC16820sZ) this.A08, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A07, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            default:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A05;
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A06;
                InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) this.A03;
                AbstractC28401Cg7.A03(A0S3, (ImmutableList) this.A08, (C75) this.A09, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, (InterfaceC16610sE) this.A07, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
        }
        return C0eB.A00;
    }
}
