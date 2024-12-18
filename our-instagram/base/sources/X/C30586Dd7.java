package X;

import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dd7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30586Dd7 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ LineType A00;
    public final /* synthetic */ C5yI A01;
    public final /* synthetic */ InterfaceC132245y2 A02;
    public final /* synthetic */ InterfaceC132365yF A03;
    public final /* synthetic */ C69R A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30586Dd7(LineType lineType, C5yI c5yI, InterfaceC132245y2 interfaceC132245y2, InterfaceC132365yF interfaceC132365yF, C69R c69r, UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(3);
        this.A02 = interfaceC132245y2;
        this.A0B = z;
        this.A05 = userSession;
        this.A01 = c5yI;
        this.A06 = str;
        this.A03 = interfaceC132365yF;
        this.A07 = str2;
        this.A00 = lineType;
        this.A04 = c69r;
        this.A09 = z2;
        this.A08 = z3;
        this.A0A = z4;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        C136856Ho A00;
        C117505Tk A0K;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1258874037, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:619)");
            }
            C132285y7 c132285y7 = (C132285y7) this.A02;
            InterfaceC132185xw interfaceC132185xw = c132285y7.A02;
            InterfaceC16660sJ interfaceC16660sJ = null;
            boolean z2 = true;
            if (c132285y7.A08) {
                c5Tl.Eno(63474689);
                UserSession A0e = AbstractC25229BEm.A0e(c5Tl);
                z = this.A0B;
                A00 = AbstractC136846Hn.A01(A0e, null, 2.0f, z);
                A0K = AbstractC25225BEi.A0K(c5Tl, false);
            } else if (c132285y7.A09) {
                c5Tl.Eno(63824865);
                UserSession A0u = AbstractC25228BEl.A0u(c5Tl);
                boolean z3 = c132285y7.A01.A00;
                z = this.A0B;
                A00 = AbstractC136846Hn.A00(interfaceC132185xw, A0u, 295, z3, z);
                A0K = AbstractC25225BEi.A0K(c5Tl, false);
            } else {
                c5Tl.Eno(64234623);
                UserSession A0u2 = AbstractC25228BEl.A0u(c5Tl);
                boolean z4 = c132285y7.A01.A00;
                Integer num = c132285y7.A03;
                if (num == null || num.intValue() <= 0) {
                    num = null;
                }
                z = this.A0B;
                A00 = AbstractC136846Hn.A00(interfaceC132185xw, A0u2, num, z4, z);
                A0K = AbstractC25225BEi.A0K(c5Tl, false);
            }
            boolean z5 = c132285y7.A05;
            if (!c132285y7.A04 || interfaceC132185xw.AXw() == null) {
                z2 = false;
            }
            UserSession userSession = this.A05;
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36327602188925660L)) {
                c5Tl.Eno(65515016);
                if (c132285y7.A06) {
                    c5Tl.Eno(65557052);
                    Object AJX = c5Tl.AJX(C5V2.A05);
                    boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, AJX, -1660450441);
                    C5yI c5yI = this.A01;
                    boolean A1X = AbstractC25225BEi.A1X(c5Tl, c5yI, A1Z);
                    String str = this.A06;
                    boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str, A1X);
                    Object EEc = c5Tl.EEc();
                    if (A1X2 || EEc == C5UI.A00) {
                        EEc = AbstractC25229BEm.A11(c5Tl, AJX, c5yI, str, 10);
                    }
                    interfaceC16660sJ = AbstractC25225BEi.A1B(A0K, EEc, false);
                    C117505Tk.A0L(A0K, false);
                } else {
                    c5Tl.Eno(65901741);
                    c5Tl.Eno(-1660441461);
                    C5yI c5yI2 = this.A01;
                    boolean AH4 = c5Tl.AH4(c5yI2);
                    Object EEc2 = c5Tl.EEc();
                    if (AH4 || EEc2 == C5UI.A00) {
                        EEc2 = AbstractC25229BEm.A0w(c5Tl, c5yI2, 47);
                    }
                    interfaceC16660sJ = AbstractC25225BEi.A1B(A0K, EEc2, false);
                    C117505Tk.A0L(A0K, false);
                }
            } else if (c132285y7.A07) {
                c5Tl.Eno(66149524);
                c5Tl.Eno(-1660434130);
                InterfaceC132365yF interfaceC132365yF = this.A03;
                boolean AH42 = c5Tl.AH4(interfaceC132365yF);
                String str2 = this.A06;
                boolean A1a = AbstractC25232BEp.A1a(c5Tl, str2, null, AH42);
                String str3 = this.A07;
                boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, str3, A1a);
                Object EEc3 = c5Tl.EEc();
                if (A1X3 || EEc3 == C5UI.A00) {
                    EEc3 = new C29913DHb(interfaceC132365yF, str2, str3, 2);
                    c5Tl.FBy(EEc3);
                }
                interfaceC16660sJ = AbstractC25225BEi.A1B(A0K, EEc3, false);
            } else {
                c5Tl.Eno(66512626);
            }
            C117505Tk.A0L(A0K, false);
            String str4 = this.A06;
            LineType lineType = this.A00;
            C69R c69r = this.A04;
            c5Tl.Eno(-1660470143);
            C5yI c5yI3 = this.A01;
            boolean A1W = AbstractC25230BEn.A1W(c5Tl, c5yI3, null);
            String str5 = this.A07;
            boolean A1X4 = AbstractC25225BEi.A1X(c5Tl, str5, A1W);
            Object EEc4 = c5Tl.EEc();
            if (A1X4 || EEc4 == C5UI.A00) {
                EEc4 = new C30538DcL(c5yI3, null, str5, 1);
                c5Tl.FBy(EEc4);
            }
            InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) EEc4;
            C117505Tk.A0L(A0K, false);
            boolean A1Z2 = AbstractC25232BEp.A1Z(c5Tl, c5yI3, str4, -1660420929);
            Object EEc5 = c5Tl.EEc();
            if (A1Z2 || EEc5 == C5UI.A00) {
                EEc5 = new DSB(str4, c5yI3, 1);
                c5Tl.FBy(EEc5);
            }
            InterfaceC16620sF A1C = AbstractC25225BEi.A1C(A0K, EEc5);
            c5Tl.Eno(-1660412273);
            InterfaceC132365yF interfaceC132365yF2 = this.A03;
            boolean AH43 = c5Tl.AH4(interfaceC132365yF2);
            Object EEc6 = c5Tl.EEc();
            if (AH43 || EEc6 == C5UI.A00) {
                EEc6 = AbstractC25229BEm.A0w(c5Tl, interfaceC132365yF2, 48);
            }
            AbstractC136866Hp.A00(c5Tl, null, lineType, A00, c69r, interfaceC132185xw, str4, null, null, interfaceC16660sJ, AbstractC25225BEi.A1B(A0K, EEc6, false), A1C, interfaceC16610sE, 0, 0, 159744, z, z5, z2, this.A09, this.A08, false, this.A0A);
            if (C0fH.A02()) {
                C0fH.A00(2029160725);
            }
        }
        return C0eB.A00;
    }
}
