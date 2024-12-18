package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class DXE extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C5yI A00;
    public final /* synthetic */ InterfaceC132365yF A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C132335yC A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ InterfaceC16620sF A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXE(C5yI c5yI, InterfaceC132365yF interfaceC132365yF, UserSession userSession, C132335yC c132335yC, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16620sF interfaceC16620sF, boolean z) {
        super(2);
        this.A03 = c132335yC;
        this.A0B = z;
        this.A06 = interfaceC16660sJ;
        this.A05 = interfaceC16820sZ;
        this.A02 = userSession;
        this.A04 = interfaceC16820sZ2;
        this.A09 = interfaceC16660sJ2;
        this.A0A = interfaceC16620sF;
        this.A07 = interfaceC16660sJ3;
        this.A08 = interfaceC16660sJ4;
        this.A00 = c5yI;
        this.A01 = interfaceC132365yF;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(742370326, "com.instagram.feed.tifu.ui.TifuHScrollPagerUnit.<anonymous> (TifuHScrollPagerUnit.kt:88)");
            }
            C132335yC c132335yC = this.A03;
            boolean z = this.A0B;
            InterfaceC16660sJ interfaceC16660sJ = this.A06;
            InterfaceC16820sZ interfaceC16820sZ = this.A05;
            UserSession userSession = this.A02;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A04;
            InterfaceC16660sJ interfaceC16660sJ2 = this.A09;
            InterfaceC16620sF interfaceC16620sF = this.A0A;
            InterfaceC16660sJ interfaceC16660sJ3 = this.A07;
            InterfaceC16660sJ interfaceC16660sJ4 = this.A08;
            C5yI c5yI = this.A00;
            InterfaceC132365yF interfaceC132365yF = this.A01;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, C5X8.A00);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            c5Tl.EnY(-1586260815, c132335yC.A03);
            ArrayList A1E = AbstractC166987dD.A1E();
            C5Hc c5Hc = c132335yC.A06;
            Iterator it = c5Hc.iterator();
            while (it.hasNext()) {
                A1E.add(new C51761Mtk((C9C6) it.next(), C05F.A00));
            }
            if (z) {
                A1E.add(new C51761Mtk((C9C6) null, C05F.A01));
            }
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A1E, -1586256672);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new J7S(A1E, 39);
                c5Tl.FBy(EEc);
            }
            C25660BVw A002 = AbstractC25655BVr.A00(c5Tl, AbstractC25225BEi.A1A(c117505Tk, EEc, false), 0, 54, 0);
            C0eB c0eB = C0eB.A00;
            boolean A1Z2 = AbstractC25232BEp.A1Z(c5Tl, A002, interfaceC16660sJ, -1586253884);
            Object EEc2 = c5Tl.EEc();
            if (A1Z2 || EEc2 == C5UI.A00) {
                EEc2 = new MCG(interfaceC16660sJ, A002, (InterfaceC23621Ds) null, 28);
                c5Tl.FBy(EEc2);
            }
            AbstractC25228BEl.A1K(c5Tl, c117505Tk, EEc2, c0eB, false);
            Object AJX = c5Tl.AJX(C5VN.A00);
            boolean A1Y = AbstractC25232BEp.A1Y(c5Tl, interfaceC16820sZ, AJX, -1586244618);
            Object EEc3 = c5Tl.EEc();
            if (A1Y || EEc3 == C5UI.A00) {
                EEc3 = new C50268MHx(34, AJX, interfaceC16820sZ);
                c5Tl.FBy(EEc3);
            }
            AbstractC25228BEl.A1J(c5Tl, c117505Tk, EEc3, AJX, false);
            C28770Cn2 c28770Cn2 = new C28770Cn2(AbstractC13880nE.A01(AbstractC25228BEl.A0K(c5Tl), (float) (AbstractC13890nF.A01(r10) * C18U.A00(C06090Tz.A05, userSession, 37170691385328146L))));
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            AbstractC25655BVr.A01(null, c28770Cn2, c5Tl, null, c6gm.A00(AbstractC25226BEj.A0X(A0T, AbstractC25226BEj.A0B(c5Tl)), true), A002, DOM.A00, C5UA.A01(c5Tl, new C30737DfZ(c5yI, interfaceC132365yF, userSession, c132335yC, interfaceC16820sZ2, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16660sJ4, interfaceC16620sF), -178424746), 0.0f, 100859952, 88, true);
            int size = c5Hc.size();
            if (z) {
                size++;
            }
            C6GV.A02(c5Tl, AbstractC25227BEk.A0N(A0T, 0.0f), size, c132335yC.A00, 384, 24, 0L, 0L);
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(874763033);
            }
        }
        return C0eB.A00;
    }
}
