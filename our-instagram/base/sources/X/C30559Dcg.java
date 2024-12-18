package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Dcg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30559Dcg extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30559Dcg(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A05 = str;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        C5Tl c5Tl;
        InterfaceC99334d2 interfaceC99334d2;
        switch (this.A00) {
            case 0:
                c5Tl = (C5Tl) obj2;
                int A0H = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(obj, 0);
                if ((A0H & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1986671847, "com.instagram.aistudio.home.view.SearchLayout.<anonymous>.<anonymous>.<anonymous> (AiSearchFragment.kt:194)");
                    }
                    C1130158n c1130158n = Modifier.A00;
                    Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
                    InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
                    String str = this.A05;
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
                    InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A04;
                    C28370CfW c28370CfW = (C28370CfW) this.A01;
                    Object obj4 = this.A02;
                    InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
                    int A00 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, A0T);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A0V, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    AbstractC28473ChR.A01(c5Tl, C6L0.A00.A00(c1130158n), c28370CfW, str, interfaceC16660sJ, interfaceC16660sJ2, 0);
                    String A002 = C5YD.A00(c5Tl, 2131952648);
                    long A0N = AbstractC25226BEj.A0N(c5Tl);
                    C118125Vw A0X = AbstractC25225BEi.A0X(c5Tl);
                    Modifier A0D = AbstractC118175Wb.A0D(c1130158n, 0.0f, 0.0f, 8.0f);
                    boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, obj4, 910025284);
                    Object EEc = c5Tl.EEc();
                    if (A1Y || EEc == C5UI.A00) {
                        EEc = new C50157MDk(obj4, 0);
                        c5Tl.FBy(EEc);
                    }
                    C5WR.A0R(c5Tl, C5XR.A05(A0D, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true), A0X, A002, A0N);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i = 923778925;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 1:
                c5Tl = (C5Tl) obj2;
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-126797897, "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerImage.<anonymous> (ImageMediaBox.kt:81)");
                    }
                    C1130158n c1130158n2 = Modifier.A00;
                    Modifier A0U = AbstractC25226BEj.A0U(c1130158n2);
                    ImageUrl imageUrl = (ImageUrl) this.A03;
                    String str2 = this.A05;
                    MUD mud = (MUD) this.A04;
                    InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) this.A01;
                    InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) this.A02;
                    InterfaceC1127857k A003 = C5XX.A00(C118195Wf.A0E, false);
                    int A004 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk2 = (C117505Tk) c5Tl;
                    C59P A042 = C117505Tk.A04(c117505Tk2);
                    Modifier A012 = C5X3.A01(c5Tl, A0U);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk2);
                    AbstractC25231BEo.A12(c5Tl, A003, A042);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (c117505Tk2.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A012);
                    C119645bN c119645bN = C119645bN.A00;
                    c5Tl.Eno(-219338700);
                    if (str2 == null) {
                        str2 = C5YD.A00(c5Tl, 2131953718);
                    }
                    C117505Tk.A0L(c117505Tk2, false);
                    AbstractC136656Gu.A01(c5Tl, null, A0U, null, null, imageUrl, str2, null, null, null, 0.0f, 384, 0, 2040, 0L);
                    c5Tl.Eno(-219333215);
                    if (mud != null) {
                        c5Tl.Eno(-219332324);
                        if (AbstractC25231BEo.A1U(interfaceC74963Ym)) {
                            CE5.A00(c5Tl, AbstractC118175Wb.A08(c119645bN.AB5(C118195Wf.A08, c1130158n2), 6.0f), mud, interfaceC16660sJ3, 0, 0);
                        }
                        C117505Tk.A0L(c117505Tk2, false);
                    }
                    if (AbstractC25230BEn.A1U(c5Tl, c117505Tk2, false)) {
                        i = 1413162579;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 2:
                C5Tl c5Tl2 = (C5Tl) obj2;
                boolean A1X = AbstractC25231BEo.A1X(obj3, obj);
                if (C0fH.A02()) {
                    C0fH.A01(-1193962162, "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MediaViewerScreen.kt:359)");
                }
                InterfaceC74963Ym interfaceC74963Ym2 = (InterfaceC74963Ym) this.A03;
                int i2 = ((C45101JxV) interfaceC74963Ym2.getValue()).A00;
                int i3 = ((C45101JxV) interfaceC74963Ym2.getValue()).A01;
                int i4 = ((C45101JxV) interfaceC74963Ym2.getValue()).A02;
                int i5 = ((C45101JxV) interfaceC74963Ym2.getValue()).A03;
                c5Tl2.Eno(-420352043);
                Object obj5 = this.A01;
                boolean AH4 = c5Tl2.AH4(obj5);
                String str3 = this.A05;
                boolean A1a = AbstractC25232BEp.A1a(c5Tl2, str3, interfaceC74963Ym2, AH4);
                Object EEc2 = c5Tl2.EEc();
                if (A1a || EEc2 == C5UI.A00) {
                    EEc2 = AbstractC25229BEm.A11(c5Tl2, interfaceC74963Ym2, obj5, str3, 7);
                }
                InterfaceC16660sJ interfaceC16660sJ4 = (InterfaceC16660sJ) EEc2;
                C117505Tk c117505Tk3 = (C117505Tk) c5Tl2;
                boolean z = ((C45101JxV) AbstractC25227BEk.A0s(c117505Tk3, interfaceC74963Ym2, A1X)).A0D;
                boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl2, obj5, -420332229);
                Object obj6 = this.A02;
                boolean A1a2 = AbstractC25232BEp.A1a(c5Tl2, str3, interfaceC74963Ym2, AbstractC25226BEj.A1X(c5Tl2, obj6, A1Y2));
                Object EEc3 = c5Tl2.EEc();
                if (A1a2 || EEc3 == C5UI.A00) {
                    EEc3 = new ME8(obj5, interfaceC74963Ym2, obj6, str3, 3);
                    c5Tl2.FBy(EEc3);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk3, EEc3, A1X);
                boolean A1Z = AbstractC25232BEp.A1Z(c5Tl2, obj5, str3, -420304177);
                Object EEc4 = c5Tl2.EEc();
                if (A1Z || EEc4 == C5UI.A00) {
                    EEc4 = new C57258Pbg(str3, obj5, 43);
                    c5Tl2.FBy(EEc4);
                }
                InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(c117505Tk3, EEc4, A1X);
                boolean A1Z2 = AbstractC25232BEp.A1Z(c5Tl2, obj5, str3, -420295213);
                Object EEc5 = c5Tl2.EEc();
                if (A1Z2 || EEc5 == C5UI.A00) {
                    EEc5 = new C57258Pbg(str3, obj5, 44);
                    c5Tl2.FBy(EEc5);
                }
                InterfaceC16820sZ A1A3 = AbstractC25225BEi.A1A(c117505Tk3, EEc5, A1X);
                boolean A1b = AbstractC25234BEr.A1b(c5Tl2, obj5, str3, interfaceC74963Ym2, -420286000);
                Object EEc6 = c5Tl2.EEc();
                if (A1b || EEc6 == C5UI.A00) {
                    EEc6 = new C50253MHi(obj5, interfaceC74963Ym2, str3, 13);
                    c5Tl2.FBy(EEc6);
                }
                InterfaceC16820sZ A1A4 = AbstractC25225BEi.A1A(c117505Tk3, EEc6, A1X);
                boolean A1b2 = AbstractC25234BEr.A1b(c5Tl2, obj5, str3, interfaceC74963Ym2, -420269920);
                Object EEc7 = c5Tl2.EEc();
                if (A1b2 || EEc7 == C5UI.A00) {
                    EEc7 = new C50253MHi(obj5, interfaceC74963Ym2, str3, 14);
                    c5Tl2.FBy(EEc7);
                }
                InterfaceC16820sZ A1A5 = AbstractC25225BEi.A1A(c117505Tk3, EEc7, A1X);
                C44463JlV c44463JlV = (C44463JlV) this.A04;
                C14360o3.A0B(str3, A1X ? 1 : 0);
                C38321qM A02 = c44463JlV.A05.A02(str3);
                if (A02 != null) {
                    interfaceC99334d2 = A02.A0C.C6Y();
                } else {
                    interfaceC99334d2 = null;
                }
                AbstractC28461ChD.A04(c5Tl2, null, new C26696Bqd(C05F.A00), A1A, A1A2, A1A3, A1A4, A1A5, interfaceC16660sJ4, null, i2, i3, i4, i5, A1X ? 1 : 0, 199680, 393248, z, LKi.A02(interfaceC99334d2), A1X, ((C45101JxV) interfaceC74963Ym2.getValue()).A0B, true, A1X);
                if (C0fH.A02()) {
                    i = -668481873;
                    C0fH.A00(i);
                    break;
                }
                break;
            case 3:
                C5Tl c5Tl3 = (C5Tl) obj2;
                boolean A1X2 = AbstractC25231BEo.A1X(obj3, obj);
                if (C0fH.A02()) {
                    C0fH.A01(-856066980, "com.instagram.barcelona.feed.post.ui.PostProfilePreview.<anonymous>.<anonymous> (PostProfilePreview.kt:72)");
                }
                Modifier A08 = AbstractC118175Wb.A08(AbstractC25232BEp.A0x(c5Tl3, AbstractC28015CWn.A01(AbstractC118175Wb.A0E((Modifier) this.A01, 0.0f, 6.0f, 0.0f, 12.0f), new C28808Cne((C72) this.A03, (C28874Coi) this.A04, 12.0f), 4.0f, C1132359l.A01, AbstractC1132259k.A00, AbstractC25230BEn.A1O(4.0f))), 12.0f);
                C6ID A013 = AbstractC118255Wn.A01(6.0f);
                C2DC c2dc = (C2DC) this.A02;
                String str4 = this.A05;
                InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
                InterfaceC1127857k A022 = AbstractC119595bH.A02(A013, c5Tl3, interfaceC118245Wl, 6);
                int A005 = C5X2.A00(c5Tl3);
                C117505Tk c117505Tk4 = (C117505Tk) c5Tl3;
                C59P A043 = C117505Tk.A04(c117505Tk4);
                Modifier A014 = C5X3.A01(c5Tl3, A08);
                InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                AbstractC25233BEq.A12(c5Tl3, c117505Tk4, interfaceC16820sZ);
                InterfaceC16620sF interfaceC16620sF3 = C5X8.A03;
                InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl3, A022, A043, interfaceC16620sF3);
                InterfaceC16620sF interfaceC16620sF4 = C5X8.A02;
                if (c117505Tk4.A0K || !AbstractC25231BEo.A1O(c5Tl3, A005)) {
                    AbstractC25231BEo.A15(c5Tl3, interfaceC16620sF4, A005);
                }
                InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl3, A014);
                InterfaceC118225Wj interfaceC118225Wj2 = C118195Wf.A04;
                C1130158n c1130158n3 = Modifier.A00;
                InterfaceC1127857k A023 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl3, interfaceC118225Wj2, 48);
                int A006 = C5X2.A00(c5Tl3);
                C59P A044 = C117505Tk.A04(c117505Tk4);
                Modifier A015 = C5X3.A01(c5Tl3, c1130158n3);
                AbstractC25233BEq.A12(c5Tl3, c117505Tk4, interfaceC16820sZ);
                C5XJ.A00(c5Tl3, A023, interfaceC16620sF3);
                if (AbstractC25225BEi.A1W(c5Tl3, c117505Tk4, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl3, A006)) {
                    AbstractC25231BEo.A15(c5Tl3, interfaceC16620sF4, A006);
                }
                C5XJ.A00(c5Tl3, A015, A1K);
                C6L0 c6l0 = C6L0.A00;
                C6LQ.A03(c5Tl3, AbstractC25226BEj.A0W(AbstractC118175Wb.A0E(c1130158n3, 0.0f, 0.0f, 12.0f, 0.0f)), c2dc);
                Modifier A007 = c6l0.A00(c1130158n3);
                InterfaceC1127857k A024 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl3, interfaceC118245Wl, A1X2 ? 1 : 0);
                int A008 = C5X2.A00(c5Tl3);
                C59P A045 = C117505Tk.A04(c117505Tk4);
                Modifier A016 = C5X3.A01(c5Tl3, A007);
                AbstractC25233BEq.A12(c5Tl3, c117505Tk4, interfaceC16820sZ);
                C5XJ.A00(c5Tl3, A024, interfaceC16620sF3);
                if (AbstractC25225BEi.A1W(c5Tl3, c117505Tk4, A045, A0q) || !AbstractC25231BEo.A1O(c5Tl3, A008)) {
                    AbstractC25231BEo.A15(c5Tl3, interfaceC16620sF4, A008);
                }
                C5XJ.A00(c5Tl3, A016, A1K);
                C5WR.A0l(c5Tl3, AbstractC25226BEj.A0h(c5Tl3), "Full Name", 1, 2, 6, 390, 11262, 0L);
                C5WR.A0m(c5Tl3, AbstractC25226BEj.A0c(c5Tl3), str4, 1, 390, 11262, 0L);
                c5Tl3.ASW();
                CXT.A01(c5Tl3, null, null, C7E.A04, DAH.A00, null, 0.0f, A1X2 ? 1 : 0, 54, 252, A1X2);
                c5Tl3.ASW();
                C5WR.A0l(c5Tl3, null, "🏀 Basketball fanatic | 🌆 NYC street style lover | 🕶️ Fashion-forward thinker", 2, 2, 6, 390, 27646, 0L);
                InterfaceC1127857k A025 = AbstractC118375Wz.A02(AbstractC118255Wn.A00(), c5Tl3, C118195Wf.A05, 6);
                int A009 = C5X2.A00(c5Tl3);
                C59P A046 = C117505Tk.A04(c117505Tk4);
                Modifier A017 = C5X3.A01(c5Tl3, c1130158n3);
                AbstractC25233BEq.A12(c5Tl3, c117505Tk4, interfaceC16820sZ);
                C5XJ.A00(c5Tl3, A025, interfaceC16620sF3);
                if (AbstractC25225BEi.A1W(c5Tl3, c117505Tk4, A046, A0q) || !AbstractC25231BEo.A1O(c5Tl3, A009)) {
                    AbstractC25231BEo.A15(c5Tl3, interfaceC16620sF4, A009);
                }
                C5XJ.A00(c5Tl3, A017, A1K);
                C5WR.A0d(c5Tl3, null, "1.5K followers,", 6, 32762, AbstractC25226BEj.A0M(c5Tl3));
                C5WR.A0d(c5Tl3, null, "230 posts", 6, 32762, AbstractC25226BEj.A0M(c5Tl3));
                if (AbstractC25230BEn.A1T(c5Tl3)) {
                    i = 1970815;
                    C0fH.A00(i);
                    break;
                }
                break;
            default:
                InterfaceC16620sF interfaceC16620sF5 = (InterfaceC16620sF) obj;
                c5Tl = (C5Tl) obj2;
                int A0H2 = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(interfaceC16620sF5, 0);
                if ((A0H2 & 6) == 0) {
                    A0H2 |= AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF5);
                }
                if ((A0H2 & 19) != 18 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-189983415, "com.instagram.compose.igds.components.searchbar.IgdsSearchBar.<anonymous> (IgdsSearchBar.kt:62)");
                    }
                    boolean A1U = AbstractC25231BEo.A1U((InterfaceC74963Ym) this.A01);
                    String str5 = this.A05;
                    C2DC c2dc2 = (C2DC) this.A04;
                    C5XO c5xo = (C5XO) this.A02;
                    c5Tl.Eno(1240176403);
                    Object obj7 = this.A03;
                    boolean AH42 = c5Tl.AH4(obj7);
                    Object EEc8 = c5Tl.EEc();
                    if (AH42 || EEc8 == C5UI.A00) {
                        EEc8 = new C29889DGd(obj7, 8);
                        c5Tl.FBy(EEc8);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    BY5.A01(c5xo, c5Tl, c2dc2, str5, (InterfaceC16820sZ) EEc8, interfaceC16620sF5, (A0H2 << 15) & 458752, A1U);
                    if (C0fH.A02()) {
                        i = -1901067573;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
        }
        return C0eB.A00;
    }
}
