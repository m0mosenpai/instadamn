package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CGC {
    public static final void A00(C5Tl c5Tl, C26087BgG c26087BgG, int i) {
        int i2;
        long j;
        C14360o3.A0B(c26087BgG, 0);
        c5Tl.Enr(-623389432);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26087BgG) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(20612372, "com.instagram.compose.igds.components.bottomsheet.IgdsModalBottomSheetHeader (ModalBottomSheetHeader.kt:128)");
            }
            InterfaceC74953Yl A0U = AbstractC25228BEl.A0U(c5Tl, AndroidCompositionLocals_androidKt.A01);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 182386774);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(0.0f));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, 182388758);
            if (A0q2 == obj) {
                A0q2 = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(0.0f));
            }
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, A0q2, false);
            Object A0q3 = AbstractC25227BEk.A0q(c5Tl, 182390486);
            if (A0q3 == obj) {
                A0q3 = AbstractC25232BEp.A0w(c5Tl, Float.valueOf(0.0f));
            }
            InterfaceC74953Yl A0M2 = AbstractC25225BEi.A0M(A0K, A0q3, false);
            float A03 = (AbstractC25231BEo.A03(interfaceC74953Yl) - (Math.max(AbstractC25231BEo.A03(A0M), AbstractC25231BEo.A03(A0M2)) * 2.0f)) - AbstractC13690mv.A01((Context) A0U.getValue(), 16);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            Modifier A0A = AbstractC118175Wb.A0A(AbstractC118185Wd.A05(A0T, 44.0f), 8.0f, 12.0f);
            Object A0q4 = AbstractC25227BEk.A0q(c5Tl, 182402853);
            if (A0q4 == obj) {
                A0q4 = C30185DRq.A02(interfaceC74953Yl, 32);
                c5Tl.FBy(A0q4);
            }
            Modifier A0B = AbstractC25233BEq.A0B(A0K, A0A, A0q4);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0B);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            InterfaceC31095Dld interfaceC31095Dld = (InterfaceC31095Dld) c26087BgG.A01;
            c5Tl.Eno(-89226542);
            if (!(interfaceC31095Dld instanceof C29178Ctj)) {
                C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, c5Tl.EEc(), obj)).A00;
                Object AJX = c5Tl.AJX(CMP.A00);
                Modifier A0A2 = AbstractC118175Wb.A0A(c119645bN.AB5(C118195Wf.A0B, c1130158n), 8.0f, 0.0f);
                Object A0q5 = AbstractC25227BEk.A0q(c5Tl, -89216911);
                if (A0q5 == obj) {
                    A0q5 = C30185DRq.A02(A0M, 34);
                    c5Tl.FBy(A0q5);
                }
                Modifier A0B2 = AbstractC25233BEq.A0B(A0K, A0A2, A0q5);
                C5XQ A0W = AbstractC25225BEi.A0W(0);
                boolean A1X = AbstractC25226BEj.A1X(c5Tl, AJX, AbstractC25232BEp.A1Y(c5Tl, interfaceC31095Dld, c19l, -89209649));
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == obj) {
                    EEc = new ME5(7, AJX, interfaceC31095Dld, c19l);
                    c5Tl.FBy(EEc);
                }
                Modifier A02 = AbstractC118635Yc.A02(c5Tl, A0B2, A0W, AbstractC25225BEi.A1A(A0K, EEc, false));
                if (interfaceC31095Dld instanceof C26174Bhz) {
                    C26174Bhz c26174Bhz = (C26174Bhz) interfaceC31095Dld;
                    c5Tl.Eno(-89200785);
                    C5YS.A07(c5Tl, AbstractC118185Wd.A0D(A02, 24.0f), C5Y7.A00(c5Tl, c26174Bhz.A01, 0), C5YJ.A06, C5YD.A00(c5Tl, c26174Bhz.A00), DalvikInternals.IOPRIO_BACKGROUND, 8, 0L);
                } else if (C14360o3.A0K(interfaceC31095Dld, C29178Ctj.A00)) {
                    c5Tl.Eno(-89177638);
                } else {
                    throw AbstractC25231BEo.A0v(c5Tl, A0K, -89202833, false);
                }
                C117505Tk.A0L(A0K, false);
            }
            C117505Tk.A0L(A0K, false);
            AbstractC117695Ue.A01(c5Tl, C5UA.A01(c5Tl, new C30217DSw(c119645bN, c26087BgG, A0U, A03, 1), 751486670), new C117685Ud[]{C5WR.A00.A02(AbstractC25226BEj.A0d(c5Tl)), AbstractC25229BEm.A0S(C6L9.A00, AbstractC25226BEj.A0G(c5Tl))}, 56);
            C51757Mtg c51757Mtg = (C51757Mtg) c26087BgG.A00;
            c5Tl.Eno(-89130737);
            if (c51757Mtg != null) {
                Modifier A0A3 = AbstractC118175Wb.A0A(c119645bN.AB5(C118195Wf.A0A, c1130158n), 8.0f, 0.0f);
                Object A0q6 = AbstractC25227BEk.A0q(c5Tl, -89126007);
                if (A0q6 == obj) {
                    A0q6 = C30185DRq.A02(A0M2, 33);
                    c5Tl.FBy(A0q6);
                }
                Modifier A022 = AbstractC118635Yc.A02(c5Tl, AbstractC25233BEq.A0B(A0K, A0A3, A0q6), AbstractC25225BEi.A0W(0), (InterfaceC16820sZ) c51757Mtg.A01);
                if (C51757Mtg.A02(c51757Mtg, 8)) {
                    c5Tl.Eno(1532336268);
                    String str = c51757Mtg.A02;
                    C118125Vw A0g = AbstractC25226BEj.A0g(c5Tl);
                    C1132359l c1132359l = (C1132359l) c51757Mtg.A00;
                    c5Tl.Eno(-89112030);
                    if (c1132359l == null) {
                        j = AbstractC25226BEj.A0G(c5Tl);
                    } else {
                        j = c1132359l.A00;
                    }
                    C117505Tk.A0L(A0K, false);
                    C5WR.A0R(c5Tl, A022, A0g, str, j);
                    C117505Tk.A0L(A0K, false);
                } else {
                    throw AbstractC25231BEo.A0v(c5Tl, A0K, -89118932, false);
                }
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            AbstractC28389Cfs.A01(c5Tl, A0T);
            if (C0fH.A02()) {
                C0fH.A00(240649278);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, c26087BgG, i, 30);
        }
    }
}
