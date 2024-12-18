package X;

import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dd3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30582Dd3 extends C0YY implements InterfaceC16610sE {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30582Dd3(LineType lineType, C5yI c5yI, InterfaceC132245y2 interfaceC132245y2, InterfaceC132365yF interfaceC132365yF, C69R c69r, UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(3);
        this.A02 = interfaceC132245y2;
        this.A05 = userSession;
        this.A01 = c5yI;
        this.A06 = str;
        this.A03 = interfaceC132365yF;
        this.A07 = str2;
        this.A00 = lineType;
        this.A0A = z;
        this.A04 = c69r;
        this.A09 = z2;
        this.A08 = z3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A00;
        C117505Tk c117505Tk;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1613882474, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:507)");
            }
            AbstractC12990ll A0d = AbstractC25229BEm.A0d(c5Tl);
            C69S c69s = (C69S) this.A02;
            boolean z = c69s.A01.A00;
            Integer num = c69s.A02;
            InterfaceC16660sJ interfaceC16660sJ = null;
            if (num == null || num.intValue() <= 0) {
                num = null;
            }
            C14360o3.A0B(A0d, 0);
            if (num != null) {
                A00 = num.intValue();
            } else {
                A00 = (int) C18U.A00(C06090Tz.A05, A0d, 37163553150468389L);
            }
            int i = 16;
            if (z) {
                i = 0;
            }
            C1333560c A0P = AbstractC25229BEm.A0P(i);
            C06090Tz c06090Tz = C06090Tz.A05;
            C25987Beb c25987Beb = new C25987Beb(A0P, A00, !C18U.A06(c06090Tz, A0d, 36327743922846548L));
            C5Hc c5Hc = c69s.A03;
            boolean z2 = c69s.A05;
            boolean z3 = c69s.A04;
            boolean z4 = c69s.A07;
            UserSession userSession = this.A05;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(c06090Tz, userSession, 36327602188925660L)) {
                c5Tl.Eno(60007370);
                c5Tl.Eno(-1660631662);
                C5yI c5yI = this.A01;
                boolean AH4 = c5Tl.AH4(c5yI);
                String str = this.A06;
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, str, AH4);
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = new C50269MHy(str, c5yI, 12);
                    c5Tl.FBy(EEc);
                }
                interfaceC16660sJ = (InterfaceC16660sJ) EEc;
                c117505Tk = AbstractC25225BEi.A0K(c5Tl, false);
            } else if (c69s.A06) {
                c5Tl.Eno(60178676);
                c5Tl.Eno(-1660626738);
                InterfaceC132365yF interfaceC132365yF = this.A03;
                boolean AH42 = c5Tl.AH4(interfaceC132365yF);
                String str2 = this.A06;
                boolean A1a = AbstractC25232BEp.A1a(c5Tl, str2, null, AH42);
                String str3 = this.A07;
                boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str3, A1a);
                Object EEc2 = c5Tl.EEc();
                if (A1X2 || EEc2 == C5UI.A00) {
                    EEc2 = new C29913DHb(interfaceC132365yF, str2, str3, 1);
                    c5Tl.FBy(EEc2);
                }
                interfaceC16660sJ = (InterfaceC16660sJ) EEc2;
                c117505Tk = (C117505Tk) c5Tl;
                C117505Tk.A0L(c117505Tk, false);
            } else {
                c5Tl.Eno(60541778);
                c117505Tk = (C117505Tk) c5Tl;
            }
            C117505Tk.A0L(c117505Tk, false);
            String str4 = this.A06;
            LineType lineType = this.A00;
            boolean z5 = this.A0A;
            C69R c69r = this.A04;
            c5Tl.Eno(-1660647854);
            C5yI c5yI2 = this.A01;
            boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, null, AbstractC25230BEn.A1W(c5Tl, c5yI2, str4));
            String str5 = this.A07;
            boolean A1X4 = AbstractC25225BEi.A1X(c5Tl, str5, A1X3);
            Object EEc3 = c5Tl.EEc();
            if (A1X4 || EEc3 == C5UI.A00) {
                EEc3 = new C30522Dc5(c5yI2, str4, str5);
                c5Tl.FBy(EEc3);
            }
            InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) EEc3;
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-1660613809);
            InterfaceC132365yF interfaceC132365yF2 = this.A03;
            boolean AH43 = c5Tl.AH4(interfaceC132365yF2);
            Object EEc4 = c5Tl.EEc();
            if (AH43 || EEc4 == C5UI.A00) {
                EEc4 = AbstractC25229BEm.A0w(c5Tl, interfaceC132365yF2, 46);
            }
            AbstractC28383Cfm.A00(c5Tl, null, lineType, c25987Beb, c69r, str4, interfaceC16660sJ, AbstractC25225BEi.A1B(c117505Tk, EEc4, false), null, interfaceC16610sE, c5Hc, 0, 0, 83968, z5, z2, z3, this.A09, this.A08, false, z4);
            if (C0fH.A02()) {
                C0fH.A00(988295757);
            }
        }
        return C0eB.A00;
    }
}
