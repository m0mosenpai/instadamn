package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class DX4 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C136946Hx A01;
    public final /* synthetic */ C136936Hw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C75363a3 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DX4(C136946Hx c136946Hx, C136936Hw c136936Hw, UserSession userSession, C75363a3 c75363a3, String str, InterfaceC16820sZ interfaceC16820sZ, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A05 = str;
        this.A0B = z;
        this.A01 = c136946Hx;
        this.A04 = c75363a3;
        this.A02 = c136936Hw;
        this.A07 = z2;
        this.A00 = f;
        this.A09 = z3;
        this.A08 = z4;
        this.A06 = interfaceC16820sZ;
        this.A0A = z5;
        this.A03 = userSession;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Modifier modifier;
        BZO A01;
        BZP A06;
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(77899334, "com.instagram.barcelona.feed.post.video.PostVideo.<anonymous> (PostVideo.kt:110)");
            }
            C1130158n c1130158n = Modifier.A00;
            c5Tl.Eno(1513488237);
            String str = this.A05;
            boolean AH4 = c5Tl.AH4(str);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A13(c5Tl, str, 19);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            Modifier A00 = AnonymousClass598.A00(c1130158n, (InterfaceC16660sJ) EEc, false);
            c5Tl.Eno(1513490740);
            boolean z = this.A0B;
            boolean AH5 = c5Tl.AH5(z);
            C136946Hx c136946Hx = this.A01;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, c136946Hx, AH5);
            C75363a3 c75363a3 = this.A04;
            boolean A1X2 = AbstractC25225BEi.A1X(c5Tl, c75363a3, A1X);
            Object EEc2 = c5Tl.EEc();
            if (A1X2 || EEc2 == C5UI.A00) {
                EEc2 = new BQB(3, c75363a3, c136946Hx, z);
                c5Tl.FBy(EEc2);
            }
            Modifier A002 = C5YF.A00(A00, AbstractC25225BEi.A1B(c117505Tk, EEc2, false));
            C136936Hw c136936Hw = this.A02;
            boolean z2 = this.A07;
            float f = this.A00;
            boolean z3 = this.A09;
            boolean z4 = this.A08;
            InterfaceC16820sZ interfaceC16820sZ = this.A06;
            boolean z5 = this.A0A;
            UserSession userSession = this.A03;
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C119645bN c119645bN = C119645bN.A00;
            Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
            c5Tl.Eno(67591217);
            if (!AbstractC25231BEo.A1U(c136936Hw.A00)) {
                Object A0q = AbstractC25227BEk.A0q(c5Tl, 67595299);
                Object obj3 = C5UI.A00;
                C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj3);
                C117505Tk.A0L(c117505Tk, false);
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, c136936Hw, 67599460);
                Object EEc3 = c5Tl.EEc();
                if (A1Y || EEc3 == obj3) {
                    EEc3 = AbstractC25230BEn.A0y(c5Tl, c136936Hw, 27);
                }
                modifier = C5XR.A04(c5xo, c1130158n, AbstractC25225BEi.A1A(c117505Tk, EEc3, false));
            } else {
                modifier = c1130158n;
            }
            Modifier A0G = AbstractC25227BEk.A0G(c117505Tk, A0U, modifier);
            boolean A1V = AbstractC25228BEl.A1V(c5Tl, c75363a3, AbstractC25232BEp.A1W(c5Tl, c136946Hx, 67604108, z), c5Tl.AH5(z2));
            Object EEc4 = c5Tl.EEc();
            if (A1V || EEc4 == C5UI.A00) {
                EEc4 = new C37487Gf5(c75363a3, c136946Hx, 1, z2, z);
                c5Tl.FBy(EEc4);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk, EEc4, false);
            boolean A1T = AbstractC25227BEk.A1T(c5Tl, f, 67622828);
            Object EEc5 = c5Tl.EEc();
            if (A1T || EEc5 == C5UI.A00) {
                EEc5 = new DHG(f, 8);
                c5Tl.FBy(EEc5);
            }
            AbstractC28450Cgz.A02(c5Tl, A0G, A1B, AbstractC25225BEi.A1B(c117505Tk, EEc5, false), 0, 0);
            c5Tl.Eno(67625011);
            if (z3 && AbstractC166997dE.A1Z(c75363a3.A0B, true)) {
                boolean z6 = !c136946Hx.A06();
                boolean A1Y2 = AbstractC25226BEj.A1Y(c5Tl, z6, AbstractC25227BEk.A1Y(c5Tl, c136946Hx, 67631800));
                Object EEc6 = c5Tl.EEc();
                if (A1Y2 || EEc6 == C5UI.A00) {
                    EEc6 = AbstractC25229BEm.A0x(c5Tl, c136946Hx, 14, z6);
                }
                AbstractC27541CDl.A00(c5Tl, AbstractC118175Wb.A0E(c119645bN.AB5(C118195Wf.A07, c1130158n), 0.0f, 0.0f, 12.0f, 12.0f), AbstractC25225BEi.A1A(c117505Tk, EEc6, false), 0, 0, c136946Hx.A06());
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(67640082);
            if (z4) {
                AbstractC27540CDk.A00(c5Tl, AbstractC118175Wb.A0B(c119645bN.AB5(C118195Wf.A08, c1130158n), 0.0f, 0.0f, 12.0f), EnumC27359C5o.A03, interfaceC16820sZ, 48, 0);
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier A004 = AbstractC28010CWi.A00(c119645bN.AB5(C118195Wf.A08, c1130158n), 0.0f, 5.0f);
            A01 = AbstractC28503Chw.A01(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.0f);
            A06 = AbstractC28503Chw.A06(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.0f);
            AbstractC28495Cho.A07(A01, A06, c5Tl, A004, null, C5UA.A01(c5Tl, new C30536DcJ(4, c119645bN, userSession, c136946Hx), -1161645923), 200064, 16, z5);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(749910423);
            }
        }
        return C0eB.A00;
    }
}
