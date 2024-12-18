package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.DWr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30316DWr extends C0YY implements InterfaceC16620sF {
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
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30316DWr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A09 = obj;
        this.A07 = obj2;
        this.A0A = z;
        this.A05 = obj3;
        this.A02 = i2;
        this.A06 = obj4;
        this.A03 = obj5;
        this.A08 = obj6;
        this.A04 = obj7;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl c5Tl = (C5Tl) obj;
                if ((AbstractC25228BEl.A0C(obj2) ^ 2) == 0 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                    break;
                } else {
                    CU3 cu3 = (CU3) this.A09;
                    cu3.A02.clear();
                    cu3.A00 = 0;
                    c5Tl.Eno(2115886522);
                    COQ coq = cu3.A01;
                    if (coq == null) {
                        coq = new COQ(cu3);
                        cu3.A01 = coq;
                    }
                    CU3 cu32 = coq.A00;
                    CT1 A00 = cu32.A00();
                    CT1 A002 = cu32.A00();
                    CT1 A003 = cu32.A00();
                    CT1 A004 = cu32.A00();
                    CT1 A005 = cu32.A00();
                    CT1 A006 = cu32.A00();
                    C1130158n c1130158n = Modifier.A00;
                    boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A002, 1315187157);
                    Object EEc = c5Tl.EEc();
                    if (A1Y || EEc == C5UI.A00) {
                        EEc = AbstractC25230BEn.A0w(c5Tl, A002, 12);
                    }
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) EEc;
                    C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                    AbstractC167017dG.A1O(c1130158n, interfaceC16660sJ);
                    Modifier Eq3 = c1130158n.Eq3(new C25788Bb4(A00, interfaceC16660sJ));
                    Alignment alignment = C118195Wf.A0E;
                    InterfaceC1127857k A007 = C5XX.A00(alignment, false);
                    int A008 = C5X2.A00(c5Tl);
                    C59P A04 = C117505Tk.A04(A0K);
                    Modifier A01 = C5X3.A01(c5Tl, Eq3);
                    InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                    AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A03;
                    InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A007, A04, interfaceC16620sF);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A008)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A008);
                    }
                    InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
                    InterfaceC16620sF interfaceC16620sF3 = (InterfaceC16620sF) this.A05;
                    int i = this.A02;
                    AbstractC25231BEo.A14(c5Tl, interfaceC16620sF3, i >> 6);
                    boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, A00, 1315199647);
                    boolean z = this.A0A;
                    boolean A1V = AbstractC25228BEl.A1V(c5Tl, A003, A1Y2, c5Tl.AH5(z));
                    Object EEc2 = c5Tl.EEc();
                    if (A1V || EEc2 == C5UI.A00) {
                        EEc2 = new BQB(7, A00, A003, z);
                        c5Tl.FBy(EEc2);
                    }
                    InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc2, false);
                    AbstractC167017dG.A1O(c1130158n, A1B);
                    Modifier A009 = AbstractC27468CAo.A00(c1130158n.Eq3(new C25788Bb4(A002, A1B)), 0.5625f, false);
                    InterfaceC1127857k A0010 = C5XX.A00(alignment, false);
                    int A0011 = C5X2.A00(c5Tl);
                    C59P A042 = C117505Tk.A04(A0K);
                    Modifier A012 = C5X3.A01(c5Tl, A009);
                    AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A0010, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A0011)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A0011);
                    }
                    C5XJ.A00(c5Tl, A012, A1K);
                    AbstractC25231BEo.A14(c5Tl, (InterfaceC16620sF) this.A06, i >> 9);
                    boolean A1Z = AbstractC25232BEp.A1Z(c5Tl, A002, A004, 1315217036);
                    Object EEc3 = c5Tl.EEc();
                    if (A1Z || EEc3 == C5UI.A00) {
                        EEc3 = C30183DRo.A00(c5Tl, A002, A004, 6);
                    }
                    InterfaceC16660sJ A1B2 = AbstractC25225BEi.A1B(A0K, EEc3, false);
                    AbstractC167017dG.A1O(c1130158n, A1B2);
                    Modifier Eq32 = c1130158n.Eq3(new C25788Bb4(A006, A1B2));
                    InterfaceC1127857k A0012 = C5XX.A00(alignment, false);
                    int A0013 = C5X2.A00(c5Tl);
                    C59P A043 = C117505Tk.A04(A0K);
                    Modifier A013 = C5X3.A01(c5Tl, Eq32);
                    AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A0012, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, A0K, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A0013)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A0013);
                    }
                    C5XJ.A00(c5Tl, A013, A1K);
                    CH1.A00(c5Tl, C119645bN.A00.Cng(c1130158n), C60.A02, 6, 0);
                    c5Tl.ASW();
                    boolean A1V2 = AbstractC25228BEl.A1V(c5Tl, A003, AbstractC25227BEk.A1Y(c5Tl, A002, 1315238458), c5Tl.AH5(z));
                    Object EEc4 = c5Tl.EEc();
                    if (A1V2 || EEc4 == C5UI.A00) {
                        EEc4 = new BQB(8, A002, A003, z);
                        c5Tl.FBy(EEc4);
                    }
                    InterfaceC16660sJ A1B3 = AbstractC25225BEi.A1B(A0K, EEc4, false);
                    AbstractC167017dG.A1O(c1130158n, A1B3);
                    Modifier Eq33 = c1130158n.Eq3(new C25788Bb4(A004, A1B3));
                    InterfaceC1127857k A0014 = C5XX.A00(alignment, false);
                    int A0015 = C5X2.A00(c5Tl);
                    C59P A044 = C117505Tk.A04(A0K);
                    Modifier A014 = C5X3.A01(c5Tl, Eq33);
                    AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A0014, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, A0K, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A0015)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A0015);
                    }
                    C5XJ.A00(c5Tl, A014, A1K);
                    AbstractC25231BEo.A14(c5Tl, (InterfaceC16620sF) this.A03, i >> 15);
                    boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, A002, 1315253112);
                    Object EEc5 = c5Tl.EEc();
                    if (A1Y3 || EEc5 == C5UI.A00) {
                        EEc5 = AbstractC25230BEn.A0w(c5Tl, A002, 13);
                    }
                    InterfaceC16660sJ A1B4 = AbstractC25225BEi.A1B(A0K, EEc5, false);
                    AbstractC167017dG.A1O(c1130158n, A1B4);
                    Modifier Eq34 = c1130158n.Eq3(new C25788Bb4(A005, A1B4));
                    InterfaceC1127857k A0016 = C5XX.A00(alignment, false);
                    int A0017 = C5X2.A00(c5Tl);
                    C59P A045 = C117505Tk.A04(A0K);
                    Modifier A015 = C5X3.A01(c5Tl, Eq34);
                    AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A0016, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, A0K, A045, A0q) || !AbstractC25231BEo.A1O(c5Tl, A0017)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A0017);
                    }
                    C5XJ.A00(c5Tl, A015, A1K);
                    AbstractC25231BEo.A14(c5Tl, (InterfaceC16620sF) this.A08, i >> 18);
                    Modifier A0L = AbstractC25227BEk.A0L(c1130158n, 10.0f);
                    boolean A1W = AbstractC25232BEp.A1W(c5Tl, A002, 1315262456, z);
                    Object EEc6 = c5Tl.EEc();
                    if (A1W || EEc6 == C5UI.A00) {
                        EEc6 = new DHP(10, A002, z);
                        c5Tl.FBy(EEc6);
                    }
                    InterfaceC16660sJ A1B5 = AbstractC25225BEi.A1B(A0K, EEc6, false);
                    AbstractC167017dG.A1O(A0L, A1B5);
                    Modifier Eq35 = A0L.Eq3(new C25788Bb4(A003, A1B5));
                    InterfaceC1127857k A0018 = C5XX.A00(C118195Wf.A0C, false);
                    int A0019 = C5X2.A00(c5Tl);
                    C59P A046 = C117505Tk.A04(A0K);
                    Modifier A016 = C5X3.A01(c5Tl, Eq35);
                    AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
                    C5XJ.A00(c5Tl, A0018, interfaceC16620sF);
                    if (AbstractC25225BEi.A1W(c5Tl, A0K, A046, A0q) || !AbstractC25231BEo.A1O(c5Tl, A0019)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A0019);
                    }
                    C5XJ.A00(c5Tl, A016, A1K);
                    AbstractC25231BEo.A14(c5Tl, (InterfaceC16620sF) this.A04, i >> 12);
                    C117505Tk.A0L(A0K, false);
                    break;
                }
                break;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C28224CcU c28224CcU = (C28224CcU) this.A08;
                boolean z2 = this.A0A;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A06;
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A04;
                InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) this.A05;
                AbstractC28390Cft.A00(A0S, (C61) this.A09, c28224CcU, (EnumC193878i8) this.A03, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, (InterfaceC16820sZ) this.A07, AbstractC25225BEi.A04(this.A01), this.A02, z2);
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                C51760Mtj c51760Mtj = (C51760Mtj) this.A08;
                InterfaceC16820sZ interfaceC16820sZ5 = (InterfaceC16820sZ) this.A04;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A06;
                InterfaceC16820sZ interfaceC16820sZ6 = (InterfaceC16820sZ) this.A05;
                InterfaceC16820sZ interfaceC16820sZ7 = (InterfaceC16820sZ) this.A03;
                AbstractC28309Cdv.A01(A0S2, c51760Mtj, (C61) this.A09, interfaceC16820sZ5, interfaceC16820sZ6, interfaceC16820sZ7, (InterfaceC16820sZ) this.A07, interfaceC16660sJ2, AbstractC25225BEi.A04(this.A01), this.A02, this.A0A);
                break;
            case 3:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                C9C8 c9c8 = (C9C8) this.A07;
                C9C8 c9c82 = (C9C8) this.A05;
                C9C8 c9c83 = (C9C8) this.A09;
                C206209Bd c206209Bd = (C206209Bd) this.A06;
                EnumC85263rH enumC85263rH = (EnumC85263rH) this.A03;
                AbstractC118165Wa.A02(A0S3, c206209Bd, (C206209Bd) this.A04, c9c8, c9c82, c9c83, (C9C8) this.A08, enumC85263rH, AbstractC25225BEi.A04(this.A01), this.A02, this.A0A);
                break;
            default:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                boolean z3 = this.A0A;
                C26081BgA c26081BgA = (C26081BgA) this.A09;
                AbstractC28509Ci3.A05(A0S4, (Modifier) this.A03, c26081BgA, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A07, (InterfaceC16660sJ) this.A08, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, z3);
                break;
        }
        return C0eB.A00;
    }
}
