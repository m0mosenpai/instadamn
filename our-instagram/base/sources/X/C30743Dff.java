package X;

/* renamed from: X.Dff, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30743Dff extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ InterfaceC74953Yl A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ InterfaceC74953Yl A02;
    public final /* synthetic */ InterfaceC74953Yl A03;
    public final /* synthetic */ InterfaceC74953Yl A04;
    public final /* synthetic */ InterfaceC74963Ym A05;
    public final /* synthetic */ InterfaceC74963Ym A06;
    public final /* synthetic */ C51729Mt8 A07;
    public final /* synthetic */ C25660BVw A08;
    public final /* synthetic */ C28357CfH A09;
    public final /* synthetic */ C44463JlV A0A;
    public final /* synthetic */ InterfaceC60442pS A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ InterfaceC16590sC A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30743Dff(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC74953Yl interfaceC74953Yl3, InterfaceC74953Yl interfaceC74953Yl4, InterfaceC74953Yl interfaceC74953Yl5, InterfaceC74963Ym interfaceC74963Ym, InterfaceC74963Ym interfaceC74963Ym2, C51729Mt8 c51729Mt8, C25660BVw c25660BVw, C28357CfH c28357CfH, C44463JlV c44463JlV, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC16590sC interfaceC16590sC, boolean z) {
        super(4);
        this.A09 = c28357CfH;
        this.A06 = interfaceC74963Ym;
        this.A0D = interfaceC16590sC;
        this.A0B = interfaceC60442pS;
        this.A0A = c44463JlV;
        this.A05 = interfaceC74963Ym2;
        this.A0C = str;
        this.A0E = z;
        this.A08 = c25660BVw;
        this.A07 = c51729Mt8;
        this.A00 = interfaceC74953Yl;
        this.A04 = interfaceC74953Yl2;
        this.A01 = interfaceC74953Yl3;
        this.A02 = interfaceC74953Yl4;
        this.A03 = interfaceC74953Yl5;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        int A0H = AbstractC166987dD.A0H(obj);
        InterfaceC31033DkX interfaceC31033DkX = (InterfaceC31033DkX) obj2;
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        C14360o3.A0B(interfaceC31033DkX, 1);
        if ((A0H2 & 6) == 0) {
            i = A0H2 | AbstractC25232BEp.A08(c5Tl, A0H);
        } else {
            i = A0H2;
        }
        if ((A0H2 & 48) == 0) {
            i |= AbstractC25232BEp.A0S(c5Tl, interfaceC31033DkX);
        }
        if ((i & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(915414593, "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreen.<anonymous>.<anonymous>.<anonymous> (MediaViewerScreen.kt:252)");
            }
            c5Tl.Eno(-257920261);
            C25660BVw c25660BVw = this.A08;
            Object EEc = c5Tl.EEc();
            Object obj5 = C5UI.A00;
            if (EEc == obj5) {
                EEc = AbstractC25229BEm.A0Q(c5Tl, new C57249PbX(A0H, 11, c25660BVw));
            }
            InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) EEc;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            int height = interfaceC31033DkX.getHeight();
            if (height > 0) {
                f = interfaceC31033DkX.getWidth() / height;
            } else {
                f = 1.0f;
            }
            AbstractC25227BEk.A18(this.A00, f);
            if (C26145BhW.A00(interfaceC31033DkX, 0)) {
                c5Tl.Eno(594699360);
                C28357CfH c28357CfH = this.A09;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04.getValue();
                C26145BhW c26145BhW = (C26145BhW) interfaceC31033DkX;
                boolean A1U = AbstractC25231BEo.A1U(interfaceC74963Ym);
                InterfaceC74963Ym interfaceC74963Ym2 = this.A06;
                c5Tl.Eno(-257900923);
                InterfaceC74953Yl interfaceC74953Yl = this.A01;
                Object EEc2 = c5Tl.EEc();
                if (EEc2 == obj5) {
                    EEc2 = AbstractC25228BEl.A1F(c5Tl, interfaceC74953Yl, 25);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc2, false);
                c5Tl.Eno(-257898537);
                InterfaceC74953Yl interfaceC74953Yl2 = this.A02;
                Object EEc3 = c5Tl.EEc();
                if (EEc3 == obj5) {
                    EEc3 = AbstractC25235BEs.A14(c5Tl, interfaceC74953Yl2, 39);
                }
                InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk, EEc3, false);
                c5Tl.Eno(-257896749);
                InterfaceC74953Yl interfaceC74953Yl3 = this.A03;
                Object EEc4 = c5Tl.EEc();
                if (EEc4 == obj5) {
                    EEc4 = AbstractC25235BEs.A14(c5Tl, interfaceC74953Yl3, 40);
                }
                InterfaceC16660sJ A1B2 = AbstractC25225BEi.A1B(c117505Tk, EEc4, false);
                c5Tl.Eno(-257894907);
                InterfaceC16590sC interfaceC16590sC = this.A0D;
                boolean AH4 = c5Tl.AH4(interfaceC16590sC);
                InterfaceC60442pS interfaceC60442pS = this.A0B;
                boolean A1X = AbstractC25226BEj.A1X(c5Tl, interfaceC60442pS, AH4);
                C44463JlV c44463JlV = this.A0A;
                boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, c44463JlV, A1X);
                Object EEc5 = c5Tl.EEc();
                if (A1X2 || EEc5 == obj5) {
                    EEc5 = C30172DRc.A00(c5Tl, interfaceC60442pS, interfaceC16590sC, c44463JlV, 1);
                }
                CXZ.A01(c5Tl, interfaceC74963Ym2, c26145BhW, c28357CfH, interfaceC16820sZ, A1A, A1B, A1B2, AbstractC25225BEi.A1B(c117505Tk, EEc5, false), f, 115015680, A1U);
            } else if (C26145BhW.A00(interfaceC31033DkX, 1)) {
                c5Tl.Eno(595588843);
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A04.getValue();
                C26145BhW c26145BhW2 = (C26145BhW) interfaceC31033DkX;
                boolean A1U2 = AbstractC25231BEo.A1U(interfaceC74963Ym);
                boolean A1U3 = AbstractC25231BEo.A1U(this.A05);
                InterfaceC74953Yl interfaceC74953Yl4 = this.A03;
                boolean A1X3 = AbstractC25230BEn.A1X(interfaceC74953Yl4);
                boolean A1U4 = AbstractC25231BEo.A1U(this.A06);
                C28357CfH c28357CfH2 = this.A09;
                String str = this.A0C;
                boolean z = this.A0E;
                C51729Mt8 c51729Mt8 = this.A07;
                c5Tl.Eno(-257863643);
                InterfaceC74953Yl interfaceC74953Yl5 = this.A01;
                Object EEc6 = c5Tl.EEc();
                if (EEc6 == obj5) {
                    EEc6 = AbstractC25235BEs.A12(c5Tl, interfaceC74953Yl5, 27);
                }
                InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(c117505Tk, EEc6, false);
                c5Tl.Eno(-257861257);
                InterfaceC74953Yl interfaceC74953Yl6 = this.A02;
                Object EEc7 = c5Tl.EEc();
                if (EEc7 == obj5) {
                    EEc7 = AbstractC25235BEs.A14(c5Tl, interfaceC74953Yl6, 41);
                }
                InterfaceC16660sJ A1B3 = AbstractC25225BEi.A1B(c117505Tk, EEc7, false);
                Object A0q = AbstractC25227BEk.A0q(c5Tl, -257859469);
                if (A0q == obj5) {
                    A0q = AbstractC25235BEs.A14(c5Tl, interfaceC74953Yl4, 42);
                }
                InterfaceC16660sJ A1B4 = AbstractC25225BEi.A1B(c117505Tk, A0q, false);
                c5Tl.Eno(-257857627);
                InterfaceC16590sC interfaceC16590sC2 = this.A0D;
                boolean AH42 = c5Tl.AH4(interfaceC16590sC2);
                InterfaceC60442pS interfaceC60442pS2 = this.A0B;
                boolean A1X4 = AbstractC25226BEj.A1X(c5Tl, interfaceC60442pS2, AH42);
                C44463JlV c44463JlV2 = this.A0A;
                boolean A1X5 = AbstractC25225BEi.A1X(c5Tl, c44463JlV2, A1X4);
                Object EEc8 = c5Tl.EEc();
                if (A1X5 || EEc8 == obj5) {
                    EEc8 = new C30172DRc(2, interfaceC60442pS2, interfaceC16590sC2, c44463JlV2);
                    c5Tl.FBy(EEc8);
                }
                AbstractC28296Cdi.A02(c5Tl, c51729Mt8, c26145BhW2, c25660BVw, c28357CfH2, str, interfaceC16820sZ2, A1A2, A1B3, A1B4, AbstractC25225BEi.A1B(c117505Tk, EEc8, false), f, A0H, 0, (i & 14) | 224256, A1U2, A1U3, A1X3, z, A1U4);
            } else if (interfaceC31033DkX instanceof C26144BhV) {
                c5Tl.Eno(596738850);
                c5Tl.AJX(C6I2.A00);
                C28357CfH c28357CfH3 = this.A09;
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A04.getValue();
                boolean A1K = AbstractC25231BEo.A1K(i) | AbstractC25227BEk.A1Y(c5Tl, null, -257838727);
                Object EEc9 = c5Tl.EEc();
                if (A1K || EEc9 == obj5) {
                    EEc9 = AbstractC25230BEn.A12(c5Tl, interfaceC31033DkX, null, 43);
                }
                InterfaceC16660sJ A1B5 = AbstractC25225BEi.A1B(c117505Tk, EEc9, false);
                c5Tl.Eno(-257833723);
                InterfaceC74953Yl interfaceC74953Yl7 = this.A01;
                Object EEc10 = c5Tl.EEc();
                if (EEc10 == obj5) {
                    EEc10 = AbstractC25228BEl.A1F(c5Tl, interfaceC74953Yl7, 26);
                }
                InterfaceC16820sZ A1A3 = AbstractC25225BEi.A1A(c117505Tk, EEc10, false);
                c5Tl.Eno(-257831337);
                InterfaceC74953Yl interfaceC74953Yl8 = this.A02;
                Object EEc11 = c5Tl.EEc();
                if (EEc11 == obj5) {
                    EEc11 = AbstractC25235BEs.A14(c5Tl, interfaceC74953Yl8, 37);
                }
                InterfaceC16660sJ A1B6 = AbstractC25225BEi.A1B(c117505Tk, EEc11, false);
                c5Tl.Eno(-257829549);
                InterfaceC74953Yl interfaceC74953Yl9 = this.A03;
                Object EEc12 = c5Tl.EEc();
                if (EEc12 == obj5) {
                    EEc12 = AbstractC25235BEs.A14(c5Tl, interfaceC74953Yl9, 38);
                }
                CE1.A00(c5Tl, AbstractC25228BEl.A0V(), c28357CfH3, interfaceC16820sZ3, A1A3, A1B5, A1B6, AbstractC25225BEi.A1B(c117505Tk, EEc12, false), C5UA.A01(c5Tl, new DS8(interfaceC31033DkX, f, 0), -574143855), 14380032);
            } else {
                throw AbstractC25231BEo.A0v(c5Tl, c117505Tk, -257910703, false);
            }
            if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                C0fH.A00(1844854720);
            }
        }
        return C0eB.A00;
    }
}
