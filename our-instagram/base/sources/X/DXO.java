package X;

import android.app.Activity;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalProfileData;

/* loaded from: classes5.dex */
public final class DXO extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ InterfaceC74963Ym A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;
    public final /* synthetic */ InterfaceC16660sJ A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXO(Activity activity, InterfaceC74953Yl interfaceC74953Yl, InterfaceC74963Ym interfaceC74963Ym, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        super(2);
        this.A09 = interfaceC16820sZ;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A00 = activity;
        this.A06 = interfaceC16820sZ2;
        this.A0B = interfaceC16660sJ;
        this.A0A = interfaceC16660sJ2;
        this.A08 = interfaceC16820sZ3;
        this.A05 = interfaceC16820sZ4;
        this.A0C = z;
        this.A07 = interfaceC16820sZ5;
        this.A02 = interfaceC74963Ym;
        this.A01 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(873379438, "com.instagram.opal.impl.ui.OpalEditContent.<anonymous> (OpalEditContent.kt:88)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, AbstractC25226BEj.A0U(c1130158n));
            Activity activity = this.A00;
            InterfaceC16820sZ interfaceC16820sZ = this.A06;
            UserSession userSession = this.A04;
            InterfaceC11380iw interfaceC11380iw = this.A03;
            InterfaceC16660sJ interfaceC16660sJ = this.A0B;
            InterfaceC16660sJ interfaceC16660sJ2 = this.A0A;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A08;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A05;
            boolean z = this.A0C;
            InterfaceC16820sZ interfaceC16820sZ4 = this.A07;
            InterfaceC74963Ym interfaceC74963Ym = this.A02;
            InterfaceC74953Yl interfaceC74953Yl = this.A01;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            InterfaceC16820sZ interfaceC16820sZ5 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, activity, -1896016321);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = DH3.A02(c5Tl, activity, 4);
            }
            Modifier A05 = C5XR.A05(A0T, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), true);
            Alignment alignment = C118195Wf.A0E;
            InterfaceC1127857k A002 = C5XX.A00(alignment, false);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A002, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            C119645bN c119645bN = C119645bN.A00;
            BGD.A01(c5Tl, AbstractC25225BEi.A0P(c119645bN, AbstractC118175Wb.A0E(c1130158n, 16.0f, 18.0f, 16.0f, 4.0f)), AbstractC43541zP.A00(c5Tl, ((OpalProfileData) ((C51760Mtj) interfaceC74963Ym.getValue()).A01).A01()), null, new BI2(96.0f, 96.0f, 2.0f, 1.0f), C30108DOq.A00, 14155824, 6, 824, false);
            c5Tl.ASW();
            String A004 = AbstractC136736Hc.A00(c5Tl, 2131969020);
            C6GB A005 = C6GA.A00(c5Tl);
            Modifier A0G = AbstractC25235BEs.A0G(c6gm, AbstractC118175Wb.A0A(c1130158n, 16.0f, 14.0f));
            C6GD c6gd = C6GD.A03;
            boolean A1b = AbstractC25232BEp.A1b(c5Tl, userSession, interfaceC11380iw, AbstractC25232BEp.A1X(c5Tl, activity, interfaceC16820sZ, -1895998222));
            Object EEc2 = c5Tl.EEc();
            if (A1b || EEc2 == C5UI.A00) {
                EEc2 = C29901DGp.A00(activity, interfaceC16820sZ, userSession, interfaceC11380iw, 16);
                c5Tl.FBy(EEc2);
            }
            C6GE.A01(c5Tl, A0G, c6gd, A005, A004, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 1572864, 408, false);
            AbstractC28389Cfs.A01(c5Tl, A0T);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, interfaceC16660sJ, -1895975406);
            Object EEc3 = c5Tl.EEc();
            if (A1Y || EEc3 == C5UI.A00) {
                EEc3 = AbstractC25229BEm.A0v(c5Tl, interfaceC16660sJ, 41);
            }
            String str = ((OpalProfileData) ((C51760Mtj) AbstractC25227BEk.A0s(c117505Tk, interfaceC74963Ym, false)).A01).A04;
            AbstractC28443Cgr.A01(c5Tl, A0T, interfaceC11380iw, C68.A03, str, (InterfaceC16660sJ) EEc3, 24960, 32, false);
            boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, interfaceC16660sJ2, -1895966223);
            Object EEc4 = c5Tl.EEc();
            if (A1Y2 || EEc4 == C5UI.A00) {
                EEc4 = AbstractC25229BEm.A0v(c5Tl, interfaceC16660sJ2, 42);
            }
            String str2 = ((OpalProfileData) ((C51760Mtj) AbstractC25227BEk.A0s(c117505Tk, interfaceC74963Ym, false)).A01).A02;
            AbstractC28443Cgr.A01(c5Tl, A0T, interfaceC11380iw, C68.A02, str2, (InterfaceC16660sJ) EEc4, 221568, 0, false);
            AbstractC28389Cfs.A01(c5Tl, A0T);
            C5XQ A0W = AbstractC25225BEi.A0W(0);
            boolean A1b2 = AbstractC25232BEp.A1b(c5Tl, userSession, interfaceC11380iw, AbstractC25232BEp.A1X(c5Tl, activity, interfaceC16820sZ2, -1895952052));
            Object EEc5 = c5Tl.EEc();
            if (A1b2 || EEc5 == C5UI.A00) {
                EEc5 = C29901DGp.A00(activity, interfaceC16820sZ2, userSession, interfaceC11380iw, 17);
                c5Tl.FBy(EEc5);
            }
            Modifier A08 = AbstractC118175Wb.A08(C5XR.A05(A0T, A0W, null, AbstractC25225BEi.A1A(c117505Tk, EEc5, false), true), 16.0f);
            InterfaceC1127857k A006 = C5XX.A00(alignment, false);
            int A007 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A006, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A007);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0g(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131969043), AbstractC25226BEj.A0N(c5Tl));
            c5Tl.ASW();
            String A008 = AbstractC136736Hc.A00(c5Tl, 2131969060);
            C5WR.A0Y(c5Tl, AbstractC118175Wb.A0A(A0T, 16.0f, 12.0f), AbstractC25226BEj.A0g(c5Tl), A008, AbstractC25226BEj.A0M(c5Tl));
            int i = ((OpalProfileData) ((C51760Mtj) interfaceC74963Ym.getValue()).A01).A00;
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, interfaceC11380iw, AbstractC25232BEp.A1Y(c5Tl, interfaceC16820sZ3, userSession, -1895917585));
            Object EEc6 = c5Tl.EEc();
            if (A1X || EEc6 == C5UI.A00) {
                EEc6 = new C29900DGo(39, interfaceC11380iw, userSession, interfaceC16820sZ3);
                c5Tl.FBy(EEc6);
            }
            AbstractC28443Cgr.A03(AbstractC118175Wb.A0A(C5XR.A05(A0T, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc6, false), true), 16.0f, 12.0f), c5Tl, i, 0);
            C5XQ A0W2 = AbstractC25225BEi.A0W(0);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1895901828);
            Object obj3 = C5UI.A00;
            if (A0q2 == obj3) {
                A0q2 = DH3.A01(c5Tl, interfaceC74953Yl, 6);
            }
            Modifier A0A = AbstractC118175Wb.A0A(C5XR.A05(A0T, A0W2, null, AbstractC25225BEi.A1A(c117505Tk, A0q2, false), true), 16.0f, 12.0f);
            InterfaceC1127857k A009 = C5XX.A00(alignment, false);
            int A0010 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(c117505Tk);
            Modifier A014 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A009, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A0010)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A0010);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0g(c5Tl), AbstractC136736Hc.A00(c5Tl, 2131969065), AbstractC25226BEj.A07(c5Tl));
            c5Tl.ASW();
            String A0011 = AbstractC136736Hc.A00(c5Tl, 2131969066);
            C5WR.A0R(c5Tl, AbstractC118175Wb.A0E(A0T, 16.0f, 12.0f, 16.0f, 16.0f), AbstractC25225BEi.A0Y(c5Tl), A0011, AbstractC25226BEj.A0M(c5Tl));
            AbstractC28389Cfs.A01(c5Tl, A0T);
            c5Tl.Eno(-1895879082);
            if (z) {
                boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, interfaceC16820sZ4, -1895873101);
                Object EEc7 = c5Tl.EEc();
                if (A1Y3 || EEc7 == obj3) {
                    EEc7 = DH3.A02(c5Tl, interfaceC16820sZ4, 5);
                }
                AbstractC25705BXp.A07(c5Tl, AbstractC118175Wb.A0A(C5XR.A05(A0T, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc7, false), true), 0.0f, 14.0f), null, null, "Delete Flipside", "(Internal only)", 24582, 130028, AbstractC25226BEj.A07(c5Tl), false);
                AbstractC28389Cfs.A01(c5Tl, A0T);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            if (AbstractC25230BEn.A1X(interfaceC74953Yl)) {
                Object A0q3 = AbstractC25227BEk.A0q(c5Tl, -1694693218);
                if (A0q3 == obj3) {
                    A0q3 = DH3.A01(c5Tl, interfaceC74953Yl, 7);
                }
                InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, A0q3, false);
                String A0012 = AbstractC136736Hc.A00(c5Tl, 2131969067);
                String A0013 = AbstractC136736Hc.A00(c5Tl, 2131969066);
                Integer num = C05F.A0N;
                c5Tl.Eno(-1694681117);
                InterfaceC16820sZ interfaceC16820sZ6 = this.A09;
                boolean A1b3 = AbstractC25232BEp.A1b(c5Tl, userSession, interfaceC11380iw, c5Tl.AH4(interfaceC16820sZ6));
                Object EEc8 = c5Tl.EEc();
                if (A1b3 || EEc8 == obj3) {
                    EEc8 = new C29900DGo(40, interfaceC11380iw, userSession, interfaceC16820sZ6);
                    c5Tl.FBy(EEc8);
                }
                AbstractC28433Cgh.A01(null, c5Tl, CGH.A00(c5Tl, num, AbstractC25225BEi.A1A(c117505Tk, EEc8, false), 2131972171, 12), CGH.A00(c5Tl, null, null, 2131954754, 30), null, A0012, A0013, A1A, 100663302, 3808, true);
            }
            if (C0fH.A02()) {
                C0fH.A00(-2121298291);
            }
        }
        return C0eB.A00;
    }
}
