package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.Dd4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30583Dd4 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LineType A01;
    public final /* synthetic */ C5yI A02;
    public final /* synthetic */ InterfaceC132245y2 A03;
    public final /* synthetic */ InterfaceC132365yF A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30583Dd4(LineType lineType, C5yI c5yI, InterfaceC132245y2 interfaceC132245y2, InterfaceC132365yF interfaceC132365yF, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, long j, boolean z) {
        super(3);
        this.A03 = interfaceC132245y2;
        this.A01 = lineType;
        this.A04 = interfaceC132365yF;
        this.A08 = str;
        this.A00 = j;
        this.A02 = c5yI;
        this.A06 = str2;
        this.A05 = str3;
        this.A0A = z;
        this.A09 = interfaceC16820sZ;
        this.A07 = str4;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C1333560c c1333560c;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-550762892, "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:560)");
            }
            InterfaceC132245y2 interfaceC132245y2 = this.A03;
            C6HG c6hg = (C6HG) interfaceC132245y2;
            String str = c6hg.A07;
            C25996Bek c25996Bek = c6hg.A05;
            String str2 = c25996Bek.A01;
            String str3 = c25996Bek.A00;
            C5Hc c5Hc = c25996Bek.A03;
            int ordinal = interfaceC132245y2.Bet().A01.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    c1333560c = new C1333560c(12.0f, 5.0f, 28.0f, AbstractC167007dF.A05(c6hg.A03.A00 ? 1 : 0));
                } else {
                    throw B4Z.A00();
                }
            } else {
                c1333560c = new C1333560c(12.0f, 0.0f, 12.0f, AbstractC167007dF.A05(c6hg.A03.A00 ? 1 : 0));
            }
            C6H4 c6h4 = new C6H4(c1333560c);
            boolean z = c6hg.A08;
            String str4 = c6hg.A06;
            int i = c6hg.A01;
            EnumC132255y4 enumC132255y4 = c6hg.A04;
            C5Hc c5Hc2 = c25996Bek.A02;
            LineType lineType = this.A01;
            c5Tl.Eno(-1660580771);
            Object obj4 = this.A04;
            boolean AH4 = c5Tl.AH4(obj4);
            String str5 = this.A08;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, str5, AH4);
            long j = this.A00;
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, j, A1X);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new MI5(obj4, str5, 1, j);
                c5Tl.FBy(EEc);
            }
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            c5Tl.Eno(-1660570939);
            C5yI c5yI = this.A02;
            boolean AH42 = c5Tl.AH4(c5yI);
            String str6 = this.A06;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, str6, AH42);
            String str7 = this.A05;
            boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, str7, A1X2);
            Object EEc2 = c5Tl.EEc();
            if (A1X3 || EEc2 == C5UI.A00) {
                EEc2 = new DSC(c5yI, str6, str7);
                c5Tl.FBy(EEc2);
            }
            InterfaceC16620sF A1C = AbstractC25225BEi.A1C(A0K, EEc2);
            boolean z2 = this.A0A;
            InterfaceC16820sZ interfaceC16820sZ = this.A09;
            boolean AH43 = c5Tl.AH4(str6) | AbstractC25227BEk.A1Y(c5Tl, obj4, -1660544270);
            String str8 = this.A07;
            boolean A1X4 = AbstractC25225BEi.A1X(c5Tl, str8, AH43);
            Object EEc3 = c5Tl.EEc();
            if (A1X4 || EEc3 == C5UI.A00) {
                EEc3 = new DH6(obj4, str6, str8, 21);
                c5Tl.FBy(EEc3);
            }
            InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K, EEc3, false);
            boolean A1b = AbstractC25234BEr.A1b(c5Tl, c5yI, str6, interfaceC132245y2, -1660556935);
            Object EEc4 = c5Tl.EEc();
            if (A1b || EEc4 == C5UI.A00) {
                EEc4 = AbstractC25229BEm.A11(c5Tl, interfaceC132245y2, c5yI, str6, 9);
            }
            CEE.A00(c5Tl, null, lineType, enumC132255y4, c6h4, str, str3, str4, str2, null, interfaceC16820sZ, A1A, interfaceC16660sJ, AbstractC25225BEi.A1B(A0K, EEc4, false), A1C, c5Hc, c5Hc2, 0, i, 0, 0, 0, 0, 1442816, z, z2);
            if (C0fH.A02()) {
                C0fH.A00(-1366989363);
            }
        }
        return C0eB.A00;
    }
}
