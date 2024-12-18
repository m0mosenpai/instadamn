package X;

import android.app.Application;
import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

/* renamed from: X.DWy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30323DWy extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final String A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30323DWy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, String str, int i) {
        super(2);
        this.A00 = i;
        this.A09 = obj;
        this.A06 = obj2;
        this.A08 = obj3;
        this.A07 = obj4;
        this.A05 = obj5;
        this.A02 = obj6;
        this.A0A = str;
        this.A04 = obj7;
        this.A01 = obj8;
        this.A03 = obj9;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.A00;
        C5Tl c5Tl = (C5Tl) obj;
        int A0B = AbstractC25228BEl.A0B(obj2);
        if (i2 != 0) {
            if (A0B != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(-2108624826, "com.instagram.barcelonaig.permalink.ui.BarcelonaIgPermalinkScreen.<anonymous> (BarcelonaIgPermalinkScreen.kt:63)");
                }
                C1130158n c1130158n = Modifier.A00;
                Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A03;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A04;
                C27958CUc c27958CUc = (C27958CUc) this.A07;
                C44508JmE c44508JmE = (C44508JmE) this.A09;
                InterfaceC132365yF interfaceC132365yF = (InterfaceC132365yF) this.A06;
                C5Hc c5Hc = (C5Hc) this.A02;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
                String str = this.A0A;
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A01;
                InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) this.A08;
                InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, A0U);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, C5X8.A00);
                AbstractC25231BEo.A12(c5Tl, A02, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C6GM c6gm = C6GM.A00;
                AbstractC27575CEu.A00(c5Tl, interfaceC16820sZ, interfaceC16820sZ2, 0);
                C45079Jx9 c45079Jx9 = (C45079Jx9) ((JWd) interfaceC74963Ym.getValue()).A00;
                Modifier A002 = c6gm.A00(AbstractC25226BEj.A0T(c1130158n), true);
                DAM dam = DAM.A00;
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c44508JmE, -795743911);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == C5UI.A00) {
                    EEc = new C50150MDd(c44508JmE, 14);
                    c5Tl.FBy(EEc);
                }
                AbstractC28034CXi.A00(c5Tl, A002, c27958CUc, interfaceC132365yF, c45079Jx9, c44508JmE, str, str, null, null, dam, AbstractC25225BEi.A1A(c117505Tk, EEc, false), DAN.A00, DAO.A00, DAP.A00, DAQ.A00, DAR.A00, interfaceC16660sJ, DM2.A00, DM3.A00, c5Hc, 0.0f, 14377016, 1797558, 0, 66060288, false, false, false, false, false);
                Context A0K = AbstractC25228BEl.A0K(c5Tl);
                if (((JWd) AbstractC25227BEk.A0r(c5Tl, interfaceC74963Ym, -795727290)).A02) {
                    boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c44508JmE, -795724168);
                    Object EEc2 = c5Tl.EEc();
                    if (A1Z2 || EEc2 == C5UI.A00) {
                        EEc2 = new C50150MDd(c44508JmE, 13);
                        c5Tl.FBy(EEc2);
                    }
                    InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk, EEc2, false);
                    boolean A1W = AbstractC25233BEq.A1W(c5Tl, c44508JmE, A0K, -795721889);
                    Object EEc3 = c5Tl.EEc();
                    if (A1W || EEc3 == C5UI.A00) {
                        EEc3 = new C50369MLw(A0K, c44508JmE, 11);
                        c5Tl.FBy(EEc3);
                    }
                    AbstractC27577CEw.A00(c5Tl, ((JWd) AbstractC25227BEk.A0s(c117505Tk, interfaceC74963Ym, false)).A01, A1A, interfaceC16820sZ3, (InterfaceC16660sJ) EEc3, 0);
                }
                if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                    i = 1160601994;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        } else {
            if (A0B != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(1278552035, "com.instagram.barcelonaig.fragment.BarcelonaIgScreen.<anonymous> (BarcelonaIgScreen.kt:49)");
                }
                Application application = (Application) AbstractC25236BEt.A0A(c5Tl);
                UserSession userSession = (UserSession) this.A09;
                C27005Bvk c27005Bvk = new C27005Bvk(application, userSession);
                InterfaceC018407e A0V = AbstractC25235BEs.A0V(c5Tl);
                if (A0V != null) {
                    AbstractC52972be A0O = AbstractC25236BEt.A0O(A0V);
                    c5Tl.Enp(-1439476281);
                    AbstractC52922bZ A003 = AbstractC27490CBl.A00(c27005Bvk, A0V, A0O, C25797BbE.class, null);
                    C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                    C117505Tk.A0L(A0K2, false);
                    C25797BbE c25797BbE = (C25797BbE) A003;
                    Object A0q = AbstractC25227BEk.A0q(c5Tl, 966381316);
                    Object obj3 = C5UI.A00;
                    if (A0q == obj3) {
                        A0q = new C27958CUc();
                        c5Tl.FBy(A0q);
                    }
                    C27958CUc c27958CUc2 = (C27958CUc) A0q;
                    C117505Tk.A0L(A0K2, false);
                    Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 966383129);
                    if (A0q2 == obj3) {
                        A0q2 = AbstractC25232BEp.A0w(c5Tl, null);
                    }
                    InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K2, A0q2, false);
                    c5Tl.Eno(966386348);
                    InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A06;
                    InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) this.A08;
                    InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) this.A07;
                    InterfaceC16660sJ interfaceC16660sJ4 = (InterfaceC16660sJ) this.A05;
                    Object EEc4 = c5Tl.EEc();
                    if (EEc4 == obj3) {
                        EEc4 = new C29100CsR(interfaceC16820sZ4, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16660sJ4, C30712DfA.A00(A0M, 36), new C30753Dfq(c25797BbE, 1));
                        c5Tl.FBy(EEc4);
                    }
                    C117505Tk.A0L(A0K2, false);
                    AbstractC28037CXl.A01(c5Tl, c27958CUc2, c25797BbE.A00.A00, 48);
                    CXW.A00(c5Tl, AbstractC25227BEk.A0H(AbstractC25228BEl.A0V(), 64.0f), c27958CUc2, 54, 0);
                    C6G1.A00(c5Tl, null, null, C5UA.A01(c5Tl, new DVX(A0M, (C29100CsR) EEc4, userSession, (InterfaceC60442pS) this.A02, this.A0A, interfaceC16820sZ4, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A01, (InterfaceC16820sZ) this.A03), -1560826697), 384, 3);
                    if (C0fH.A02()) {
                        i = 1064339545;
                        C0fH.A00(i);
                    }
                } else {
                    throw AbstractC25235BEs.A0i();
                }
            }
            c5Tl.Em9();
        }
        return C0eB.A00;
    }
}
