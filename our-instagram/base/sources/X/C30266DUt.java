package X;

/* renamed from: X.DUt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30266DUt extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ InterfaceC16620sF A06;
    public final /* synthetic */ C5Hc A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30266DUt(InterfaceC74953Yl interfaceC74953Yl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, float f) {
        super(2);
        this.A07 = c5Hc;
        this.A00 = f;
        this.A04 = interfaceC16660sJ;
        this.A05 = interfaceC16660sJ2;
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC74953Yl;
        this.A03 = interfaceC16660sJ3;
        this.A06 = interfaceC16620sF;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(627158494, "com.instagram.nux.reelstuning.ui.ReelsTuningCardStack.<anonymous>.<anonymous> (ReelsTuningCardStack.kt:291)");
            }
            C5Hc<CSX> c5Hc = this.A07;
            for (CSX csx : c5Hc) {
                Object A0q = AbstractC25227BEk.A0q(c5Tl, -47189026);
                Object obj3 = C5UI.A00;
                Object A0c = AbstractC25234BEr.A0c(c5Tl, A0q, obj3, false);
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                int size = (c5Hc.size() - c5Hc.indexOf(csx)) - 1;
                if (size > 2) {
                    size = 2;
                }
                C75363a3 c75363a3 = csx.A03;
                C136936Hw A00 = AbstractC28032CXg.A00(c5Tl, c75363a3, 0);
                C136946Hx A002 = AbstractC27555CEa.A00(c5Tl, A00, c75363a3.A0G, null, null, null, null, 0, 252, false);
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A002, -47171817);
                InterfaceC74953Yl interfaceC74953Yl = this.A01;
                Object EEc = c5Tl.EEc();
                if (A1Y || EEc == obj3) {
                    EEc = new C57531Pg5(49, interfaceC74953Yl, A002);
                    c5Tl.FBy(EEc);
                }
                C117505Tk.A0L(A0K, false);
                A002.A05.Egh(null);
                A002.A07.Egh(null);
                A002.A08.Egh(EEc);
                A002.A06.Egh(null);
                int intValue = AbstractC28480ChY.A01[size].intValue();
                float f = this.A00;
                c5Tl.Eno(-47160997);
                InterfaceC16660sJ interfaceC16660sJ = this.A04;
                boolean A1V = AbstractC25230BEn.A1V(c5Tl, interfaceC16660sJ, csx);
                Object EEc2 = c5Tl.EEc();
                if (A1V || EEc2 == obj3) {
                    EEc2 = AbstractC25235BEs.A18(c5Tl, csx, interfaceC16660sJ, 0);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc2, false);
                c5Tl.Eno(-47159012);
                InterfaceC16660sJ interfaceC16660sJ2 = this.A05;
                boolean A1V2 = AbstractC25230BEn.A1V(c5Tl, interfaceC16660sJ2, csx);
                Object EEc3 = c5Tl.EEc();
                if (A1V2 || EEc3 == obj3) {
                    EEc3 = AbstractC25235BEs.A18(c5Tl, csx, interfaceC16660sJ2, 1);
                }
                InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(A0K, EEc3, false);
                c5Tl.Eno(-47156980);
                InterfaceC16820sZ interfaceC16820sZ = this.A02;
                boolean AH4 = c5Tl.AH4(interfaceC16820sZ);
                Object EEc4 = c5Tl.EEc();
                if (AH4 || EEc4 == obj3) {
                    EEc4 = new C57510Pfk(interfaceC16820sZ, 15);
                    c5Tl.FBy(EEc4);
                }
                AbstractC28480ChY.A04(c5Tl, csx, A1A, A1A2, AbstractC25225BEi.A1A(A0K, EEc4, false), C5UA.A01(c5Tl, new DWQ(csx, c5Hc, A002, A00, this.A03, this.A06, interfaceC74953Yl, A0c, size, 4), -768906137), f, intValue, 1572872, 0);
                if (csx.equals(AbstractC001800i.A0K(c5Hc))) {
                    A00.A00();
                }
            }
            if (C0fH.A02()) {
                C0fH.A00(-1856465243);
            }
        }
        return C0eB.A00;
    }
}
