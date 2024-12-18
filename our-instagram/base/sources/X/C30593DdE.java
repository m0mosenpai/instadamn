package X;

import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;

/* renamed from: X.DdE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30593DdE extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ LineType A02;
    public final /* synthetic */ InterfaceC99414dE A03;
    public final /* synthetic */ C5yI A04;
    public final /* synthetic */ InterfaceC132245y2 A05;
    public final /* synthetic */ InterfaceC132365yF A06;
    public final /* synthetic */ C26024BfD A07;
    public final /* synthetic */ C132275y6 A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ boolean A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30593DdE(LineType lineType, InterfaceC99414dE interfaceC99414dE, C5yI c5yI, InterfaceC132245y2 interfaceC132245y2, InterfaceC132365yF interfaceC132365yF, C26024BfD c26024BfD, C132275y6 c132275y6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, long j, boolean z) {
        super(3);
        this.A05 = interfaceC132245y2;
        this.A04 = c5yI;
        this.A0C = str;
        this.A06 = interfaceC132365yF;
        this.A0H = str2;
        this.A07 = c26024BfD;
        this.A0I = z;
        this.A0A = str3;
        this.A0E = str4;
        this.A0B = str5;
        this.A0F = str6;
        this.A00 = i;
        this.A0G = str7;
        this.A01 = j;
        this.A02 = lineType;
        this.A0D = str8;
        this.A09 = str9;
        this.A08 = c132275y6;
        this.A03 = interfaceC99414dE;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC132245y2 interfaceC132245y2;
        C26154Bhf c26154Bhf;
        C117505Tk A0T;
        InterfaceC16660sJ interfaceC16660sJ;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(599304535, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous>.<anonymous> (FeedPostRow.kt:1407)");
            }
            UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
            if (C18U.A06(AbstractC25225BEi.A0j(A0u, 0), A0u, 36327602188925660L)) {
                c5Tl.Eno(-1296050976);
                interfaceC132245y2 = this.A05;
                c26154Bhf = (C26154Bhf) interfaceC132245y2;
                if (c26154Bhf.A09) {
                    c5Tl.Eno(-1296005716);
                    Object AJX = c5Tl.AJX(C5V2.A05);
                    boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, AJX, -2120013573);
                    C5yI c5yI = this.A04;
                    boolean A1X = AbstractC25225BEi.A1X(c5Tl, c5yI, A1Z);
                    String str = this.A0C;
                    boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str, A1X);
                    Object EEc = c5Tl.EEc();
                    if (A1X2 || EEc == C5UI.A00) {
                        EEc = AbstractC25229BEm.A11(c5Tl, AJX, c5yI, str, 11);
                    }
                    interfaceC16660sJ = (InterfaceC16660sJ) EEc;
                    A0T = AbstractC25225BEi.A0K(c5Tl, false);
                } else {
                    c5Tl.Eno(-1295551938);
                    c5Tl.Eno(-2120001198);
                    C5yI c5yI2 = this.A04;
                    boolean AH4 = c5Tl.AH4(c5yI2);
                    Object EEc2 = c5Tl.EEc();
                    if (AH4 || EEc2 == C5UI.A00) {
                        EEc2 = AbstractC25230BEn.A0v(c5Tl, c5yI2, 0);
                    }
                    interfaceC16660sJ = (InterfaceC16660sJ) EEc2;
                    A0T = (C117505Tk) c5Tl;
                    C117505Tk.A0L(A0T, false);
                }
                C117505Tk.A0L(A0T, false);
                C117505Tk.A0L(A0T, false);
            } else {
                interfaceC132245y2 = this.A05;
                c26154Bhf = (C26154Bhf) interfaceC132245y2;
                if (c26154Bhf.A0A) {
                    c5Tl.Eno(-1295279975);
                    c5Tl.Eno(-2119993207);
                    InterfaceC132365yF interfaceC132365yF = this.A06;
                    boolean AH42 = c5Tl.AH4(interfaceC132365yF);
                    String str2 = this.A0C;
                    boolean A1a = AbstractC25232BEp.A1a(c5Tl, str2, null, AH42);
                    String str3 = this.A0H;
                    boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, str3, A1a);
                    Object EEc3 = c5Tl.EEc();
                    if (A1X3 || EEc3 == C5UI.A00) {
                        EEc3 = new C29913DHb(interfaceC132365yF, str2, str3, 4);
                        c5Tl.FBy(EEc3);
                    }
                    interfaceC16660sJ = (InterfaceC16660sJ) EEc3;
                    A0T = (C117505Tk) c5Tl;
                    C117505Tk.A0L(A0T, false);
                    C117505Tk.A0L(A0T, false);
                } else {
                    A0T = AbstractC25230BEn.A0T(c5Tl, -1294885997);
                    interfaceC16660sJ = null;
                }
            }
            boolean z = c26154Bhf.A08;
            boolean z2 = c26154Bhf.A07;
            boolean z3 = c26154Bhf.A02.A00;
            boolean z4 = !interfaceC132245y2.Bet().A0A;
            boolean z5 = c26154Bhf.A06;
            C26024BfD c26024BfD = this.A07;
            CT2 ct2 = new CT2(AbstractC28461ChD.A01(A0u), this.A0I, z, z2, z3, c26024BfD.A0O, z4, z5, c26154Bhf.A0B);
            Integer num = c26154Bhf.A05;
            Integer num2 = num;
            if (num == null || num2.intValue() <= 0) {
                num2 = null;
            }
            c5Tl.Eno(-2120069821);
            C5yI c5yI3 = this.A04;
            boolean AH43 = c5Tl.AH4(c5yI3);
            String str4 = this.A0A;
            boolean A1X4 = AbstractC25225BEi.A1X(c5Tl, str4, AH43);
            String str5 = this.A0E;
            boolean A1a2 = AbstractC25232BEp.A1a(c5Tl, str5, null, A1X4);
            String str6 = this.A0H;
            boolean A1X5 = AbstractC25225BEi.A1X(c5Tl, str6, A1a2);
            String str7 = this.A0B;
            boolean A1X6 = AbstractC25225BEi.A1X(c5Tl, str7, A1X5);
            Object EEc4 = c5Tl.EEc();
            if (A1X6 || EEc4 == C5UI.A00) {
                EEc4 = new C29725D8v(c5yI3, str4, str5, str6, str7, 1);
                c5Tl.FBy(EEc4);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0T, EEc4, false);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, c5yI3, -2120057729);
            String str8 = this.A0C;
            boolean A1X7 = AbstractC25225BEi.A1X(c5Tl, str8, A1Y);
            String str9 = this.A0F;
            boolean A1a3 = AbstractC25232BEp.A1a(c5Tl, str6, str7, AbstractC25232BEp.A1a(c5Tl, str4, null, AbstractC25232BEp.A1a(c5Tl, str9, str5, A1X7)));
            int i = this.A00;
            boolean AH2 = A1a3 | c5Tl.AH2(i);
            Object EEc5 = c5Tl.EEc();
            if (AH2 || EEc5 == C5UI.A00) {
                EEc5 = new MEI(c5yI3, null, str5, str6, str9, str7, str4, str8, i, 2);
                c5Tl.FBy(EEc5);
            }
            InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(A0T, EEc5, false);
            boolean A1b = AbstractC25234BEr.A1b(c5Tl, c5yI3, str5, str4, -2120040994);
            Object EEc6 = c5Tl.EEc();
            if (A1b || EEc6 == C5UI.A00) {
                EEc6 = new DH6(c5yI3, str4, str5, 22);
                c5Tl.FBy(EEc6);
            }
            InterfaceC16820sZ A1A3 = AbstractC25225BEi.A1A(A0T, EEc6, false);
            boolean A1Z2 = AbstractC25232BEp.A1Z(c5Tl, c5yI3, interfaceC132245y2, -2120090430);
            Object EEc7 = c5Tl.EEc();
            if (A1Z2 || EEc7 == C5UI.A00) {
                EEc7 = new C30716DfE(21, c5yI3, interfaceC132245y2);
                c5Tl.FBy(EEc7);
            }
            InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) EEc7;
            C117505Tk.A0L(A0T, false);
            boolean A1Z3 = AbstractC25232BEp.A1Z(c5Tl, c5yI3, interfaceC132245y2, -2120084195);
            Object EEc8 = c5Tl.EEc();
            if (A1Z3 || EEc8 == C5UI.A00) {
                EEc8 = new C30485DbU(4, c5yI3, interfaceC132245y2);
                c5Tl.FBy(EEc8);
            }
            InterfaceC16620sF A1C = AbstractC25225BEi.A1C(A0T, EEc8);
            boolean A1Z4 = AbstractC25232BEp.A1Z(c5Tl, c5yI3, str8, -2120074262);
            Object EEc9 = c5Tl.EEc();
            if (A1Z4 || EEc9 == C5UI.A00) {
                EEc9 = AbstractC25230BEn.A14(c5Tl, c5yI3, str8, 0);
            }
            InterfaceC16820sZ A1A4 = AbstractC25225BEi.A1A(A0T, EEc9, false);
            boolean A1b2 = AbstractC25234BEr.A1b(c5Tl, c5yI3, null, str6, -2120035907);
            Object EEc10 = c5Tl.EEc();
            if (A1b2 || EEc10 == C5UI.A00) {
                EEc10 = new C30718DfG(c5yI3, str6);
                c5Tl.FBy(EEc10);
            }
            InterfaceC16600sD interfaceC16600sD = (InterfaceC16600sD) EEc10;
            C117505Tk.A0L(A0T, false);
            boolean A1Z5 = AbstractC25232BEp.A1Z(c5Tl, c5yI3, str8, -2119978858);
            Object EEc11 = c5Tl.EEc();
            if (A1Z5 || EEc11 == C5UI.A00) {
                EEc11 = new DSB(str8, c5yI3, 2);
                c5Tl.FBy(EEc11);
            }
            InterfaceC16620sF A1C2 = AbstractC25225BEi.A1C(A0T, EEc11);
            c5Tl.Eno(-2119969366);
            InterfaceC132365yF interfaceC132365yF2 = this.A06;
            boolean AH44 = c5Tl.AH4(interfaceC132365yF2);
            Object EEc12 = c5Tl.EEc();
            if (AH44 || EEc12 == C5UI.A00) {
                EEc12 = AbstractC25229BEm.A0w(c5Tl, interfaceC132365yF2, 49);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0T, EEc12, false);
            boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, interfaceC132365yF2, -2119965970);
            String str10 = this.A0G;
            boolean A1X8 = AbstractC25225BEi.A1X(c5Tl, str10, A1Y2);
            long j = this.A01;
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, j, A1X8);
            Object EEc13 = c5Tl.EEc();
            if (A1W || EEc13 == C5UI.A00) {
                EEc13 = new MI5(interfaceC132365yF2, str10, 2, j);
                c5Tl.FBy(EEc13);
            }
            InterfaceC16660sJ A1B2 = AbstractC25225BEi.A1B(A0T, EEc13, false);
            boolean A1Z6 = AbstractC25232BEp.A1Z(c5Tl, c5yI3, str8, -2119955496);
            Object EEc14 = c5Tl.EEc();
            if (A1Z6 || EEc14 == C5UI.A00) {
                EEc14 = new DSB(str8, c5yI3, 3);
                c5Tl.FBy(EEc14);
            }
            InterfaceC16620sF A1C3 = AbstractC25225BEi.A1C(A0T, EEc14);
            boolean A1W2 = AbstractC25226BEj.A1W(c5Tl, j, AbstractC25234BEr.A1b(c5Tl, c26024BfD, interfaceC132365yF2, str10, -2119944358));
            Object EEc15 = c5Tl.EEc();
            if (A1W2 || EEc15 == C5UI.A00) {
                EEc15 = new D8e(interfaceC132365yF2, c26024BfD, str10, 3, j);
                c5Tl.FBy(EEc15);
            }
            InterfaceC16820sZ A1A5 = AbstractC25225BEi.A1A(A0T, EEc15, false);
            boolean A1Z7 = AbstractC25232BEp.A1Z(c5Tl, c26024BfD, c5yI3, -2119929768);
            Object EEc16 = c5Tl.EEc();
            if (A1Z7 || EEc16 == C5UI.A00) {
                EEc16 = AbstractC25230BEn.A11(c5Tl, c5yI3, c26024BfD, 2);
            }
            InterfaceC16820sZ A1A6 = AbstractC25225BEi.A1A(A0T, EEc16, false);
            boolean A1Z8 = AbstractC25232BEp.A1Z(c5Tl, c5yI3, str5, -2119924688);
            Object EEc17 = c5Tl.EEc();
            if (A1Z8 || EEc17 == C5UI.A00) {
                EEc17 = AbstractC25230BEn.A14(c5Tl, c5yI3, str5, 1);
            }
            InterfaceC16820sZ A1A7 = AbstractC25225BEi.A1A(A0T, EEc17, false);
            boolean A1Z9 = AbstractC25232BEp.A1Z(c5Tl, c5yI3, str8, -2119919960);
            Object EEc18 = c5Tl.EEc();
            if (A1Z9 || EEc18 == C5UI.A00) {
                EEc18 = new C50269MHy(str8, c5yI3, 14);
                c5Tl.FBy(EEc18);
            }
            InterfaceC16660sJ A1B3 = AbstractC25225BEi.A1B(A0T, EEc18, false);
            boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, c5yI3, -2119915218);
            Object EEc19 = c5Tl.EEc();
            if (A1Y3 || EEc19 == C5UI.A00) {
                EEc19 = C30480DbP.A00(c5yI3, 29);
                c5Tl.FBy(EEc19);
            }
            InterfaceC16620sF A1C4 = AbstractC25225BEi.A1C(A0T, EEc19);
            boolean A1Y4 = AbstractC25227BEk.A1Y(c5Tl, c5yI3, -2119910013);
            Object EEc20 = c5Tl.EEc();
            if (A1Y4 || EEc20 == C5UI.A00) {
                EEc20 = C30712DfA.A00(c5yI3, 30);
                c5Tl.FBy(EEc20);
            }
            C117505Tk.A0L(A0T, false);
            LineType lineType = this.A02;
            String str11 = this.A0D;
            String str12 = this.A09;
            AbstractC28384Cfn.A00(c5Tl, null, lineType, this.A03, ct2, c26024BfD, this.A08, num2, str11, str12, A1A, A1A2, A1A3, A1A4, A1A5, A1A6, A1A7, interfaceC16660sJ, A1B, A1B2, A1B3, A1C, A1C2, A1C3, A1C4, interfaceC16610sE, (InterfaceC16610sE) EEc20, interfaceC16600sD, 5, 0, 0, 384, 67108864);
            if (C0fH.A02()) {
                C0fH.A00(-811831730);
            }
        }
        return C0eB.A00;
    }
}
